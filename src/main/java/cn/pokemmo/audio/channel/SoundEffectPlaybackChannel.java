package cn.pokemmo.audio.channel;

import f.*;

import java.io.BufferedReader;
import java.io.IOException;

public class SoundEffectPlaybackChannel extends ZI0 {
   public float[] B8;
   public float[] hS;

   public SoundEffectPlaybackChannel() {
      float[] var1;
      float[] var10003 = var1 = new float[3];
      var10003[0] = 1.0F;
      var10003[1] = 1.0F;
      var10003[2] = 1.0F;
      this.B8 = var1;
      float[] var2;
      (var2 = new float[1])[0] = 0.0F;
      this.hS = var2;
      super.jH0 = true;
   }

   public final void LPT9(BufferedReader var1) {
      try {
         if (!super.jH0) {
            super.L9 = Boolean.parseBoolean(No.xF(var1, "active"));
         } else {
            super.L9 = true;
         }

         if (super.L9) {
            this.B8 = new float[Integer.parseInt(No.xF(var1, "colorsCount"))];
            int var2 = 0;

            while (true) {
               float[] var3 = this.B8;
               if (var2 >= this.B8.length) {
                  this.hS = new float[Integer.parseInt(No.xF(var1, "timelineCount"))];
                  var2 = 0;

                  while (true) {
                     var3 = this.hS;
                     if (var2 >= this.hS.length) {
                        return;
                     }

                     var3[var2] = Float.parseFloat(No.xF(var1, "timeline" + var2));
                     var2++;
                  }
               }

               var3[var2] = Float.parseFloat(No.xF(var1, "colors" + var2));
               var2++;
            }
         }
      } catch (IOException exception) {
         throw sneakyThrow(exception);
      }
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> T sneakyThrow(Throwable exception) throws T {
      throw (T) exception;
   }

   public final void a20(K0 var1) {
      super.L9 = var1.L9;
      super.jH0 = var1.jH0;
      float[] var2;
      this.B8 = var2 = new float[var1.B8.length];
      int var4 = var2.length;
      System.arraycopy(var1.B8, 0, var2, 0, var4);
      float[] var3;
      this.hS = var3 = new float[var1.hS.length];
      int var5 = var3.length;
      System.arraycopy(var1.hS, 0, var3, 0, var5);
   }
}
