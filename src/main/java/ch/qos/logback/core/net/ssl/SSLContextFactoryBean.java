package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class SSLContextFactoryBean {
   private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
   private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
   private KeyStoreFactoryBean keyStore;
   private KeyStoreFactoryBean trustStore;
   private SecureRandomFactoryBean secureRandom;
   private KeyManagerFactoryFactoryBean keyManagerFactory;
   private TrustManagerFactoryFactoryBean trustManagerFactory;
   private String protocol;
   private String provider;

   private KeyManager[] createKeyManagers(ContextAware context) throws Exception {
      if (this.getKeyStore() == null) {
         return null;
      } else {
         KeyStore keyStore = this.getKeyStore().createKeyStore();
         context.addInfo("key store of type '" + keyStore.getType() + "' provider '" + String.valueOf(keyStore.getProvider()) + "': " + this.getKeyStore().getLocation());
         KeyManagerFactory kmf = this.getKeyManagerFactory().createKeyManagerFactory();
         context.addInfo("key manager algorithm '" + kmf.getAlgorithm() + "' provider '" + String.valueOf(kmf.getProvider()) + "'");
         kmf.init(keyStore, this.getKeyStore().getPassword().toCharArray());
         return kmf.getKeyManagers();
      }
   }

   private TrustManager[] createTrustManagers(ContextAware context) throws Exception {
      if (this.getTrustStore() == null) {
         return null;
      } else {
         KeyStore trustStore = this.getTrustStore().createKeyStore();
         context.addInfo("trust store of type '" + trustStore.getType() + "' provider '" + String.valueOf(trustStore.getProvider()) + "': " + this.getTrustStore().getLocation());
         TrustManagerFactory tmf = this.getTrustManagerFactory().createTrustManagerFactory();
         context.addInfo("trust manager algorithm '" + tmf.getAlgorithm() + "' provider '" + String.valueOf(tmf.getProvider()) + "'");
         tmf.init(trustStore);
         return tmf.getTrustManagers();
      }
   }

   private SecureRandom createSecureRandom(ContextAware context) throws Exception {
      SecureRandom secureRandom = this.getSecureRandom().createSecureRandom();
      context.addInfo("secure random algorithm '" + secureRandom.getAlgorithm() + "' provider '" + String.valueOf(secureRandom.getProvider()) + "'");
      return secureRandom;
   }

   private KeyStoreFactoryBean keyStoreFromSystemProperties(String prefix) {
      if (System.getProperty(prefix) == null) {
         return null;
      } else {
         KeyStoreFactoryBean keyStore = new KeyStoreFactoryBean();
         keyStore.setLocation(this.locationFromSystemProperty(prefix));
         keyStore.setProvider(System.getProperty(prefix + "Provider"));
         keyStore.setPassword(System.getProperty(prefix + "Password"));
         keyStore.setType(System.getProperty(prefix + "Type"));
         return keyStore;
      }
   }

   private String locationFromSystemProperty(String prefix) {
      String location = System.getProperty(prefix);
      if (location != null && !location.startsWith("file:")) {
         location = "file:" + location;
      }
      return location;
   }

   public SSLContext createContext(ContextAware context) throws Exception {
      SSLContext sslContext;
      if (this.getProvider() != null) {
         sslContext = SSLContext.getInstance(this.getProtocol(), this.getProvider());
      } else {
         sslContext = SSLContext.getInstance(this.getProtocol());
      }
      context.addInfo("SSL protocol '" + sslContext.getProtocol() + "' provider '" + String.valueOf(sslContext.getProvider()) + "'");
      KeyManager[] keyManagers = this.createKeyManagers(context);
      TrustManager[] trustManagers = this.createTrustManagers(context);
      SecureRandom secureRandom = this.createSecureRandom(context);
      sslContext.init(keyManagers, trustManagers, secureRandom);
      return sslContext;
   }

   public KeyStoreFactoryBean getKeyStore() {
      if (this.keyStore == null) {
         this.keyStore = this.keyStoreFromSystemProperties("javax.net.ssl.keyStore");
      }
      return this.keyStore;
   }

   public void setKeyStore(KeyStoreFactoryBean keyStore) {
      this.keyStore = keyStore;
   }

   public KeyStoreFactoryBean getTrustStore() {
      if (this.trustStore == null) {
         this.trustStore = this.keyStoreFromSystemProperties("javax.net.ssl.trustStore");
      }
      return this.trustStore;
   }

   public void setTrustStore(KeyStoreFactoryBean trustStore) {
      this.trustStore = trustStore;
   }

   public SecureRandomFactoryBean getSecureRandom() {
      return this.secureRandom == null ? new SecureRandomFactoryBean() : this.secureRandom;
   }

   public void setSecureRandom(SecureRandomFactoryBean secureRandom) {
      this.secureRandom = secureRandom;
   }

   public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
      return this.keyManagerFactory == null ? new KeyManagerFactoryFactoryBean() : this.keyManagerFactory;
   }

   public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactory) {
      this.keyManagerFactory = keyManagerFactory;
   }

   public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
      return this.trustManagerFactory == null ? new TrustManagerFactoryFactoryBean() : this.trustManagerFactory;
   }

   public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactory) {
      this.trustManagerFactory = trustManagerFactory;
   }

   public String getProtocol() {
      return this.protocol == null ? "SSL" : this.protocol;
   }

   public void setProtocol(String protocol) {
      this.protocol = protocol;
   }

   public String getProvider() {
      return this.provider;
   }

   public void setProvider(String provider) {
      this.provider = provider;
   }
}
