package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.security.NoSuchAlgorithmException;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

public class SimpleSSLSocketServer extends SimpleSocketServer {
   private final ServerSocketFactory socketFactory;

   public static void main(String[] var0) throws Exception {
      SimpleSocketServer.doMain(SimpleSSLSocketServer.class, var0);
   }

   public SimpleSSLSocketServer(LoggerContext var1, int var2) throws NoSuchAlgorithmException {
      this(var1, var2, SSLContext.getDefault());
   }

   public SimpleSSLSocketServer(LoggerContext var1, int var2, SSLContext var3) {
      super(var1, var2);
      if (var3 != null) {

         SSLParametersConfiguration var4;
         SSLParametersConfiguration var10001 = var4 = new SSLParametersConfiguration();
         ((ContextAwareBase)var10001).setContext(var1);
         ConfigurableSSLServerSocketFactory var5;
         var5 = new ConfigurableSSLServerSocketFactory(var4, var3.getServerSocketFactory());
         this.socketFactory = var5;
      } else {
         throw new NullPointerException("SSL context required");
      }
   }

   public ServerSocketFactory getServerSocketFactory() {
      return this.socketFactory;
   }
}
