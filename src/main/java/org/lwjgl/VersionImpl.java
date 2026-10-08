package org.lwjgl;

final class VersionImpl {
   public VersionImpl() {
   }

   public static String find() {
      Package var0;
      String var1;
      String var10000 = var1 = (var0 = Version.class.getPackage()).getSpecificationVersion();
      String var2 = var0.getImplementationVersion();
      if (var10000 != null && var2 != null) {
         return Version.createImplementation(var1, var2);
      } else {
         return (var2 = Version.findImplementationFromManifest()) != null ? var2 : "-snapshot";
      }
   }
}
