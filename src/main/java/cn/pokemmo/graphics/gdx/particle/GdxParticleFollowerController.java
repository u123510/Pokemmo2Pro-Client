package cn.pokemmo.graphics.gdx.particle;

import f.*;
import cn.pokemmo.world.entity.PlayerAvatarMovementController;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;

public class GdxParticleFollowerController extends cn.pokemmo.graphics.gdx.particle.GdxFollowerParticleRenderer {
   public static final int[][] Ti0;
   public static final int[][] Mk;
   public static final int[][] mn0;
   public static final int[][] Fb0;
   public Color z2;
   public Color N30;
   public final PlayerAvatarMovementController Bk0;
   public com3__3 c;
   public com3__3 k40;
   public float i10;
   public Ou0 Oy;

   public GdxParticleFollowerController(PlayerAvatarMovementController var1) {
      super(var1);
      this.Bk0 = var1;
   }

   static {
      int[][] var10000 = new int[4][];
      int[] var0;
      int[] var10005 = var0 = new int[4];
      var10005[0] = 11;
      var10005[1] = 12;
      var10005[2] = 13;
      var10005[3] = 14;
      var10000[0] = var0;
      int[] var10004 = var0 = new int[4];
      var10004[0] = 0;
      var10004[1] = 8;
      var10004[2] = 9;
      var10004[3] = 10;
      var10000[1] = var0;
      int[] var10003 = var0 = new int[4];
      var10003[0] = 15;
      var10003[1] = 1;
      var10003[2] = 2;
      var10003[3] = 3;
      var10000[2] = var0;
      int[] var10002 = var0 = new int[4];
      var10002[0] = 4;
      var10002[1] = 5;
      var10002[2] = 6;
      var10002[3] = 7;
      var10000[3] = var0;
      Ti0 = var10000;
      var10000 = new int[4][];
      var10005 = var0 = new int[4];
      var10005[0] = 2;
      var10005[1] = 3;
      var10005[2] = 2;
      var10005[3] = 3;
      var10000[0] = var0;
      var10004 = var0 = new int[4];
      var10004[0] = 0;
      var10004[1] = 1;
      var10004[2] = 0;
      var10004[3] = 1;
      var10000[1] = var0;
      var10003 = var0 = new int[4];
      var10003[0] = 4;
      var10003[1] = 5;
      var10003[2] = 4;
      var10003[3] = 5;
      var10000[2] = var0;
      var10002 = var0 = new int[4];
      var10002[0] = 6;
      var10002[1] = 7;
      var10002[2] = 6;
      var10002[3] = 7;
      var10000[3] = var0;
      Mk = var10000;
      var10000 = new int[4][];
      var10005 = var0 = new int[4];
      var10005[0] = 12;
      var10005[1] = 13;
      var10005[2] = 14;
      var10005[3] = 15;
      var10000[0] = var0;
      var10004 = var0 = new int[4];
      var10004[0] = 0;
      var10004[1] = 9;
      var10004[2] = 10;
      var10004[3] = 11;
      var10000[1] = var0;
      var10003 = var0 = new int[4];
      var10003[0] = 16;
      var10003[1] = 1;
      var10003[2] = 2;
      var10003[3] = 3;
      var10000[2] = var0;
      var10002 = var0 = new int[4];
      var10002[0] = 4;
      var10002[1] = 5;
      var10002[2] = 6;
      var10002[3] = 7;
      var10000[3] = var0;
      mn0 = var10000;
      var10000 = new int[4][];
      var10005 = var0 = new int[4];
      var10005[0] = 27;
      var10005[1] = 28;
      var10005[2] = 29;
      var10005[3] = 30;
      var10000[0] = var0;
      var10004 = var0 = new int[4];
      var10004[0] = 0;
      var10004[1] = 11;
      var10004[2] = 0;
      var10004[3] = 26;
      var10000[1] = var0;
      var10003 = var0 = new int[4];
      var10003[0] = 2;
      var10003[1] = 1;
      var10003[2] = 2;
      var10003[3] = 3;
      var10000[2] = var0;
      var10002 = var0 = new int[4];
      var10002[0] = 4;
      var10002[1] = 5;
      var10002[2] = 6;
      var10002[3] = 7;
      var10000[3] = var0;
      Fb0 = var10000;
   }

   public final void ej0() {
      PlayerAvatarMovementController var1;
      byte var2;
      if ((var2 = (var1 = this.Bk0).ba0.uS) == 0) {
         super.w5 = QI.Py.kN(var2, var1.Z4, false).XC(11);
      } else if (var2 == 1) {
         super.w5 = QI.Py.kN(var2, var1.Z4, false).XC(12);
      } else if (var2 == 3 && var1.Z4 == 230) {
         super.OA0.y = 2.0F;
         vo_2 var3;
         if ((var3 = tw0_0.LD0.Sc) != null) {
            var3.IK();
         }
      }

   }

   /** Reconstructed directly from f/z2_0.N30 bytecode. */
   public boolean N30(hl0_1 renderer, int frame, boolean flip) {
      PlayerAvatarMovementController object = this.Bk0;
      nk_0 mapObject = object.il0.mV;
      short modelId = object.Z4;
      byte modelType = object.ok;
      if (modelType == 1) {
         if (modelId == 207) {
            flip = false;
            if (this.ZD() == 3) {
               frame++;
            }
            if (mapObject != null && mapObject.Dw0 || mapObject == nk_0.rH0) {
               frame = 4;
            }
         } else if (modelId == 94) {
            flip = false;
         }
      }
      if (modelId == 0) {
         return true;
      }

      tw0_0.Tl0.Ov(object);
      if (object.x10 > 0) {
         return super.N30(renderer, frame, flip);
      }

      ht_0 model = null;
      boolean customSprite = false;
      Wr sprite = null;
      boolean specialType = modelType == 10;
      float scale = object.coM6;
      if (!specialType && dw_2.Is0 && tw0_0.Ll0.t1 != null) {
         ht_0 candidate = QI.Py.kN(modelType, modelId, false);
         if (!(candidate instanceof IH)) {
            sprite = tw0_0.Ll0.t1.v5(modelType, modelId, (short)frame);
            customSprite = sprite != null;
         }
      }

      if (specialType) {
         if (modelId == 1210) {
            cq0_0 cache = tw0_0.rl.oY;
            short state = cache.lY.jA0((short)1044);
            short animation = cache.lY.kp((short)1504) ? (short)120 : (short)121;
            animation = (short)(rg0_0.gu(animation, false, true, 0) + 4095);
            byte direction = this.ZD();
            if (state == 0) {
               direction = 1;
            }
            Wr alternate = tw0_0.Ll0.Qz0.AF(animation).gs0(direction, 0);
            if (state != 50 && state != 0) {
               scale = 0.9F;
               super.VH.y -= 23.4F;
            } else if (state == 0) {
               super.VH.y += 5.0F;
            } else {
               super.VH.y += 3.0F;
            }
            sprite = alternate;
         }
         if (modelId >= 500 && modelId < 600 && zp_0.Wk[modelId - 500]
               || modelId >= 600 && modelId < 700 && zp_0.rx[modelId - 600]) {
            frame = c8_0.JD0.YG();
         }
      }

      if (sprite == null) {
         model = QI.Py.kN(modelType, modelId, false);
         sprite = model.li0(frame);
      }
      int x = (int)super.VH.x;
      int y = (int)super.VH.y;
      if (sprite == null) {
         return true;
      }

      if (!customSprite && !specialType) {
         if (model.Lx0() != -1) {
            this.wH0(255, renderer);
            Texture texture = sprite.H8();
            renderer.QB0(texture, x - (texture.getWidth() - 16) / 2.0F,
                  y - (texture.getHeight() - 16), texture.getWidth(), texture.getHeight(),
                  texture.getWidth(), texture.getHeight(), flip, false);
         }
         if (!this.Bk0.I80) {
            return true;
         }
         Wr marker = QI.Py.kN((byte)10, 298, true).li0((int)(hk0_1.KG / 200L) % 9);
         if (marker == null) {
            return true;
         }
         Texture texture = marker.H8();
         renderer.oH.set(Color.WHITE);
         renderer.og = Color.WHITE.toFloatBits();
         renderer.QB0(texture, x - (texture.getWidth() - 16) / 2.0F,
               y - (texture.getHeight() - 16), texture.getWidth(), texture.getHeight(),
               texture.getWidth(), texture.getHeight(), flip, false);
         float color = Vs0.lv;
         Color.abgr8888ToColor(renderer.oH, color);
         renderer.og = color;
         return true;
      }

      float xOffset = 0.5F;
      boolean drawShadow;
      switch (modelId) {
         case 201: case 240: case 241: case 280: case 281: case 282:
         case 286: case 287: case 288: case 289: case 290: case 291:
         case 294: case 295: case 296: case 299: case 301: case 302:
         case 306: case 311: case 320:
            drawShadow = false;
            break;
         default:
            drawShadow = modelId < 500 || modelId > 1000;
      }
      if (specialType) {
         if (modelId == 240 || modelId == 288) {
            xOffset = 24.0F;
         } else if (modelId == 241 || modelId == 289) {
            xOffset = 32.0F;
         } else if (modelId == 301) {
            y += 9;
         } else if (modelId >= 500 && modelId <= 1000) {
            x += 16;
            y += 32;
         }
      }
      if (drawShadow) {
         this.wH0(255, renderer);
      }

      Texture texture = sprite.H8();
      int width = (int)(texture.getWidth() * scale);
      int height = (int)(texture.getHeight() * scale);
      float drawX = x + xOffset - (width * 0.751F - 16.0F) / 2.0F;
      float drawY = y - (height * 0.751F - 16.0F);
      if (modelId == 294 || modelId == 295 || modelId == 296) {
         Color tint = this.L20(this.Bk0.ba0.uS, modelId);
         renderer.oH.set(tint);
         renderer.og = tint.toFloatBits();
      } else if (modelId == 301) {
         if (this.N30 == null) {
            this.N30 = new Color(1.0F, 1.0F, 1.0F, 0.8F);
         }
         renderer.oH.set(this.N30);
         renderer.og = this.N30.toFloatBits();
      }
      renderer.QB0(texture, drawX, drawY, width * 0.751F, height * 0.751F,
            texture.getWidth(), texture.getHeight(), flip, false);
      if (modelId == 294 || modelId == 295 || modelId == 296 || modelId == 301) {
         float color = Vs0.lv;
         Color.abgr8888ToColor(renderer.oH, color);
         renderer.og = color;
      }

      if (specialType) {
         Wr overlay = QI.Py.kN(modelType, modelId, true).li0(frame);
         if (overlay != null) {
            Texture overlayTexture = overlay.H8();
            renderer.oH.set(Color.WHITE);
            renderer.og = Color.WHITE.toFloatBits();
            renderer.QB0(overlayTexture, drawX, drawY, width * 0.751F, height * 0.751F,
                  overlayTexture.getWidth(), overlayTexture.getHeight(), flip, false);
            float color = Vs0.lv;
            Color.abgr8888ToColor(renderer.oH, color);
            renderer.og = color;
         }
      }

      if (this.Bk0.I80) {
         Wr marker = QI.Py.kN((byte)10, 298, true).li0((int)(hk0_1.KG / 200L) % 9);
         if (marker != null) {
            Texture markerTexture = marker.H8();
            renderer.oH.set(Color.WHITE);
            renderer.og = Color.WHITE.toFloatBits();
            renderer.QB0(markerTexture, drawX, drawY, width * 0.751F, height * 0.751F,
                  markerTexture.getWidth(), markerTexture.getHeight(), flip, false);
            float color = Vs0.lv;
            Color.abgr8888ToColor(renderer.oH, color);
            renderer.og = color;
         }
      }
      return true;
   }
   public boolean jq0(BJ0 var1, ER var2, U5 var3, int var4, boolean var5) {
      PlayerAvatarMovementController var6;
      PlayerAvatarMovementController var10000 = var6 = this.Bk0;
      short var7 = var10000.Z4;
      int var8 = var10000.ok;
      if (tw0_0.Ll0.Qz0 == null) {
         return true;
      } else if (var7 == 0 && var8 != 3 && var8 != 4) {
         return true;
      } else {
         tw0_0.Tl0.Ov(var6);
         if (this.Bk0.x10 > 0) {
            return super.jq0(var1, var2, var3, var4, var5);
         } else {
            UT var74 = UT.oV();
            byte var134 = this.Bk0.ba0.uS;
            var74.getClass();
            if (UT.Ce0(var134, var7)) {
               if (UT.m && this.Oy != null && lg_0.lW.eC0(59) && lg_0.lW.nI0(46)) {
                  this.Oy.O4();
                  this.Oy = null;
               }

               if (this.Bk0.hq0) {
                  Ou0 var71;
                  if ((var71 = this.Oy) != null) {
                     var71.O4();
                     this.Oy = null;
                  }

                  this.Bk0.hq0 = false;
               }

               if (this.Oy == null) {
                  this.Oy = UT.oV().jK(var7);
               }

               Ou0 var72;
               if ((var72 = this.Oy) == null) {
                  return true;
               } else {
                  if (var7 == 2800) {
                     C8 var162 = super.VH;
                     var162.y -= 0.04F;
                     var162.z += 0.12F;
                  } else if (var7 == 2810) {
                     C8 var163 = super.VH;
                     var163.y -= 0.02F;
                     var163.z -= 0.29F;
                     var163.x -= 0.01F;
                  }

                  var72.eo0(super.VH);
                  this.Oy.v3(0.0F, lg_0.S4.uL);
                  var2.Lh0(this.Oy, var3);
                  if (!this.Oy.VP()) {
                     return true;
                  } else {
                     switch (var7) {
                        case 2010:
                        case 2050:
                           Ou0 var13;
                           if ((var13 = this.Oy.p8) != null) {
                              var2.Lh0(var13, var3);
                           }

                           return true;
                        case 2400:
                        case 2800:
                        case 2810:
                        case 2820:
                        case 2860:
                        case 2890:
                           return true;
                        default:
                           boolean var73 = false;
                           ((mg_0)this).xD(var1, var2, var3, false, var73);
                           return true;
                     }
                  }
               }
            } else if (var8 == 10) {
               if (var7 >= 2000) {
                  var7 = (short)(var7 / 10);
               }

               PO var151 = QI.Ue0;
               byte var82;
               if (var7 == 201) {
                  var82 = 64;
               } else {
                  var82 = 32;
               }

               byte var101;
               switch (var7) {
                  case 201:
                     var101 = 64;
                     break;
                  case 211:
                  case 301:
                  case 306:
                  case 311:
                  case 320:
                     var101 = 48;
                     break;
                  default:
                     var101 = 32;
               }

               boolean var123;
               label489: {
                  switch (var7) {
                     case 201:
                     case 240:
                     case 241:
                     case 280:
                     case 281:
                     case 282:
                     case 286:
                     case 287:
                     case 288:
                     case 289:
                     case 290:
                     case 291:
                     case 294:
                     case 295:
                     case 296:
                     case 299:
                     case 301:
                     case 302:
                     case 306:
                     case 311:
                     case 320:
                        break;
                     default:
                        if (var7 < 500 || var7 > 1000) {
                           var123 = true;
                           break label489;
                        }
                  }

                  var123 = false;
               }

               float var116 = 0.0F;
               float var83 = 0.0F;
               float var159 = 0.0F;
               float var160 = 0.0F;
               float var85 = 0.0F;
               Wr var125 = null;
               if (var7 == 1210) {
                  cq0_0 var126;
                  cq0_0 var152 = var126 = tw0_0.rl.oY;
                  short var11 = 1044;
                  var126.getClass();
                  cq0_0.w0((short)1044);
                  short var127 = var152.lY.jA0(var11);
                  cq0_0 var130;
                  var152 = var130 = tw0_0.rl.oY;
                  short var12 = 1504;
                  var130.getClass();
                  cq0_0.w0((short)1504);
                  byte var131;
                  if (var152.lY.kp(var12)) {
                     var131 = 120;
                  } else {
                     var131 = 121;
                  }

                  short var154 = var127;
                  var127 = (short)(rg0_0.gu(var131, false, true, 0) + 4095);
                  var131 = 0;
                  if (var154 == 0) {
                     var131 = 1;
                  }

                  var125 = tw0_0.Ll0.Qz0.AF(var127).gs0(var131, 0);
               }

               if (var125 == null) {
                  ht_0 var129;
                  if ((var129 = QI.Py.kN((byte)var8, var7, false)) == QI.Ue0) {
                     return true;
                  }

                  if ((var125 = var129.li0(var4)) == null) {
                     if (var123) {
                        var4 = 0;
                        ((mg_0)this).xD(var1, var2, var3, false, false);
                     }

                     return true;
                  }
               }

               ht_0 var114;
               ht_0 var155 = var114 = QI.Py.kN((byte)var8, var7, true);
               Wr var133 = null;
               if (var155 != QI.Ue0) {
                  var133 = var114.li0(var4);
               }

               com3__3 var52;
               if ((var52 = this.c) == null || var52.a50 != var82 || var52.kn0 != var101) {
                  label469: {
                     LPT6_ var53;
                     var53 = new LPT6_(var125.H8());
                     com3__3 var115;
                     com3__3 var156 = var115 = new com3__3(var82, var101, var53, false);
                     this.c = var115;
                     var156.qq0(vo_2.z0);
                     var52 = this.c;
                     if (var7 != 284) {
                        switch (var7) {
                           case 277:
                           case 278:
                           case 279:
                              break;
                           default:
                              var116 = 0.0115F;
                              break label469;
                        }
                     }

                     var116 = 0.0173F;
                  }

                  var52.OF0(var116);
                  this.c.Vg();
               }

               if ((var52 = this.k40) == null && var133 != null) {
                  label457: {
                     LPT6_ var56;
                     var56 = new LPT6_(var133.H8());
                     com3__3 var117;
                     com3__3 var157 = var117 = new com3__3(var82, var101, var56, false);
                     this.k40 = var117;
                     var157.qq0(false);
                     var52 = this.k40;
                     if (var7 != 284) {
                        switch (var7) {
                           case 277:
                           case 278:
                           case 279:
                              break;
                           default:
                              var83 = 0.0115F;
                              break label457;
                        }
                     }

                     var83 = 0.0173F;
                  }

                  var52.OF0(var83);
                  this.k40.Vg();
               } else if (var52 != null && var133 == null) {
                  this.k40 = null;
               }

               var125.Ik = hk0_1.KG;
               this.c.qr0(super.VH);
               if (var101 == 48) {
                  this.c.j.na(0.0F, 0.0F, -0.1F);
               }

               if (var7 == 301) {
                  byte var58;
                  if ((var58 = this.Bk0.ba0.uS) != 2) {
                     if (var58 == 3 || var58 == 4) {
                        this.c.j.na(0.0F, 0.04F, -0.14F);
                     }
                  } else {
                     this.c.j.na(0.0F, 0.0F, -0.05F);
                  }

                  this.c.j.na(0.0F, 0.21F, 0.21F);
               } else if (var7 >= 500 && var7 < 1000) {
                  label436: {
                     var52 = this.c;
                     if (var7 != 284) {
                        switch (var7) {
                           case 277:
                           case 278:
                           case 279:
                              break;
                           default:
                              var159 = 0.0115F;
                              break label436;
                        }
                     }

                     var159 = 0.0173F;
                  }

                  label429: {
                     var85 = var159 * 2.2F;
                     if (var7 != 284) {
                        switch (var7) {
                           case 277:
                           case 278:
                           case 279:
                              break;
                           default:
                              var160 = 0.0115F;
                              break label429;
                        }
                     }

                     var160 = 0.0173F;
                  }

                  float var118 = var160 * 2.75F;
                  var52.Qw0(var85, var118);
                  this.c.j.na(0.25F, 0.1F, -0.25F);
                  this.c.Vg();
                  var123 = false;
               } else if (var7 == 1210) {
                  cq0_0 var59;
                  cq0_0 var158 = var59 = tw0_0.rl.oY;
                  short varStateKey = 1044;
                  var59.getClass();
                  cq0_0.w0((short)1044);
                  short var60;
                  if ((var60 = var158.lY.jA0(varStateKey)) != 50 && var60 != 0) {
                     this.c.j.na(0.0F, 0.16F, -0.28F);
                     this.c.OF0(0.01F);
                  } else {
                     this.c.j.na(0.0F, 0.0F, 0.1F);
                  }
               }

               this.c.DB0(super.n80, super.qv0.St0);
               var52 = this.c;
               var52.bq0.I3.uj = var125.H8();
               var52 = this.c;
               if (((mg_0)this).ZD() == 3) {
                  var82 = 1;
               } else {
                  var82 = 0;
               }

               var52.QG(var82 != 0);
               if (var133 != null) {
                  var133.Ik = hk0_1.KG;
                  var52 = this.k40;
                  var52.bq0.I3.uj = var133.H8();
                  var52 = this.k40;
                  if (((mg_0)this).ZD() == 3) {
                     var82 = 1;
                  } else {
                     var82 = 0;
                  }

                  var52.QG(var82 != 0);
                  this.k40.qr0(super.VH);
                  if (var101 == 48) {
                     this.k40.j.na(0.0F, 0.0F, -0.1F);
                  }

                  this.k40.DB0(super.n80, super.qv0.St0);
               }

               label416: {
                  Color var66;
                  com3__3 var161;
                  switch (var7) {
                     case 294:
                     case 295:
                     case 296:
                        var161 = this.c;
                        var66 = this.L20(this.Bk0.ba0.uS, var7);
                        break;
                     default:
                        if (var7 != 301) {
                           var2.Lh0(this.c, var3);
                           break label416;
                        }

                        com3__3 var67 = this.c;
                        if (this.N30 == null) {
                           Color var88;
                           var88 = new Color(1.0F, 1.0F, 1.0F, 0.8F);
                           this.N30 = var88;
                        }

                        var161 = var67;
                        var66 = this.N30;
                  }

                  var161.CQ.v50.set(var66);
                  var2.Lh0(this.c, (U5)null);
               }

               if ((var52 = this.k40) != null) {
                  var2.Lh0(var52, var3);
               }

               if (var123) {
                  boolean var69 = false;
                  ((mg_0)this).xD(var1, var2, var3, false, var69);
               }

               return true;
            } else {
               if (var8 == 2) {
                  float var31 = 0.011F;
                  float var75 = this.Bk0.coM6 * 1.0F;
                  ej_1 var89;
                  if ((var89 = tw0_0.Ll0.Qz0.AF(var7)).Ky0 != 0) {
                     var7 = 0;
                     ((mg_0)this).xD(var1, var2, var3, false, false);
                  }

                  byte var14;
                  if ((var14 = var89.JZ) != 1) {
                     if (var14 == 2) {
                        if (this.Oy == null) {
                           this.Oy = fi_0.xL().rH(var89.vq);
                        }

                        Ou0 var15;
                        if ((var15 = this.Oy) != null) {
                           this.i10 += lg_0.S4.uL;
                           Matrix4 var135 = var15.ho;
                           C8 var10001 = super.VH;
                           me0_2 var10002 = super.fl0;
                           C8 var10003 = mg_0.bg0;
                           float var16 = 1.0F;
                           var31 = 1.0F;
                           var10003.x = 1.0F;
                           var10003.y = var16;
                           var10003.z = var31;
                           var135.oF0(var10001, var10002, var10003);
                           float var164 = (float)var89.Oy0 / 64.0F;
                           var16 = (float)var89.io0 / 64.0F;
                           this.Oy.ho.el0(var164, var16, (float)var89.pE0 / 64.0F);
                           this.Oy.bo0(this.i10);
                           var2.Lh0(this.Oy, var3);
                        }
                     }
                  } else {
                     Wr var18;
                     if ((var18 = var89.gs0(((mg_0)this).ZD(), super.ui0)) == null) {
                        return true;
                     }

                     com3__3 var103;
                     if ((var103 = this.c) == null || var103.a50 != 32 || var103.kn0 != 32) {
                        byte var104 = 32;
                        var8 = (byte)32;
                        LPT6_ var9;
                        var9 = new LPT6_(var18.H8());
                        com3__3 var10;
                        var10 = new com3__3(var104, var8, var9, false);
                        this.c = var10;
                     }

                     var18.Ik = hk0_1.KG;
                     this.c.qq0(vo_2.z0);
                     if (var89.Z80 != 2) {
                        this.c.OF0(var31 * var75);
                        this.c.Vg();
                     } else {
                        this.c.OF0(var31 * var75 * 2.0F);
                        this.c.Vg();
                        C8 var136 = super.VH;
                        var136.y += 0.16F;
                     }

                     Wr var165 = var18;
                     com3__3 var19 = this.c;
                     var19.bq0.I3.uj = var165.H8();
                     if (var75 > 1.0F) {
                        C8 var137 = super.VH;
                        float var20;
                        var137.y += (var20 = ((float)this.c.kn0 * var75 - 32.0F) / 32.0F) * 0.08F;
                        var137.z -= var20 * 0.16F;
                     }

                     var19 = this.c;
                     byte var90;
                     if (((var90 = var89.vd) == 5 || var90 == 12 || var90 == 13) && ((mg_0)this).ZD() == 3) {
                        var90 = 1;
                     } else {
                        var90 = 0;
                     }

                     var19.QG(var90 != 0);
                     this.c.qr0(super.VH);
                     this.c.DB0(super.n80, super.qv0.St0);
                     var2.Lh0(this.c, var3);
                     Wr var22;
                     if (this.Bk0.I80 && (var22 = QI.Py.kN((byte)10, 299, true).li0((int)(hk0_1.KG / 200L) % 9)) != null) {
                        if (this.k40 == null) {
                           Texture var92 = var22.H8();
                           byte var105 = 32;
                           var8 = (byte)32;
                           LPT6_ var119;
                           var119 = new LPT6_(var92);
                           com3__3 var93;
                           com3__3 var138 = var93 = new com3__3(var105, var8, var119, false);
                           this.k40 = var93;
                           var138.OF0(var75 * var31);
                           this.k40.Vg();
                        }

                        Wr var139 = var22;
                        this.k40.qq0(false);
                        com3__3 var23 = this.k40;
                        var23.bq0.I3.uj = var139.H8();
                        this.k40.qr0(super.VH);
                        this.k40.DB0(super.n80, super.qv0.St0);
                        var2.Lh0(this.k40, var3);
                     }
                  }
               } else {
                  label600: {
                     float var25;
                     if (var8 == 3) {
                        if (var7 == 8192) {
                           return true;
                        }

                        if (var7 == 101) {
                           E90 var33;
                           if ((var33 = tw0_0.e60.jB0) != null && var33.Vv != 0) {
                              var7 = 0;
                           } else {
                              var7 = 97;
                           }
                        }

                        Ts var34;
                        (var34 = tw0_0.Ll0.nC0).getClass();
                        if ((var7 < 4095 || var7 > 5094) && var7 != 8192 && !var34.NG.bL0(var7)) {
                           if (this.Oy == null) {
                              this.Oy = fi_0.xL().Et(var7);
                           }

                           Ou0 var26;
                           if ((var26 = this.Oy) != null) {
                              this.i10 += lg_0.S4.uL;
                              Matrix4 var148 = var26.ho;
                              C8 var169 = super.VH;
                              me0_2 var173 = super.fl0;
                              C8 var177 = mg_0.bg0;
                              float var27 = 1.0F;
                              float var42 = 1.0F;
                              var177.x = 1.0F;
                              var177.y = var27;
                              var177.z = var42;
                              var148.oF0(var169, var173, var177);
                              this.Oy.ho.el0(0.0F, -0.22F, 0.0F);
                              this.Oy.bo0(this.i10);
                              var2.Lh0(this.Oy, var3);
                           }

                           return true;
                        }

                        Wr[] var35;
                        Wr[] var140 = var35 = tw0_0.Ll0.nC0.f80(var7);
                        int var76 = 0;
                        if (var140 != null) {
                           if (var35.length != 1 && var35.length != 2) {
                              if (var35.length == 16) {
                                 var76 = Ti0[((mg_0)this).ZD()][super.ui0];
                              } else if (var35.length == 17) {
                                 var76 = mn0[((mg_0)this).ZD()][super.ui0];
                              } else if (var35.length == 32) {
                                 var76 = Fb0[((mg_0)this).ZD()][super.ui0];
                              } else {
                                 System.out.println(var7 + " UNK sprite tex len = " + var35.length);
                              }
                           } else {
                              var76 = 0;
                           }
                        }

                        if (var7 == 230) {
                           var76 = (int)(hk0_1.KG / 500L % 2L);
                           C8 var141 = super.VH;
                           var141.y += 0.08F;
                           var141.z -= 0.25F;
                           if (super.OA0.y > 0.0F) {
                              com3__3 var94;
                              if ((var94 = this.c) != null) {
                                 com3__3 var142 = var94;
                                 float var95 = 0.0F;
                                 float var108 = 0.0F;
                                 float var120 = 0.0F;
                                 float var124 = 1.0F;
                                 var142.CQ.v50.set(var95, var108, var120, var124);
                              }

                              var141 = super.OA0;
                              var141.y -= lg_0.S4.uL * 0.5F;
                           } else {
                              com3__3 var96;
                              Color var97;
                              float var109;
                              if ((var96 = this.c) != null && (var109 = (var97 = var96.MI0()).r) < 1.0F) {
                                 Color var144 = var97;
                                 Color var166 = var97;
                                 Color var172 = var97;
                                 Color var175 = var97;
                                 Color var10004 = var97;
                                 float var98 = lg_0.S4.uL * 0.5F;
                                 var10004.r = Math.min(1.0F, var98) + var109;
                                 float var176 = var175.g;
                                 var172.g = Math.min(1.0F, var98) + var176;
                                 float var167 = var166.b;
                                 var144.b = Math.min(1.0F, var98) + var167;
                              }
                           }
                        }

                        Wr var99 = null;
                        if (var35 != null) {
                           var99 = var35[var76];
                        }

                        if (var99 == null) {
                           return true;
                        }

                        if (this.c == null) {
                           Texture var36;
                           Texture var145 = var36 = var99.H8();
                           var76 = var145.getWidth();
                           var8 = var145.getHeight();
                           LPT6_ var121;
                           var121 = new LPT6_(var36);
                           com3__3 var37;
                           var37 = new com3__3(var76, var8, var121, false);
                           this.c = var37;
                        }

                        var99.Ik = hk0_1.KG;
                        this.c.qq0(vo_2.z0);
                        this.c.OF0(this.Bk0.coM6 * 0.01171875F);
                        C8 var38;
                        C8 var168 = var38 = super.VH;
                        float var78;
                        var168.y = var78 = var168.y + 0.03125F;
                        float var111;
                        var168.z = var111 = var168.z + 0.03125F;
                        if (var99.fr0 == 16 && var99.Tq == 16) {
                           var38.y = var78 - 0.08F;
                           var38.z = var111 + 0.03125F;
                           ((mg_0)this).xD(var1, var2, var3, true, false);
                        } else if (var7 != 202 && var7 != 230) {
                           boolean var39 = false;
                           ((mg_0)this).xD(var1, var2, var3, false, var39);
                        }

                        if (var7 != 202) {
                           if (var7 != 248) {
                              if (var7 == 249) {
                                 C8 var146 = super.VH;
                                 var146.x += 0.65F;
                              }
                           } else {
                              C8 var147 = super.VH;
                              var147.x += 0.025F;
                           }
                        } else {
                           this.c.OF0(0.015625F);
                        }

                        this.c.Vg();
                        com3__3 var24 = this.c;
                        var24.bq0.I3.uj = var99.H8();
                        var25 = 0.0F;
                        zv_2 var40;
                        LT var41;
                        if ((var40 = this.Bk0.ba0).Lpt2 && (var41 = var40.LPt1()).XC0() != 0.0F) {
                           var25 = var41.XC0();
                           if (LW.LH0(90.0F, var25)) {
                              super.VH.Vy(0.2F, 0.25F, -0.05F);
                           } else if (LW.LH0(270.0F, var25)) {
                              super.VH.Vy(-0.15F, 0.2F, 0.0F);
                           }
                        }

                        this.c.qr0(super.VH);
                        if (var7 == 202) {
                           this.c.DB0(super.VH, super.qv0.St0);
                        } else {
                           this.c.DB0(super.n80, super.qv0.St0);
                        }

                        if (LW.LH0(var25, 0.0F)) {
                           break label600;
                        }
                     } else {
                        if (var8 != 4) {
                           return true;
                        }

                        if (var7 == 8192) {
                           return true;
                        }

                        if (var7 == 349) {
                           return true;
                        }

                        if (var7 == 101) {
                           E90 var43;
                           if ((var43 = tw0_0.e60.jB0) != null && var43.Vv != 0) {
                              var7 = 0;
                           } else {
                              var7 = 97;
                           }
                        }

                        if (tw0_0.Ll0.t1.wS(var7)) {
                           if (this.Oy == null) {
                              this.Oy = fi_0.xL().Bz(var7);
                           }

                           Ou0 var29;
                           if ((var29 = this.Oy) != null) {
                              this.i10 += lg_0.S4.uL;
                              Matrix4 var150 = var29.ho;
                              C8 var171 = super.VH;
                              me0_2 var174 = super.fl0;
                              C8 var178 = mg_0.bg0;
                              float var30 = 1.0F;
                              float var51 = 1.0F;
                              var178.x = 1.0F;
                              var178.y = var30;
                              var178.z = var51;
                              var150.oF0(var171, var174, var178);
                              this.Oy.ho.el0(0.0F, -0.2F, 0.05F);
                              this.Oy.bo0(this.i10);
                              var2.Lh0(this.Oy, var3);
                           }

                           return true;
                        }

                        UY var44;
                        Wr[] var45;
                        if (!(var44 = tw0_0.Ll0.t1).Gt.bL0(var7)) {
                           var45 = null;
                        } else {
                           var45 = (Wr[])var44.GY.f5(var44.Gt.f5(var7));
                        }

                        int var79 = 0;
                        if (var45 != null) {
                           if (var45.length != 1 && var45.length != 2 && var7 != 262 && (var7 < 263 || var7 > 269)) {
                              if (var45.length == 7) {
                                 var79 = (int)(hk0_1.KG / 150L % 5L);
                              } else if (var45.length == 8) {
                                 var79 = Mk[((mg_0)this).ZD()][super.ui0];
                              } else if (var45.length == 16) {
                                 var79 = Ti0[((mg_0)this).ZD()][super.ui0];
                              } else if (var45.length == 17) {
                                 var79 = mn0[((mg_0)this).ZD()][super.ui0];
                              } else if (var45.length == 32) {
                                 var79 = Fb0[((mg_0)this).ZD()][super.ui0];
                              } else {
                                 System.out.println(var7 + " UNK sprite tex len = " + var45.length);
                              }
                           } else {
                              var79 = 0;
                           }
                        }

                        Wr var100 = null;
                        if (var45 != null) {
                           var100 = var45[var79];
                        }

                        if (var100 == null) {
                           return true;
                        }

                        if (this.c == null) {
                           Texture var46;
                           Texture var149 = var46 = var100.H8();
                           var79 = var149.getWidth();
                           var8 = var149.getHeight();
                           LPT6_ var122;
                           var122 = new LPT6_(var46);
                           com3__3 var47;
                           var47 = new com3__3(var79, var8, var122, false);
                           this.c = var47;
                        }

                        var100.Ik = hk0_1.KG;
                        this.c.qq0(vo_2.z0);
                        this.c.OF0(this.Bk0.coM6 * 0.01171875F);
                        C8 var48;
                        C8 var170 = var48 = super.VH;
                        float var81;
                        var170.y = var81 = var170.y + 0.03125F;
                        float var113;
                        var170.z = var113 = var170.z + 0.03125F;
                        if (var100.fr0 == 16 && var100.Tq == 16) {
                           var48.y = var81 - 0.08F;
                           var48.z = var113 + 0.03125F;
                           ((mg_0)this).xD(var1, var2, var3, true, false);
                        } else if (var7 != 202 && var7 != 230 && var7 != 425) {
                           ((mg_0)this).xD(var1, var2, var3, false, false);
                        }

                        this.c.Vg();
                        com3__3 var28 = this.c;
                        var28.bq0.I3.uj = var100.H8();
                        var25 = 0.0F;
                        zv_2 var49;
                        LT var50;
                        if ((var49 = this.Bk0.ba0).Lpt2 && (var50 = var49.LPt1()).XC0() != 0.0F) {
                           var25 = var50.XC0();
                           if (LW.LH0(90.0F, var25)) {
                              super.VH.Vy(0.2F, 0.25F, -0.05F);
                           } else if (LW.LH0(270.0F, var25)) {
                              super.VH.Vy(-0.15F, 0.2F, 0.0F);
                           }
                        }

                        this.c.qr0(super.VH);
                        this.c.DB0(super.n80, super.qv0.St0);
                        if (LW.LH0(var25, 0.0F)) {
                           break label600;
                        }
                     }

                     this.c.qI0.tO(C8.Z, var25);
                  }

                  var2.Lh0(this.c, var3);
                  this.aE0(var2, var3);
               }

               return true;
            }
         }
      }
   }

   public final void aE0(ER var1, U5 var2) {
      Wr var3;
      if (this.Bk0.I80 && (var3 = QI.Py.kN((byte)10, 298, true).li0((int)(hk0_1.KG / 200L) % 9)) != null) {
         if (this.k40 == null) {
            Texture var4;
            Texture var10001 = var4 = var3.H8();
            int var5 = var10001.getWidth();
            int var6 = var10001.getHeight();
            LPT6_ var7;
            var7 = new LPT6_(var4);
            com3__3 var9;
            com3__3 var11 = var9 = new com3__3(var5, var6, var7, false);
            this.k40 = var9;
            float var10 = 0.01171875F;
            var11.OF0(this.Bk0.coM6 * var10);
            this.k40.Vg();
         }

         ER var10000 = var1;
         this.k40.qq0(false);
         com3__3 var8 = this.k40;
         var8.bq0.I3.uj = var3.H8();
         this.k40.qr0(super.VH);
         this.k40.DB0(super.n80, super.qv0.St0);
         var10000.Lh0(this.k40, var2);
      }

   }

   public final Color L20(byte var1, short var2) {
      if (this.z2 == null) {
         Color var3;
         var3 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
         this.z2 = var3;
      }

      zv_2 var10001 = tw0_0.e60.jB0.ba0;
      short var9 = var10001.Lq0;
      short var4 = var10001.B5;
      zv_2 var10000 = this.Bk0.ba0;
      int var5 = var10000.Lq0;
      short var15 = var10000.B5;
      dl_1 var10004 = tx_1.Sy0;
      long var10 = (long)(var5 - var9);
      long var16 = (long)(var15 - var4);
      var10 *= var10;
      double var12;
      if ((var12 = Math.sqrt((double)(var16 * var16 + var10))) > (double)10.0F) {
         var12 = (double)10.0F;
      }

      float var6;
      if (var2 != 295) {
         if (var2 != 296) {
            var6 = 0.9F;
         } else if (N50.Fc(var1)) {
            var6 = 0.25F;
         } else {
            var6 = 0.2F;
         }
      } else {
         var6 = 0.5F;
      }

      if (var6 < 0.9F) {
         float var7 = 0.9F - var6;
         if ((var5 = c8_0.JD0.ki0() % 86400) < 82800 && var5 > 18000) {
            if (var5 <= 25200) {
               var6 = 0.9F - var7 / 7200.0F * (float)(var5 - 18000);
            } else if (var5 >= 75600) {
               var6 += var7 / 7200.0F * (float)(var5 - 75600);
            }
         } else {
            var6 = 0.9F;
         }
      }

      var12 = var12 / (double)10.0F * (double)1.0F;
      float var8;
      if (!((var8 = (float)((double)1.0F - var12)) < var6)) {
         var6 = var8;
      }

      this.z2.set(1.0F, 1.0F, 1.0F, var6);
      return this.z2;
   }
}
