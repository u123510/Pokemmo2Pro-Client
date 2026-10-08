package ch.qos.logback.core.net;

import ch.qos.logback.core.util.DelayStrategy;
import ch.qos.logback.core.util.FixedDelay;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

public class DefaultSocketConnector implements SocketConnector {
   private final InetAddress address;
   private final int port;
   private final DelayStrategy delayStrategy;
   private SocketConnector.ExceptionHandler exceptionHandler;
   private SocketFactory socketFactory;

   public DefaultSocketConnector(InetAddress var1, int var2, long var3, long var5) {
      this(var1, var2, new FixedDelay(var3, var5));
   }

   public DefaultSocketConnector(InetAddress var1, int var2, DelayStrategy var3) {
      this.address = var1;
      this.port = var2;
      this.delayStrategy = var3;
   }

   private Socket createSocket() {
      Socket var1 = null;

      try {
         var1 = this.socketFactory.createSocket(this.address, this.port);
      } catch (IOException var2) {
         this.exceptionHandler.connectionFailed(this, var2);
      }

      return var1;
   }

   private void useDefaultsForMissingFields() {
      if (this.exceptionHandler == null) {
         this.exceptionHandler = new ConsoleExceptionHandler();
      }

      if (this.socketFactory == null) {
         this.socketFactory = SocketFactory.getDefault();
      }

   }

   public Socket call() {
      this.useDefaultsForMissingFields();

      Socket var1;
      for(var1 = this.createSocket(); var1 == null && !Thread.currentThread().isInterrupted(); var1 = this.createSocket()) {
         try {
            Thread.sleep(this.delayStrategy.nextDelay());
         } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(var2);
         }
      }

      return var1;
   }

   public void setExceptionHandler(SocketConnector.ExceptionHandler var1) {
      this.exceptionHandler = var1;
   }

   public void setSocketFactory(SocketFactory var1) {
      this.socketFactory = var1;
   }

   private static class ConsoleExceptionHandler implements SocketConnector.ExceptionHandler {
      private ConsoleExceptionHandler() {
      }

      public void connectionFailed(SocketConnector var1, Exception var2) {
         System.out.println(var2);
      }
   }
}
