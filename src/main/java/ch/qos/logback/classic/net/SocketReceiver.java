package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
   private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
   private String remoteHost;
   private InetAddress address;
   private int port;
   private int reconnectionDelay;
   private int acceptConnectionTimeout = 5000;
   private String receiverId;
   private volatile Socket socket;
   private Future connectorTask;

   private SocketConnector createConnector(InetAddress address, int port, int initialDelay, int retryDelay) {
      SocketConnector connector = newConnector(address, port, initialDelay, retryDelay);
      connector.setExceptionHandler(this);
      connector.setSocketFactory(getSocketFactory());
      return connector;
   }

   private Future activateConnector(SocketConnector connector) {
      try {
         return getContext().getScheduledExecutorService().submit(connector);
      } catch (RejectedExecutionException e) {
         return null;
      }
   }

   private Socket waitForConnectorToReturnASocket() throws InterruptedException {
      try {
         Socket connectorSocket = (Socket) connectorTask.get();
         connectorTask = null;
         return connectorSocket;
      } catch (ExecutionException e) {
         return null;
      }
   }

   private void dispatchEvents(LoggerContext context) {
      HardenedLoggingEventInputStream hardenedLoggingEventInputStream = null;
      try {
         socket.setSoTimeout(acceptConnectionTimeout);
         hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(socket.getInputStream());
         socket.setSoTimeout(0);
         addInfo(receiverId + "connection established");
         while (true) {
            ILoggingEvent event = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
            Logger remoteLogger = context.getLogger(event.getLoggerName());
            if (remoteLogger.isEnabledFor(event.getLevel())) {
               remoteLogger.callAppenders(event);
            }
         }
      } catch (EOFException e) {
         addInfo(receiverId + "end-of-stream detected");
      } catch (IOException e) {
         addInfo(receiverId + "connection failed: " + e);
      } catch (ClassNotFoundException e) {
         addInfo(receiverId + "unknown event class: " + e);
      } finally {
         CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
         CloseUtil.closeQuietly(socket);
         socket = null;
         addInfo(receiverId + "connection closed");
      }
   }

   public boolean shouldStart() {
      int errorCount = 0;
      if (port == 0) {
         errorCount++;
         addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
      }
      if (remoteHost == null) {
         errorCount++;
         addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
      }
      if (reconnectionDelay == 0) {
         reconnectionDelay = 30000;
      }
      if (errorCount == 0) {
         try {
            address = InetAddress.getByName(remoteHost);
         } catch (UnknownHostException e) {
            addError("unknown host: " + remoteHost);
            errorCount++;
         }
      }
      if (errorCount == 0) {
         receiverId = "receiver " + remoteHost + ":" + port + ": ";
      }
      return errorCount == 0;
   }

   public void onStop() {
      if (socket != null) {
         CloseUtil.closeQuietly(socket);
      }
   }

   public Runnable getRunnableTask() {
      return this;
   }

   public void run() {
      try {
         LoggerContext context = (LoggerContext) getContext();
         while (!Thread.currentThread().isInterrupted()) {
            InetAddress address = this.address;
            int port = this.port;
            int initialDelay = 0;
            int retryDelay = this.reconnectionDelay;
            connectorTask = activateConnector(createConnector(address, port, initialDelay, retryDelay));
            if (connectorTask == null) {
               break;
            }
            socket = waitForConnectorToReturnASocket();
            if (socket == null) {
               break;
            }
            dispatchEvents(context);
         }
      } catch (InterruptedException e) {
         // connector was interrupted; fall through to shutdown
      }
      addInfo("shutting down");
   }

   public void connectionFailed(SocketConnector connector, Exception ex) {
      if (ex instanceof InterruptedException) {
         addInfo("connector interrupted");
      } else if (ex instanceof ConnectException) {
         addInfo(receiverId + "connection refused");
      } else {
         addInfo(receiverId + ex);
      }
   }

   public SocketConnector newConnector(InetAddress address, int port, int initialDelay, int retryDelay) {
      return new DefaultSocketConnector(address, port, (long) initialDelay, (long) retryDelay);
   }

   public SocketFactory getSocketFactory() {
      return SocketFactory.getDefault();
   }

   public void setRemoteHost(String remoteHost) {
      this.remoteHost = remoteHost;
   }

   public void setPort(int port) {
      this.port = port;
   }

   public void setReconnectionDelay(int reconnectionDelay) {
      this.reconnectionDelay = reconnectionDelay;
   }

   public void setAcceptConnectionTimeout(int acceptConnectionTimeout) {
      this.acceptConnectionTimeout = acceptConnectionTimeout;
   }
}
