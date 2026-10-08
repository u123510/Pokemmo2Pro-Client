package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class MapRomDataPacket extends GH {
   public byte pR;
   public byte nk;
   public byte T90;
   public byte Ez;
   public byte ze0;
   public int Mv0;
   public int kd;
   public int sH0;
   public int k4;
   public byte md0;
   public byte bp0;
   public short[] jO;
   public short[] Ui;
   public Vj[] VD0;
   public jt0_0 pP = null;
   public short bv;
   public byte Ue0;
   public tW JH;
   public s4_0 Rx0;
   public gh_0 f8;
   public boolean MH0;
   public boolean vp;
   public String uf;
   public boolean LG0;
   public short RB0 = -1;
   public final TE Da0;

   public MapRomDataPacket(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
      this.Da0 = new TE();
   }

   @Override
   public final void Oj0() {
      this.pR = super.Rj.get();
      this.nk = super.Rj.get();
      this.MH0 = tw0_0.Ll0.cOM4(this.nk);
      if (this.nk == 1 && !tw0_0.Ll0.cOM4((byte)0)) {
         this.MH0 = false;
      }
      if (!this.MH0) {
         return;
      }

      this.T90 = super.Rj.get();
      this.Ez = super.Rj.get();
      this.ze0 = super.Rj.get();
      if (this.nk == 2 || this.nk == 3 || this.nk == 4 || this.nk == 10) {
         this.RB0 = super.Rj.getShort();
         int var1 = super.Rj.get() & 255;
         for (int var2 = 0; var2 < var1; var2++) {
            this.Da0.Dc0(super.Rj.getShort(), super.Rj.getShort());
         }
         this.JH = (tW)tW.N8.BM(super.Rj.get());
         byte weatherByte1 = super.Rj.get();
         s4_0 weather1 = (s4_0)s4_0.Ai.BM(weatherByte1);
         if (weather1 == null) {
            weather1 = (s4_0)s4_0.Tb0.BM(weatherByte1);
         }
         if (weather1 == null) {
            weather1 = (this.nk == 3 || this.nk == 4) ? s4_0.OV : s4_0.rP;
         }
         this.Rx0 = weather1;
         this.f8 = (gh_0)gh_0.YC.BM(super.Rj.get());
         return;
      }

      this.Mv0 = super.Rj.getInt();
      this.kd = super.Rj.getInt();
      this.sH0 = super.Rj.getInt();
      this.k4 = super.Rj.getInt();
      this.md0 = super.Rj.get();
      this.bp0 = super.Rj.get();
      this.bv = super.Rj.getShort();
      this.Ue0 = super.Rj.get();
      this.JH = (tW)tW.N8.BM(super.Rj.get());
      byte weatherByte2 = super.Rj.get();
      s4_0 weather2 = (s4_0)s4_0.Ai.BM(weatherByte2);
      if (weather2 == null) {
         weather2 = (s4_0)s4_0.Tb0.BM(weatherByte2);
      }
      if (weather2 == null) {
         weather2 = s4_0.rP;
      }
      this.Rx0 = weather2;
      this.f8 = (gh_0)gh_0.YC.BM(super.Rj.get());
      y3.Bp0.BM(super.Rj.get());
      this.jO = new short[this.md0 * this.bp0];
      for (int var1 = 0; var1 < this.jO.length; var1++) {
         this.jO[var1] = super.Rj.getShort();
      }

      this.LG0 = (super.Rj.get() & 255) == 1;
      if (this.LG0) {
         byte[] var1 = new byte[super.Rj.getInt()];
         super.Rj.get(var1);
         byte[] var2 = FI.MH(var1);
         this.Ui = new short[var2.length / 2];
         for (int var3 = 0; var3 < this.Ui.length; var3++) {
            int var4 = var3 * 2;
            this.Ui[var3] = (short)((var2[var4] & 255) + ((var2[var4 + 1] & 255) << 8));
         }
      }

      this.VD0 = new Vj[super.Rj.get() & 255];
      for (int var1 = 0; var1 < this.VD0.length; var1++) {
         this.VD0[var1] = new Vj((dn_1)dn_1.JR.BM(super.Rj.get()), super.Rj.getInt(), this.nk, super.Rj.get(), super.Rj.get());
      }
      this.vp = (super.Rj.get() & 255) == 1;
      if (this.vp) {
         this.pE();
         this.uf = this.q60();
      }
   }

   @Override
   public final void os0() {
      if (!this.MH0) {
         this.sr0().Dv0 = fc0_0.dL0;
         this.sr0().Qw = true;
         return;
      }

      BR var1 = (BR)this.sr0();
      boolean var2 = (this.pR | 1) == this.pR;
      if (var2) {
         var1.fw = true;
         Vs0 var3 = tw0_0.ys0;
         if (var3 != null) {
            var3.Ty0();
         }
         q6_0 var4 = q6_0.EG0;
         for (int var5 = 0; var5 < var4.An0.length; var5++) {
            xc0_2 var6 = var4.An0[var5];
            Iterator var7 = var6.Vy.values().iterator();
            while (var7.hasNext()) {
               i4_0[][] var8 = ((Dz0)var7.next()).Hl0;
               for (int var9 = 0; var9 < var8.length; var9++) {
                  i4_0[] var10 = var8[var9];
                  for (int var11 = 0; var11 < var10.length; var11++) {
                     var10[var11].dispose();
                  }
               }
            }
            var6.Vy.clear();
         }
      }

      try {
         tw0_0.e60.qS(this.R2(), var2);
         if ((this.pR | 2) == this.pR) {
            vo_2 var3 = tw0_0.LD0.Sc;
            if (var3 != null) {
               var3.bw();
            }
            var1.fk0.uQ(new CD());
            BU var4 = var1.lZ.zK0;
            if (var4 != null) {
               var4.Iz(false, null);
            }
            var1.lPt9();
         }
      } catch (Exception var5) {
         var1.jp0(sm0_0.c0(nf0_0.xp0));
         Ge0.XI0.error("Error loading map data, possible corrupt rom", var5);
      }

      Qy0 var3 = var1.lZ;
      if (var3 != null) {
         BU var4 = var3.zK0;
         if (var4 != null) {
            lg_0.k.lPT5(new mf0_1(var4, this.vp));
         }
      }
   }

   public final _else R2() {
      s4_0 defaultWeather = (this.nk == 3 || this.nk == 4) ? s4_0.OV : s4_0.rP;
      s4_0 weather = this.Rx0 != null ? this.Rx0 : defaultWeather;
      if (this.nk == 2) {
         p50_0 var1 = new p50_0(tw0_0.Ll0.Qz0, J4.p5(this.T90, this.Ez), this.ze0, this.RB0, this.Da0);
         var1.lm0 = this.f8;
         var1.Jo0 = weather;
         var1.pG = this.JH;
         return var1;
      }
      if (this.nk == 3) {
         cb_0 var1 = new cb_0(tw0_0.Ll0.nC0, J4.p5(this.T90, this.Ez), this.ze0, this.RB0, this.Da0);
         var1.lm0 = this.f8;
         var1.Jo0 = weather;
         var1.pG = this.JH;
         return var1;
      }
      if (this.nk == 4) {
         hm_0 var1 = new hm_0(tw0_0.Ll0.t1, J4.p5(this.T90, this.Ez), this.ze0, this.RB0, this.Da0);
         var1.lm0 = this.f8;
         var1.Jo0 = weather;
         var1.pG = this.JH;
         return var1;
      }
      if (this.nk == 10) {
         yu_0 var1 = new yu_0(this.ze0, J4.p5(this.T90, this.Ez));
         var1.lm0 = this.f8;
         var1.Jo0 = weather;
         var1.pG = this.JH;
         return var1;
      }

      if (!this.LG0) {
         Z0 var1 = Z0.rb;
         int var2 = this.T90;
         int var3 = this.Ez;
         if (var2 == 99) {
            var2 = 2;
         }
         if (var2 == 50 && var3 == 100) {
            var3 = 1;
         }
         if (var2 == 3 && var3 == 100) {
            var3 = 5;
         }

         ng0_0 var4 = null;
         if (var2 < var1.sn.length) {
            ZT[] var5 = var1.sn[var2];
            if (var5 != null && var3 < var5.length) {
               ZT var6 = var5[var3];
               if (var6 != null) {
                  var4 = (ng0_0)var1.Ta[this.nk].x20.f5(var6.RD0);
               }
            }
         }
         if (var4 == null) {
            throw new RuntimeException(ng0_0.class.getSimpleName() + " null " + this.nk + " " + this.T90 + " " + this.Ez);
         }

         this.Ui = var4.sh0;
         short var5 = var4.VO;
         jt0_0 var6 = null;
         try {
            Xs0 var7 = Xs0.TW;
            Dn0 var8 = (Dn0)var7.co.get(var5);
            gq_1 var9 = (gq_1)var7.r0.get(var5);
            if (var8 != null && var9 != null) {
               var6 = new jo_1(var9).VW(var8.el());
               Xs0.C6.info("Loaded {} from mod file.", Short.valueOf(var5));
            }
         } catch (Exception var10) {
            Xs0.C6.error("Unable to load tmx for {}", Short.valueOf(var5), var10);
         }
         this.pP = var6;
      }

      if (tw0_0.ys0 == null) {
         tw0_0.ys0 = new Vs0();
      }
      yl_0 var1 = new yl_0(this.nk, this.T90, this.Ez, this.ze0, this.Mv0, this.kd, this.sH0, this.k4, this.md0, this.bp0);
      var1.final$ = this.pP;
      var1.hL0 = this.bv;
      int var2 = this.Ue0 & 255;
      if (var1.dw == 0) {
         var1.dr = sm0_0.c0(var2 - -139912);
      } else {
         var1.dr = sm0_0.c0(var1.dw * 1000 + 140000 + var2);
      }
      if (var1.dw == 0 && var2 == 134) {
         var1.dr = var1.dr + " " + (var1.case$ - 46) + "F";
      }
      var1.pG = this.JH;
      var1.Jo0 = weather;
      var1.lm0 = this.f8;

      boolean var3 = true;
      for (int var4 = 1; var4 < this.jO.length; var4++) {
         if (this.jO[var4] != this.jO[0]) {
            var3 = false;
         }
      }
      if (var3) {
         var1.com8 = 1;
         var1.wK0 = 1;
      }

      var1.pe0 = new go_0[var1.wK0][var1.com8];
      int var4 = 0;
      for (short var5 = 0; var5 < var1.com8; var5++) {
         for (short var6 = 0; var6 < var1.wK0; var6++) {
            go_0 var7 = new go_0(this.jO[var4++], var1, var6, var5);
            var1.pe0[var6][var5] = var7;
            var7.Z8 = var1.LL0.w3[var7.Qu];
         }
      }
      var1.OC0(this.Ui);
      var1.gE = this.VD0;

      for (Vj var5 : this.VD0) {
         yl_0 var6 = (yl_0)tw0_0.e60.E6.get(J4.iA0(var5.j6, var5.U0, var5.RT));
         if (var6 == null || !var6.kY) {
            continue;
         }
         if (var5.Oo == dn_1.sn) {
            var1.jb = var6.jb - var5.FA0 * 16;
            var1.KX = var6.KX - var1.BJ * 16;
         } else if (var5.Oo == dn_1.AR) {
            var1.jb = var6.jb - var5.FA0 * 16;
            var1.KX = var6.KX + var6.BJ * 16;
         } else if (var5.Oo == dn_1.o2) {
            var1.jb = var6.jb - var1.zC0 * 16;
            var1.KX = var6.KX - var5.FA0 * 16;
         } else if (var5.Oo == dn_1.vI) {
            var1.jb = var6.jb + var6.zC0 * 16;
            var1.KX = var6.KX - var5.FA0 * 16;
         }
         break;
      }

      var1.kY = true;
      if (this.vp) {
         var1.vB = true;
         var1.Fw = this.uf;
      }
      return var1;
   }
}
