package cn.pokemmo.graphics;

import f.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 现代化重构类 - 原始混淆类: f.AP
 */
public class Modern_Gdx_Ap extends WE {

   public final void YN(BufferedReader var1) {
      try {
         super.YN(var1);
         if (var1.markSupported()) {
            var1.mark(100);
         }

         String var2;
         if ((var2 = var1.readLine()) != null) {
            if (var2.contains("independent")) {
               Boolean.parseBoolean(var2.substring(var2.indexOf(":") + 1).trim());
            } else {
               if (!var1.markSupported()) {
                  lg_0.k.Xd0("ParticleEmitter", "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
                  throw new IOException("The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
               }

               var1.reset();
            }

         } else {
            throw new IOException("Missing value: independent");
         }
      } catch (IOException var3) {
         throw sneakyThrow(var3);
      }
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> T sneakyThrow(Throwable var0) throws T {
      throw (T)var0;
   }
}

