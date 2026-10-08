package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;

public class ScriptVarSubAction extends BaseScriptAction {
   public static final float[] Rc0 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
   public static final C8 Pc0 = new C8();
   public final id_2 K8;
   public final int rD;
   public final int Fw0;

   public ScriptVarSubAction(int var1, int var2) {
      id_2 var3;
      var3 = new id_2();
      this.K8 = var3;
      this.rD = var1;
      this.Fw0 = var2;
   }

   @Override
   public final void set(Wm0 var1, int var2, W00 var3, wh_0 var4) {
      if (var3.AA0 == null) {
         lt_1 var10000 = var1.program;
         int var12 = var1.loc(var2);
         float[] var14 = Rc0;
         var10000.getClass();
         lg_0.Sf0.glUniform3fv(var12, 6, var14, 0);
      } else {
         var3.eo0.V1(Pc0);
         long var5 = PRN_.xE;
         if (var4.tM(PRN_.xE)) {
            id_2 var17 = this.K8;
            Color var45 = ((PRN_)var4.sg(var5)).v50;
            var17.getClass();
            float var23 = var45.r;
            float var6 = var45.g;
            float var7 = var45.b;

            for (byte var8 = 0; var8 < 18; var8 += 3) {
               float[] var9 = var17.l3;
               var9[var8] = var23;
               var9[var8 + 1] = var6;
               var17.l3[var8 + 2] = var7;
            }
         }

         var5 = CP.M0;
         if (var4.tM(CP.M0)) {
            es_1 var18 = ((CP)var4.sg(var5)).Ds0;

            for (int var25 = this.rD; var25 < var18.KB; var25++) {
               id_2 var31;
               id_2 var46 = var31 = this.K8;
               Color var36 = ((qv_0)var18.get(var25)).l0;
               C8 var10001 = ((qv_0)var18.get(var25)).jf;
               var31.getClass();
               float var32 = var36.r;
               float var37 = var36.g;
               float var40 = var36.b;
               float var43 = var10001.x;
               float var10 = var10001.y;
               float var11 = var10001.z;
               var46.Ve0(var32, var37, var40, var43, var10, var11);
            }
         }

         var5 = fi_2.Tl0;
         if (var4.tM(fi_2.Tl0)) {
            es_1 var19 = ((fi_2)var4.sg(var5)).jA;

            for (int var21 = this.Fw0; var21 < var19.KB; var21++) {
               id_2 var27;
               id_2 var47 = var27 = this.K8;
               Color var33 = ((dm0_0)var19.get(var21)).l0;
               C8 var38 = ((dm0_0)var19.get(var21)).EJ;
               C8 var41 = Pc0;
               float var49 = ((dm0_0)var19.get(var21)).ET;
               var27.getClass();
               float var28 = var49 / (var41.SH0(var38) + 1.0F);
               var49 = var33.r * var28;
               float var34 = var33.g * var28;
               float var29 = var33.b * var28;
               float var42 = var41.x - var38.x;
               float var44 = var41.y - var38.y;
               float var39 = var41.z - var38.z;
               var47.Ve0(var49, var34, var29, var42, var44, var39);
            }
         }

         id_2 var20 = this.K8;
         int var22 = 0;

         while (true) {
            float[] var30 = var20.l3;
            if (var22 >= var20.l3.length) {
               lt_1 var48 = var1.program;
               int var13 = var1.loc(var2);
               float[] var15;
               var2 = (var15 = this.K8.l3).length;
               var48.getClass();
               lg_0.Sf0.glUniform3fv(var13, var2 / 3, var15, 0);
               break;
            }

            float var35;
            if ((var35 = var30[var22]) < 0.0F) {
               var35 = 0.0F;
            } else if (var35 > 1.0F) {
               var35 = 1.0F;
            }

            var30[var22] = var35;
            var22++;
         }
      }
   }
}
