package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

public class StringCollectionUtil {
   public static void retainMatching(Collection var0, String... var1) {
      retainMatching(var0, (Collection)Arrays.asList(var1));
   }

   public static void retainMatching(Collection var0, Collection var1) {
      if (!var1.isEmpty()) {
         Collection var10000 = var1;
         ArrayList var6;
         var6 = new ArrayList(var0.size());
         Iterator var2 = var10000.iterator();

         while(var2.hasNext()) {
            Pattern var3 = Pattern.compile((String)var2.next());
            Iterator var4 = var0.iterator();

            while(var4.hasNext()) {
               String var5;
               if (var3.matcher(var5 = (String)var4.next()).matches()) {
                  var6.add(var5);
               }
            }
         }

         var0.retainAll(var6);
      }
   }

   public static void removeMatching(Collection var0, String... var1) {
      removeMatching(var0, (Collection)Arrays.asList(var1));
   }

   public static void removeMatching(Collection var0, Collection var1) {
      Collection var10000 = var1;
      ArrayList var6;
      var6 = new ArrayList(var0.size());
      Iterator var2 = var10000.iterator();

      while(var2.hasNext()) {
         Pattern var3 = Pattern.compile((String)var2.next());
         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            String var5;
            if (var3.matcher(var5 = (String)var4.next()).matches()) {
               var6.add(var5);
            }
         }
      }

      var0.removeAll(var6);
   }
}
