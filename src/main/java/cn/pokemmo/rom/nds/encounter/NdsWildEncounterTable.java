package cn.pokemmo.rom.nds.encounter;

import f.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class NdsWildEncounterTable implements fy0_0 {
   public static boolean cOm2;
   public static boolean dc;
   public static final dl_1 O6;
   public static final C8 U6;
   public static final C8 C1;
   public static final ly0_0 ZB;
   public static final float[][] oh;
   public static final float[][] xv0;
   public final int O00;
   public final int VJ;
   public final int uI;
   public final C8 hw;
   public final C8 Y40;
   public final Z50 EK;
   public final Ou0 wp0;
   public final es_1 yf0;
   public final es_1 xi;
   public final es_1 e80;
   public final boolean jQ;
   public final an_0 Br;
   public final MG0 LI0;
   public Ou0 O40;
   public final Ou0 Cg0;
   public Ou0 K10;

   public NdsWildEncounterTable(Ao0 var1, qj0_1 var2) {
      this.hw = new C8();
      this.Y40 = new C8();
      this.yf0 = new es_1(false, 16);
      this.xi = new es_1(false, 6);
      this.e80 = new es_1(false, 16);
      this.O40 = null;
      this.K10 = null;
      this.EK = var1;
      this.VJ = 0;
      this.Br = null;
      this.LI0 = null;
      int var3 = var2.sK0();
      this.uI = var3;
      int o00 = 0;
      Ou0 wp = null;
      Ou0 cg = null;
      boolean jq = true;

      ku_0 var4;
      try {
         var4 = ku_0.zn(var2.GE());
      } catch (Exception var30) {
         var30.printStackTrace();
         this.O00 = 0;
         this.wp0 = null;
         this.Cg0 = null;
         this.jQ = true;
         return;
      }

      if (var1.ac() == null) {
         o00 = var1.T70;
      } else {
         o00 = var1.ac().rV();
      }

      if (var1.Qy() == 3) {
         if (var3 == 177 || var3 == 178) {
            o00 = 14;
         } else if (var3 == 173) {
            o00 = 6;
         } else if (var3 == 174) {
            o00 = 15;
         } else if (var3 == 175) {
            o00 = 7;
         } else if (var3 == 176) {
            o00 = 12;
         } else if (var3 == 179) {
            o00 = 19;
         }
      }

      am_2 var5 = tw0_0.Ll0.AB(var1.Qy()).EL0(MG0.lpt6, o00);
      pc_1 var6 = new pc_1(var1.Qy(), var4.KV[0], var5, o00);
      v80_0.fo0(var4.KV[0], var5);
      if (dw_2.bn) {
         byte var7 = var1.Qy();
         if (var7 == 3) {
            wp = tw0_0.KW.jg0((byte)3).CE0(var3, var6);
            if (wp != null) {
               v80_0.GJ0(tw0_0.Ll0.nC0, wp, var4.KV[0], var6);
            }
         } else if (var7 == 4) {
            wp = tw0_0.KW.jg0((byte)4).CE0(var3, var6);
            if (wp != null) {
               v80_0.GJ0(tw0_0.Ll0.t1, wp, var4.KV[0], var6);
            }
         } else {
            this.O00 = o00;
            this.wp0 = null;
            this.Cg0 = null;
            this.jQ = true;
            return;
         }
      }

      boolean var31 = var1.Ap();
      boolean var8 = var1.ts0();
      if (wp == null) {
         if (var1.Qy() == 4 && var3 == 225) {
            eu0.xo(var4.KV[0]);
         }

         v80_0 var9 = v80_0.Cb0();
         var9.getClass();
         wp = v80_0.a40(var4.KV[0], var6, var5, null, 1.0F, var31, false);
      }

      this.O00 = o00;
      this.wp0 = wp;
      if (var1.Qy() == 3 && (var3 == 294 || var3 == 233 || var3 == 235)) {
         BM var32 = null;
         if (var3 == 233) {
            var32 = this.wp0.ff0("ss");
         } else if (var3 == 235 || var3 == 294) {
            var32 = this.wp0.ff0("lambert1");
         }

         if (var32 != null) {
            var32.fR(mz_2.g7);
         }
      }

      if (this.wp0 != null && !dc) {
         l50_0 var33;
         if (var1.Qy() == 3) {
            var33 = tw0_0.Ll0.nC0;
         } else {
            var33 = tw0_0.Ll0.t1;
         }

         v80_0.GJ0(var33, this.wp0, var4.KV[0], var6);
      }

      if (var2.hS > 0 && (var1.Qy() != 3 || var2.sK0() != 71)) {
         ByteBuffer var34 = var2.Xy0().j90();

         for (int var35 = 0; var35 < var2.hS; ++var35) {
            int var36 = var2.TM();
            var34.position(var35 * 48 + var36);
            C8 var37 = U6;
            int var38 = var34.getInt();
            float var39 = (var34.getShort() & 65535) / 65536.0F;
            var37.x = var34.getShort() + var39;
            var39 = (var34.getShort() & 65535) / 65536.0F;
            var37.y = var34.getShort() + var39;
            var39 = (var34.getShort() & 65535) / 65536.0F;
            var37.z = var34.getShort() + var39;
            if (var1.Qy() == 4 && (var38 == 124 || var38 == 125) && var8) {
               continue;
            }

            if (var1.Qy() == 4 && var38 == 221) {
               var38 = 23;
            }

            Ou0 var40;
            if (var1.Qy() == 3) {
               var40 = ok0_2.gm(var37, this.wp0.oU, var38);
            } else {
               var40 = ok0_2.coM9(var37, this.wp0.oU, var38, var8 ^ true);
            }

            if (var40 == null) {
               O6.info("unable to load building id = {}", Integer.valueOf(var38));
               continue;
            }

            if (var1.Qy() == 4 && var1.IU() == gh_0.tA) {
               if (var38 == 36) {
                  this.O40 = var40;
                  this.K10 = ok0_2.coM9(var37, this.wp0.oU, 107, false);
               } else if (var38 == 37) {
                  cg = var40;
               }
            } else if (var1.Qy() == 3) {
               if (var38 == 123) {
                  this.O40 = var40;
                  this.K10 = ok0_2.gm(var37, this.wp0.oU, 517);
               } else if (var38 == 124) {
                  cg = var40;
               }
            }

            var40.Yt0((byte)2, var1.tN);
            this.yf0.Ue0(var40);
         }
      }

      if (var1.Qy() == 3) {
         if (this.uI == 588) {
            jq = false;
         }

         byte var41 = var1.tN;
         if (var41 == 6) {
            this.wp0.Gv(new String[]{"c1_o02b_lm6"});
            this.wp0.Gv(new String[]{"c1_o02b_lm4"});
         } else if (var41 == 10) {
            this.wp0.Gv(new String[]{"c5_light_lm2"});
            this.wp0.Gv(new String[]{"lambert7"});
         } else if (var41 == 56) {
            this.wp0.Gv(new String[]{"c5_light_lm2"});
            this.wp0.Gv(new String[]{"c5_light_lm4"});
            this.wp0.Gv(new String[]{"c5_light_lm6"});
         }
      } else if (var1.Qy() == 4) {
         if (var1.O60 == 76) {
            this.wp0.Ck("h_mado_lm1");
            this.wp0.Ck("ko_h03x_h_");
         } else {
            int var42 = this.uI;
            if (var42 == 249) {
               this.wp0.sY = false;
            } else if (var42 == 246) {
               Xz0 var43 = this.wp0.Yz("polygon2_lm9");
               if (var43 != null) {
                  var43.X50();
               }
            } else if (var42 == 225) {
               eu0.o8(this.wp0);
            } else if (var42 == 230) {
               BM var44 = this.wp0.ff0("lm4");
               if (var44 != null) {
                  var44.LPT8(new PRN_(PRN_.Ly, Color.BLACK.cpy()));
               }
            } else if (var42 == 445) {
               Ou0 var45 = this.ll();
               if (var45 != null) {
                  var45.Yz("back_yuu").Fc0.mf0(1.0F, 1.0F, 1.0F);
                  var45.Yz("cloud_yuu").Fc0.mf0(1.0F, 1.0F, 1.0F);
                  var45.Yz("back_yoru").Fc0.mf0(1.0F, 1.0F, 1.0F);
                  var45.Yz("cloud_yoru").Fc0.mf0(1.0F, 1.0F, 1.0F);
                  var45.a8();
               }
            }
         }
      }

      this.Cg0 = cg;
      this.jQ = jq;
   }

   public NdsWildEncounterTable(ug_0 var1, w6 var2) {
      this.hw = new C8();
      this.Y40 = new C8();
      this.yf0 = new es_1(false, 16);
      this.xi = new es_1(false, 6);
      this.e80 = new es_1(false, 16);
      this.O40 = null;
      this.K10 = null;
      this.EK = var1;
      int var3 = var2.sK0();
      this.uI = var3;
      boolean jq = true;
      Ou0 wp = null;
      an_0 br = null;
      MG0 li0;
      int o00;
      int vj;

      ku_0 var4;
      try {
         var4 = ku_0.zn(var2.GE());
      } catch (Exception var29) {
         var29.printStackTrace();
         this.O00 = 0;
         this.VJ = 0;
         this.wp0 = null;
         this.Br = null;
         this.LI0 = null;
         this.Cg0 = null;
         this.jQ = true;
         return;
      }

      var1.KJ();
      km0 var30 = var1.ac();
      o00 = var30.rV();
      vj = var30.nG0();
      if (var1.Ap()) {
         li0 = MG0.Wk0;
      } else {
         li0 = MG0.rm;
      }

      this.O00 = o00;
      this.VJ = vj;
      this.LI0 = li0;
      wl0_1 var5 = tw0_0.Ll0.Qz0.s30().jy(o00);
      if (dw_2.bn) {
         v80_0.fo0(var4.KV[0], var5.vI0);
         var5.while$(var4.KV[0]);
         wp = tw0_0.KW.jg0((byte)2).CE0(var3, var5.t50);
         if (wp != null) {
            v80_0.GJ0(tw0_0.Ll0.Qz0, wp, var4.KV[0], var5.t50);
         }
      }

      if (wp == null || !dw_2.bn) {
         v80_0.Cb0().getClass();
         wp = v80_0.o7(var4.KV[0], var5, li0 == MG0.Wk0);
         if (tw0_0.ng() && dw_2.bn) {
            O6.info("Failed to load cache of {}. Using convert instead.", wp.yI0);
         }

         v80_0.GJ0(tw0_0.Ll0.Qz0, wp, var4.KV[0], var5.t50);
      }

      this.wp0 = wp;
      ns0_0 var31 = tw0_0.Ll0.Qz0.s30().wM(li0, vj);
      br = var31.hW;
      this.Br = br;
      nb_2 var32 = var31.MM;
      am_2 var33 = tw0_0.Ll0.Qz0.EL0(li0, vj);
      ByteBuffer var34 = var2.Xy0().j90();
      var34.position(var2.TM());
      int var35 = var34.getInt();

      for (int var36 = 0; var36 < var35; ++var36) {
         C8 var37 = U6;
         float var38 = (var34.getShort() & 65535) / 65536.0F;
         var37.x = var34.getShort() + var38;
         var38 = (var34.getShort() & 65535) / 65536.0F;
         var37.y = var34.getShort() + var38;
         var38 = (var34.getShort() & 65535) / 65536.0F;
         var37.z = -var34.getShort() - var38;
         var34.get();
         int var39 = var34.get() & 255;
         int var40 = (var34.get() & 255) << 8 | var34.get() & 255;
         int var41 = var34.position();
         short var42 = (short)var40;
         this.X1(var37, var42, var39, var33, var32);
         var34.position(var41);
      }

      if (this.O00 == 211 && this.VJ == 1) {
         Xz0 var43 = this.wp0.Yz("polygon3_in02_pc");
         if (var43 != null) {
            var43.X50();
         }
      }

      int var44 = var1.O60;
      if (var44 == 28) {
         this.hw.y += 0.1F;
         jq = false;
         int var45 = this.uI;
         if (var45 == 635) {
            es_1 var46 = this.wp0.ZE0;
            var46.sj0(var46.get(0), true);
         } else if (var45 == 636) {
            ((I20)this.wp0.Yz("polygon25_c3_kanban").sJ0.get(0)).d40.Y7.Fg0(100.0F);
            ((I20)this.wp0.Yz("polygon26_c3_kanban").sJ0.get(0)).d40.Y7.Fg0(100.0F);
            ((I20)this.wp0.Yz("polygon27_c3_kanban").sJ0.get(0)).d40.Y7.Fg0(100.0F);
            ((I20)this.wp0.Yz("polygon19_c3_kanban").sJ0.get(0)).d40.Y7.Fg0(100.0F);
            jq = false;
            this.wp0.Ck("c3_window");
            this.wp0.MZ("c3_window_1");
         }
      } else if (var44 == 33) {
         jq = false;
      } else if (var44 == 249) {
         this.hw.y = 0.05F;
      } else if (var44 >= 30 && var44 <= 35) {
         if (var44 == 35) {
            this.wp0.MZ("h_mado");
         } else {
            this.wp0.Ck("h_mado");
         }
      }

      this.Cg0 = null;
      this.jQ = jq;
   }

   static {
      O6 = Cq0.E1(NdsWildEncounterTable.class);
      U6 = new C8();
      C1 = new C8();
      new C8();
      new Matrix4();
      ZB = new ly0_0();
      oh = new float[][]{
         {-0.05F, -0.1F},
         {0.05F, -0.1F},
         {0.1F, 0.0F},
         {0.05F, 0.1F},
         {-0.05F, 0.1F},
         {-0.1F, 0.0F}
      };
      xv0 = new float[][]{
         {-0.05F, -0.1F},
         {0.05F, -0.1F},
         {-0.05F, 0.0F},
         {0.05F, 0.0F},
         {-0.05F, 0.1F},
         {0.05F, 0.1F}
      };
   }

   public static void Uu0(iq0_0 var0, es_1 var1, Xz0 var2, C8 var3) {
      es_1 var4 = var2.sJ0;
      if (var4.KB != 0) {
         I2 var5 = var4.ZD();

         while (var5.hasNext()) {
            I20 var6 = (I20)var5.next();
            U6.np(var6.d40.T4);
            U6.na(var3.x, var3.y, var3.z);
            C1.np(var6.d40.Y7);
            C1.Fg0(2.0F);
            if (R30.cf(var0, U6, C1)) {
               var1.Ue0(var6.jK0);
            }
         }
      }

      I2 var7 = var2.yn.ZD();

      while (var7.hasNext()) {
         Uu0(var0, var1, (Xz0)var7.next(), var3);
      }
   }

   public static void x8(Xz0 var0) {
      es_1 var1 = var0.sJ0;
      if (var1.KB != 0) {
         I2 var2 = var1.ZD();

         while (var2.hasNext()) {
            U30 var3 = ((I20)var2.next()).d40;
            ap0_0 var4 = var3.m8;
            ly0_0 var5 = ZB;
            int var6 = var3.d30;
            int var7 = var3.I8;
            Matrix4 var8 = var0.TG0;
            var4.getClass();
            var4.Bn0(var5.br(), var6, var7, var8);
            var3.T4.np(var5.Xm0);
            var3.Y7.np(var5.ec0);
            var3.Y7.Fg0(0.5F);
            var3.ep0 = var3.Y7.Am0();
         }
      }

      I2 var9 = var0.yn.ZD();

      while (var9.hasNext()) {
         x8((Xz0)var9.next());
      }
   }

   public final Ou0 ll() {
      int var1 = 187;
      I2 var2 = this.yf0.ZD();

      while (var2.hasNext()) {
         Ou0 var3 = (Ou0)var2.next();
         if (var3.AD == var1) {
            return var3;
         }
      }

      return null;
   }

   public final Ou0 LH0(C8 var1, int var2) {
      am_2 var3 = tw0_0.Ll0.Qz0.EL0(this.LI0, this.VJ);
      return this.X1(var1, var2, 0, var3, new nb_2());
   }

   public final Ou0 X1(C8 var1, int var2, int var3, am_2 var4, nb_2 var5) {
      JC0 var6 = (JC0)this.Br.i8.get(Short.valueOf((short)var2));
      if (var6 == null) {
         O6.info("Unable to load model: {}", Integer.valueOf(var2));
         return null;
      } else {
         var6.ZJ();
         if (var6.iK0 == null) {
            O6.info("Unable to load model: {}", Integer.valueOf(var2));
            return null;
         } else {
            Ou0 var7;
            if (var5.fl(Integer.valueOf(var2))) {
               var7 = new Ou0((Ou0)var5.Wk0(Integer.valueOf(var2)));
               var7.AD = var2;
            } else {
               var7 = this.R6(var6, var4);
               var5.WK0(Integer.valueOf(var2), var7);
               var7.AD = var2;
            }

            if (var7.Kv.KB > 0 && (var6.n4 == 1 || var6.n4 == 3)) {
               var7.t20 = var6.n4 == 3;
               var7.sC0(0, true, null);
               if (var6.o == 2) {
                  var7.sC0(1, true, null);
               }
            }

            MG0 var8 = MG0.Wk0;
            if (this.LI0 == var8 && var2 == 34) {
               JC0 var9 = (JC0)this.Br.i8.get(Short.valueOf((short)98));
               var9.ZJ();
               Ou0 var10 = this.R6(var9, var4);
               this.K10 = var10;
               var10.sY = false;
               this.O40 = var7;
            }

            var7.lw = var3;
            var1 = var1.Fg0(0.25F);
            var7.ho.el0(var1.x, var1.y, var1.z);
            if (var7.yI0.startsWith("door_")) {
               var7.Mp0.jG0.na(var1.x, var1.y, var1.z);
               var7.Mp0.jG0.dz0(0.15F);
               var7.Mp0.Xa0.na(var1.x, var1.y, var1.z);
               var7.Mp0.Xa0.if$(0.15F);
               if (this.uI == 638) {
                  var7.ho.el0(0.0F, -0.025F, 0.0F);
               }
            } else {
               var7.Mp0.jG0.na(var1.x, var1.y, var1.z);
               var7.Mp0.Xa0.na(var1.x, var1.y, var1.z);
               var7.Mp0.nF(var7.Mp0.jG0, var7.Mp0.Xa0);
            }

            var7.Yt0((byte)2, this.EK.tN);
            this.yf0.Ue0(var7);
            short var11 = var6.eI;
            if (var11 >= 0) {
               JC0 var12 = (JC0)this.Br.i8.get(Short.valueOf(var11));
               if (var12 == null) {
                  return var7;
               }

               var12.ZJ();
               if (var12.iK0 == null) {
                  return var7;
               }

               Ou0 var13;
               if (!var5.fl(Integer.valueOf(var6.eI))) {
                  pc_1 var14 = new pc_1();
                  this.e80.Ue0(var14);
                  var14.Od0(var12.iK0.KV[0], var4);
                  var13 = null;
                  if (dw_2.bn) {
                     var13 = tw0_0.KW.bG0[2].yt0(this.LI0, this.VJ, var12.im, var14);
                     if (var13 != null) {
                        v80_0.Cb0().getClass();
                        v80_0.D7(var13, var4, var14, var12.JA);
                     }
                  }

                  if (var13 == null) {
                     v80_0.Cb0().getClass();
                     var13 = v80_0.a40(var12.iK0.KV[0], var14, var4, var12.JA, 1.0F, this.LI0 == var8, false);
                  }

                  var5.WK0(Integer.valueOf(var6.eI), var13);
               } else {
                  var13 = new Ou0((Ou0)var5.Wk0(Integer.valueOf(var6.eI)));
               }

               var13.ho.el0(var1.x, var1.y, var1.z);
               var13.ho.el0(var6.rt0.x * 0.016F, 0.0F, var6.rt0.z * 0.015F);
               if (this.wp0.yI0.equals("map24_18") && var6.rt0.z == 13.0F) {
                  var13.ho.el0(0.0F, var6.rt0.z * 0.012F, 0.0F);
               }

               var13.ho.V1(U6);
               var13.Mp0.jG0.na(U6.x, U6.y, U6.z);
               var13.Mp0.Xa0.na(U6.x, U6.y, U6.z);
               var13.Mp0.nF(var13.Mp0.jG0, var13.Mp0.Xa0);
               this.yf0.Ue0(var13);
               var13.AD = var6.eI;
            }

            return var7;
         }
      }
   }

   public final Ou0 R6(JC0 var1, am_2 var2) {
      Ou0 var3 = null;
      pc_1 var4 = new pc_1();
      this.e80.Ue0(var4);
      var4.Od0(var1.iK0.KV[0], var2);
      if (dw_2.bn) {
         var3 = tw0_0.KW.bG0[2].yt0(this.LI0, this.VJ, var1.im, var4);
         if (var3 != null && var1.JA.KB > 0) {
            v80_0.Cb0().getClass();
            v80_0.D7(var3, var2, var4, var1.JA);
         }
      }

      if (var3 == null) {
         v80_0.fo0(var1.iK0.KV[0], var2);
         v80_0 var5 = v80_0.Cb0();
         var5.getClass();
         var3 = v80_0.a40(var1.iK0.KV[0], var4, var2, var1.JA, this.wp0.oU / var1.iK0.KV[0].Iu0, this.LI0 == MG0.Wk0, false);
      }

      return var3;
   }

   public final void GN(int var1) {
      Ou0 var2 = this.O40;
      if (var2 != null && this.K10 != null && tw0_0.e60 != null && tw0_0.e60.jB0 != null) {
         var2.ho.V1(U6);

         for (int var3 = 0; var3 < var1; ++var3) {
            Ou0 var4 = this.K10.Ma0();
            var4.ho.el0(U6.x, U6.y, U6.z);
            this.xi.Ue0(var4);
         }

         boolean var5 = this.EK.lU.Tz() == 2;
         float[][] var6 = var5 ? oh : xv0;
         E90 var7 = tw0_0.e60.jB0;
         short var8 = var7.mI0();
         var7.QL();
         if (var8 != 0) {
            KF var9 = var7.rd;
            if (var9 != null) {
               ((Ai0)var9.hj).N10 = true;
            }
         }

         pw_1 var10 = pw_1.xC();

         for (int var11 = 0; var11 < var1; ++var11) {
            final int var12 = var11;
            var10.p1(0.125F);
            var10.y80(ao_1.pc((int var13, D2 var14) -> this.rl0(var6, var12, var13, var14)));
         }

         var10.y80(ao_1.pc((int var15, D2 var16) -> this.Re(var5, var15, var16)));
         float var17 = var5 ? 3.0F : 2.0F;
         var10.p1(var17);
         var10.y80(ao_1.pc((int var18, D2 var19) -> this.DB(var8, var7, var18, var19)));
         var10.Ms(tw0_0.LD0.Ov);
      }
   }

   public final void dispose() {
      this.wp0.O4();
      I2 var1 = this.yf0.ZD();

      while (var1.hasNext()) {
         ((Ou0)var1.next()).O4();
      }

      this.yf0.clear();
      Ou0 var2 = this.K10;
      if (var2 != null) {
         var2.O4();
      }

      I2 var3 = this.e80.ZD();

      while (var3.hasNext()) {
         ((pc_1)var3.next()).dispose();
      }

      this.e80.clear();
   }

   public final void kK(Xz0 var1, BJ0 var2) {
      es_1 var3 = var1.sJ0;
      if (var3.KB != 0) {
         I2 var4 = var3.ZD();

         while (var4.hasNext()) {
            I20 var5 = (I20)var4.next();
            U30 var6 = var5.d40;
            fv_2 var7 = var2.cON;
            float var8 = var6.T4.x + this.Y40.x;
            float var9 = var6.T4.y + this.Y40.y;
            float var10 = var6.T4.z + this.Y40.z;
            float var11 = var6.Y7.x;
            float var12 = var6.Y7.y;
            float var13 = var6.Y7.z;
            boolean var14 = false;

            for (int var15 = 0; var15 < var7.Bu.length; ++var15) {
               float var16 = var8 + var11;
               float var17 = var9 + var12;
               float var18 = var10 + var13;
               lpt2__2 var19 = lpt2__2.Kj;
               if (var7.Bu[var15].Jj0(var16, var17, var18) != var19) {
                  continue;
               }

               float var20 = var10 - var13;
               if (var7.Bu[var15].Jj0(var16, var17, var20) != var19) {
                  continue;
               }

               float var21 = var9 - var12;
               if (var7.Bu[var15].Jj0(var16, var21, var18) != var19) {
                  continue;
               }

               if (var7.Bu[var15].Jj0(var16, var21, var20) != var19) {
                  continue;
               }

               var16 = var8 - var11;
               if (var7.Bu[var15].Jj0(var16, var17, var18) != var19) {
                  continue;
               }

               if (var7.Bu[var15].Jj0(var16, var17, var20) != var19) {
                  continue;
               }

               if (var7.Bu[var15].Jj0(var16, var21, var18) != var19) {
                  continue;
               }

               if (var7.Bu[var15].Jj0(var16, var21, var20) == var19) {
                  var5.eh = false;
                  var14 = true;
                  break;
               }
            }

            if (!var14) {
               var5.eh = true;
            }
         }
      }

      I2 var22 = var1.yn.ZD();

      while (var22.hasNext()) {
         this.kK((Xz0)var22.next(), var2);
      }
   }

   public final void Py0() {
      this.wp0.ho.el0(this.hw.x, this.hw.y, this.hw.z);
      this.wp0.Mp0.jG0.na(this.hw.x, this.hw.y, this.hw.z);
      this.wp0.Mp0.Xa0.na(this.hw.x, this.hw.y, this.hw.z);
      this.wp0.Mp0.nF(this.wp0.Mp0.jG0, this.wp0.Mp0.Xa0);
      this.wp0.a8();
      this.wp0.ho.V1(this.Y40);
      es_1 var1 = this.wp0.ZE0;
      if (var1.KB == 1) {
         x8((Xz0)var1.get(0));
      }

      I2 var2 = this.yf0.ZD();

      while (var2.hasNext()) {
         Ou0 var3 = (Ou0)var2.next();
         C8 var4 = new C8();
         var3.ho.V1(var4);
         var3.ho.el0(this.hw.x, this.hw.y, this.hw.z);
         var3.ho.tO(C8.Y, (float)var3.lw / 64.0F * 90.0F);
         var3.rF0();
         if (this.EK.lU.Tz() == 3 || this.EK.lU.Tz() == 4) {
            this.wp0.Mp0.qK0(var3.Mp0);
         }
      }

      this.hw.x = 0.0F;
      this.hw.y = 0.0F;
      this.hw.z = 0.0F;
   }

   public final void Hb0(rj0_2 var1) {
      this.wp0.aW(var1, true);
      I2 var2 = this.yf0.ZD();

      while (var2.hasNext()) {
         ((Ou0)var2.next()).aW(var1, true);
      }
   }

   public final void DB(short var1, E90 var2, int var3, D2 var4) {
      this.xi.clear();
      if (var1 != 0) {
         KF var5 = var2.rd;
         if (var5 != null) {
            ((Ai0)var5.hj).N10 = false;
         }
      }
   }

   public final void Re(boolean var1, int var2, D2 var3) {
      this.O40.sC0(0, false, null);
      this.O40.PE0 = 1.125F;
      tw0_0.RE0.SA0((byte)2, (short)1300);
      if (!var1) {
         Ou0 var4 = this.Cg0;
         if (var4 != null) {
            var4.PE0 = 1.25F;
            var4.sC0(0, false, null);
         }
      }

      I2 var5 = this.xi.ZD();

      while (var5.hasNext()) {
         ((Ou0)var5.next()).sC0(0, false, null);
      }
   }

   public final void rl0(float[][] var1, int var2, int var3, D2 var4) {
      Ou0 var5 = this.K10.Ma0();
      var5.ho.el0(U6.x + var1[var2][0], U6.y + 0.2F, U6.z + var1[var2][1]);
      this.xi.Ue0(var5);
   }
}
