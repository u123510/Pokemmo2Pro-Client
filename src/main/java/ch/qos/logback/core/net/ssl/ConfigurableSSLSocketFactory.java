package ch.qos.logback.core.net.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ConfigurableSSLSocketFactory extends SocketFactory {
   private final SSLParametersConfiguration parameters;
   private final SSLSocketFactory delegate;

   public ConfigurableSSLSocketFactory(SSLParametersConfiguration var1, SSLSocketFactory var2) {
      this.parameters = var1;
      this.delegate = var2;
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      SSLSocket var5;
      SSLSocket var10000 = var5 = (SSLSocket)this.delegate.createSocket(var1, var2, var3, var4);
      this.parameters.configure(new SSLConfigurableSocket(var5));
      return var10000;
   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      SSLSocket var3;
      SSLSocket var10000 = var3 = (SSLSocket)this.delegate.createSocket(var1, var2);
      this.parameters.configure(new SSLConfigurableSocket(var3));
      return var10000;
   }

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException {
      SSLSocket var5;
      SSLSocket var10000 = var5 = (SSLSocket)this.delegate.createSocket(var1, var2, var3, var4);
      this.parameters.configure(new SSLConfigurableSocket(var5));
      return var10000;
   }

   public Socket createSocket(String var1, int var2) throws IOException {
      SSLSocket var3;
      SSLSocket var10000 = var3 = (SSLSocket)this.delegate.createSocket(var1, var2);
      this.parameters.configure(new SSLConfigurableSocket(var3));
      return var10000;
   }
}
