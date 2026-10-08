package cn.pokemmo.audio;

import f.*;

/**
 * 现代化重构类 - 原始类: f.Sr
 */
public abstract class SoundSampleStream implements fy0_0 {

   public static final C8 HN = new C8();
   public static final C8 Sv0 = new C8();
   public final byte L9;
   public BJ0 Ns;
   public U5 nm0;
   public ER iD0;
   public final es_1 og0 = new es_1(6);
   public int VK0 = 0;
   public float Xb = 0.0F;
   public int Js = -1;
   public Tz0 SA;
   public pw_1 Con;
   public pw_1 VE;
   public Ou0[] YM;
   public com3__3 Wr0;

   public SoundSampleStream(byte var1) {
      this.L9 = var1;
      this.cJ();
      this.qL(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   public void cJ() {
      this.Ns = new BJ0();
      (this.nm0 = new U5()).LPT8(new PRN_(PRN_.xE, 1.0F, 1.0F, 1.0F, 1.0F));
      mv_0 var1 = new mv_0();
      var1.el = 32;
      this.iD0 = new ER(new XB(var1), new com5__6());
      tw0_0.rl.xm = this::COm4;
   }

   public void DA() {
      this.Xb = 99999.0F;
      this.VK0 = 1;
   }

   public void O70() {
   }

   public abstract void nm();

   public void E7() {
      this.Xb = 0.0F;
      this.VK0 = 3;
   }

   public int J7(int var1) {
      if (var1 < 0) {
         var1 = 2;
      } else if (var1 > 2) {
         var1 %= 3;
      }

      int var2 = this.Js;
      if (this.Js == var1) {
         return -2;
      }

      this.Js = var1;
      if (var2 > -1) {
         this.TO(var2);
      }

      Ou0 var10001 = this.YM[this.Js];
      this.YM[this.Js].PE0 = 1.0F;
      var10001.sC0(0, true, null);
      return var2;
   }

   public void TO(int var1) {
      this.YM[var1].EG();
   }

   public void Iu() {
      pw_1 var1 = this.Con;
      if (this.Con != null && var1.BJ0()) {
         this.Con = null;
      }

      float var2;
      float var10000 = var2 = this.Xb + lg_0.S4.uL;
      this.Xb = var2;
      if (var10000 < 0.0F || var2 >= Float.MAX_VALUE) {
         this.Xb = 0.0F;
      }

      I2 var3 = this.og0.ZD();

      while (var3.hasNext()) {
         ((Ou0)var3.next()).bo0(this.Xb);
      }
   }

   public void qL(int var1, int var2) {
      BJ0 var10000 = this.Ns;
      BJ0 var10001 = this.Ns;
      this.Ns.Ui = var1;
      var10001.yG = var2;
      var10000.ye(true);
   }

   public void Kk(boolean var1) {
      if (!var1) {
         int var2 = lg_0.S4.Kr0();
         int var3 = lg_0.S4.sD0();
         CI0.r40(0, 0, var2, var3);
      }
   }

   public void Dq() {
      es_1 var1 = this.og0;
      this.iD0.A80(var1, this.nm0);
      com3__3 var2 = this.Wr0;
      if (this.Wr0 != null && this.Js > -1) {
         this.iD0.Lh0(var2, this.nm0);
      }
   }

   public void Ct0() {
   }

   public void LK0() {
      this.Kk(false);
      this.iD0.jK(this.Ns);
      this.Dq();
      this.iD0.end();
      this.Ct0();
      this.Kk(true);
   }

   @Override
   public void dispose() {
      I2 var1 = this.og0.ZD();

      while (var1.hasNext()) {
         ((Ou0)var1.next()).O4();
      }

      this.SA.dispose();
      pw_1 var2 = this.Con;
      if (this.Con != null) {
         var2.w6 = true;
      }

      pw_1 var3 = this.VE;
      if (this.VE != null) {
         var3.w6 = true;
      }

      this.og0.clear();
      ((uu_0)this.iD0.KF).dispose();
   }

   public final boolean COm4(boolean var1, int var2) {
      if (this.VK0 == 4) {
         return false;
      }

      if (!var1) {
         return true;
      }

      rp_0 var3 = rp_0.I90;
      if (rp_0.I90 == null || !var3.Ov(var2)) {
         rp_0 var4 = rp_0.Ni;
         if (rp_0.Ni == null || !var4.Ov(var2)) {
            rp_0 var5 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var5.Ov(var2)) {
               int var7 = this.VK0;
               if (var7 == 1 && this.Js > -1) {
                  this.Xb = 0.0F;
                  this.VK0 = 2;
                  this.O70();
               } else if (var7 == 2 && this.Js > -1) {
                  this.nm();
               }
            } else {
               rp_0 var6 = rp_0.nK0;
               if (rp_0.nK0 != null && var6.Ov(var2) && this.VK0 == 2) {
                  this.DA();
               }
            }
         } else if (this.VK0 == 1 && this.Con == null) {
            this.J7(this.Js + 1);
         }
      } else if (this.VK0 == 1 && this.Con == null) {
         this.J7(this.Js - 1);
      }

      return true;
   }

   public void Ac(int var1, D2 var2) {
      this.nm();
   }
}
