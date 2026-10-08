package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLHandshakeException;

public abstract class AbstractSocketAppender extends AppenderBase implements SocketConnector.ExceptionHandler {
   public static final int DEFAULT_PORT = 4560;
   public static final int DEFAULT_RECONNECTION_DELAY = 30000;
   public static final int DEFAULT_QUEUE_SIZE = 128;
   private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
   private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
   private final ObjectWriterFactory objectWriterFactory;
   private final QueueFactory queueFactory;
   private String remoteHost;
   private int port;
   private InetAddress address;
   private Duration reconnectionDelay;
   private int queueSize;
   private int acceptConnectionTimeout;
   private Duration eventDelayLimit;
   private BlockingDeque deque;
   private String peerId;
   private SocketConnector connector;
   private Future task;
   private volatile Socket socket;

   public AbstractSocketAppender() {
      this(new QueueFactory(), new ObjectWriterFactory());
   }

   public AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
      super();
      this.port = 4560;
      this.reconnectionDelay = new Duration(30000L);
      this.queueSize = 128;
      this.acceptConnectionTimeout = 5000;
      this.eventDelayLimit = new Duration(100L);
      this.objectWriterFactory = objectWriterFactory;
      this.queueFactory = queueFactory;
   }

   private void connectSocketAndDispatchEvents() {
      while (this.socketConnectionCouldBeEstablished()) {
         try {
            ObjectWriter objectWriter = this.createObjectWriterForSocket();
            this.addInfo(this.peerId + "connection established");
            this.dispatchEvents(objectWriter);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            this.addInfo(this.peerId + "connection closed");
         } catch (InterruptedException e) {
            break;
         } catch (SSLHandshakeException e) {
            try {
               Thread.sleep(30000L);
            } catch (InterruptedException ex) {
               break;
            }
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            this.addInfo(this.peerId + "connection closed");
         } catch (IOException e) {
            this.addInfo(this.peerId + "connection failed: ", e);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            this.addInfo(this.peerId + "connection closed");
         } catch (Throwable t) {
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            this.addInfo(this.peerId + "connection closed");
            throw t;
         }
      }
      this.addInfo("shutting down");
   }

   private boolean socketConnectionCouldBeEstablished() {
      this.socket = this.connector.call();
      return this.socket != null;
   }

   private ObjectWriter createObjectWriterForSocket() throws IOException {
      this.socket.setSoTimeout(this.acceptConnectionTimeout);
      ObjectWriter objectWriter = this.objectWriterFactory.newAutoFlushingObjectWriter(this.socket.getOutputStream());
      this.socket.setSoTimeout(0);
      return objectWriter;
   }

   private SocketConnector createConnector(InetAddress address, int port, int delay, long currentTime) {
      SocketConnector connector = this.newConnector(address, port, (long)delay, currentTime);
      connector.setExceptionHandler(this);
      connector.setSocketFactory(this.getSocketFactory());
      return connector;
   }

   private void dispatchEvents(ObjectWriter objectWriter) throws InterruptedException, IOException {
      while (true) {
         Object event = this.deque.takeFirst();
         this.postProcessEvent(event);
         objectWriter.write(this.getPST().transform(event));
      }
   }

   private void tryReAddingEventToFrontOfQueue(Object event) {
      if (!this.deque.offerFirst(event)) {
         this.addInfo("Dropping event due to socket connection error and maxed out deque capacity");
      }
   }

   public void start() {
      if (this.isStarted()) {
         return;
      }
      int errorCount = 0;
      if (this.port <= 0) {
         ++errorCount;
         this.addError("No port was configured for appender" + this.getName() + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
      }
      if (this.remoteHost == null) {
         ++errorCount;
         this.addError("No remote host was configured for appender" + this.getName() + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
      }
      if (this.queueSize == 0) {
         this.addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
      }
      if (this.queueSize < 0) {
         ++errorCount;
         this.addError("Queue size must be greater than zero");
      }
      if (errorCount == 0) {
         try {
            this.address = InetAddress.getByName(this.remoteHost);
         } catch (UnknownHostException e) {
            this.addError("unknown host: " + this.remoteHost);
            ++errorCount;
         }
      }
      if (errorCount == 0) {
         this.deque = this.queueFactory.newLinkedBlockingDeque(this.queueSize);
         this.peerId = "remote peer " + this.remoteHost + ":" + this.port + ": ";
         this.connector = this.createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds());
         this.task = this.getContext().getExecutorService().submit(new Runnable() {
            public void run() {
               AbstractSocketAppender.this.connectSocketAndDispatchEvents();
            }
         });
         super.start();
      }
   }

   public void stop() {
      if (this.isStarted()) {
         CloseUtil.closeQuietly(this.socket);
         this.task.cancel(true);
         super.stop();
      }
   }

   public void append(Object event) {
      if (event != null && this.isStarted()) {
         try {
            long delay = this.eventDelayLimit.getMilliseconds();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!this.deque.offer(event, delay, timeUnit)) {
               this.addInfo("Dropping event due to timeout limit of [" + String.valueOf(this.eventDelayLimit) + "] being exceeded");
            }
         } catch (InterruptedException e) {
            this.addError("Interrupted while appending event to SocketAppender", e);
         }
      }
   }

   public void connectionFailed(SocketConnector connector, Exception ex) {
      if (ex instanceof InterruptedException) {
         this.addInfo("connector interrupted");
      } else if (ex instanceof ConnectException) {
         this.addInfo(this.peerId + "connection refused");
      } else {
         this.addInfo(this.peerId + String.valueOf(ex));
      }
   }

   public SocketConnector newConnector(InetAddress address, int port, long delay, long currentTime) {
      return new DefaultSocketConnector(address, port, delay, currentTime);
   }

   public SocketFactory getSocketFactory() {
      return SocketFactory.getDefault();
   }

   public abstract void postProcessEvent(Object event);

   public abstract PreSerializationTransformer getPST();

   public void setRemoteHost(String remoteHost) {
      this.remoteHost = remoteHost;
   }

   public String getRemoteHost() {
      return this.remoteHost;
   }

   public void setPort(int port) {
      this.port = port;
   }

   public int getPort() {
      return this.port;
   }

   public void setReconnectionDelay(Duration reconnectionDelay) {
      this.reconnectionDelay = reconnectionDelay;
   }

   public Duration getReconnectionDelay() {
      return this.reconnectionDelay;
   }

   public void setQueueSize(int queueSize) {
      this.queueSize = queueSize;
   }

   public int getQueueSize() {
      return this.queueSize;
   }

   public void setEventDelayLimit(Duration eventDelayLimit) {
      this.eventDelayLimit = eventDelayLimit;
   }

   public Duration getEventDelayLimit() {
      return this.eventDelayLimit;
   }

   public void setAcceptConnectionTimeout(int acceptConnectionTimeout) {
      this.acceptConnectionTimeout = acceptConnectionTimeout;
   }
}
