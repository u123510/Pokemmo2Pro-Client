package cn.pokemmo.ui.window.map;

import f.*;
import cn.pokemmo.ui.widget.text.tag.PlayerTitleTagLabel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 地区全景城镇地图窗口
 *
 * 原混淆类: f.lf0_0
 */
public class TownMapWindow extends cx_0 implements tr_1  {
    public final lf0_0 asBridge() {
        return (lf0_0) (Object) this;
    }

   public final BU Wh0;
   public final Runnable Yy0;
   public final fy_2 sy0;
   public final qj_2 yD0;
   public final qj_2 Va;
   public S70 kF;
   public final ia0_1 z40;
   public final ia0_1 n00;
   public final cn_0 KJ0;
   public final cn_0 TP;
   public final cn_0 gF0;
   public final OT cI0;
   public final qj_2 MA0;
   public final S70 fi;
   public final S70 yr;
   public final cn_0 a90;
   public Fr0 uG = null;
   public dg_1 BT = null;
   public int Gf0 = 0;
   public int Sz = 0;
   public int Kv = -1;
   public int vm0 = -1;
   public int pc0 = 0;
   public int Jj = 0;
   public int gc = 0;
   public int Ht = 0;
   public int XJ0 = 0;
   public float HI = 0.0F;
   public float uo0 = 0.0F;
   public int EZ = 8;
   public int DA = 0;
   public int rE0 = 0;
   public int rC0 = 8;
   public final ArrayList<le0_2> cOM5;
   public final ArrayList<le0_2> Aw;
   public final ArrayList<le0_2> aX;
   public boolean Yd0;
   public final int ax;
   public final int CE0;
   public final nC Xo;
   public boolean El0;
   public long yw0;
   public final List Ca0;

   public TownMapWindow(BU var1, tl0_0 var2) {
      super(tw0_0.kz0());
      ArrayList var3;
      var3 = new ArrayList();
      this.cOM5 = var3;
      var3 = new ArrayList();
      this.Aw = var3;
      var3 = new ArrayList();
      this.aX = var3;
      this.Yd0 = true;
      this.El0 = false;
      long var32 = System.currentTimeMillis();
      this.yw0 = var32;
      byte var33;
      List ca0 = null;
      if (N50.Aa(var33 = nUL())) {
         ca0 = nl_0.hJ0(var33);
      }

      this.Ca0 = ca0;

      byte var34;
      if (tw0_0.kz0()) {
         var34 = 4;
      } else {
         var34 = 3;
      }

      this.ax = var34;
      float var4;
      int var5 = (int)Math.floor((var4 = var34) * 0.75F);
      this.CE0 = var5;
      this.Wh0 = var1;
      this.Yy0 = var2;
      this.Pb0(() -> lf0_0.x00(var1));
      this.LPT8(new N1(asBridge(), new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1)));
      this.uf("town-map");
      this.Hy(gu0.Az0().lPT6((short)5442).getName());
      this.sy0 = new fy_2();
      OT var9 = new OT(0, 0, (E90)null);
      this.cI0 = var9;
      var9.Ll(false);
      var9.VL0(var5);
      int var6 = var34 * 12;
      qj_2 var24 = new qj_2("", var6, var6);
      this.yD0 = var24;
      var24.uf("townmap-cursor");
      var24.Oq0(false);
      if (nUL() == 2) {
         var24.sl().Nk(new Wr[]{tw0_0.Ll0.Qz0.ma0[7]});
         var24.sl().nq0(var34 * 16, var34 * 16);
         var24.sl().Gy0(0, var34 * -16);
         int var10 = var5 * -17;
         var9.Te0(var10, var5 * -14);
      } else if (nUL() == 3) {
         var24.sl().Nk(tw0_0.Ll0.nC0.gh);
         var24.sl().dA(var4);
         var24.sl().Gy0(var34 * -4, var34 * -4);
         var24.sl().hG();
         int var11 = var5 * -23;
         var9.Te0(var11, var5 * -22);
      } else if (nUL() == 4) {
         var24.sl().Nk(tw0_0.Ll0.t1.Hq0);
         var24.sl().dA(var4);
         var24.sl().Gy0(var34 * -4, var34 * -4);
         var24.sl().hG();
         int var12 = var5 * -23;
         var9.Te0(var12, var5 * -22);
      } else {
         var24.sl().o60(i5_0.Jg0().hf0());
         var24.sl().nq0(var6, var6);
         var24.sl().Gy0(var34 * -2, var34 * -2);
         var24.sl().hG();
         int var13 = var5 * -23;
         var9.Te0(var13, var5 * -21);
      }

      var24.RR(this::uC);
      Wr[] var14 = new Wr[6];

      for (int var25 = 0; var25 < 6; var25++) {
         var14[var25] = tw0_0.Ll0.Qz0.ma0[14 - var25];
      }

      this.Va = new qj_2("", 0, 0);
      this.Va.uf("townmap-cursor");
      this.Va.Oq0(false);
      this.Va.sl().Nk(var14);
      Br0 var10005 = this.Va.sl();
      int var15 = var14[0].zz() * this.ax;
      var10005.nq0(var15, var14[0].K0() * this.ax);
      this.Va.sl().Ic();
      this.Va.sl().C80(125);
      this.Va.sl().hG();
      this.Va.Ll(false);
      this.Va.RR(this::be0);
      this.z40 = new ia0_1(2);
      ia0_1 var43 = this.z40;
      pa0_0 var17 = pa0_0.xE;
      var43.LPT2(pa0_0.xE);
      cn_0 var27 = new cn_0("");
      this.KJ0 = var27;
      cn_0 var28 = new cn_0("");
      this.TP = var28;
      cn_0 var35 = new cn_0("");
      this.gF0 = var35;
      var43.SL(var27);
      var43.SL(var28);
      var43.SL(var35);
      this.n00 = new ia0_1(1);
      ia0_1 var44 = this.n00;
      var44.LPT2(var17);
      var44.uf("townmap-swarm-indicator");
      this.yr = new S70(32, 32, 0);
      this.yr.JH().Gy0(3, -5);
      cn_0 var19 = new cn_0("");
      this.a90 = var19;
      var19.uf("townmap-label");
      var44.SL(this.yr);
      var44.SL(var19);
      this.MA0 = new qj_2("", this.ax * 16, this.ax * 16);
      this.MA0.uf("switch-map");
      this.MA0.RR(() -> {
         if (nUL() == 0) {
            if (this.pc0 >= 3) {
               this.pc0 = -1;
            }

            this.oC(nUL(), this.pc0 + 1);
         }
      });
      this.Xo = UM.A7().nUl(nUL());
      this.fi = new S70(1, 1, 0);
      this.SL(this.sy0);
      byte var46 = nUL();
      int var22 = dv0();
      this.oC(var46, var22);
   }

   public static void x00(BU var0) {
      var0.Iz(false, null);
   }

   public static byte nUL() {
      yt_1 var0 = tw0_0.e60;
      return tw0_0.e60 != null && var0.N60() != null ? tw0_0.e60.N60().dw : 2;
   }

   public static int dv0() {
      if (nUL() == 0 && tw0_0.Ll0.YB0 != null) {
         zv_2 var0 = tw0_0.e60.jB0.ba0;
         byte var1 = var0.o0;
         vf_0 var2;
         if ((var2 = nl_0.p80(J4.iA0(tw0_0.e60.jB0.ba0.uS, var1, var0.ID0))) != null) {
            return var2.bQ;
         }
      }

      return 0;
   }

   public final boolean Rt0() {
      return false;
   }

   public final void Ax(dg_1 var1) {
      dg_1 var2 = this.BT;
      if (var1 != this.BT) {
         this.BT = var1;
         if (var2 != null) {
            var2.tp0.ug = false;
            var2.cI();
         }

         if (var1 != null) {
            if (var1.W4 && var1.Ki0.MF0) {
               var1.tp0.ug = true;
            }

            var1.cI();
            int var5 = var1.A20;
            int var6 = var1.Mx / 2 + var5;
            int var3 = var1.SB0;
            this.Va.E40(var6, var1.OB / 2 + var3);
            RP var7 = var1.Ki0;
            byte var11 = var1.Ki0.eW;
            if (var1.Ki0.eW == 2) {
               this.Kv = var7.l40;
               this.vm0 = var7.fQ;
               this.K8();
               short var8 = var1.Ki0.Yr0;
               this.KJ0.Sk(((ug_0)tw0_0.Ll0.Qz0.Pq.Sx0[var8]).getName());
            } else if (var11 == 3) {
               this.Gf0 = var7.l40;
               this.Sz = var7.fQ;
               this.KJ0.Sk(var7.zh0());
               this.COm3();
            } else if (var11 == 4) {
               this.Gf0 = var7.l40;
               this.Sz = var7.fQ;
               UY var9 = tw0_0.Ll0.t1;
               this.KJ0.Sk(((Ao0)var9.Za0.Sx0[var7.Yr0]).getName());
               this.COm3();
            }
         } else {
            this.KJ0.Sk("");
         }

         if (nUL() == 2) {
            qj_2 var4 = this.Va;
            boolean var10;
            if (var1 != null) {
               var10 = true;
            } else {
               var10 = false;
            }

            var4.Ll(var10);
         }

         this.Qi0();
      }
   }

   public final void x00() {
      lpt6__0.v90(this);
   }

   public final void C(zk0_1 var1) {
      super.C(var1);
      this.K8();
      this.N80(pa0_0.Ol);
      lpt6__0.v90(this);
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var2)) {
            dg_1 var4 = this.BT;
            if (this.BT != null) {
               a7_0.bH(var4.ER.Fc0);
               return true;
            }

            if (this.Gf0 == 21 && this.Sz == 13 && nUL() == 0) {
               if (this.pc0 == 3) {
                  this.pc0 = -1;
               }

               this.oC(nUL(), this.pc0 + 1);
               return true;
            }

            this.dq(this.uG);
            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            this.Wh0.Iz(false, null);
            return true;
         }

         if (var2 == 66 && nUL() == 0) {
            if (this.pc0 == 3) {
               this.pc0 = -1;
            }

            this.oC(nUL(), this.pc0 + 1);
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void U2(int var1, int var2) {
      int var3 = 0;
      int var4 = 21;
      int var5 = 14;
      if (nUL() == 1) {
         var3 = 0;
         var4 = 27;
         var5 = 14;
      } else if (nUL() == 2) {
         var3 = 0;
         var4 = this.rC0 * 31;
         var5 = this.rC0 * 21;
      } else if (nUL() == 3) {
         var3 = 6;
         var4 = 28;
         var5 = 28;
      } else if (nUL() == 4) {
         var3 = 0;
         if (tw0_0.rl.yh0.Ny((byte)4, (short)1490)) {
            var4 = 31;
         } else {
            var4 = 27;
         }

         var5 = 19;
      }

      int var6 = this.Kv;
      if (this.Kv > 0) {
         var1 = this.EZ / 2 * var1;
         var2 = this.EZ / 2 * var2;
         if ((var1 = var6 + var1) > var4) {
            return;
         }

         if ((var2 = this.vm0 + var2) > var5) {
            return;
         }

         if (var1 < 0) {
            return;
         }

         if (var2 < var3) {
            return;
         }

         this.Kv = var1;
         this.vm0 = var2;
         this.Oz(var1, var2);
      } else {
         if ((var1 = this.Gf0 + var1) > var4) {
            return;
         }

         if ((var2 = this.Sz + var2) > var5) {
            return;
         }

         if (var1 < 0) {
            return;
         }

         if (var2 < var3) {
            return;
         }

         Fr0 var12 = null;
         label119: {
            this.Gf0 = var1;
            this.Sz = var2;
            this.Oz(var1, var2);
            var1 = this.pc0;
            var2 = this.Gf0;
            var3 = this.Sz;
            List var20 = this.Ca0;
            if (this.Ca0 != null) {
               Iterator var21 = var20.iterator();

               while (var21.hasNext()) {
                  Fr0 var22;
                  if ((var22 = (Fr0)var21.next()).Ik == nUL() && var22.rY == var1 && var22.cI == var2 && var22.jE0 == var3) {
                     byte var23 = var22.Ik;
                     if (tw0_0.rl.yh0.Ny(var23, var22.KQ)) {
                        var23 = tw0_0.e60.jB0.Vv;
                        byte var7 = var22.kz0;
                        if (var22.kz0 <= -1 || var23 == var7) {
                           var12 = var22;
                           break label119;
                        }
                     }
                  }
               }
            }

            var12 = null;
         }

         this.uG = var12;
      }

      this.COm3();
      long var13 = System.currentTimeMillis();
      long var19 = nUL() == 2 ? 50 : 100;
      this.yw0 = var13 + var19;
   }

   public final void HP(zk0_1 var1) {
      if (this.Of()) {
         byte var2 = 1;
         if (System.currentTimeMillis() >= this.yw0) {
            Yo0 var3 = tw0_0.iE;
            if (tw0_0.iE != null) {
               if (var3.dH0(rp_0.Ni)) {
                  this.U2(var2, 0);
               }

               if (tw0_0.iE.dH0(rp_0.I90)) {
                  this.U2(-1, 0);
               }

               if (tw0_0.iE.dH0(rp_0.kC0)) {
                  this.U2(0, -1);
               }

               if (tw0_0.iE.dH0(rp_0.synchronized$)) {
                  this.U2(0, var2);
               }
            }
         }
      }

      if (this.Xo != null) {
         MD0 var4 = dz_2.H7;
         this.fi.M.j70(dz_2.H7, true);
         this.yr.M.j70(var4, true);
      }

      super.HP(var1);
   }

   public final void K8() {
      if (tw0_0.kz0()) {
         if (super.Em0 != null) {
            this.kh0();
         }
      } else {
         fy_2 var1 = this.sy0;
         int var2 = this.sy0.e80 + var1.NV + this.kF.Mx;
         int var5 = var1.y9 + var1.Cz + this.kF.OB;
         this.gC0(var2, var5);
      }

      int var6 = this.Kv;
      int var38;
      qj_2 var10000;
      int var10002;
      if (this.Kv > 0) {
         var10000 = this.yD0;
         fy_2 var7 = this.sy0;
         int var17 = this.sy0.A20 + var7.e80;
         int var3 = this.ax;
         var38 = var6 * this.ax + var17;
         var10002 = this.vm0 * var3 + var7.SB0 + var7.y9;
      } else {
         var10000 = this.yD0;
         fy_2 var8 = this.sy0;
         var38 = this.sy0.A20 + var8.e80;
         int var18 = this.rC0;
         var38 = this.Gf0 * this.rC0 + var38 + this.DA;
         var10002 = this.Sz * var18 + var8.SB0 + var8.y9 + this.rE0;
      }

      var10000.E40(var38, var10002);
      fy_2 var9 = this.sy0;
      var38 = this.sy0.A20 + var9.e80;
      int var19 = this.rC0;
      this.cI0.E40(this.Jj * this.rC0 + var38 + this.DA, this.gc * var19 + var9.SB0 + var9.y9 + this.rE0);
      if (!this.fi.og.AU()) {
         fy_2 var10 = this.sy0;
         var38 = this.sy0.A20 + var10.e80;
         var19 = this.rC0;
         this.fi.E40(this.Ht * this.rC0 + var38 + this.DA, this.XJ0 * var19 + var10.SB0 + var10.y9 + this.rE0);
      }

      if (nUL() == 0) {
         ia0_1 var11 = this.z40;
         fy_2 var21 = this.sy0;
         int var30 = this.sy0.A20 + var21.e80 + 22;
         var19 = this.sy0.SB0 + var21.y9;
         byte var4;
         if (tw0_0.kz0()) {
            var4 = 45;
         } else {
            var4 = 30;
         }

         var11.E40(var30, var19 + var4);
      } else {
         ia0_1 var37;
         if (nUL() == 3) {
            ia0_1 var12 = this.z40;
            fy_2 var23 = this.sy0;
            var19 = this.sy0.A20 + var23.e80;
            int var31;
            if (tw0_0.kz0()) {
               var31 = 110;
            } else {
               var31 = 80;
            }

            var19 += var31;
            fy_2 var32 = this.sy0;
            var31 = this.sy0.SB0 + var32.y9;
            byte var35;
            if (tw0_0.kz0()) {
               var35 = 12;
            } else {
               var35 = 4;
            }

            var37 = var12;
            var38 = var19;
            var10002 = var35 * this.ax + var31;
         } else {
            ia0_1 var13;
            int var34;
            byte var36;
            if (nUL() == 2) {
               var13 = this.z40;
               fy_2 var26 = this.sy0;
               var34 = this.sy0.A20 + var26.e80 + 22;
               var19 = this.sy0.SB0 + var26.y9;
               if (tw0_0.kz0()) {
                  var36 = 12;
               } else {
                  var36 = 8;
               }
            } else {
               var13 = this.z40;
               fy_2 var28 = this.sy0;
               var34 = this.sy0.A20 + var28.e80 + 22;
               var19 = this.sy0.SB0 + var28.y9;
               if (tw0_0.kz0()) {
                  var36 = 7;
               } else {
                  var36 = 4;
               }
            }

            var37 = var13;
            var38 = var34;
            var10002 = var36 * this.ax + var19;
         }

         var37.E40(var38, var10002);
      }

      if (tw0_0.kz0() ^ true) {
         fy_2 var14 = this.sy0;
         this.n00.E40(this.sy0.A20 + var14.e80, var14.SB0 + var14.OB);
      }

      fy_2 var15 = this.sy0;
      float var29;
      this.MA0.E40(this.sy0.A20 + var15.e80 + (int)((var29 = this.ax) * 172.0F), var15.SB0 + var15.y9 + (int)(var29 * 116.0F));
      super.K8();
      if (tw0_0.kz0()) {
         var6 = this.kF.Mx;
         this.sy0.oY(var6, this.kF.OB);
         this.sy0.A20(pa0_0.dC0, 0, super.y9);
      }
   }

   public final void dq(Fr0 var1) {
      if (var1 != null && this.Yd0) {
         boolean var2;
         if (var1 != this.uG) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.uG = var1;
         if (tw0_0.kz0() && var2) {
            Fr0 var10002 = this.uG;
            short var4;
            this.Gf0 = var4 = this.uG.cI;
            short var5;
            this.Sz = var5 = var10002.jE0;
            this.Oz(var4, var5);
            return;
         }

         byte var3 = this.uG.g0;
         tw0_0.rl.fk0.uQ(new rp_2(var3));
         this.Wh0.Iz(false, null);
      }
   }

   public final void oC(byte var1, int var2) {
      int var3 = 0;
      VU[] var4;
      int var5 = (var4 = tw0_0.rl.r1(_volatile.BV).y0()).length;

      for (int var6 = 0; var6 < var5; var6++) {
         VU var7;
         if ((var7 = var4[var6]) != null && !var7.I8.vn() && var7.I8.Mb((short)19)) {
            var3 = 1;
         }
      }

      RJ0 var10000 = tw0_0.rl.NC[1];
      byte var59 = 1;
      if (var10000.Dj0((byte)-1, (short)1181, var59)) {
         var3 = 1;
      }

      label522: {
         switch (nUL()) {
            case 0:
               if (tw0_0.rl.yh0.Ny((byte)0, (short)2082)) {
                  break label522;
               }
               break;
            case 1:
               if (tw0_0.rl.yh0.Ny((byte)1, (short)2156)) {
                  break label522;
               }
               break;
            case 2:
               if (tw0_0.rl.yh0.Ny((byte)2, (short)1525)) {
                  break label522;
               }
               break;
            case 3:
               if (tw0_0.rl.yh0.Ny((byte)3, (short)1363)) {
                  break label522;
               }
               break;
            case 4:
               if (tw0_0.rl.yh0.Ny((byte)4, (short)1365)) {
                  break label522;
               }
               break;
            default:
               break label522;
         }

         var3 = 0;
      }

      this.Yd0 = var3 != 0;
      if (var2 >= 0 && (var1 != 0 || var2 < i5_0.Jg0().oY.length)) {
         this.HI = 0.0F;
         this.uo0 = 0.0F;
         if (var1 == 1 || var1 == 0) {
            this.HI = 8.0F;
            this.uo0 = 16.0F;
         }

         this.sy0.em();
         this.aX.clear();
         this.cOM5.clear();
         this.Aw.clear();
         this.pc0 = var2;
         Xm0 var60;
         if (var1 == 1) {
            Wr var34;
            (var34 = i5_0.Jg0().HN).getClass();
            Xm0 var182 = var60 = new Xm0(var34);
            var182.lpT6(0, 0, 256, 160);
         } else if (var1 == 0) {
            Wr var35;
            (var35 = i5_0.Jg0().ij[this.pc0]).getClass();
            Xm0 var183 = var60 = new Xm0(var35);
            var183.lpT6(24, 16, 192, 144);
         } else if (var1 == 3) {
            Wr var36 = tw0_0.Ll0.nC0.U3;
            tw0_0.Ll0.nC0.U3.getClass();
            var60 = new Xm0(var36);
            this.HI = 21.0F;
            this.uo0 = -39.0F;
            this.EZ = 7;
         } else if (var1 == 4) {
            Wr var37 = tw0_0.Ll0.t1.U9;
            AG0 var61 = new AG0(var37, 0, 0, tw0_0.rl.yh0.Ny((byte)4, (short)1490) ? 256 : 224, 160);
            byte var97 = 0;
            byte var120 = 0;
            short var139;
            if (tw0_0.rl.yh0.Ny((byte)4, (short)1490)) {
               var139 = 256;
            } else {
               var139 = 224;
            }

            var60 = new Xm0(var61);
         } else {
            Wr var39 = tw0_0.Ll0.Qz0.sz0;
            tw0_0.Ll0.Qz0.sz0.getClass();
            var60 = new Xm0(var39);
         }

         var3 = this.ax;
         this.rC0 = this.EZ * this.ax;
         float var41;
         this.DA = (int)(this.HI * (var41 = var3));
         this.rE0 = (int)(this.uo0 * var41);
         S70 var42;
         S70 var184 = var42 = new S70(var60.bz * this.ax, var60.xZ * this.ax, 0);
         var5 = this.ax;
         this.kF = var42;
         var184.og.r8(new LPT6_[]{var60});
         S70 var43 = this.kF;
         Br0 var185 = this.kF.og;
         Br0 var10001 = this.kF.og;
         Br0 var99;
         Br0 var10002 = var99 = this.kF.og;
         byte var62 = 0;
         var99.gY = 0;
         var99.a4 = var62;
         int var63 = this.ax;
         var5 = var60.bz * this.ax;
         int var64 = var60.xZ * var63;
         var10002.OA0 = true;
         var10001.IF = var5;
         var185.gx0 = var64;
         this.sy0.F9(this.sy0.fU(), var43);
         int var186 = this.ax;
         this.Jj = this.ax * 16;
         this.gc = var186 * 24;
         this.cI0.Ll(false);
         int var44 = 0;
         boolean var65 = false;
         nC var101 = this.Xo;
         if (this.Xo != null) {
            if (var101.YV) {
               short var121 = var101.kW;
               if (var101.kW > 0) {
                  this.fi.og.o60(yh_0.Xm0.qC0(yh_0.Ed(var101.Bt, var121), (byte)-1, true));
               } else {
                  this.fi.og.r8(new LPT6_[]{fn_0.qz0().Ft0});
                  var65 = true;
               }
            } else {
               short var102 = var101.kW;
               this.fi.og.o60(yh_0.Xm0.qC0(yh_0.Ed(var101.Bt, var102), (byte)-1, false));
            }

            Br0 var66 = this.fi.og;
            this.fi.og.EJ0 = 2.0F;
            byte var67;
            byte var103;
            Br0 var188;
            if (var65) {
               var188 = var66;
               var10001 = var66;
               var67 = -10;
               var103 = -16;
            } else if (this.Xo.DH != null) {
               var188 = var66;
               var10001 = var66;
               var67 = -18;
               var103 = -30;
            } else {
               var188 = var66;
               var10001 = var66;
               var67 = -22;
               var103 = -32;
            }

            var10001.gY = var67;
            var188.a4 = var103;
         } else {
            this.fi.og.lo0();
            this.fi.Ll(false);
         }

         label498: {
            label497: {
               label496: {
                  if (var1 == 0) {
                     qj_2 var68 = this.MA0;
                     this.sy0.F9(this.sy0.fU(), var68);

                     for (int var69 = 0; var69 < 22; var69++) {
                        for (int var104 = 0; var104 < 15; var104++) {
                           if (i5_0.Jg0().Gt[this.pc0][var104][var69] != 0) {
                              int var122 = 0;
                              Iterator var140 = this.Ca0.iterator();

                              while (var140.hasNext()) {
                                 Fr0 var8;
                                 if ((var8 = (Fr0)var140.next()).cI == var69 && var8.jE0 == var104) {
                                    var122 = 1;
                                    break;
                                 }
                              }

                              qj_2 var141;
                              qj_2 var196 = var141 = new qj_2("", this.ax * 8, this.ax * 8);
                              var196.tp0.Nk(new Wr[]{i5_0.Jg0().Oy0});
                              Br0 var150 = var196.tp0;
                              byte var9;
                              if (var122 != 0) {
                                 var9 = 7;
                              } else {
                                 var9 = 0;
                              }

                              if (var122 != 0) {
                                 var122 = (byte)7;
                              } else {
                                 var122 = (byte)0;
                              }

                              var150.gY = var9;
                              var150.a4 = var122;
                              var122 = this.ax * 8;
                              var150.OA0 = true;
                              var150.IF = var122;
                              var150.gx0 = var122;
                              var141.uf("townmap-cursor");
                              var122 = this.rC0;
                              int var151 = var69 * this.rC0 + this.DA;
                              var141.E40(var151, var104 * var122 + this.rE0);
                              this.cOM5.add(var141);
                           }
                        }
                     }

                     zv_2 var70 = tw0_0.e60.jB0.ba0;
                     byte var105 = var70.o0;
                     vf_0 var106;
                     vf_0 var189 = var106 = nl_0.p80(J4.iA0(tw0_0.e60.jB0.ba0.uS, var105, var70.ID0));
                     byte var126 = -1;
                     byte var142 = -1;
                     vf_0 var152 = nl_0.Xp0;
                     if (var189 != nl_0.Xp0 && var106.bQ == var2) {
                        short var71 = var70.Lq0;
                        var126 = var106.o4(var71, var70.B5, tw0_0.e60.oh0);
                        var142 = var106.JM(var70.B5, tw0_0.e60.oh0);
                        this.Gf0 = var126;
                        this.Sz = var142;
                        this.Jj = var126;
                        this.gc = var142;
                        OT var72 = this.cI0;
                        boolean var158;
                        if (var106.bQ == var2) {
                           var158 = true;
                        } else {
                           var158 = false;
                        }

                        var72.Ll(var158);
                     }

                     nC var73 = this.Xo;
                     if (this.Xo != null) {
                        byte var74 = var73.Lk0;
                        vf_0 var75 = nl_0.p80(J4.iA0(var73.LpT6, var74, var73.x20));
                        if (var106 != var152 && var75.bQ == var2) {
                           var44 = this.Xo.qg;
                           this.Ht = var75.o4(var44, this.Xo.jJ, -1);
                           this.XJ0 = var75.JM(this.Xo.jJ, -1);
                           var44 = 1;
                        }
                     }

                     this.Oz(var126, var142);
                  } else {
                     if (var1 == 1) {
                        zv_2 var49 = tw0_0.e60.jB0.ba0;
                        byte var93 = var49.o0;
                        vf_0 var94;
                        vf_0 var192 = var94 = nl_0.p80(J4.iA0(tw0_0.e60.jB0.ba0.uS, var93, var49.ID0));
                        byte var116 = -1;
                        byte var133 = -1;
                        vf_0 var149 = nl_0.Xp0;
                        if (var192 != nl_0.Xp0) {
                           var44 = var49.Lq0;
                           var116 = var94.o4(var44, var49.B5, tw0_0.e60.oh0);
                           var133 = var94.JM(var49.B5, tw0_0.e60.oh0);
                           this.Gf0 = var116;
                           this.Sz = var133;
                           this.Jj = var116;
                           this.gc = var133;
                           this.cI0.Ll(true);
                        }

                        this.Oz(var116, var133);
                        nC var51 = this.Xo;
                        if (this.Xo != null) {
                           short var52 = var51.Lk0;
                           vf_0 var53 = nl_0.p80(J4.iA0(var51.LpT6, (byte)var52, var51.x20));
                           if (var94 != var149) {
                              var52 = this.Xo.qg;
                              this.Ht = var53.o4(var52, this.Xo.jJ, -1);
                              this.XJ0 = var53.JM(this.Xo.jJ, -1);
                              break label497;
                           }
                        }
                        break label496;
                     }

                     if (var1 == 3) {
                        if (tw0_0.Ll0.nC0 == null) {
                           break label496;
                        }

                        _else var76;
                        byte var107;
                        if ((var76 = tw0_0.e60.N60()) instanceof XF0) {
                           var107 = ((XF0)var76).Ro0.tN;
                        } else {
                           var107 = -1;
                        }

                        int var127 = tw0_0.e60.jB0.ba0.Lq0 / 32;
                        int var143 = tw0_0.e60.jB0.ba0.B5 / 32;
                        boolean var153 = false;
                        boolean var159 = false;
                        Ts var10 = tw0_0.Ll0.nC0;
                        if (tw0_0.Ll0.nC0.gC == null) {
                           Lo0 var11;
                           var11 = new Lo0(var10);
                           var10.gC = var11;
                        }

                        uz_1[] var163;
                        int var167 = (var163 = var10.gC.lPT7).length;

                        for (int var12 = 0; var12 < var167; var12++) {
                           uz_1 var13 = var163[var12];
                           dg_1 var14;
                           var14 = new dg_1(asBridge(), var13);
                           this.aX.add(var14);
                           nC var15 = this.Xo;
                           if (this.Xo != null) {
                              short var16 = var13.Yr0;
                              Z50 var180;
                              if (var13.Yr0 == (var180 = var15.DH).O60 || var16 == var180.i70 || var13.p == var180.tN) {
                                 this.Ht = var13.l40;
                                 this.XJ0 = var13.fQ;
                                 var44 = 1;
                                 var159 = true;
                              }
                           }

                           if (var76 != null && (var13.Yr0 == J4.p5(var76.Bm0, var76.case$) || var107 == tw0_0.Ll0.nC0.na(var13.Yr0).tN)) {
                              short var181 = var13.l40;
                              if (var13.l40 == var127 && var13.fQ == var143 || this.BT == null) {
                                 this.Jj = var181;
                                 this.gc = var13.fQ;
                                 this.cI0.Ll(true);
                                 this.Ax(var14);
                                 var153 = true;
                              }
                           }
                        }

                        nC var77 = this.Xo;
                        if (this.Xo != null && !var159) {
                           byte var78 = var77.Lk0;
                           vf_0 var79;
                           if ((var79 = nl_0.p80(J4.iA0(var77.LpT6, var78, var77.x20))) != nl_0.Xp0) {
                              var44 = this.Xo.qg;
                              this.Ht = var79.o4(var44, this.Xo.jJ, -1);
                              this.XJ0 = var79.JM(this.Xo.jJ, -1);
                              var44 = 1;
                           }
                        }

                        if (!var153) {
                           zv_2 var80 = tw0_0.e60.jB0.ba0;
                           var107 = var80.o0;
                           vf_0 var109;
                           if ((var109 = nl_0.p80(J4.iA0(tw0_0.e60.jB0.ba0.uS, var107, var80.ID0))) != nl_0.Xp0) {
                              short var81 = var80.Lq0;
                              byte var82 = var109.o4(var81, var80.B5, tw0_0.e60.oh0);
                              var107 = var109.JM(var80.B5, tw0_0.e60.oh0);
                              Ts var128 = tw0_0.Ll0.nC0;
                              if (tw0_0.Ll0.nC0.gC == null) {
                                 Lo0 var144;
                                 var144 = new Lo0(var128);
                                 var128.gC = var144;
                              }

                              uz_1[] var129;
                              var143 = (var129 = var128.gC.lPT7).length;

                              for (int var154 = 0; var154 < var143; var154++) {
                                 uz_1 var160;
                                 if ((var160 = var129[var154]).l40 == var82 && var160.fQ == var107) {
                                    dg_1 var83;
                                    var83 = new dg_1(asBridge(), var160);
                                    this.aX.add(var83);
                                    this.Jj = var160.l40;
                                    this.gc = var160.fQ;
                                    this.cI0.Ll(true);
                                    this.Ax(var83);
                                    break;
                                 }
                              }
                           }
                        }

                        if (this.BT == null) {
                           this.Gf0 = 14;
                           this.Sz = 18;
                        }
                     } else if (var1 == 4) {
                        if (tw0_0.Ll0.t1 == null) {
                           break label496;
                        }

                        _else var84;
                        byte var111;
                        if ((var84 = tw0_0.e60.N60()) instanceof XF0) {
                           var111 = ((XF0)var84).Ro0.tN;
                        } else {
                           var111 = -1;
                        }

                        int var130 = tw0_0.e60.jB0.ba0.Lq0 / 32;
                        int var146 = tw0_0.e60.jB0.ba0.B5 / 32 + 2;
                        boolean var155 = false;
                        boolean var161 = false;
                        Iterator var164 = mo_1.Cx().iterator();

                        while (var164.hasNext()) {
                           qg_1 var168;
                           short var171;
                           if ((var171 = (var168 = (qg_1)var164.next()).HI0) == -1 || tw0_0.rl.yh0.Ny(var168.eW, var171)) {
                              dg_1 var172;
                              var172 = new dg_1(asBridge(), var168);
                              this.aX.add(var172);
                              nC var174 = this.Xo;
                              if (this.Xo != null) {
                                 short var179 = var168.Yr0;
                                 Z50 var175;
                                 short var176;
                                 if (var168.Yr0 == (var175 = var174.DH).O60 || (var176 = var175.i70) != 0 && var179 == var176) {
                                    this.Ht = var168.l40;
                                    this.XJ0 = var168.fQ;
                                    var44 = 1;
                                    var161 = true;
                                 }
                              }

                              if (var84 != null) {
                                 if (var168.Yr0 != J4.p5(var84.Bm0, var84.case$)) {
                                    UY var177 = tw0_0.Ll0.t1;
                                    if (var111 != ((Ao0)var177.Za0.Sx0[var168.Yr0]).tN) {
                                       continue;
                                    }
                                 }

                                 short var178 = var168.l40;
                                 if (var168.l40 == var130 && var168.fQ == var146 || this.BT == null) {
                                    this.Jj = var178;
                                    this.gc = var168.fQ;
                                    this.cI0.Ll(true);
                                    this.Ax(var172);
                                    var155 = true;
                                 }
                              }
                           }
                        }

                        nC var85 = this.Xo;
                        if (this.Xo != null && !var161) {
                           byte var86 = var85.Lk0;
                           vf_0 var87;
                           if ((var87 = nl_0.p80(J4.iA0(var85.LpT6, var86, var85.x20))) != nl_0.Xp0) {
                              var44 = this.Xo.qg;
                              this.Ht = var87.o4(var44, this.Xo.jJ, -1);
                              this.XJ0 = var87.JM(this.Xo.jJ, -1);
                              var44 = 1;
                           }
                        }

                        if (!var155) {
                           zv_2 var88 = tw0_0.e60.jB0.ba0;
                           var111 = var88.o0;
                           vf_0 var113;
                           if ((var113 = nl_0.p80(J4.iA0(tw0_0.e60.jB0.ba0.uS, var111, var88.ID0))) != nl_0.Xp0) {
                              short var89 = var88.Lq0;
                              byte var90 = var113.o4(var89, var88.B5, tw0_0.e60.oh0);
                              var111 = var113.JM(var88.B5, tw0_0.e60.oh0);
                              Iterator var131 = mo_1.Cx().iterator();

                              while (var131.hasNext()) {
                                 qg_1 var147;
                                 if ((var147 = (qg_1)var131.next()).l40 == var90 && var147.fQ == var111) {
                                    dg_1 var91;
                                    var91 = new dg_1(asBridge(), var147);
                                    this.aX.add(var91);
                                    this.Jj = var147.l40;
                                    this.gc = var147.fQ;
                                    this.cI0.Ll(true);
                                    this.Ax(var91);
                                    break;
                                 }
                              }
                           }
                        }

                        if (this.BT == null) {
                           this.Gf0 = 21;
                           this.Sz = 14;
                        }
                     } else {
                        if (var1 != 2 || tw0_0.Ll0.Qz0 == null) {
                           break label496;
                        }

                        _else var92 = tw0_0.e60.N60();
                        QY[] var115;
                        int var132 = (var115 = tw0_0.Ll0.Qz0.OJ()).length;

                        for (int var148 = 0; var148 < var132; var148++) {
                           QY var156 = var115[var148];
                           dg_1 var162;
                           var162 = new dg_1(asBridge(), var156);
                           this.aX.add(var162);
                           nC var165 = this.Xo;
                           if (this.Xo != null) {
                              nj0_0 var169 = tw0_0.Ll0.Qz0;
                              short var173 = var156.Yr0;
                              ug_0 var166 = (ug_0)var169.Pq.Sx0[var173];
                              Z50 var170;
                              if (var156.Yr0 == (var170 = var165.DH).O60 || var173 == var170.i70 || var166.tN == var170.tN) {
                                 var44 = this.CE0;
                                 this.Ht = var162.A20 - this.CE0 * 3;
                                 this.XJ0 = var162.SB0 - var44 * 4;
                                 var44 = 1;
                              }
                           }

                           if (this.BT == null
                              && (var92 != null && var156.Yr0 == J4.p5(var92.Bm0, var92.case$) || var92 instanceof XF0 && ((XF0)var92).Ro0.i70 == var156.Yr0)) {
                              int var157 = this.CE0;
                              this.Jj = var162.A20 - this.CE0 * 3;
                              this.gc = var162.SB0 - var157 * 4;
                              this.cI0.Ll(true);
                              this.Ax(var162);
                           }
                        }
                     }
                  }

                   if (var44 != 0) {
                     break label497;
                  }
               }

               this.fi.Ll(false);
               this.Ht = 0;
               this.XJ0 = 0;
               break label498;
            }

            this.fi.Ll(true);
         }

         if (this.Yd0) {
            List var55 = this.Ca0;
            if (this.Ca0 != null) {
               Iterator var56 = var55.iterator();

               while (var56.hasNext()) {
                  Fr0 var95;
                  byte var117;
                  if ((var117 = (var95 = (Fr0)var56.next()).Ik) == var1 && var95.rY == var2) {
                     short var134 = var95.KQ;
                     if (var95.KQ == 0 || tw0_0.rl.yh0.Ny(var117, var134)) {
                        var117 = tw0_0.e60.jB0.Vv;
                        int var135 = var95.kz0;
                        if (var95.kz0 <= -1 || var117 == var135) {
                           Zy0 var119;
                           Zy0 var204 = var119 = new Zy0(asBridge(), var95, (int)Math.ceil(this.ax * 0.66F));
                           var135 = (int)Math.ceil(this.ax * 0.66F);
                           Zy0 var194;
                           int var205;
                           int var210;
                           if (var1 == 2) {
                              var194 = var119;
                              var135 = this.ax;
                              var205 = var95.cI * this.ax;
                              var210 = var95.jE0 * var135;
                           } else {
                              var194 = var119;
                              var135 = this.rC0;
                              var205 = var95.cI * this.rC0 + this.DA;
                              var210 = var95.jE0 * var135 + this.rE0;
                           }

                           var194.E40(var205, var210);
                           this.Aw.add(var119);
                        }
                     }
                  }
               }
            }
         }

         if (this.Gf0 == 0) {
            if (nUL() == 2) {
               this.Gf0 = 446;
               this.Sz = 298;
            } else if (nUL() == 3) {
               this.Gf0 = 4;
               this.Sz = 23;
            } else if (nUL() == 4) {
               this.Gf0 = 21;
               this.Sz = 14;
            }
         }

         this.KJ0.uf("townmap-label");
         this.TP.uf("townmap-label");
         this.gF0.uf("townmap-label");

         for (le0_2 var30 : this.aX) {
            this.sy0.F9(this.sy0.fU(), var30);
         }

         for (le0_2 var31 : this.cOM5) {
            this.sy0.F9(this.sy0.fU(), var31);
         }

         for (le0_2 var32 : this.Aw) {
            this.sy0.F9(this.sy0.fU(), var32);
         }

         qj_2 var22 = this.Va;
         this.sy0.F9(this.sy0.fU(), var22);
         qj_2 var23 = this.yD0;
         this.sy0.F9(this.sy0.fU(), var23);
         ia0_1 var24 = this.z40;
         this.sy0.F9(this.sy0.fU(), var24);
         S70 var25 = this.fi;
         this.sy0.F9(this.sy0.fU(), var25);
         ia0_1 var26 = this.n00;
         this.sy0.F9(this.sy0.fU(), var26);
         OT var27 = this.cI0;
         this.sy0.F9(this.sy0.fU(), var27);
         if (nUL() != 2 && nUL() != 3 && nUL() != 4) {
            this.U2(0, 0);
         }

         this.n00.oY(this.kF.Mx, 35);
         if (this.Xo != null) {
            this.n00.Ll(true);
            String var28;
            if (!(var28 = this.Gx()).isEmpty() && !this.El0) {
               this.El0 = true;
               this.a90.Sk(var28);
               Br0 var29 = this.yr.og;
               yh_0 var33 = yh_0.Xm0;
               short var57 = this.Xo.kW;
               var57 = yh_0.Ed(this.Xo.Bt, var57);
               byte var96 = -1;
               nC var17;
               boolean var18;
               if ((var17 = this.Xo).YV && var17.kW > 0) {
                  var18 = true;
               } else {
                  var18 = false;
               }

               var29.o60(var33.qC0(var57, var96, var18));
            }
         } else {
            this.n00.Ll(false);
         }
      }
   }

   public final String Gx() {
      String var1 = "";
      nC var2 = this.Xo;
      if (this.Xo != null) {
         byte var4 = var2.LpT6;
         if (var2.LpT6 != 0) {
            if (var4 != 1) {
               var1 = var2.DH.getName();
            } else {
               var1 = sm0_0.hL0((var2.an & 255) + 141000, "");
            }
         } else {
            var1 = sm0_0.hL0((var2.an & 255) + 139912, "");
         }

         nC var3;
         if ((var3 = this.Xo).YV) {
            String[] var6;
            String[] var10000 = var6 = new String[2];
            var10000[0] = sm0_0.c0(var3.kW + 150000);
            var10000[1] = var1;
            var1 = sm0_0.Bx(16777247, var6);
         } else {
            String[] var7;
            String[] var8 = var7 = new String[2];
            var8[0] = sm0_0.c0(var3.kW + 150000);
            var8[1] = var1;
            var1 = sm0_0.Bx(16777246, var7);
         }
      }

      return var1;
   }

   public final void Oz(int var1, int var2) {
      if (var1 != -1 && var2 != -1) {
         if (nUL() == 0) {
            if (i5_0.Jg0().oY[this.pc0][var2][var1] == 0) {
               this.KJ0.Sk("");
            } else {
               this.KJ0.Sk(sm0_0.hL0((i5_0.Jg0().oY[this.pc0][var2][var1] & 255) + 139912, ""));
            }

            if (i5_0.Jg0().Gt[this.pc0][var2][var1] != 0) {
               this.TP.Sk(sm0_0.hL0((i5_0.Jg0().Gt[this.pc0][var2][var1] & 255) + 139912, ""));
               return;
            }
         } else {
            dg_1 var10 = null;
            if (nUL() != 1) {
               label135: {
                  if (nUL() == 3) {
                     this.TP.Sk("");
                     var10 = null;
                     Iterator var16 = this.aX.iterator();

                     while (var16.hasNext()) {
                        le0_2 var19;
                        dg_1 var20;
                        RP var21;
                        if ((var19 = (le0_2)var16.next()) instanceof dg_1 && (var21 = (var20 = (dg_1)var19).Ki0).l40 == this.Gf0 && var21.fQ == this.Sz) {
                           var10 = var20;
                        }
                     }

                     if (var10 != null && var10 != this.BT) {
                        break label135;
                     }
                  } else if (nUL() != 4) {
                     if (nUL() != 2) {
                        return;
                     }

                     this.TP.Sk("");
                     var1 = this.yD0.A20;
                     var2 = this.yD0.SB0;
                     double var18 = 11110.0;
                     dg_1 var5 = null;
                     Iterator var6 = this.aX.iterator();

                     while (var6.hasNext()) {
                        le0_2 var7;
                        if ((var7 = (le0_2)var6.next()) instanceof dg_1) {
                           dg_1 var10000 = (dg_1)var7;
                           dg_1 var10001 = (dg_1)var7;
                           dg_1 var22;
                           dg_1 var10002 = var22 = (dg_1)var7;
                           int var8 = ((dg_1)var7).A20;
                           var8 = var10002.Mx / 2 + var8;
                           int var9 = var10001.SB0;
                           int var27 = var10000.OB / 2 + var9;
                           long var24 = var8 - var1;
                           long var28 = var27 - var2;
                           long var25 = var24 * var24;
                           double var26;
                           if ((var26 = Math.sqrt(var28 * var28 + var25)) < var18) {
                              var5 = var22;
                              var18 = var26;
                           }
                        }
                     }

                     if (var5 != null && var18 <= this.ax * 8 && var5 != this.BT) {
                        this.Ax(var5);
                        long var12 = System.currentTimeMillis() + 150L;
                        this.yw0 = var12;
                        return;
                     }

                     if (!(var18 > this.ax * 8)) {
                        return;
                     }
                  } else {
                     this.TP.Sk("");
                     var10 = null;
                     Iterator var14 = this.aX.iterator();

                     while (var14.hasNext()) {
                        le0_2 var3;
                        RP var4;
                        dg_1 var17;
                        if ((var3 = (le0_2)var14.next()) instanceof dg_1
                           && (var4 = (var17 = (dg_1)var3).Ki0).At0 != 0
                           && var4.l40 == this.Gf0
                           && var4.fQ == this.Sz) {
                           var10 = var17;
                        }
                     }

                     if (var10 != null && var10 != this.BT) {
                        break label135;
                     }
                  }

                  this.Ax(null);
                  return;
               }

               this.Ax(var10);
               long var13 = System.currentTimeMillis() + 150L;
               this.yw0 = var13;
               return;
            }

            if (i5_0.Jg0().VG0[var2][var1] == -1) {
               this.KJ0.Sk("");
            } else {
               this.KJ0.Sk(sm0_0.hL0((i5_0.Jg0().VG0[var2][var1] & 255) + 141000, ""));
            }
         }

         this.Qi0();
      } else {
         this.KJ0.Sk(sm0_0.c0(7912));
         this.TP.Sk("");
      }
   }

   public final void Qi0() {
      yt_1 var1 = tw0_0.e60;
      if (tw0_0.e60 != null && var1.N60() != null) {
         String var2 = tw0_0.e60.N60().OE();
         if (!this.KJ0.j50.toString().isEmpty()
            && !var2.isEmpty()
            && !var2.equalsIgnoreCase("???")
            && this.Jj == this.Gf0
            && this.gc == this.Sz
            && !this.KJ0.j50.toString().equalsIgnoreCase(var2)) {
            this.TP.Sk(var2);
         } else {
            this.TP.Sk("");
         }
      } else {
         this.TP.Sk("");
      }
   }

   public final void be0() {
      dg_1 var1;
      if ((var1 = this.BT) != null) {
         a7_0.bH(var1.ER.Fc0);
      }
   }

   public final void uC() {
      dg_1 var1 = this.BT;
      if (this.BT != null) {
         a7_0.bH(var1.ER.Fc0);
      } else {
         this.dq(this.uG);
      }
   }
}
