package ch.qos.logback.core.util;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class LocationUtil {
   public static final String SCHEME_PATTERN = "^\\p{Alpha}[\\p{Alnum}+.-]*:.*$";
   public static final String CLASSPATH_SCHEME = "classpath:";

   public static URL urlForResource(String var0) throws MalformedURLException, FileNotFoundException {
      if (var0 != null) {
         URL var1;
         if (!var0.matches("^\\p{Alpha}[\\p{Alnum}+.-]*:.*$")) {
            var1 = Loader.getResourceBySelfClassLoader(var0);
         } else if (var0.startsWith("classpath:")) {
            String var2;
            if ((var2 = var0.substring(10)).startsWith("/")) {
               var2 = var2.substring(1);
            }

            if (var2.length() == 0) {
               throw new MalformedURLException("path is required");
            }

            var1 = Loader.getResourceBySelfClassLoader(var2);
         } else {
            var1 = new URL(var0);
         }

         if (var1 != null) {
            return var1;
         } else {
            throw new FileNotFoundException(var0);
         }
      } else {
         throw new NullPointerException("location is required");
      }
   }
}
