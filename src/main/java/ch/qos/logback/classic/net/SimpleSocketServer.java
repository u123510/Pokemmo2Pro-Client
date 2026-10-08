package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.classic.joran.JoranConfigurator;
import f.Cq0;
import f.dl_1;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;

public class SimpleSocketServer extends Thread {
   dl_1 logger = Cq0.E1(SimpleSocketServer.class);
   private final int port;
   private final LoggerContext lc;
   private boolean closed = false;
   private ServerSocket serverSocket;
   private List socketNodeList = new ArrayList();
   private CountDownLatch latch;

   public static void main(String[] argv) throws Exception {
      doMain(SimpleSocketServer.class, argv);
   }

   public static void doMain(Class clazz, String[] argv) throws Exception {
      int port = -1;
      if (argv.length == 2) {
         port = parsePortNumber(argv[0]);
      } else {
         usage("Wrong number of arguments.");
      }
      String configFile = argv[1];
      LoggerContext lc = (LoggerContext) Cq0.vr().getLoggerFactory();
      configureLC(lc, configFile);
      new SimpleSocketServer(lc, port).start();
   }

   public SimpleSocketServer(LoggerContext lc, int port) {
      this.lc = lc;
      this.port = port;
   }

   public static void usage(String msg) {
      PrintStream ps = System.err;
      ps.println(msg);
      ps.println("Usage: java " + SimpleSocketServer.class.getName() + " port configFile");
      System.exit(1);
   }

   public static int parsePortNumber(String portStr) {
      try {
         return Integer.parseInt(portStr);
      } catch (NumberFormatException e) {
         e.printStackTrace();
         usage("Could not interpret port number [" + portStr + "].");
         return -1;
      }
   }

   public static void configureLC(LoggerContext lc, String configFile) throws JoranException {
      JoranConfigurator configurator = new JoranConfigurator();
      lc.reset();
      configurator.setContext(lc);
      configurator.doConfigure(configFile);
   }

   public void run() {
      String oldThreadName = Thread.currentThread().getName();
      try {
         Thread.currentThread().setName(getServerThreadName());
         logger.info("Listening on port " + port);
         serverSocket = getServerSocketFactory().createServerSocket(port);
         while (!closed) {
            logger.info("Waiting to accept a new client.");
            signalAlmostReadiness();
            Socket socket = serverSocket.accept();
            logger.info("Connected to client at " + socket.getInetAddress());
            logger.info("Starting new socket node.");
            SocketNode newSocketNode = new SocketNode(this, socket, lc);
            synchronized (socketNodeList) {
               socketNodeList.add(newSocketNode);
            }
            String clientThreadName = getClientThreadName(socket);
            Thread t = new Thread(newSocketNode, clientThreadName);
            t.start();
         }
      } catch (Exception e) {
         if (closed) {
            logger.info("Exception in run method for a closed server. This is normal.");
         } else {
            logger.error("Unexpected failure in run method", e);
         }
      } finally {
         Thread.currentThread().setName(oldThreadName);
      }
   }

   public String getServerThreadName() {
      Object[] var1 = new Object[2];
      var1[0] = this.getClass().getSimpleName();
      var1[1] = this.port;
      return String.format("Logback %s (port %d)", var1);
   }

   public String getClientThreadName(Socket socket) {
      Object[] var2 = new Object[1];
      var2[0] = socket.getRemoteSocketAddress();
      return String.format("Logback SocketNode (client: %s)", var2);
   }

   public ServerSocketFactory getServerSocketFactory() {
      return ServerSocketFactory.getDefault();
   }

   public void signalAlmostReadiness() {
      CountDownLatch latch = this.latch;
      if (latch != null && latch.getCount() != 0L) {
         latch.countDown();
      }
   }

   public void setLatch(CountDownLatch latch) {
      this.latch = latch;
   }

   public CountDownLatch getLatch() {
      return this.latch;
   }

   public boolean isClosed() {
      return this.closed;
   }

   public void close() {
      closed = true;
      if (serverSocket != null) {
         try {
            serverSocket.close();
         } catch (IOException e) {
            logger.error("Failed to close serverSocket", e);
         } finally {
            serverSocket = null;
         }
      }
      logger.info("closing this server");
      synchronized (socketNodeList) {
         for (Iterator it = socketNodeList.iterator(); it.hasNext(); ) {
            ((SocketNode) it.next()).close();
         }
      }
      if (socketNodeList.size() != 0) {
         logger.warn("Was expecting a 0-sized socketNodeList after server shutdown");
      }
   }

   public void socketNodeClosing(SocketNode socketNode) {
      synchronized (socketNodeList) {
         socketNodeList.remove(socketNode);
      }
   }
}
