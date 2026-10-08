package cn.pokemmo.ui.window.social;

import f.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 公会主面板与日志窗口
 *
 * 原混淆类: f.ab_1
 */
public class GuildWindow extends cx_0 implements tr_1  {
    public final ab_1 asBridge() {
        return (ab_1) (Object) this;
    }

   public static boolean oL0;
   public final M5 av0;
   public final fy_2 Do;
   public final fy_2 cW;
   public final fy_2 F8;
   public final lo0_0 zy0;
   public final fy_2 COm6;
   public final tk0_0 kq0;
   public final N0 ao0;
   public final pk_0 Qt0;
   public final cg_0 gm0;
   public final W9[][] RL;
   public final u80_0 J5;
   public final u80_0 HS;
   public final le0_2[] Fu0;
   public final cg_0 i6;
   public final JK ht;
   public final lo0_0 tE0;
   public final JK XM;
   public final Qs0 un0;
   public final F2 Rd0;
   public final cg_0 Pg;
   public final boolean R7;

   public GuildWindow(BU var1) {
      super(tw0_0.kz0());
      this.RL = new W9[pg0_0.we.length][4];
      this.Fu0 = new le0_2[pg0_0.we.length];
      pk_0 var2 = tw0_0.rl.t7();
      this.Qt0 = var2;
      this.R7 = var2.Nr0(tw0_0.e60.za0(), (short)255);
      this.uf("guildwindow");
      this.Hy(var2.kP());
      this.ff0(1);
      this.gm0 = new cg_0();
      this.Pb0(() -> LJ0(var1));
      M5 var3 = new M5();
      this.av0 = var3;
      var3.I6(false);
      fy_2 var4 = new fy_2();
      this.Do = var4;
      var4.x40(XZ.BC0(var4.lo0(), new ya_1[]{var4.H10().LPt3(var3)}, var4).Xq(var4.lo0().LPt3(var3)));
      this.cW = new fy_2();
      N0 var5 = new N0();
      this.ao0 = var5;
      ge_0 var6 = new ge_0(var5);
      var5.xc(var2.VE0().gG0());
      u80_0 var7 = new u80_0(66);
      this.HS = var7;
      var7.sl().r8(fn_0.qz0().m7());
      var7.sl().Gy0(5, 7);
      var7.RR(this::Xs);
      if (var2.hn(tw0_0.e60.za0()) == pg0_0.ze0) {
         JK var8 = new JK(var2.VE0().J50() ? 2716 : 2713);
         this.XM = var8;
         var8.RR(this::d6);
      } else {
         JK var9 = new JK(2709);
         this.XM = var9;
         var9.RR(() -> this.bw(var1));
      }

      this.un0 = new Qs0();
      lo0_0 var10 = new lo0_0(var6);
      this.tE0 = var10;
      var10.uf("motdscroll");
      cg_0 var11 = new cg_0();
      this.i6 = var11;
      var11.I7();
      JK var12 = new JK(2711);
      this.ht = var12;
      var12.RR(this::v80);
      fy_2 var13 = new fy_2();
      this.F8 = var13;
      F2 var14 = new F2(var2, asBridge());
      this.Rd0 = var14;
      var14.If0("", oL0);
      var14.Qm0(new MW(asBridge()));
      lo0_0 var15 = new lo0_0(var14);
      int var16 = 2;
      var15.Qs0(var16);
      cg_0 var17 = new cg_0();
      this.Pg = var17;
      var17.I7();
      var17.uf("editfield-search");
      W9 var18 = new W9();
      var17.Ii((int var19) -> this.rt0(var18, var19));
      var18.RR(() -> this.yk0(var18));
      var18.k50(oL0);
      Qs0 var20 = new Qs0(1682);
      var20.coM8(var18);
      var13.x40(XZ.BC0(var13.lo0(), new ya_1[]{var13.C7(var17, var18, var20).qd(tw0_0.kz0() ? 80 : 0), var13.C7(var15)}, var13).Xq(var13.hb(var17, var18, var20), var13.hb(var15)));
      fy_2 var21 = new fy_2();
      this.COm6 = var21;
      lo0_0 var22 = new lo0_0();
      this.zy0 = var22;
      var22.so();
      var22.Qs0(var16);
      tk0_0 var23 = new tk0_0();
      var23.gg0.X0();
      var23.uw().Wa(2.0F).Xs(2.0F);
      var23.uf("dialoglayout");
      var23.gg0.AH0(2749, "label-title-perm").K6();

      for (int var24 = 0; var24 < this.RL[0].length; var24++) {
         var23.gg0.AH0(2750 + var24, "label-title-perm-val").K6();
      }

      var23.Nu();
      byte var25 = 0;

      while (var25 < pg0_0.we.length) {
         pg0_0 var26 = pg0_0.vh0(var25);
         if (this.R7) {
            cg_0 var27 = new cg_0();
            this.Fu0[var25] = var27;
            var27.I7();
            var27.mm(this.Qt0.Ha0(var26));
            var27.ef0(16);
         } else {
            cn_0 var28 = new cn_0(this.Qt0.Ha0(var26));
            this.Fu0[var25] = var28;
            var28.uf("label-title-perm");
         }

         var23.Xf0(this.Fu0[var25]).K6();

         for (int var29 = 0; var29 < this.RL[var25].length; var29++) {
            W9 var30 = new W9();
            this.RL[var25][var29] = var30;
            if (var26 == pg0_0.ze0) {
               var30.pw0(false);
               var30.k50(true);
            }

            var30.pw0(this.R7);
            j1_0 var31 = var23.Xf0(var30);
            if (tw0_0.kz0()) {
               var31.K6();
               var31.Pt(140.0F);
            }
         }

         var23.Nu();
         var25 = (byte)(var25 + 1);
      }

      var23.Xf0(new le0_2()).Oj();
      this.zy0.AH0(var23);
      u80_0 var32 = new u80_0(54);
      this.J5 = var32;
      var32.sl().r8(fn_0.qz0().Zp());
      var32.sl().Gy0(5, 7);
      var32.RR(this::KE0);
      var32.pw0(this.R7);
      this.COm6.WQ(this.COm6.lo0().Xq(this.COm6.C7(this.zy0), this.COm6.H10().Ze0().Kn0(var32)));
      this.COm6.x40(this.COm6.H10().qd(tw0_0.kz0() ? 60 : 0).Xq(this.COm6.hb(this.zy0), this.COm6.hb(var32)));
      fy_2 var33 = new fy_2();
      lo0_0 var34 = new lo0_0();
      var34.Qs0(2);
      tk0_0 var35 = new tk0_0();
      this.kq0 = var35;
      var35.uf("dialoglayout");
      var34.AH0(var35);
      var33.WQ(var33.lo0());
      var33.x40(var33.H10());
      var33.kl0().X20(var33.C7(var34));
      var33.nt0().qd(tw0_0.kz0() ? 60 : 0).X20(var33.hb(var34));
      this.v30();
      this.Zv0();
      this.do$();
      this.av0.i00(2700, this.cW);
      this.av0.i00(2701, this.F8);
      this.av0.i00(2710, this.COm6);
      yt_1 var36 = tw0_0.e60;
      if (var36 != null && this.Qt0.Nr0(var36.za0(), (short)8)) {
         this.av0.i00(2719, var33).fK0(this::MK);
      }

      this.SL(this.Do);
      this.Qt0.gJ0();
   }

   public static void Qk(BU var0) {
      tw0_0.rl.fk0.uQ(new gq0_0());
      var0.hc0(false);
   }

   public static void RC0() {
      BR var0 = tw0_0.rl;
      var0.fk0.uQ(new Pu0(var0.xI0.mn0.Vj, true));
   }

   public static void Rq0() {
      BR var0 = tw0_0.rl;
      var0.fk0.uQ(new Pu0(var0.xI0.mn0.Vj, false));
   }

   public static /* synthetic */ void LJ0(BU var0) {
      var0.hc0(false);
   }

   public final void Px0(ce0_0 var1, xe_1 var2, int var3, int var4) {
      le0_2 var16 = var2;
      if (var16 == null) {
         var16 = this;
      } else {
         var3 = var16.A20;
         var4 = var16.SB0;
      }

      pg0_0 var6 = pg0_0.ze0;
      Vt0 var5 = Qy0.yI0.KC(var3, var4, var1.GG0.DR);
      if (var1.qf0 != var6 && this.Qt0.Nr0(tw0_0.e60.dj0, (short)2) || var1.qf0 != var6 && this.Qt0.Nr0(tw0_0.e60.dj0, (short)255)) {
         var5.hx.add(new _abstract());
      }

      if (var1.qf0 != var6 && this.Qt0.Nr0(tw0_0.e60.dj0, (short)2)) {
         at_0 var7 = new at_0(sm0_0.c0(2706));
         var7.eu0 = new X7(asBridge(), var1);
         String var8 = "popup-button";
         String var9 = var7.F0;
         var7.F0 = var8;
         var7.Di("theme", var9, var8);
         var5.hx.add(var7);
      }

      if (var1.qf0 != var6 && this.Qt0.Nr0(tw0_0.e60.dj0, (short)255)) {
         Vt0 var10 = new Vt0(sm0_0.c0(2707));
         pg0_0[] var11 = pg0_0.we;
         int var12 = var11.length;

         for (int var13 = 0; var13 < var12; var13++) {
            pg0_0 var14 = var11[var13];
            if (var1.qf0.b8 != var14.b8) {
               at_0 var15 = new at_0(this.Qt0.Ha0(var14));
               var15.eu0 = new da0_0(asBridge(), var14, var1);
               var10.hx.add(var15);
            }
         }

         var5.hx.add(var10);
      }

      UA.rL(var5, var16, var3, var4);
   }

   public final void HP(zk0_1 var1) {
      if (this.Qt0.mn0.J50()) {
         Qs0 var2 = this.un0;
         int var3 = this.Qt0.mn0.hr - (int)(System.currentTimeMillis() / 1000L);
         String var4;
         if (var3 < 301) {
            var4 = sm0_0.c0(2715);
         } else {
            var4 = tx_1.HU(var3, 2);
         }

         var2.Sk(sm0_0.wa0(2714, var4));
      }

      if (this.Qt0.gJ0()) {
         this.v30();
         this.ao0.xc(this.Qt0.mn0.VB);
         this.Zv0();
      }

      super.HP(var1);
   }

   public final void ZC0(short var1, zy_1[] var2) {
      if (this.Qt0 == null) {
         return;
      }

      this.kq0.gg0.OO();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         zy_1 var5 = var2[var4];
         String var6 = DateFormat.getDateTimeInstance().format(new Date((long)var5.bk * 1000L));
         String var7 = new StringBuilder("[").append(var6).append("]: ").append(sm0_0.Bx(var5.Hk.U6, new String[]{var5.RI0, var5.mB})).toString();
         j1_0 var8 = this.kq0.gg0.sw0(var7, "label-guild-log");
         var8.d80 = 2;
         var8.goto$().NA();
         var8.Yg = new vl0_0(5.0F);
         var8.Ek0 = new vl0_0(5.0F);
         var8.J90 = new vl0_0(5.0F);
         var8.Wa0();
         var8.Rr0.Rg();
      }

      if (var2.length < 1) {
         Qs0 var9 = new Qs0(6007);
         var9.uf("label-guild-log");
         j1_0 var10 = this.kq0.gg0.vx0(var9);
         var10.d80 = 2;
         var10.goto$().NA();
         var10.Yg = new vl0_0(5.0F);
         var10.Ek0 = new vl0_0(5.0F);
         var10.J90 = new vl0_0(5.0F);
         var10.Wa0();
         var10.Rr0.Rg();
      }

      xe_1 var11 = new xe_1("<<");
      var11.RR(() -> this.lG(var1));
      var11.Ll(var1 > 0);
      var11.pw0(var1 > 0);
      xe_1 var12 = new xe_1(">>");
      var12.Ll(var2.length > 0);
      var12.pw0(var2.length > 0);
      var12.RR(() -> this.mB(var1));
      j1_0 var13 = this.kq0.gg0.vx0(var11).Wa0();
      var13.Ek0 = new vl0_0(5.0F);
      var13.Yg = new vl0_0(5.0F);
      j1_0 var14 = var13.Rr0.vx0(var12).GD();
      var14.J90 = new vl0_0(5.0F);
      var14.Yg = new vl0_0(5.0F);
      var14.Rr0.Rg();
   }

   public final void Xs() {
      lg_0.k.lPT5(new wn_2(asBridge()));
   }

   public final void KE0() {
      if (!this.R7) {
         return;
      }

      short var1 = this.qg(pg0_0.Ix0);
      short var2 = this.qg(pg0_0.DK);
      short var3 = this.qg(pg0_0.Zr0);
      short var4 = this.qg(pg0_0.s60);
      short var5 = this.qg(pg0_0.MI0);
      tw0_0.rl.fk0.uQ(new ow_0(var1, var2, var3, var4, var5));
      byte var6 = 0;

      while (var6 < pg0_0.we.length) {
         pg0_0 var7 = pg0_0.vh0(var6);
         String var8 = ((wn0_0)((cg_0)this.Fu0[var6]).dI0).YA.toString();
         if (!var8.equals(this.Qt0.Ha0(var7))) {
            String var9 = sm0_0.c0(var7.r20);
            if (var8.equals(var9)) {
               var8 = "";
            } else if (var8.isEmpty()) {
               ((cg_0)this.Fu0[var6]).mm(var9);
            }

            tw0_0.rl.fk0.uQ(new RD0(var7, var8));
         }

         var6 = (byte)(var6 + 1);
      }
   }

   public final void K8() {
      if (tw0_0.kz0()) {
         this.kh0();
      }

      super.K8();
   }

   public final void x00() {
      lpt6__0.v90(this);
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         if (Qy0.af(this)) {
            return super.nd0(var1);
         }

         if (this.av0.Bb() == 1 && var1.finally$ == 34 && var1.J30 == 4) {
            this.Pg.BL();
            return true;
         }

         int var2 = var1.finally$;
         rp_0 var3 = rp_0.nK0;
         int var4 = dw_2.ff;
         if (var3 != null && var3.Ov(var2)) {
            BU.T50.hc0(false);
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void QB(short var1) {
      tw0_0.rl.fk0.uQ(new Xt0(var1));
      this.kq0.gg0.OO();
      int var2 = nf0_0.EC0;
      String var3 = "label-guild-log";
      Qs0 var4 = new Qs0(var2);
      var4.uf(var3);
      j1_0 var5 = this.kq0.gg0.vx0(var4);
      var5.goto$().NA();
      var5.Yg = new vl0_0(5.0F);
      var5.Ek0 = new vl0_0(5.0F);
      var5.J90 = new vl0_0(5.0F);
      var5.Wa0();
      var5.Rr0.Rg();
      j1_0 var6 = this.kq0.gg0.vx0(new le0_2(null, false));
      var6.i8 = 1;
   }

   public final void do$() {
      E90 var1 = tw0_0.e60.jB0;
      if (var1 == null) {
         return;
      }

      lg_0.k.lPT5(() -> this.ot0(var1));
   }

   public final void v30() {
      if (this.Qt0.mn0.J50()) {
         if (this.Qt0.mn0.J50()) {
            Qs0 var1 = this.un0;
            int var2 = this.Qt0.mn0.hr - (int)(System.currentTimeMillis() / 1000L);
            String var3;
            if (var2 < 301) {
               var3 = sm0_0.c0(2715);
            } else {
               var3 = tx_1.HU(var2, 2);
            }

            var1.Sk(sm0_0.wa0(2714, var3));
         }
      } else {
         Qs0 var4 = this.un0;
         int var5 = 2712;
         String[] var6 = new String[2];
         pk_0 var7 = this.Qt0;
         Object var8 = var7.VJ0;
         int var9;
         synchronized (var8) {
            var9 = this.Qt0.VJ0.size();
         }

         var6[0] = fp0_0.uD(new StringBuilder(), var9, "");
         var6[1] = "150";
         var4.L5 = var6;
         var4.er0(var5);
      }

      if (this.R7) {
         this.XM.D4(this.Qt0.mn0.J50() ? 2716 : 2713);
      }

      this.Rd0.tf0();
      this.do$();
   }

   public final void Zv0() {
      if (this.Qt0 == null) {
         return;
      }

      pg0_0[] var1 = pg0_0.we;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         pg0_0 var4 = var1[var3];
         boolean var5 = this.Qt0.mn0.vN(var4, (short)1);
         this.RL[var4.b8][0].ER.lK0(var5);
         var5 = this.Qt0.mn0.vN(var4, (short)2);
         this.RL[var4.b8][1].ER.lK0(var5);
         var5 = this.Qt0.mn0.vN(var4, (short)4);
         this.RL[var4.b8][2].ER.lK0(var5);
         boolean var6 = this.Qt0.mn0.vN(var4, (short)8);
         this.RL[var4.b8][3].ER.lK0(var6);
      }

      this.do$();
   }

   public final short qg(pg0_0 var1) {
      short var2 = 0;
      if (this.RL[var1.b8][0].ER.U20()) {
         var2 = 1;
      }

      if (this.RL[var1.b8][1].ER.U20()) {
         var2 = (short)(var2 | 2);
      }

      if (this.RL[var1.b8][2].ER.U20()) {
         var2 = (short)(var2 | 4);
      }

      if (this.RL[var1.b8][3].ER.U20()) {
         var2 = (short)(var2 | 8);
      }

      return var2;
   }

   public final /* synthetic */ void mB(short var1) {
      this.QB((short)(var1 + 1));
   }

   public final /* synthetic */ void lG(short var1) {
      this.QB((short)(var1 - 1));
   }

   public final void ot0(E90 var1) {
      this.cW.em();
      Hm0 var2 = D5.fE0(this.cW, this.cW);
      I7 var3 = XN.sA(this.cW, this.cW);
      if (tw0_0.kz0()) {
         if (this.Qt0.Nr0(var1.pu, (short)1)) {
            var2.X20(this.cW.C7(this.i6, this.ht).qd(80));
            var3.X20(this.cW.hb(this.i6, this.ht));
         } else {
            var3.qd(60);
         }
      }

      SimpleDateFormat var4 = new SimpleDateFormat("yyyy-MM-dd");
      Date var5 = new Date();
      var5.setTime((long)this.Qt0.mn0.Ym0 * 1000L);
      Qs0 var6 = new Qs0(var4.format(var5));
      var2.X20(new I7(this.cW).Ze0().k5(pa0_0.Mk, var6));
      var3.X20(this.cW.hb(var6));
      var2.X20(this.cW.C7(this.tE0));
      var3.X20(this.cW.hb(this.tE0));
      if (!tw0_0.kz0() && this.Qt0.Nr0(var1.pu, (short)1)) {
         var2.X20(this.cW.C7(this.i6, this.ht));
         var3.X20(this.cW.hb(this.i6, this.ht));
      }

      if (this.Qt0.Nr0(var1.pu, (short)4)) {
         var2.X20(this.cW.C7(this.HS, this.XM).Ze0().Kn0(this.un0));
         var3.X20(this.cW.hb(this.HS, this.XM, this.un0));
      } else {
         var2.X20(this.cW.C7(this.XM).Ze0().Kn0(this.un0));
         var3.X20(this.cW.hb(this.XM, this.un0));
      }

      this.cW.WQ(var2);
      this.cW.x40(var3);
      this.J5.Ll(this.Qt0.Nr0(var1.pu, (short)255));
   }

   public final /* synthetic */ void MK() {
      this.QB((short)0);
   }

   public final void yk0(W9 var1) {
      boolean var2 = var1.ER.U20();
      this.Rd0.If0(this.Pg.dI0.toString(), var2);
      oL0 = var1.ER.U20();
   }

   public final void rt0(W9 var1, int var2) {
      boolean var3 = var1.ER.U20();
      this.Rd0.If0(this.Pg.dI0.toString(), var3);
   }

   public final void v80() {
      String var1 = ((wn0_0)this.i6.dI0).YA.toString();
      tw0_0.rl.fk0.uQ(new nh_0(var1));
      this.i6.Gv("");
   }

   public final void bw(BU var1) {
      pk_0 var2 = this.Qt0;
      if (var2 == null) {
         return;
      }

      if (var2.hn(tw0_0.e60.dj0) == pg0_0.ze0) {
         Qy0.yI0.e80(sm0_0.c0(2728), null);
         return;
      }

      lpt3__4 var3 = new lpt3__4(sm0_0.c0(2727), () -> Qk(var1), asBridge());
      var3.D80 = true;
      Qy0.yI0.sr0(var3);
   }

   public final void d6() {
      pk_0 var1 = this.Qt0;
      if (var1 == null) {
         return;
      }

      if (var1.hn(tw0_0.e60.dj0) != pg0_0.ze0) {
         return;
      }

      if (this.Qt0.mn0.J50()) {
         Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(2732), ab_1::Rq0, asBridge()));
      } else {
         lpt3__4 var2 = new lpt3__4(sm0_0.c0(2731), ab_1::RC0, asBridge());
         var2.D80 = true;
         Qy0.yI0.sr0(var2);
      }
   }
}
