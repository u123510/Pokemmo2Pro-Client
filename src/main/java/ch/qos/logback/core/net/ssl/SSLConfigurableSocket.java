package ch.qos.logback.core.net.ssl;

import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public class SSLConfigurableSocket implements SSLConfigurable {
   private final SSLSocket delegate;

   public SSLConfigurableSocket(SSLSocket var1) {
      this.delegate = var1;
   }

   public String[] getDefaultProtocols() {
      return this.delegate.getEnabledProtocols();
   }

   public String[] getSupportedProtocols() {
      return this.delegate.getSupportedProtocols();
   }

   public void setEnabledProtocols(String[] var1) {
      this.delegate.setEnabledProtocols(var1);
   }

   public String[] getDefaultCipherSuites() {
      return this.delegate.getEnabledCipherSuites();
   }

   public String[] getSupportedCipherSuites() {
      return this.delegate.getSupportedCipherSuites();
   }

   public void setEnabledCipherSuites(String[] var1) {
      this.delegate.setEnabledCipherSuites(var1);
   }

   public void setNeedClientAuth(boolean var1) {
      this.delegate.setNeedClientAuth(var1);
   }

   public void setWantClientAuth(boolean var1) {
      this.delegate.setWantClientAuth(var1);
   }

   public void setHostnameVerification(boolean var1) {
      if (var1) {
         SSLConfigurableSocket var10000 = this;
         SSLParameters var2;
         (var2 = this.delegate.getSSLParameters()).setEndpointIdentificationAlgorithm("HTTPS");
         var10000.delegate.setSSLParameters(var2);
      }
   }
}
