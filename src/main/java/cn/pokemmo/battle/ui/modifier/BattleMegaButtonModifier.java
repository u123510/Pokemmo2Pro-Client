package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMegaButtonModifier extends TC0 {
   public final byte DR;
   public final short Ia;
   public final byte D5;
   public final lpt8__0 T30;

   public BattleMegaButtonModifier(byte var1, short var2, byte var3, lpt8__0 var4) {
      this.DR = var1;
      this.Ia = var2;
      this.D5 = var3;
      this.T30 = var4;
   }

   public final void QC(ML0 var1) {
      int var2 = gu0.l2.lPT6(this.Ia).Bk0;
      PF var3 = null;
      byte var4 = 0;

      while (true) {
         a10_0 var10001 = tw0_0.PK0;
         byte var5 = a10_0.Vp0(this.DR);
         if (var4 >= (byte)var10001.wI0[var5].length || (var3 = tw0_0.PK0.Ce(a10_0.Vp0(this.DR), var4)) != null) {
            ML0 var54;
            String var57;
            switch (this.D5) {
               case -9:
                  var54 = var1;
                  byte var17 = 17;
                  byte var26 = 51;
                  String[] var36 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var17, var26, var36);
                  break;
               case -8:
                  var54 = var1;
                  var57 = sm0_0.c0(16803000);
                  break;
               case -7:
                  var54 = var1;
                  byte var16 = 17;
                  byte var25 = 47;
                  String[] var35 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var16, var25, var35);
                  break;
               case -6:
                  var54 = var1;
                  byte var15 = 17;
                  byte var24 = 44;
                  String[] var34 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var15, var24, var34);
                  break;
               case -5:
                  var54 = var1;
                  byte var14 = 15;
                  short var23 = 196;
                  String[] var33 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var14, var23, var33);
                  break;
               case -4:
                  var54 = var1;
                  byte var13 = 17;
                  byte var22 = 47;
                  String[] var32 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var13, var22, var32);
                  break;
               case -3:
                  var54 = var1;
                  var57 = sm0_0.c0(6907);
                  break;
               case -2:
                  var54 = var1;
                  byte var12 = 17;
                  byte var21 = 45;
                  String[] var31 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var12, var21, var31);
                  break;
               case -1:
                  var54 = var1;
                  byte var11 = 15;
                  byte var20 = 67;
                  String[] var30 = sm0_0.zb0;
                  var57 = sm0_0.Bw((byte)2, lpt6__2.Q80, var11, var20, var30);
                  break;
               case 0:
               case 1:
               case 2:
               case 3:
                  ok0_1 var18;
                  var18 = new ok0_1(var3, var2, this.D5);
                  var1.lZ.add(new kw_0(var18));
                  lpt6__2 var10 = lpt6__2.Q80;
                  byte var19 = 15;
                  var2 = this.D5 + 61;
                  String[] var42 = sm0_0.zb0;
                  var1.wJ(sm0_0.Bw((byte)2, var10, var19, var2, var42), "", null);
                  return;
               case 4:
                  ok0_1 var43;
                  var43 = new ok0_1(var3, var2, this.D5);
                  var1.lZ.add(new kw_0(var43));
                  String var27 = "";
                  if (var3 != null) {
                     var27 = var3.nz0(true);
                  }

                  lpt6__2 var44 = lpt6__2.Q80;
                  var5 = 15;
                  short var6 = 65;
                  String[] var7;
                  (var7 = new String[1])[0] = var27;
                  var1.wJ(sm0_0.fg0((byte)2, var44, var5, var6, var7), "", null);
                  if (var3 != null) {
                     a10_0 var10000 = var1.yd0;
                     short var37 = var3.p10();
                     int var38;
                     wx_2 var46;
                     if ((var38 = (var46 = var10000.R60).Ye0(var37)) >= 0) {
                        var46.dx0(var38);
                        byte var39 = 15;
                        var5 = 66;
                        String[] var49;
                        (var49 = new String[1])[0] = var27;
                        var1.wJ(sm0_0.fg0((byte)2, var44, var39, var5, var49), "", null);
                     }
                  }

                  lpt8__0 var40 = this.T30;
                  _volatile var48 = _volatile.Bf0;
                  if (this.T30.Eu0 == _volatile.Bf0) {
                     var6 = 176;
                     String var41 = tw0_0.rl.y8.P2(var48, (byte)(var40.F60 / 60));
                     short var51 = 234;
                     String[] var8;
                     String[] var55 = var8 = new String[2];
                     var55[0] = var27;
                     var55[1] = var41;
                     var1.wJ(sm0_0.fg0((byte)2, var44, var51, var6, var8), "", null);
                  }

                  if (!var1.yd0.a40) {
                     VU var28 = null;
                     if (this.T30.Eu0 == var48) {
                        var28 = tw0_0.rl.r1(var48).Ry0(this.T30.F60);
                     }

                     if (var28 != null) {
                        if (tw0_0.kz0()) {
                           a10_0 var52 = var1.yd0;
                           G70 var9;
                           var9 = new G70(var28);
                           var52.lPt9.add(var9);
                        } else {
                           var1.lZ.add(new ek_1(var28));
                        }

                        return;
                     }
                  }

                  return;
               default:
                  return;
            }

            var54.wJ(var57, "", null);
            return;
         }

         var4++;
      }
   }
}
