package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Iterator;

public class ElevatorMeshRenderer extends BaseMapMeshRenderer {
   public boolean V4 = false;
   public final ArrayList R5;
   public int lw0 = 27;
   public int zk0 = 47;
   public float SH = 0.0F;
   public final s3_0 eZ = new s3_0();

   public ElevatorMeshRenderer(p50_0 var1) {
      super(var1);
       ArrayList var2 = new ArrayList();
       this.R5 = var2;
      if (var1.p4() == 32) {
          bc_2 var6 = new bc_2();
          bc_2 var26 = var6;
         var26.s90 = 13;
         var26.wh = 15;
         var26.Kw = 15;
         var26.xl0 = 63;
         var26.pj0 = 1;
         short[] var14;
         short[] var10003 = var14 = new short[3];
         var10003[0] = 52;
         var10003[1] = 53;
         var10003[2] = 155;
         var26.DJ = var14;
         var2.add(var6);
          bc_2 var7 = new bc_2();
          bc_2 var10001 = var7;
         var10001.s90 = 16;
         var10001.wh = 18;
         var10001.Kw = 15;
         var10001.xl0 = 63;
         var10001.pj0 = 0;
         short[] var15;
         short[] var27 = var15 = new short[3];
         var27[0] = 52;
         var27[1] = 53;
         var27[2] = 155;
         var10001.DJ = var15;
         var2.add(var7);
      } else if (var1.p4() == 33) {
          bc_2 var8 = new bc_2();
          bc_2 var28 = var8;
         var28.s90 = 13;
         var28.wh = 15;
         var28.Kw = 7;
         var28.xl0 = 63;
         var28.pj0 = 1;
         short[] var16;
         short[] var32 = var16 = new short[2];
         var32[0] = 52;
         var32[1] = 53;
         var28.DJ = var16;
         var2.add(var8);
          bc_2 var9 = new bc_2();
          bc_2 var23 = var9;
         var23.s90 = 16;
         var23.wh = 18;
         var23.Kw = 7;
         var23.xl0 = 63;
         var23.pj0 = 0;
         short[] var17;
         short[] var29 = var17 = new short[2];
         var29[0] = 52;
         var29[1] = 53;
         var23.DJ = var17;
         var2.add(var9);
      } else if (var1.p4() == 34) {
          bc_2 var10 = new bc_2();
          bc_2 var30 = var10;
         var30.s90 = 11;
         var30.wh = 15;
         var30.Kw = 10;
         var30.xl0 = 63;
         var30.pj0 = 1;
         short[] var18;
         short[] var10004 = var18 = new short[3];
         var10004[0] = 52;
         var10004[1] = 53;
         var10004[2] = 44;
         var30.DJ = var18;
         var30.LpT9 = 6;
         var2.add(var10);
          bc_2 var11 = new bc_2();
          bc_2 var24 = var11;
         var24.s90 = 16;
         var24.wh = 20;
         var24.Kw = 10;
         var24.xl0 = 63;
         var24.pj0 = 0;
         short[] var19;
         short[] var33 = var19 = new short[3];
         var33[0] = 52;
         var33[1] = 53;
         var33[2] = 44;
         var24.DJ = var19;
         var24.LpT9 = 6;
         var2.add(var11);
      } else if (var1.p4() == 254) {
          bc_2 var12 = new bc_2();
          bc_2 var10005 = var12;
         var10005.s90 = 10;
         var10005.wh = 14;
         var10005.Kw = 24;
         var10005.xl0 = 180;
         var10005.pj0 = 1;
         short[] var20;
         (var20 = new short[1])[0] = 62;
         var10005.DJ = var20;
         var10005.LpT9 = 6;
         nk_0 var21 = nk_0.SV;
         var10005.St = nk_0.SV;
         nk_0 var22 = nk_0.qh0;
         var10005.cB0 = nk_0.qh0;
         nk_0 var3 = nk_0.jS;
         var10005.z70 = nk_0.jS;
         nk_0 var4 = nk_0.CA;
         var10005.uh0 = nk_0.CA;
         var2.add(var12);
          bc_2 var13 = new bc_2();
          bc_2 var36 = var13;
         var36.s90 = 16;
         var36.wh = 20;
         var36.Kw = 24;
         var36.xl0 = 180;
         var36.pj0 = 0;
         short[] var5;
         (var5 = new short[1])[0] = 62;
         var36.DJ = var5;
         var36.LpT9 = 6;
         var36.St = var21;
         var36.cB0 = var22;
         var36.z70 = var3;
         var36.uh0 = var4;
         var2.add(var13);
         this.lw0 = 48;
         this.zk0 = 57;
         this.Gc0();
      }
   }

   public final void lpt1(float var1) {
      super.lpt1(var1);
      this.SH += var1;
      Iterator var10 = this.R5.iterator();

      while (var10.hasNext()) {
         bc_2 var2;
         Iterator var3 = (var2 = (bc_2)var10.next()).pg.iterator();

         while (var3.hasNext()) {
            MO var4;
            nk_0 var5;
            label101: {
               MO var10001 = var4 = (MO)var3.next();
               var5 = null;
               short var6 = var10001.ba0.Lq0;
               short var7 = var10001.ba0.B5;
               if (this.Dk(var2.pj0, var6, var7)) {
                  var6 = var4.ba0.Lq0;
                  var7 = var4.ba0.B5;
                  if (this.Dk((byte)-1, var6, var7)) {
                     if (!var4.il0.np) {
                        if (var2.pj0 == 0) {
                           var5 = var2.cB0;
                        } else {
                           var5 = var2.St;
                        }
                     }
                     break label101;
                  }
               }

               label97:
               if (var4.il0.BH0.isEmpty()) {
                  label95: {
                     if (var2.pj0 == 0) {
                        var6 = var4.ba0.Lq0;
                        var7 = var4.ba0.B5;
                        if (this.Dk((byte)3, var6, var7) && var4.ba0.Lq0 <= var2.wh) {
                           break label95;
                        }

                        var6 = var4.ba0.Lq0;
                        var7 = var4.ba0.B5;
                        if (!this.Dk((byte)2, var6, var7) || var4.ba0.Lq0 < var2.s90) {
                           break label97;
                        }
                     } else {
                        var6 = var4.ba0.Lq0;
                        var7 = var4.ba0.B5;
                        if (!this.Dk((byte)2, var6, var7) || var4.ba0.Lq0 < var2.s90) {
                           var6 = var4.ba0.Lq0;
                           var7 = var4.ba0.B5;
                           if (!this.Dk((byte)3, var6, var7) || var4.ba0.Lq0 > var2.wh) {
                              break label97;
                           }
                           break label95;
                        }
                     }

                     var5 = var2.z70;
                     break label97;
                  }

                  var5 = var2.uh0;
               }
            }

            if (var5 != null) {
               var4.il0.LE(new nk_0[]{var5});
            }

            if (!var4.il0.np) {
               label76: {
                   zv_2 var12;
                   byte var8;
                  short var9;
                   int var22;
                  short var29;
                  label75: {
                     label74: {
                         var12 = var4.ba0;
                        var22 = var4.ba0.B5;
                        if (var4.ba0.B5 >= var2.xl0) {
                           var22 = 0;
                           var29 = (short)rg0_2.j40(var2.s90, var2.wh);
                           var8 = var2.pj0;
                           if (var2.pj0 == 0) {
                              break label74;
                           }
                        } else {
                           if (var22 > var2.Kw) {
                              break label76;
                           }

                           var22 = 0;
                           var29 = (short)rg0_2.j40(var2.s90, var2.wh);
                           var8 = var2.pj0;
                           if (var2.pj0 == 0) {
                              break label74;
                           }
                        }

                        var9 = var2.xl0;
                        break label75;
                     }

                     var9 = var2.Kw;
                  }

                   var12.PX(var22 != 0, var29, var9, (byte)0, var8);
               }

               if (this.SH > 0.1F) {
                  long var13 = hk0_1.KG;
                  s3_0 var30 = this.eZ;
                  long var31;
                  int var33;
                  if ((var33 = this.eZ.Dy0(var4.pu)) < 0) {
                     var31 = var30.Ju;
                  } else {
                     var31 = var30.Fp[var33];
                  }

                  if (var13 - var31 > 10000L && rg0_2.r4(20) == 0) {
                     CH0 var14 = var4.pu;
                     this.eZ.uR(hk0_1.KG, var14);
                     tj0_0 var10000 = tw0_0.Tl0;
                     CH0 var35 = var4.pu;
                     lpt6__2 var11 = lpt6__2.YG0;
                     short var15 = 159;
                     int var23 = rg0_2.j40(this.lw0, this.zk0);
                     String[] var32 = sm0_0.zb0;
                     var10000.wM(var35, sm0_0.Bw((byte)2, var11, var15, var23, var32));
                  }
               }
            }
         }
      }

      if (this.SH > 0.1F) {
         this.SH = 0.0F;
      }
   }

   public final void sn0(short[] var1) {
      if (var1.length >= 1) {
         if (var1[0] == 308) {
            this.Gc0();
         }
      }
   }

   public final boolean Dk(byte var1, int var2, int var3) {
      switch (var1) {
         case 0:
            var3++;
            break;
         case 1:
            var3--;
            break;
         case 2:
            var2--;
            break;
         case 3:
            var2++;
      }

      LT var5 = super.WK.Fn(var2, var3, 0);
      yt_1 var6 = tw0_0.e60;
      E90 var4 = tw0_0.e60.jB0;
      zv_2 var7;
      return tw0_0.e60.jB0 != null && (var7 = var4.ba0).Lq0 == var2 && var7.B5 == var3 ? false : var6.Vm0((byte)0, var5) ^ true;
   }

   public final void Gc0() {
      if (!this.V4) {
         this.V4 = true;
         Iterator var1 = this.R5.iterator();

         while (var1.hasNext()) {
            bc_2 var2;
            short var3 = (var2 = (bc_2)var1.next()).Kw;

            while (var3 <= var2.xl0 - 10) {
               byte var5 = super.WK.dw;
               byte var6 = super.WK.Bm0;
               byte var7 = super.WK.case$;
               short var8 = (short)rg0_2.j40(var2.s90, var2.wh);
               byte var9 = var2.pj0;
               zv_2 var4 = new zv_2(var5, var6, var7, false, var8, var3, (byte)0, var9);
               CH0 var11 = q20_0.do0.vJ();
               var7 = super.WK.dw;
               var8 = var2.DJ[rg0_2.r4(var2.DJ.length)];
               var9 = var2.pj0;
               pk0_2 var10 = new pk0_2(var11, var7, var8, var9, var4);
               tw0_0.e60.pn0.put(var11, var10);
               var2.pg.add(var10);
               short var10000 = var2.LpT9;
               var3 = (short)(rg0_2.j40(0, 2) + var10000 + var3);
            }
         }
      }
   }
}
