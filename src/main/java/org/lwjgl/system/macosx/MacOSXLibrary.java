package org.lwjgl.system.macosx;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.SharedLibrary;

public abstract class MacOSXLibrary extends SharedLibrary.Default {
   public MacOSXLibrary(String var1, long var2) {
      super(var1, var2);
   }

   public static MacOSXLibrary getWithIdentifier(String var0) {
      APIUtil.apiLog("Loading library: " + var0);
      MacOSXLibraryBundle var10000 = MacOSXLibraryBundle.getWithIdentifier(var0);
      APIUtil.apiLogMore("Success");
      return var10000;
   }

   public static MacOSXLibrary create(String var0) {
      Object var2;
      if (var0.endsWith(".framework")) {
         var2 = MacOSXLibraryBundle.create(var0);
      } else {
         MacOSXLibraryDL var1;
         var1 = new MacOSXLibraryDL(var0);
         var2 = var1;
      }

      return (MacOSXLibrary)var2;
   }
}
