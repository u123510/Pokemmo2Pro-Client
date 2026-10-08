package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class StatAction085Packet extends Nt implements eb0_0 {
   public final byte qR;

   public StatAction085Packet(byte var1) {
      this.qR = var1;
   }

   public static void lh0(PF var0, ML0 var1) {
      Oz0 var2 = tw0_0.LD0.he0;
      if (var2 == null) {
         return;
      }

      byte var3 = var0.cD0;
      for (PF var5 : var1.yd0.wI0[var3]) {
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.sL0.length; var6++) {
               if (var5.sL0[var6] < 0) {
                  var5.sL0[var6] = 0;
               }
            }
            var2.N10.Hi(var5).XO();
         }
      }

      for (PF var7 : var1.yd0.wI0[a10_0.Vp0(var3)]) {
         if (var7 != null) {
            var2.N10.Hi(var7).XO();
         }
      }

      var1.lZ.add(new kw_0((byte)0, new JG0(var0)));
   }

   public static void f0(ML0 var0) {
      Oz0 var1 = tw0_0.LD0.he0;
      if (var1 != null) {
         byte var2 = tw0_0.PK0.Ez0();
         var0.yd0.mn(var2).zI.bB0 = 0;
         var1.tt(var2, (short)366);
         var0.yd0.p0(var0, var2);
      }
   }

   public static void q10(ML0 var0) {
      Oz0 var1 = tw0_0.LD0.he0;
      if (var1 != null) {
         byte var2 = tw0_0.PK0.Ez0();
         var0.yd0.mn(var2).zI.bB0 = 4;
         var1.Z8(var2, (short)366);
         var0.yd0.p0(var0, var2);
      }
   }

   public static void JI0(ML0 var0, PF var1) {
      var0.yd0.Jm(var1);
      tb0_1 var2 = var0.yd0.yD0(var1.Zo0());
      if (var2 != null) {
         var2.B3 = new se_0();
         var2.uG0 = 0;
         var2.Wb();
      }
      var0.Tb0[var1.cD0][var1.Kj0].Hm(false);
   }

   public static PF[] NU(int var0) {
      return new PF[var0];
   }

   public static boolean i5(PF var0) {
      return var0 != null && !var0.zi0.hf0();
   }

   public static void ed0(PF var0, ML0 var1) {
      PF[] var2 = Arrays.stream(var1.yd0.wI0[a10_0.Vp0(var0.cD0)]).filter(StatAction085Packet::TC0).toArray(StatAction085Packet::BG);
      for (PF var4 : var2) {
         var4.hS = true;
      }
      var1.lZ.add(new kw_0((byte)0, new yv_1(var0, false, var2)));
   }

   public static PF[] BG(int var0) {
      return new PF[var0];
   }

   public static boolean TC0(PF var0) {
      return var0 != null && !var0.zi0.hf0();
   }

   public static void zj(PF var0, ML0 var1) {
      i40_0 var2 = i40_0.z2;
      var0.gp = var2;
      var0.Qj = var2;
      var1.Hi(var0).XO();
   }

   public static void Zf0(PF var0) {
      var0.bv0((short)1019);
   }

   public static void cOM1(PF var0) {
      var0.bv0((short)1021);
   }

   public static void Po0(PF var0) {
      var0.bv0((short)1021);
   }

   public final byte BL0() {
      return 85;
   }

   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      switch (this.qR) {
         case 0:
            var7.I1(sm0_0.Bx(200378, new String[]{var1.Yp(), sm0_0.c0(100037)}), "", null);
            var7.lZ.add(new kw_0((byte)0, new tb_1(var2)));
            return;
         case 1:
            if (var1 == var2) {
               var7.wJ(sm0_0.Bx(6062, new String[]{var1.Yp(), sm0_0.c0(100037)}), "", new Runnable() {
                  public void run() {
                     Po0(var2);
                  }
               });
               return;
            }
            var7.I1(sm0_0.Bx(200377, new String[]{var1.Yp(), var2.Yp(), sm0_0.c0(100037)}), "", new Runnable() {
               public void run() {
                  cOM1(var2);
               }
            });
            var7.lZ.add(new kw_0((byte)0, new oh_0(var1).vv(var2)));
            return;
         case 2:
            tu0_0.mk(var2, 200379, var7, "", null);
            return;
         case 3:
            var7.wJ(sm0_0.c0(200385), "", null);
            return;
         case 4:
            tu0_0.mk(var2, 200386, var7, "", null);
            return;
         case 5:
            tu0_0.mk(var2, 200382, var7, "", null);
            return;
         case 6:
            tu0_0.mk(var2, 200383, var7, "", null);
            return;
         case 7:
            var7.wJ(sm0_0.c0(200387), "", null);
            return;
         case 8:
            var7.wJ(sm0_0.Bx(200377, new String[]{var1.Yp(), var2.Yp(), sm0_0.c0(100033)}), "", new Runnable() {
               public void run() {
                  Zf0(var2);
               }
            });
            return;
         case 9:
            tu0_0.mk(var2, 200514, var7, "", null);
            return;
         case 10:
            var7.wJ(sm0_0.c0(200381), "", null);
            return;
         case 11:
            var7.I1(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(896, var2), new String[]{var2.Yp(), i40_0.z2.BT()}), "", new Runnable() {
               public void run() {
                  zj(var2, var7);
               }
            });
            var7.lZ.add(new kw_0((byte)0, new NV(var2)));
            return;
         case 12:
            tu0_0.mk(var2, 200521, var7, "", null);
            return;
         case 13:
            tu0_0.mk(var2, 200523, var7, "", null);
            return;
         case 16:
            tu0_0.mk(var2, 200389, var7, "", null);
            return;
         case 17:
            tu0_0.mk(var2, 200390, var7, "", null);
            return;
         case 18:
            tu0_0.mk(var2, 200391, var7, "", null);
            return;
         case 19:
            tu0_0.mk(var2, 200392, var7, "", null);
            return;
         case 20:
            tu0_0.mk(var2, 200393, var7, "", null);
            return;
         case 21:
            var7.wJ(sm0_0.Bx(200395, new String[]{var1.Yp(), var2.Yp()}), "", null);
            return;
         case 22:
            tu0_0.mk(var2, 200396, var7, "", null);
            return;
         case 23:
            tu0_0.mk(var2, 200397, var7, "", null);
            return;
         case 24:
            tu0_0.mk(var2, 200398, var7, "", null);
            return;
         case 25:
            tu0_0.mk(var2, 200399, var7, "", null);
            return;
         case 26:
            var7.lZ.add(new lR(var1.cD0, var1.Kj0, var2.cD0, var2.Kj0, (short)1025, false));
            return;
         case 28:
            var7.lZ.add(new kw_0((byte)0, new Ef(var2).vv(var2)));
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(736, var2), new String[]{var2.Yp()}), "", null);
            var7.wJ(sm0_0.c0(200366), "", new Runnable() {
               public void run() {
                  ed0(var2, var7);
               }
            });
            return;
         case 29:
            var2.hS = true;
            var7.wJ(sm0_0.wa0(200358, var2.Yp()), "", null);
            var7.lZ.add(new kw_0((byte)0, new yv_1(var1, false, new PF[]{var2})));
            return;
         case 30:
            for (PF var10 : Arrays.stream(var7.yd0.wI0[var7.yd0.Ez0()]).filter(StatAction085Packet::i5).toArray(StatAction085Packet::NU)) {
               var10.hS = false;
            }
            var7.wJ(sm0_0.c0(200357), "", null);
            return;
         case 31:
            var2.hS = false;
            tu0_0.mk(var2, 200356, var7, "", null);
            return;
         case 32:
            var2.getClass();
            var7.wJ(sm0_0.wa0(200403, var2.Yp()), "", null);
            return;
         case 33:
            var2.getClass();
            var7.wJ(sm0_0.wa0(200404, var2.Yp()), "", null);
            return;
         case 34:
            tu0_0.mk(var2, 200403, var7, "", null);
            return;
         case 35:
            var7.wJ(sm0_0.c0(200405), "", null);
            return;
         case 36:
            var7.wJ(sm0_0.Bx(200406, new String[]{var1.Yp(), var2.Yp()}), "", null);
            return;
         case 37:
            var7.wJ(sm0_0.c0(200407), "", null);
            a10_0 var11 = tw0_0.PK0;
            if (var11 != null) {
               for (PF var12 : var11.wI0[var2.cD0]) {
                  if (var12 != null && !var12.zi0.hf0()) {
                     var12.Ah();
                  }
               }
            }
            return;
         case 38:
            tu0_0.mk(var2, 200408, var7, "", null);
            return;
         case 39:
            tu0_0.mk(var2, 200409, var7, "", null);
            return;
         case 40:
            var7.wJ(sm0_0.c0(200410), "", null);
            return;
         case 41:
            var7.lZ.add(new kw_0((byte)0, qk_2.cR.import$(var2, (short)366)));
            var7.I1(sm0_0.c0(200411), "", new Runnable() {
               public void run() {
                  q10(var7);
               }
            });
            return;
         case 42:
            tu0_0.mk(var2, 200437, var7, "", null);
            return;
         case 43:
            var7.lZ.add(new kw_0((byte)0, new ds_1(var2).vv(var2)));
            var7.wJ(sm0_0.wa0(16807029, var2.Yp()), "", new Runnable() {
               public void run() {
                  JI0(var7, var2);
               }
            });
            return;
         case 44:
            var7.wJ(sm0_0.c0(200512), "", new Runnable() {
               public void run() {
                  lh0(var2, var7);
               }
            });
            return;
         case 48:
            var7.wJ(sm0_0.c0(200412), "", new Runnable() {
               public void run() {
                  f0(var7);
               }
            });
            return;
         case 49:
            var7.wJ(sm0_0.c0(200413), "", null);
            return;
         case 50:
            var7.wJ(sm0_0.c0(200414), "", null);
            return;
         case 51:
            tu0_0.mk(var2, 200438, var7, "", null);
            return;
         case 52:
            tu0_0.mk(var2, 200404, var7, "", null);
            return;
         case 53:
            tu0_0.mk(var2, 200439, var7, "", null);
            return;
         default:
            return;
      }
   }

   public final boolean Hm() {
      switch (this.qR) {
         case 3:
         case 7:
         case 10:
         case 16:
         case 30:
         case 35:
         case 37:
         case 40:
         case 41:
         case 48:
         case 49:
         case 50:
            return false;
         default:
            return true;
      }
   }
}
