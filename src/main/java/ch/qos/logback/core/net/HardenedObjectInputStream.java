package ch.qos.logback.core.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HardenedObjectInputStream extends ObjectInputStream {
   private static final String[] JAVA_PACKAGES = new String[]{"java.lang", "java.util"};
   private static final int DEPTH_LIMIT = 16;
   private static final int ARRAY_LIMIT = 10000;
   private final List whitelistedClassNames;

   public HardenedObjectInputStream(InputStream var1, String[] var2) throws IOException {
      super(var1);
      this.initObjectFilter();
      ArrayList var3;
      var3 = new ArrayList();
      this.whitelistedClassNames = var3;
      if (var2 != null) {
         for(int var4 = 0; var4 < var2.length; ++var4) {
            this.whitelistedClassNames.add(var2[var4]);
         }
      }

   }

   private void initObjectFilter() {
      ((ObjectInputStream)this).setObjectInputFilter(Config.createFilter("maxarray=10000;maxdepth=16;"));
   }

   public HardenedObjectInputStream(InputStream var1, List var2) throws IOException {
      super(var1);
      this.initObjectFilter();
      ArrayList var3;
      ArrayList var10000 = var3 = new ArrayList();
      this.whitelistedClassNames = var3;
      var10000.addAll(var2);
   }

   private boolean isWhitelisted(String var1) {
      String[] var3;
      for(int var2 = 0; var2 < (var3 = JAVA_PACKAGES).length; ++var2) {
         if (var1.startsWith(var3[var2])) {
            return true;
         }
      }

      Iterator var4 = this.whitelistedClassNames.iterator();

      while(var4.hasNext()) {
         if (var1.equals((String)var4.next())) {
            return true;
         }
      }

      return false;
   }

   public Class resolveClass(ObjectStreamClass var1) throws IOException, ClassNotFoundException {
      if (this.isWhitelisted(var1.getName())) {
         return super.resolveClass(var1);
      } else {
         throw new InvalidClassException("Unauthorized deserialization attempt", var1.getName());
      }
   }

   public void addToWhitelist(List var1) {
      this.whitelistedClassNames.addAll(var1);
   }
}
