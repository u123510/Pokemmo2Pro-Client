package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

public class GymSwitchMeshRenderer extends BaseMapMeshRenderer {
   public static final C8 u50 = new C8();
   public static final C8 Id = new C8();
   public final XU ES;
   public final v50_0 e20;
   public final pd0_1[] QH0;
   public final HashMap z;
   public final es_1 ub0;
   public final es_1 Yp0;
   public final es_1 D0;
   public final boolean[] wH;
   public Ou0 uF;

   public GymSwitchMeshRenderer(cb_0 var1) {
      super(var1);
      HashMap var2;
      var2 = new HashMap();
      this.z = var2;
      es_1 var11;
      var11 = new es_1();
      this.ub0 = var11;
      var11 = new es_1();
      this.Yp0 = var11;
      var11 = new es_1();
      this.D0 = var11;
      this.uF = null;
      Ts var14 = tw0_0.Ll0.nC0;
      FJ var3;
      var3 = new FJ(((l50_0)var14).nuL().COM7("/fielddata/tornworld/tw_arc.narc"));
      sk_1 var4 = (new CU(var3.EG(0).j90())).p80(((_else)var1).p4());
      XU var5;
      XU var10000 = var5 = new XU(var3.EG(var4.Md + 1));
      this.ES = var5;
      this.e20 = (new fx0_0(var14)).B5(((_else)var1).p4());
      ax_1[] var19;
      int var23 = (var19 = var10000.sg).length;

      for(int var27 = 0; var27 < var23; ++var27) {
         ax_1 var6;
         ax_1 var43 = var6 = var19[var27];
         Ou0 var7 = fi_0.xL().r8(var6.LA);
         short var8 = var6.z6;
         short var9 = var6.J6;
         short var10 = var6.LPT2;
         X9(var43.LA, var7, var8, var9, var10);
         if ((var8 = var43.LA) != 24 && var8 != 21) {
            var7.PE0 = 1.0E8F;
            var7.TU(0, false);
         } else {
            var7.TU(0, true);
         }

         if ((var8 = var6.LA) == 1 || var8 == 0) {
            this.ub0.Ue0(var7);
            C8 var38;
            C8 var10001 = var38 = new C8();
            this.Yp0.Ue0(var38);
            var10001.y = var7.ho.EW[13];
            var10001.z = (float)rg0_2.r4(99) / 100.0F;
            if (var6.LA == 0) {
               float var10002 = (float)var6.z6;
               float var39 = (float)var6.J6;
               Ll0 var48 = var1.fm(var10002, var39, (float)var6.LPT2, (yo_0)null);
               this.D0.Ue0(var48);
               var38.x = var48.S80();
            } else {
               this.D0.Ue0((Object)null);
            }
         }

         ((gr_2)this).yS(var7);
         ma0_1 var40;
         if ((var40 = (ma0_1)this.z.get(var6.Dj0)) == null) {
            var40 = new ma0_1();
            this.z.put(var6.Dj0, var40);
         }

         var40.pg0(var7);
      }

      this.wH = new boolean[this.ub0.KB];
      this.oG0(var14);
      v50_0 var15 = this.e20;
      this.QH0 = var15 == null ? new pd0_1[0] : new pd0_1[var15.pp0().size()];
      if (var15 != null) {

          for (Iterator<?> var16 = this.e20.pp0().iterator(); var16.hasNext();) {
             BP var20 = (BP)var16.next();
             Ou0 var24 = fi_0.xL().r8(var20.z40);
             X9(var20.z40, var24, var20.tH0, var20.Dk0, var20.Su0);
             ((gr_2)this).yS(var24);
             this.QH0[var20.P40] = new pd0_1((f.kq0_0)(Object)this, var20, var24);
         }

         pd0_1[] var17;
         int var21 = (var17 = this.QH0).length;

         for(int var25 = 0; var25 < var21; ++var25) {
            pd0_1 var29;
            BP var32;
            if ((var32 = (var29 = var17[var25]).FB0).zj0 == 2) {
               pd0_1 var47;
               pd0_1 var49;
               byte var50;
               switch (var32.P40) {
                  case 1:
                     var47 = var29;
                     var49 = this.QH0[2];
                     var50 = 1;
                     break;
                  case 2:
                     var47 = var29;
                     var49 = this.QH0[3];
                     var50 = 1;
                     break;
                  case 3:
                  case 7:
                  case 8:
                  case 14:
                  case 15:
                  default:
                     continue;
                  case 4:
                     var47 = var29;
                     var49 = this.QH0[4];
                     var50 = 3;
                     break;
                  case 5:
                     var47 = var29;
                     var49 = this.QH0[8];
                     var50 = 0;
                     break;
                  case 6:
                     var47 = var29;
                     var49 = this.QH0[7];
                     var50 = 3;
                     break;
                  case 9:
                     var47 = var29;
                     var49 = this.QH0[10];
                     var50 = 3;
                     break;
                  case 10:
                     var47 = var29;
                     var49 = this.QH0[11];
                     var50 = 3;
                     break;
                  case 11:
                     var47 = var29;
                     var49 = this.QH0[12];
                     var50 = 0;
                     break;
                  case 12:
                     var47 = var29;
                     var49 = this.QH0[15];
                     var50 = 2;
                     break;
                  case 13:
                     var47 = var29;
                     var49 = this.QH0[14];
                     var50 = 2;
                     break;
                  case 16:
                     var47 = var29;
                     var49 = this.QH0[1];
                     var50 = 3;
                     break;
                  case 17:
                     var47 = var29;
                     var49 = this.QH0[6];
                     var50 = 1;
               }

               var47.zg(var50, var49);
            }
         }
      }

      for (us_1 var30 : this.ES.tG0) {
         for(int var33 = 0; var33 < var30.x0 + 1; ++var33) {
            for(int var35 = 0; var35 < var30.jH0 + 1; ++var35) {
               LT var41;
               if ((var41 = ((_else)var1).A40(var30.Mu + var33, var30.I1 + var35)) != null) {
                  if (var41.u40() == lj_1.pF) {
                     mc0_0 var42;
                     var42 = new mc0_0((f.kq0_0)(Object)this);
                     var41.Mw(var42);
                  }

                  if (!(var41.u40() instanceof mc0_0)) {
                     throw new RuntimeException();
                  }

                  ((mc0_0)var41.u40()).J2(var30);
               }
            }
         }
      }

      if (((gr_2)this).gq0() == 580) {
         ((_else)var1).A40(96, 69).DZ(113.0F);
         ((_else)var1).A40(100, 69).DZ(113.0F);
         ((_else)var1).A40(105, 69).DZ(113.0F);
         ((_else)var1).A40(84, 60).DZ(113.0F);
         ((_else)var1).A40(84, 56).DZ(113.0F);
         ((_else)var1).A40(84, 52).DZ(113.0F);
         ((_else)var1).A40(68, 66).DZ(113.0F);
         ((_else)var1).A40(75, 66).DZ(113.0F);
         ((_else)var1).A40(79, 66).DZ(113.0F);
      }

      this.QA();
   }

   // $FF: synthetic method
   public static XF0 TG(GymSwitchMeshRenderer var0) {
      return var0.WK;
   }

   public static void X9(int var0, Ou0 var1, short var2, short var3, short var4) {
      int var10000 = var0;
      float var7 = 0.125F;
      float var5 = 0.125F;
      float var6 = -0.25F;
      switch (var10000) {
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 12:
         case 13:
         case 19:
            var5 = 0.0F;
            break;
         case 7:
         case 10:
         case 11:
         case 17:
         case 20:
         case 22:
         case 23:
         default:
            var7 = 0.125F;
            var5 = 0.125F;
            break;
         case 8:
         case 16:
            var7 = 0.0F;
            break;
         case 14:
         case 15:
            var7 = 0.25F;
            var5 = -0.125F;
            break;
         case 18:
            var7 = 0.0F;
            var5 = 0.25F;
            break;
         case 21:
            var6 = -0.5F;
            break;
         case 24:
            var5 = 0.25F;
            var6 = 0.0F;
      }

      float var10001 = (float)var2 * 0.25F + var7;
      var7 = (float)var4 * 0.25F + var6;
      var1.ho.el0(var10001, var7, (float)var3 * 0.25F + var5);
   }

   public final void lpt1(float var1) {
      pd0_1[] var10;
      int var2 = (var10 = this.QH0).length;

      for(int var3 = 0; var3 < var2; ++var3) {
         pd0_1 var4;
         C8 var6;
         label195: {
            label194: {
               Matrix4 var5 = (var4 = var10[var3]).ge.ho;
               C8 var10000 = var6 = u50;
               var5.V1(var6);
               C8 var7;
               float var8;
               float var25;
               if ((var25 = var10000.y) < (var8 = (var7 = var4.v50).y)) {
                  float var26;
                  float var74 = var26 = lg_0.S4.uL * 1.5F + var25;
                  var6.y = var26;
                  if (!(var74 >= (var25 = var7.y))) {
                     break label194;
                  }
               } else {
                  if (!(var25 > var8)) {
                     if ((var25 = var6.z) < (var8 = var7.z)) {
                        float var30;
                        float var76 = var30 = lg_0.S4.uL * 1.5F + var25;
                        var6.z = var30;
                        if (!(var76 >= (var25 = var7.z))) {
                           break label194;
                        }
                     } else {
                        if (!(var25 > var8)) {
                           if ((var25 = var6.x) < (var8 = var7.x)) {
                              float var34;
                              float var78 = var34 = lg_0.S4.uL * 1.5F + var25;
                              var6.x = var34;
                              if (!(var78 >= (var25 = var7.x))) {
                                 break label194;
                              }
                           } else {
                              if (!(var25 > var8)) {
                                 switch (var4.JI) {
                                    case 1:
                                       if ((var4.tJ -= lg_0.S4.uL) < 0.0F) {
                                          var25 = 0.125F;
                                          var8 = 0.0F;
                                          float var73 = -0.25F;
                                          switch (var4.UF) {
                                             case 0:
                                                var8 = -1.75F;
                                                break;
                                             case 1:
                                                var8 = 1.75F;
                                                break;
                                             case 2:
                                                var25 = 1.875F;
                                                break;
                                             case 3:
                                                var25 = -1.625F;
                                          }

                                          BP var64;
                                          float var96 = (float)(var64 = var4.sQ.FB0).tH0 * 0.25F + var25;
                                          var25 = (float)var64.Su0 * 0.25F + var73;
                                          float var65 = (float)var64.Dk0 * 0.25F + var8;
                                          var7.x = var96;
                                          var7.y = var25;
                                          var7.z = var65;
                                          var4.JI = 2;
                                          if (var4.qN) {
                                             var4.nA0();
                                          }
                                       }
                                       break label195;
                                    case 2:
                                       var4.JI = 3;
                                       var4.tJ = 1.0F;
                                       if (var4.qN) {
                                          cb_0 var93 = (cb_0)this.WK;
                                          C8 var88 = var4.Jq0.il0.t60;
                                          var25 = var88.x;
                                          float var61 = var88.y;
                                          var8 = var88.z;
                                          Ll0 var89 = var93.fm(var25, var61, var8, (yo_0)null);
                                          zv_2 var84 = var4.Jq0.ba0;
                                          boolean var46 = ((LT)var89).gr0();
                                          short var62 = var89.Tz();
                                          short var70 = var89.HR();
                                          byte var72 = var89.Sm;
                                          byte var47 = var4.Jq0.ba0.Y30;
                                          var84.PX(var46, var62, var70, var72, var47);
                                          bi0_1 var48;
                                          (var48 = var4.Jq0).il0.p6(var48.ba0);
                                          EA0 var85 = var4.Jq0.il0;
                                          Object var49 = null;
                                          var62 = 0;
                                          var85.getClass();
                                          var85.f60((Ou0)var49, (var62 != 0), C8.Zero);
                                          switch (var4.UF) {
                                             case 0:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.zm});
                                                break label195;
                                             case 1:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.EJ0});
                                                break label195;
                                             case 2:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.CL});
                                                break label195;
                                             case 3:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.Ey});
                                          }
                                       } else {
                                          switch (t70_0.Kc0(var4.UF)) {
                                             case 0:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.zm});
                                                break label195;
                                             case 1:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.EJ0});
                                                break label195;
                                             case 2:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.CL});
                                                break label195;
                                             case 3:
                                                var4.Jq0.il0.LE(new nk_0[]{nk_0.Ey});
                                          }
                                       }
                                       break label195;
                                    case 3:
                                       if ((var4.tJ -= lg_0.S4.uL) < 0.0F) {
                                          var4.JI = 4;
                                          if (!var4.qN) {
                                             var4.nA0();
                                          }

                                          var10000 = var4.v50;
                                          BP var43;
                                          float var95 = (float)(var43 = var4.FB0).tH0 * 0.25F + 0.125F;
                                          float var44 = (float)var43.Su0 * 0.25F - 0.25F;
                                          float var60 = (float)var43.Dk0 * 0.25F;
                                          var10000.x = var95;
                                          var10000.y = var44;
                                          var10000.z = var60;
                                       }
                                       break label195;
                                    case 4:
                                       var4.JI = 0;
                                       bi0_1 var37;
                                       if ((var37 = var4.Jq0) != null) {
                                          if (!var4.qN) {
                                             LT var38 = var4.ws0[var4.UF];
                                             zv_2 var81 = var37.ba0;
                                             boolean var39 = var38.gr0();
                                             short var58 = var38.Tz();
                                             short var68 = var38.HR();
                                             byte var9 = var38.Es();
                                             byte var40 = var4.Jq0.ba0.Y30;
                                             var81.PX(var39, var58, var68, var9, var40);
                                             bi0_1 var41;
                                             (var41 = var4.Jq0).il0.p6(var41.ba0);
                                          }

                                          EA0 var82 = var4.Jq0.il0;
                                          Object var42 = null;
                                          boolean var59 = false;
                                          var82.getClass();
                                          var82.f60((Ou0)var42, var59, C8.Zero);
                                          var4.Jq0 = null;
                                       }
                                    default:
                                       break label195;
                                 }
                              }

                              float var36;
                              float var79 = var36 = var25 - lg_0.S4.uL * 1.5F;
                              var6.x = var36;
                              if (!(var79 <= (var25 = var7.x))) {
                                 break label194;
                              }
                           }

                           var6.x = var25;
                           break label194;
                        }

                        float var32;
                        float var77 = var32 = var25 - lg_0.S4.uL * 1.5F;
                        var6.z = var32;
                        if (!(var77 <= (var25 = var7.z))) {
                           break label194;
                        }
                     }

                     var6.z = var25;
                     break label194;
                  }

                  float var28;
                  float var75 = var28 = var25 - lg_0.S4.uL * 1.5F;
                  var6.y = var28;
                  if (!(var75 <= (var25 = var7.y))) {
                     break label194;
                  }
               }

               var6.y = var25;
            }

            var4.ge.rF0();
         }

         var4.ge.ho.Y1(var6);
      }

      Iterator var11 = this.z.values().iterator();

      while(var11.hasNext()) {
         ma0_1 var13;
         if (!LW.LH0((var13 = (ma0_1)var11.next()).xV, var13.TJ0)) {
            float var16;
            if ((var16 = var13.xV) > var13.TJ0) {
               var13.xV = var16 - lg_0.S4.uL * 1.25F;
            } else {
               var13.xV = lg_0.S4.uL * 1.25F + var16;
            }

            var13.xV = LW.r1(var13.xV, 0.0F, 1.0F);
            Iterator var17 = var13.X2.iterator();

            while(var17.hasNext()) {
               Ou0 var20;
               I2 var52 = (var20 = (Ou0)var17.next()).Y3.ZD();

               while(var52.hasNext()) {
                  ((BM)var52.next()).LPT8(new sh_0(var13.xV));
               }

               var20.Th();
               var20.rF0();
            }
         }
      }

      float var12 = lg_0.S4.uL * 1.25F;

      for(int var14 = 0; var14 < this.ub0.KB; ++var14) {
         C8 var18;
         float var21;
         boolean[] var53;
         if ((var21 = (var18 = (C8)this.Yp0.get(var14)).z) >= 1.0F && (var53 = this.wH)[var14]) {
            var18.z = var21 - var12;
            var53[var14] = false;
         } else if (var21 > 0.0F && !this.wH[var14]) {
            var18.z = var21 - var12;
         } else if (var21 <= 0.0F && !(var53 = this.wH)[var14]) {
            var18.z = var21 + var12;
            var53[var14] = true;
         } else {
            var18.z = var21 + var12;
         }

         var21 = Math.min(1.0F, Math.max(0.0F, var18.z));
         Ou0 var92 = (Ou0)this.ub0.get(var14);
         var21 = by_0.Vk0.UV(var21) * 0.05F;
         var92.ho.EW[13] = var18.y - var21;
         LT var55;
         if ((var55 = (LT)this.D0.get(var14)) != null) {
            var55.DZ(var18.x - var21 * 4.0F);
         }
      }

      if (this.uF != null) {
         boolean enabled = tw0_0.rl.yh0.ma((byte)3, (short)16469) >= 14;

         I2 var19 = this.uF.Y3.ZD();

         while(var19.hasNext()) {
            BM var24 = (BM)var19.next();
            float var57 = enabled ? 1.0F : 0.0F;
            sh_0 var56 = new sh_0(var57);

            ((wh_0)var24).LPT8(var56);
         }
      }

      super.lpt1(var12);
   }

   public final void oG0(Ts var1) {
      wm_1 chunk = var1.z40.Wp0[9];
      ByteBuffer header = chunk.G3.MH(chunk.Zx);
      ByteBuffer records = chunk.G3.MH(chunk.Zx);
      tx_1.iY(header, 1117022236, -1122971147, 573);
      header.position(header.getInt() - chunk.O7);
      while (true) {
         int mapId = header.getInt();
         int recordOffset = header.getInt();
         if (mapId == 593 || recordOffset < 1) return;
         boolean alternate = mapId == 579 && this.gq0() == 577;
         if (mapId != this.gq0() && !alternate) continue;
         records.position(recordOffset - chunk.O7);
         while (true) {
            records.getInt();
            int objectId = records.getShort();
            short x = records.getShort();
            short y = records.getShort();
            short z = records.getShort();
            short layer = records.getShort();
            short marker = records.getShort();
            if (objectId == 25) break;
            Ou0 object = fi_0.xL().r8(objectId);
            X9(objectId, object, x, z, y);
            object.sC0(0, true, (gw_0)null);
            object.rF0();
            super.y50.Ue0(object);
            if (layer == 5 && marker == 14) this.uF = object;
         }
      }
   }

   public final void QA() {
      E90 state = tw0_0.e60.jB0;
      if (state == null) return;
      zv_2 pos = state.ba0;
      short x = pos.Lq0;
      short y = pos.B5;
      if (this.gq0() == 576) {
         this.fe0(0, x >= 63 && x <= 67 && y >= 32 && y <= 42);
         this.fe0(1, (x >= 72 && x <= 78 && y >= 33 && y <= 35)
                 || (x == 72 && y >= 36 && y <= 37));
         this.fe0(2, x >= 70 && x <= 74 && y >= 55 && y <= 61);
         this.fe0(3, x >= 70 && x <= 72 && y >= 63 && y <= 72);
         this.fe0(4, x >= 76 && x <= 85 && y >= 71 && y <= 73);
         this.fe0(5, x == 85 && y >= 57 && y <= 67);
         this.fe0(6, !(x == 87 && y == 46) && !(x == 82 && y == 49));
         this.fe0(7, x < 58 || (pos.JT == 0 && pos.Lpt2));
         this.fe0(8, !(x == 72 && y == 49) && !(x == 77 && y == 46));
         this.fe0(9, !(x == 80 && y == 29));
         this.fe0(10, x >= 82 && x <= 87 && y >= 39 && y <= 43);
         this.fe0(11, !(x == 99 && y == 30));
         this.fe0(12, !(x == 66 && (y == 64 || y == 72)));
         this.fe0(13, !(x == 60 && y == 67) && !(x == 63 && y == 72));
         this.fe0(14, !(x == 100 && y == 58));
         this.fe0(15, !(x == 95 && y == 60));
         this.fe0(16, !(x == 71 && y == 55) && !(x == 74 && y == 55));
         this.fe0(17, !(x == 62 && y == 56));
      } else if (this.gq0() == 577) {
         this.fe0(1, x >= 73 && x <= 82 && y >= 48 && y <= 56);
         this.fe0(2, !(x >= 79 && x <= 83 && y >= 47 && y <= 56));
         this.fe0(4, !((x >= 82 && x <= 86 && y >= 42 && y <= 48) || (x >= 73 && x <= 81 && y >= 42 && y <= 45)));
         this.fe0(5, x >= 72 && x <= 79 && y >= 42 && y <= 49);
         this.fe0(7, !((x >= 79 && x <= 86 && y >= 42 && y <= 53) || (x >= 77 && x <= 82 && y >= 56 && y <= 68)));
         this.fe0(8, !(x >= 69 && x <= 74 && y >= 64 && y <= 69));
         this.fe0(10, !((x >= 65 && x <= 74 && y >= 42 && y <= 53) || (x >= 69 && x <= 72 && y >= 54 && y <= 58)));
         this.fe0(11, !(x >= 65 && x <= 69 && y >= 59 && y <= 67));
         this.fe0(12, x >= 65 && x <= 74 && y >= 63 && y <= 68);
         this.fe0(13, (x >= 71 && x <= 80 && y >= 75 && y <= 80) || (x >= 70 && x <= 72 && y >= 81 && y <= 82));
      }
   }

   public final void fe0(int var1, boolean var2) {
      ma0_1 var3;
      if ((var3 = (ma0_1)this.z.get(var1)) != null) {
         var3.ah(var2, true);
      }

   }
}
