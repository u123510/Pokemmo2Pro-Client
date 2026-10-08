package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StringCollectionUtil;
import java.util.ArrayList;
import java.util.Arrays;

public class SSLParametersConfiguration extends ContextAwareBase {
   private String includedProtocols;
   private String excludedProtocols;
   private String includedCipherSuites;
   private String excludedCipherSuites;
   private Boolean needClientAuth;
   private Boolean wantClientAuth;
   private String[] enabledProtocols;
   private String[] enabledCipherSuites;
   private Boolean hostnameVerification;

   private String[] enabledProtocols(String[] var1, String[] var2) {
      if (this.enabledProtocols == null) {
         if (OptionHelper.isNullOrEmptyOrAllSpaces(this.getIncludedProtocols()) && OptionHelper.isNullOrEmptyOrAllSpaces(this.getExcludedProtocols())) {
            this.enabledProtocols = (String[])Arrays.copyOf(var2, var2.length);
         } else {
            String var4 = this.getIncludedProtocols();
            this.enabledProtocols = this.includedStrings(var1, var4, this.getExcludedProtocols());
         }

         int var6 = (var1 = this.enabledProtocols).length;

         for(int var3 = 0; var3 < var6; ++var3) {
            ((ContextAwareBase)this).addInfo("enabled protocol: " + var1[var3]);
         }
      }

      return this.enabledProtocols;
   }

   private String[] enabledCipherSuites(String[] var1, String[] var2) {
      if (this.enabledCipherSuites == null) {
         if (OptionHelper.isNullOrEmptyOrAllSpaces(this.getIncludedCipherSuites()) && OptionHelper.isNullOrEmptyOrAllSpaces(this.getExcludedCipherSuites())) {
            this.enabledCipherSuites = (String[])Arrays.copyOf(var2, var2.length);
         } else {
            String var4 = this.getIncludedCipherSuites();
            this.enabledCipherSuites = this.includedStrings(var1, var4, this.getExcludedCipherSuites());
         }

         int var6 = (var1 = this.enabledCipherSuites).length;

         for(int var3 = 0; var3 < var6; ++var3) {
            ((ContextAwareBase)this).addInfo("enabled cipher suite: " + var1[var3]);
         }
      }

      return this.enabledCipherSuites;
   }

   private String[] includedStrings(String[] var1, String var2, String var3) {
      ArrayList var4;
      ArrayList var10001 = var4 = new ArrayList(var1.length);
      var10001.addAll(Arrays.asList(var1));
      if (var2 != null) {
         StringCollectionUtil.retainMatching(var4, this.stringToArray(var2));
      }

      if (var3 != null) {
         StringCollectionUtil.removeMatching(var4, this.stringToArray(var3));
      }

      return (String[])var4.toArray(new String[var4.size()]);
   }

   private String[] stringToArray(String var1) {
      return var1.split("\\s*,\\s*");
   }

   public void configure(SSLConfigurable var1) {
      String[] var2 = var1.getSupportedProtocols();
      var1.setEnabledProtocols(this.enabledProtocols(var2, var1.getDefaultProtocols()));
      var2 = var1.getSupportedCipherSuites();
      var1.setEnabledCipherSuites(this.enabledCipherSuites(var2, var1.getDefaultCipherSuites()));
      if (this.isNeedClientAuth() != null) {
         var1.setNeedClientAuth(this.isNeedClientAuth());
      }

      if (this.isWantClientAuth() != null) {
         var1.setWantClientAuth(this.isWantClientAuth());
      }

      Boolean var4;
      if ((var4 = this.hostnameVerification) != null) {
         ((ContextAwareBase)this).addInfo("hostnameVerification=" + var4);
         var1.setHostnameVerification(this.hostnameVerification);
      }

   }

   public boolean getHostnameVerification() {
      Boolean var1;
      return (var1 = this.hostnameVerification) == null ? false : var1;
   }

   public void setHostnameVerification(boolean var1) {
      this.hostnameVerification = var1;
   }

   public String getIncludedProtocols() {
      return this.includedProtocols;
   }

   public void setIncludedProtocols(String var1) {
      this.includedProtocols = var1;
   }

   public String getExcludedProtocols() {
      return this.excludedProtocols;
   }

   public void setExcludedProtocols(String var1) {
      this.excludedProtocols = var1;
   }

   public String getIncludedCipherSuites() {
      return this.includedCipherSuites;
   }

   public void setIncludedCipherSuites(String var1) {
      this.includedCipherSuites = var1;
   }

   public String getExcludedCipherSuites() {
      return this.excludedCipherSuites;
   }

   public void setExcludedCipherSuites(String var1) {
      this.excludedCipherSuites = var1;
   }

   public Boolean isNeedClientAuth() {
      return this.needClientAuth;
   }

   public void setNeedClientAuth(Boolean var1) {
      this.needClientAuth = var1;
   }

   public Boolean isWantClientAuth() {
      return this.wantClientAuth;
   }

   public void setWantClientAuth(Boolean var1) {
      this.wantClientAuth = var1;
   }
}
