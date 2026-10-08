package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class KeyStoreFactoryBean {
   private String location;
   private String provider;
   private String type;
   private String password;

   private KeyStore newKeyStore() throws NoSuchAlgorithmException, NoSuchProviderException, KeyStoreException {
      return this.getProvider() != null ? KeyStore.getInstance(this.getType(), this.getProvider()) : KeyStore.getInstance(this.getType());
   }

   public KeyStore createKeyStore() throws Exception {
      if (this.getLocation() == null) {
         throw new IllegalArgumentException("location is required");
      }
      InputStream is = null;
      try {
         is = LocationUtil.urlForResource(this.getLocation()).openStream();
         KeyStore keyStore = this.newKeyStore();
         keyStore.load(is, this.getPassword().toCharArray());
         return keyStore;
      } catch (NoSuchProviderException e) {
         throw new NoSuchProviderException("no such provider: " + this.getProvider());
      } catch (NoSuchAlgorithmException e) {
         throw new NoSuchAlgorithmException("no such algorithm: " + this.getType());
      } catch (FileNotFoundException e) {
         throw new KeyStoreException("could not find key store: " + this.getLocation());
      } catch (Exception e) {
         throw new KeyStoreException("could not open key store: " + this.getLocation() + ", " + e.getMessage(), e);
      } finally {
         if (is != null) {
            try {
               is.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String var1) {
      this.location = var1;
   }

   public String getType() {
      String var1;
      return (var1 = this.type) == null ? "JKS" : var1;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public String getProvider() {
      return this.provider;
   }

   public void setProvider(String var1) {
      this.provider = var1;
   }

   public String getPassword() {
      String var1;
      return (var1 = this.password) == null ? "changeit" : var1;
   }

   public void setPassword(String var1) {
      this.password = var1;
   }
}
