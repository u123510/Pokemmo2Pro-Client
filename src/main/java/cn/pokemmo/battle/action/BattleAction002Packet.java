package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction002Packet extends Nt implements eb0_0 {
   public final byte Wn0;
   public final byte Gb0;
   public final short sz;
   public final CH0 ZJ;

   public BattleAction002Packet(byte var1, byte var2, CH0 var3, short var4) {
      this.Wn0 = var1;
      this.Gb0 = var2;
      this.sz = var4;
      this.ZJ = var3;
   }

   @Override
   public final byte BL0() {
      return 2;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      byte var15 = this.Wn0;
      fk_0 var29;
      String var30;
      if (this.Wn0 == 0) {
         boolean var16;
         boolean var10000 = var16 = var2.jD0();
         var3 = var2.rq();
         var4 = var2.wG0();
         boolean var64 = var2.zs();
         var6 = var2.Eq();
         boolean var69 = var2.Ky();
         var2.Ry0(this.Gb0);
         if (var10000 != var2.jD0()) {
            String var75;
            if (var16) {
               lpt6__2 var74 = lpt6__2.Q80;
               byte var17 = 14;
               int var9 = var7.yd0.QX(312, var2);
               String[] var10;
               (var10 = new String[1])[0] = var2.A60();
               var75 = sm0_0.fg0((byte)2, var74, var17, var9, var10);
            } else {
               lpt6__2 var76 = lpt6__2.Q80;
               byte var18 = 14;
               int var70 = var7.yd0.QX(306, var2);
               String[] var73;
               (var73 = new String[1])[0] = var2.A60();
               var75 = sm0_0.fg0((byte)2, var76, var18, var70, var73);
            }

            var7.wJ(var75, "", null);
         }

         if (var3 != var2.rq()) {
            String var78;
            if (var3) {
               lpt6__2 var77 = lpt6__2.Q80;
               byte var19 = 14;
               String[] var71;
               (var71 = new String[1])[0] = var2.A60();
               var78 = sm0_0.fg0((byte)2, var77, var19, var7.yd0.QX(246, var2), var71);
            } else {
               lpt6__2 var79 = lpt6__2.Q80;
               byte var20 = 14;
               String[] var72;
               (var72 = new String[1])[0] = var2.A60();
               var78 = sm0_0.fg0((byte)2, var79, var20, var7.yd0.QX(234, var2), var72);
            }

            var7.wJ(var78, "", null);
         }

         if (var4 != var2.wG0()) {
            String var81;
            if (var4) {
               lpt6__2 var80 = lpt6__2.Q80;
               byte var21 = 14;
               String[] var51;
               (var51 = new String[1])[0] = var2.A60();
               var81 = sm0_0.fg0((byte)2, var80, var21, var7.yd0.QX(264, var2), var51);
            } else {
               lpt6__2 var82 = lpt6__2.Q80;
               byte var22 = 14;
               String[] var52;
               (var52 = new String[1])[0] = var2.A60();
               var81 = sm0_0.fg0((byte)2, var82, var22, var7.yd0.QX(255, var2), var52);
            }

            var7.wJ(var81, "", null);
         }

         if (var64 != var2.zs()) {
            String var84;
            if (var64) {
               lpt6__2 var83 = lpt6__2.Q80;
               byte var23 = 14;
               String[] var53;
               (var53 = new String[1])[0] = var2.A60();
               var84 = sm0_0.fg0((byte)2, var83, var23, var7.yd0.QX(294, var2), var53);
            } else {
               lpt6__2 var85 = lpt6__2.Q80;
               byte var24 = 14;
               String[] var54;
               (var54 = new String[1])[0] = var2.A60();
               var84 = sm0_0.fg0((byte)2, var85, var24, var7.yd0.QX(288, var2), var54);
            }

            var7.wJ(var84, "", null);
         }

         if (var6 != var2.Eq()) {
            String var87;
            if (var6) {
               lpt6__2 var86 = lpt6__2.Q80;
               byte var25 = 14;
               String[] var55;
               (var55 = new String[1])[0] = var2.A60();
               var87 = sm0_0.fg0((byte)2, var86, var25, var7.yd0.QX(279, var2), var55);
            } else {
               lpt6__2 var88 = lpt6__2.Q80;
               byte var26 = 14;
               String[] var56;
               (var56 = new String[1])[0] = var2.A60();
               var87 = sm0_0.fg0((byte)2, var88, var26, var7.yd0.QX(273, var2), var56);
            }

            var7.wJ(var87, "", null);
         }

         if (var69 != var2.Ky()) {
            String var90;
            if (var69) {
               lpt6__2 var89 = lpt6__2.Q80;
               byte var27 = 14;
               String[] var57;
               (var57 = new String[1])[0] = var2.A60();
               var90 = sm0_0.fg0((byte)2, var89, var27, var7.yd0.QX(246, var2), var57);
            } else {
               lpt6__2 var91 = lpt6__2.Q80;
               byte var28 = 14;
               String[] var58;
               (var58 = new String[1])[0] = var2.A60();
               var90 = sm0_0.fg0((byte)2, var91, var28, var7.yd0.QX(237, var2), var58);
            }

            var7.wJ(var90, "", null);
         }

          var29 = new fk_0(var7, var2, this.Gb0);
      } else if (var15 == 1) {
         label101: {
            var2.Ry0(this.Gb0);
             var30 = sm0_0.c0(gu0.l2.lPT6(this.sz).Nl);
            String var94;
            if (var2.Ky()) {
               lpt6__2 var93 = lpt6__2.Q80;
               byte var45 = 14;
               String[] var65;
               String[] var10001 = var65 = new String[2];
               var10001[0] = var2.A60();
               var10001[1] = var30;
                var94 = sm0_0.fg0((byte)2, var93, var45, var7.yd0.QX(240, var2), var65);
            } else {
               if (!var2.rq()) {
                  break label101;
               }

               lpt6__2 var95 = lpt6__2.Q80;
               byte var46 = 14;
               String[] var66;
               (var66 = new String[1])[0] = var2.A60();
                var94 = sm0_0.fg0((byte)2, var95, var46, var7.yd0.QX(234, var2), var66);
            }

            var7.wJ(var94, "", null);
         }

         if (var2.wG0()) {
            lpt6__2 var96 = lpt6__2.Q80;
            byte var47 = 14;
            String[] var67;
            String[] var101 = var67 = new String[2];
            var101[0] = var2.A60();
            var101[1] = var30;
            var7.wJ(sm0_0.fg0((byte)2, var96, var47, var7.yd0.QX(258, var2), var67), "", null);
         }

         if (var2.Eq()) {
            lpt6__2 var97 = lpt6__2.Q80;
            byte var31 = 14;
            String[] var62;
            (var62 = new String[1])[0] = var2.A60();
            var7.wJ(sm0_0.fg0((byte)2, var97, var31, var7.yd0.QX(273, var2), var62), "", null);
         }

         if (var2.jD0()) {
            lpt6__2 var98 = lpt6__2.Q80;
            byte var32 = 14;
            String[] var63;
            (var63 = new String[1])[0] = var2.A60();
            var7.wJ(sm0_0.fg0((byte)2, var98, var32, var7.yd0.QX(306, var2), var63), "", null);
         }

          var29 = new fk_0(var7, var2, this.Gb0);
      } else {
         if (var15 != 2) {
            if (var15 == 3) {
               if (this.ZJ.Uz0()) {
                  return;
               }

               tb0_1 var33;
               if ((var33 = var7.yd0.yD0(this.ZJ)) == null) {
                  return;
               }

               se_0 var14 = var33.B3;
               var14.Bn.H1 = this.Gb0;
               var33.Wb();
            }

            return;
         }

         var2.Ry0(this.Gb0);
          var29 = new fk_0(var7, var2, this.Gb0);
      }

      var7.lZ.add(var29);
   }
}
