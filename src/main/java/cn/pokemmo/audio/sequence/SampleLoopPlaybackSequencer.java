package cn.pokemmo.audio.sequence;

import f.*;

public class SampleLoopPlaybackSequencer implements wl0_2, ix_1 {
   public final wl0_2 ga0;
   public final ux0_0 oM;
   public final ux0_0 Qk;
   public final int L20;
   public final int Nv0;
   public final boolean Nh0;
   public final Oq Ld0;

   public SampleLoopPlaybackSequencer(wl0_2 var1, ux0_0 var2, ux0_0 var3, int var4, int var5, boolean var6, Oq var7) {
      this.ga0 = var1;
      this.oM = var2;
      this.Qk = var3;
      this.L20 = var4;
      this.Nv0 = var5;
      this.Nh0 = var6;
      this.Ld0 = var7;
   }

   @Override
   public final int Nx() {
      int var1 = this.L20;
      if (this.L20 >= 0) {
         return var1;
      } else {
         ux0_0 var2;
         return this.Qk != null ? this.ga0.Nx() + (var2 = this.Qk).ZK0 + var2.Ar0 : this.ga0.Nx();
      }
   }

   @Override
   public final int Af() {
      int var1 = this.Nv0;
      if (this.Nv0 >= 0) {
         return var1;
      } else {
         ux0_0 var2;
         return this.Qk != null ? this.ga0.Af() + (var2 = this.Qk).aP + var2.W30 : this.ga0.Af();
      }
   }

   @Override
   public final void uf(rb_1 var1, int var2, int var3, int var4, int var5) {
      Oq var6 = this.Ld0;
      if (this.Ld0 == null || var6.mk0(var1)) {
         ux0_0 var11 = this.Qk;
         if (this.Qk != null) {
            int var8 = var11.ZK0;
            int var10 = var2 + var11.ZK0;
            int var7 = var3 + var11.aP;
            var4 = Math.max(0, var4 - var8 - var11.Ar0);
            ux0_0 var9 = this.Qk;
            var5 = Math.max(0, var5 - this.Qk.aP - var9.W30);
            var3 = var7;
            var2 = var10;
         }

         if (this.Nh0) {
            int var13 = var5;
            int var10001 = var4;
            var4 = Math.min(var4, this.ga0.Nx());
            var5 = Math.min(var5, this.ga0.Af());
            var2 = kq_0.lpT2(var10001, var4, 2, var2);
            var3 = kq_0.lpT2(var13, var5, 2, var3);
         }

         this.ga0.uf(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public final void GO(VT var1, int var2, int var3) {
      int var4 = this.ga0.Nx();
      int var5 = this.ga0.Af();
      this.uf(var1, var2, var3, var4, var5);
   }

   @Override
   public final ux0_0 MY() {
      return this.oM;
   }

   @Override
   public final wl0_2 so(gn_0 var1) {
      wl0_2 var7 = this.ga0.so(var1);
      ux0_0 var8 = this.oM;
      ux0_0 var2 = this.Qk;
      int var3 = this.L20;
      int var4 = this.Nv0;
      boolean var5 = this.Nh0;
      Oq var6 = this.Ld0;
      return new Q2(var7, var8, var2, var3, var4, var5, var6);
   }

   @Override
   public final LPT6_ LT() {
      return null;
   }
}
