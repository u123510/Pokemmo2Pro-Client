package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class LinearTimelineSequence extends BaseTimelineSequence {
   public LinearTimelineSequence() {
      super(0);
      this.W1();
   }

   @Override
   public final void nr(hl0_1 var1) {
      super.nr(var1);
      if (!dw_2.u10) {
         int alpha;
         if (dw_2.Ga0 && (tw0_0.e60 == null || !tw0_0.e60.ek())) {
            alpha = 180;
         } else {
            alpha = 255;
         }
         q3_0 fade = nf_0.zo0().ik;
         if (fade.xP < alpha) {
            fade.m(-1, alpha, 500);
         }
      } else {
         long elapsed = super.ry0;
         int var4;
         if (elapsed < 200L) {
            var4 = (int)elapsed;
         } else if (elapsed < 300L) {
            var4 = (int)(200L - (elapsed - 200L));
         } else if (elapsed < 400L) {
            var4 = (int)(elapsed - 200L);
         } else if (elapsed < 600L) {
            var4 = (int)(200L - (elapsed - 400L));
         } else if (elapsed < 800L) {
            var4 = 0;
         } else {
            var4 = 0;
            int alpha;
            if (dw_2.Ga0 && (tw0_0.e60 == null || !tw0_0.e60.ek())) {
               alpha = 180;
            } else {
               alpha = 255;
            }
            q3_0 fade = nf_0.zo0().ik;
            if (fade.xP < alpha) {
               fade.m(-1, alpha, 500);
            }
         }

         nf_0.zo0().TK.m(var4, var4, 0);
      }
   }

   @Override
   public final boolean gL0() {
      if (super.gL0()) {
         nf_0.zo0().TK.m(0, 0, 0);
         return true;
      } else {
         return false;
      }
   }
}
