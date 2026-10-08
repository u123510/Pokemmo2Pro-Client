package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction028Packet extends Nt implements eb0_0 {
   public final byte kD0;
   public final byte c00;
   public final boolean ej;

   public SwitchAction028Packet(byte var1, byte var2, boolean var3) {
      this.kD0 = var1;
      this.c00 = var2;
      this.ej = var3;
   }

   @Override
   public final byte BL0() {
      return 28;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      String var11 = "";
      O8 var20;
      if ((var20 = var7.yd0.mn(this.kD0)) != null) {
         var11 = var20.M2();
      }

      String var21 = "";
      switch (this.c00) {
         case 0:
            lpt6__2 var19 = lpt6__2.Q80;
            int var52 = 132;
            var52 = var7.yd0.Vs0(this.kD0, var52);
            String[] var65 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var19, 15, var52, var65);
            break;
         case 1:
            lpt6__2 var18 = lpt6__2.Q80;
            int var50 = 134;
            var50 = var7.yd0.Vs0(this.kD0, var50);
            String[] var64 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var18, 15, var50, var64);
            break;
         case 2:
            if (var2 != null) {
               var11 = var2.A60();
            }

            lpt6__2 var31 = lpt6__2.Q80;
            byte var49 = 14;
            String[] var69;
            (var69 = new String[1])[0] = var11;
            var21 = sm0_0.fg0((byte)2, var31, var49, var7.yd0.QX(839, var2), var69);
            break;
         case 3:
            lpt6__2 var17 = lpt6__2.Q80;
            int var47 = 136;
            var47 = var7.yd0.Vs0(this.kD0, var47);
            String[] var62 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var17, 15, var47, var62);
            break;
         case 4:
            lpt6__2 var16 = lpt6__2.Q80;
            int var45 = 138;
            var45 = var7.yd0.Vs0(this.kD0, var45);
            String[] var61 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var16, 15, var45, var61);
            break;
         case 5:
            if (var2 != null) {
               var11 = var2.A60();
            }

            lpt6__2 var28 = lpt6__2.Q80;
            byte var44 = 14;
            String[] var68;
            (var68 = new String[1])[0] = var11;
            var21 = sm0_0.fg0((byte)2, var28, var44, var7.yd0.QX(842, var2), var68);
         case 6:
         case 7:
         default:
            break;
         case 8:
            lpt6__2 var15 = lpt6__2.Q80;
            int var42 = 160;
            var42 = var7.yd0.Vs0(this.kD0, var42);
            String[] var59 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var15, 15, var42, var59);
            break;
         case 9:
            if (var2 != null) {
               var11 = var2.A60();
            }

            lpt6__2 var26 = lpt6__2.Q80;
            byte var41 = 14;
            String[] var67;
            (var67 = new String[1])[0] = var11;
            var21 = sm0_0.fg0((byte)2, var26, var41, var7.yd0.QX(797, var2), var67);
            break;
         case 10:
            lpt6__2 var14 = lpt6__2.Q80;
            int var39 = 162;
            var39 = var7.yd0.Vs0(this.kD0, var39);
            String[] var57 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var14, 15, var39, var57);
            break;
         case 11:
            if (var2 != null) {
               var11 = var2.A60();
            }

            lpt6__2 var24 = lpt6__2.Q80;
            byte var38 = 14;
            String[] var66;
            (var66 = new String[1])[0] = var11;
            var21 = sm0_0.fg0((byte)2, var24, var38, var7.yd0.QX(800, var2), var66);
            break;
         case 12:
            lpt6__2 var13 = lpt6__2.Q80;
            int var36 = 144;
            var36 = var7.yd0.Vs0(this.kD0, var36);
            String[] var55 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var13, 15, var36, var55);
            break;
         case 13:
            lpt6__2 var12 = lpt6__2.Q80;
            String[] var54 = sm0_0.zb0;
            var21 = sm0_0.Bw((byte)2, var12, 15, var7.yd0.Vs0(this.kD0, 146), var54);
      }

      if (this.ej) {
         var7.I1(var21, "", null);
         byte var9;
         kw_0 var10;
         ML0 var10000;
         if ((var9 = this.c00) != 0) {
            if (var9 != 3) {
               if (var9 != 8) {
                  if (var9 != 10) {
                     if (var9 != 12) {
                        return;
                     }

                     var10000 = var7;
                      var10 = new kw_0((byte)0, qk_2.cR.import$(var2, (short)381));
                  } else {
                     var10000 = var7;
                      var10 = new kw_0((byte)0, qk_2.cR.import$(var2, (short)501));
                  }
               } else {
                  var10000 = var7;
                  var10 = new kw_0((byte)0, qk_2.cR.import$(var2, (short)469));
               }
            } else {
               var10000 = var7;
                var10 = new kw_0((byte)0, qk_2.cR.import$(var2, (short)54));
            }
         } else {
            var10000 = var7;
            var10 = new kw_0((byte)0, qk_2.cR.import$(var2, (short)219));
         }

         var10000.lZ.add(var10);
      } else {
         var7.wJ(var21, "", null);
      }
   }

   @Override
   public final boolean Hm() {
      return this.ej ? true : super.Hm();
   }
}
