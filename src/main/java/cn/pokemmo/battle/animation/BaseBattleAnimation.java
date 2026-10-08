package cn.pokemmo.battle.animation;

import f.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter;
import com.badlogic.gdx.graphics.g3d.particles.influencers.ControllerSpawnInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsInfluencerExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.values.NumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;

public abstract class BaseBattleAnimation {
   public static final com3__3[] Op = new com3__3[0];
   public static final dl_1 UF = Cq0.E1(BaseBattleAnimation.class);
   public static final C8 lPt1 = new C8();
   public static final Color T8 = new Color();
   public boolean Am;
   public final vr_1 Vs;
   public final BJ0 jq;
   public byte Lpt5;
   public byte ei0;
   public PF Vz0;
   public PF Xp;
   public es_1 CoM9;
   public com3__3[] lu;
   public es_1 aZ;
   public pw_1 E8;
   public final es_1 ro;
   public final SQ O70;
   public final YT ZY;
   public final es_1 g10;
   public boolean nJ0;
   public boolean Tc0;
   public final es_1 JA0;

   public BaseBattleAnimation(PF var1) {
      this.Am = false;
      this.Lpt5 = -1;
      this.ei0 = -1;
      this.lu = Op;
      this.ro = new es_1();
      this.O70 = new SQ();
      this.ZY = new YT();
      this.g10 = new es_1();
      this.nJ0 = false;
      this.Tc0 = false;
      this.JA0 = new es_1();
      this.Vs = (vr_1)tw0_0.LD0.S30();
      this.jq = this.Vs.VU();
      this.g20(var1);
      ao_1.xZ();
   }

   public static void EM(ParticleControllerExt var0, ParticleControllerExt var1, int var2, D2 var3) {
      var0.start();
      if (var1 != null) {
         var1.start();
      }
   }

   public static void Hc0(byte var0, short var1, boolean var2, int var3, D2 var4) {
      tw0_0.RE0.d00(false, var0, var1, (var2 ? -1.0F : 1.0F) * dw_2.ej);
   }

   public static void ab(byte var0, short var1, int var2, D2 var3) {
      tw0_0.RE0.d00(false, var0, var1, 0.0F);
   }

   public static ao_1 kO(short var0) {
      return ao_1.pc((var1, var2) -> ab((byte)2, var0, var1, var2));
   }

   public static ao_1 eK0(short var0, boolean var1) {
      return ao_1.pc((var2, var3) -> Hc0((byte)2, var0, var1, var2, var3));
   }

   public final void ql(PF var1, int var2, D2 var3) {
      this.vv(var1);
   }

   public final void Ob(int var1, D2 var2) {
      if (this.Vz0 != null) {
         this.Vz0.no();
      }

      if (this.CoM9 != null) {
         for (I2 var3 = this.CoM9.ZD(); var3.hasNext(); ((PF)var3.next()).no()) {
         }
      }
   }

   public final void Lpt1(int var1, Color var2, int var3, D2 var4) {
      this.Vs.rj0(var1, var2);
   }

   public final void ob(int var1, int var2, D2 var3) {
      this.Vs.rj0(var1, new Color().set(Color.WHITE));
   }

   public final void og0(int var1, int var2, D2 var3) {
      PF var4;
      if (var1 != 14) {
         if (var1 != 16 || (var4 = this.Xp) == null) {
            return;
         }
      } else if ((var4 = this.Vz0) == null) {
         return;
      }

      var4.U7(1.0F);
   }

   public final void bq0(int var1, D2 var2) {
      vr_1 var3;
      Texture var4;
      if ((var4 = (var3 = this.Vs).fB) != null) {
         var4.dispose();
         var3.fB = null;
      }

      var3.SE0.a = 0.0F;
      var3.vJ0 = false;
      var3.fo = false;
      var3.RH = false;
   }

   public final void b(int var1, boolean var2, int var3, D2 var4) {
      if (var1 != 14) {
         if (var1 != 16) {
            if (var1 == 18) {
               this.Vz0.ea0 = var2;
               es_1 var5;
               if ((var5 = this.CoM9) != null && var5.KB > 0) {
                  for(I2 var6 = var5.ZD(); var6.hasNext(); ((PF)var6.next()).ea0 = var2) {
                  }
               }
            }
         } else {
            es_1 var7;
            if ((var7 = this.CoM9) != null && var7.KB > 0) {
               for(I2 var8 = var7.ZD(); var8.hasNext(); ((PF)var8.next()).ea0 = var2) {
               }
            }
         }
      } else {
         this.Vz0.ea0 = var2;
      }

   }

   public final void g20(PF var1) {
      this.Vz0 = var1;
      if (var1 != null) {
         this.lu = var1.Br0;
         this.Lpt5 = var1.cD0;
         this.Vc();
      }
   }

   public MU vv(PF var1) {
      es_1 var2;
      var2 = new es_1();
      this.CoM9 = var2;
      var2 = new es_1();
      this.aZ = var2;
      this.Xp = var1;
      if (var1 != null) {
         this.CoM9.Ue0(var1);
         es_1 var10002 = var2 = this.aZ;
         com3__3[] var10003 = var1.Br0;
         var2.getClass();
         var10002.G6(var10003, 0, var10003.length);
         this.ei0 = var1.cD0;
      }

      this.Vc();
      return (MU) (Object) this;
   }

   public final void Vc() {
      co_1.Xh = this.nn0() ? ri_0.pN : ri_0.xQ;
      PF var1;
      com3__3 var2;
      if ((var1 = this.Vz0) != null && (var2 = var1.LpT9) != null) {
         co_1.Kl0.np(var1.ZK(var2, false));
      }

      if ((var1 = this.Xp) != null && (var2 = var1.LpT9) != null) {
         co_1.cOm6.np(var1.ZK(var2, false));
      } else {
         C8 var5 = co_1.cOm6;
         C8 var9;
         if (this.nn0()) {
            var9 = vr_1.MS;
         } else {
            var9 = vr_1.Lt0;
         }

         var5.np(var9);
      }

      C8 var6 = co_1.XZ;
      C8 var10;
      if (this.nn0()) {
         var10 = vr_1.Lt0;
      } else {
         var10 = vr_1.MS;
      }

      BaseBattleAnimation var10000 = this;
      var6.np(var10);
      C8 var3 = co_1.OK;
      if (var10000.nn0()) {
         var6 = vr_1.MS;
      } else {
         var6 = vr_1.Lt0;
      }

      var3.np(var6);
   }

   public final pw_1 Wt(int var1, float var2) {
      float delay = 0.0F;
      PF target = var1 == 0 ? this.Vz0 : (var1 == 1 ? this.Xp : null);
      if (target != null) {
         lPt1.np(target.LpT9.j);
      } else {
         switch (var1) {
            case 0:
            case 2:
               lPt1.np(this.nn0() ? vr_1.MS : vr_1.Lt0);
               break;
            case 1:
            case 3:
               lPt1.np(this.nn0() ? vr_1.MS : vr_1.Lt0);
               break;
            case 4:
               lPt1.np(vr_1.tk);
               break;
            default:
               break;
         }
      }

      float yOffset = 0.0F;
      float zOffset = 0.25F;
      float secondYOffset = -0.25F;
      float secondZOffset = 1.0F;
      if ((var1 == 0 && this.ei0 != tw0_0.PK0.eI()) || (var1 == 1 && this.ei0 == tw0_0.PK0.eI())) {
         yOffset = 0.25F;
         zOffset = 0.5F;
         secondYOffset = -0.075F;
         secondZOffset = 0.5F;
      }

      if (var1 == 2 || var1 == 3) {
         secondZOffset -= 0.5F;
      }

      C8 position = lPt1;
      pw_1 animation = pw_1.xC().p1(delay).Xf0();
      animation.y80(ao_1.DX(this.jq, 9, var2).kt(position.x, position.y - yOffset, position.z - zOffset));
      return animation.y80(ao_1.DX(this.jq, 4, var2).kt(position.x, position.y - secondYOffset, position.z - secondZOffset)).mz0();
   }

   public final void kE(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   public final void GQ(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   public final void CB(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   public final void gL(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   public final void xM(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   public final pw_1 tP(float var1) {
      pw_1 var10000 = pw_1.xC().p1(0.0F).Xf0();
      ao_1 var10001 = ao_1.DX(this.jq, 4, var1);
      C8 var10002 = vr_1.SG0;
      float var2 = var10002.x;
      float var3 = var10002.y;
      float var4 = var10002.z;
      var10000 = var10000.y80(var10001.kt(var2, var3, var4));
      var10001 = ao_1.DX(this.jq, 9, var1);
      var10002 = vr_1.Lt;
      float var5 = var10002.x;
      var1 = var10002.y;
      var2 = var10002.z;
      return var10000.y80(var10001.kt(var5, var1, var2)).mz0();
   }

   public final ao_1 E2(int var1, boolean var2) {
      return ao_1.pc((var3, var4) -> this.b(var1, var2, var3, var4));
   }

   public final ao_1 li0() {
      return ao_1.pc(this::bq0);
   }

   public final ao_1 fn(int var1) {
      ParticleEffectExt var2 = this.Jv("custom/" + var1);
      return ao_1.pc((var3, var4) -> this.Mr0(var2));
   }

   public ao_1 wn0(String var1) {
      ParticleEffectExt var2 = this.Jv("custom/" + var1);
      return ao_1.pc((var3, var4) -> this.Mr0(var2));
   }

   public final ao_1 vy(String var1) {
      ParticleEffectExt var2 = this.Jv("special/" + var1);
      return ao_1.pc((var3, var4) -> this.Mr0(var2));
   }

   public MU us() {
      this.Vc();
      return (MU) (Object) this;
   }

   public MU Kh() {
      return (MU) (Object) this;
   }

   public MU o() {
      return (MU) (Object) this;
   }

   public MU sJ0(gc_2 var1, byte var2) {
      return (MU) (Object) this;
   }

   public void ZS() {
      int var1 = 0;
      I2 var2 = this.ro.ZD();

      while(var2.hasNext()) {
         if (((ParticleEffect)var2.next()).isComplete()) {
            ++var1;
         }
      }

      pw_1 var3;
      if ((var3 = this.E8) != null && (((D2)var3).BJ0() || !this.E8.fb0)) {
         this.E8 = null;
      }

      if (!this.nJ0 && var1 == this.ro.KB && this.E8 == null) {
         this.nJ0 = true;
         this.R10();
      }

   }

   public void R10() {
      I2 var1 = this.ro.ZD();

      while(var1.hasNext()) {
         ParticleEffectExt var2 = (ParticleEffectExt)var1.next();
         this.Vs.OB0.Kz0(var2);
      }

      this.ro.clear();
      if (!this.Tc0) {
         pw_1 var10002 = pw_1.xC().Xf0();
         ao_1 var10003 = ao_1.DX(this.jq, 4, 0.25F);
         C8 var10004 = vr_1.SG0;
         float var10 = var10004.x;
         float var15 = var10004.y;
         float var3 = var10004.z;
         var10002 = var10002.y80(var10003.kt(var10, var15, var3));
         var10003 = ao_1.DX(this.jq, 9, 0.25F);
         var10004 = vr_1.Lt;
         var10 = var10004.x;
         var15 = var10004.y;
         var3 = var10004.z;
         pw_1 var12 = var10002.y80(var10003.kt(var10, var15, var3));
         var15 = 0.25F;
         float[] var10001 = this.Vs.lw;
         var3 = var10001[0];
         float var4 = var10001[1];
         float var5 = var10001[2];
         float var6 = var10001[3];
         pw_1 var7 = pw_1.xC().Xf0();
         I2 var8 = this.Vs.sJ.Y3.ZD();

         while(var8.hasNext()) {
            var7.y80(ao_1.DX((BM)var8.next(), 10, var15).Om0(new float[]{var3, var4, var5, var6}));
         }

         var8 = this.Vs.vr.Y3.ZD();

         while(var8.hasNext()) {
            var7.y80(ao_1.DX((BM)var8.next(), 10, var15).Om0(new float[]{var3, var4, var5, var6}));
         }

         var8 = this.Vs.E9.Y3.ZD();

         while(var8.hasNext()) {
            var7.y80(ao_1.DX((BM)var8.next(), 10, var15).Om0(new float[]{var3, var4, var5, var6}));
         }

         var7.mz0();
         pw_1 var13;
         this.E8 = var13 = (pw_1)var12.xi0(var7).xi0(this.WW(16, 0.0F, 0.0F, 0.0F, px_1.ep0(0))).xi0(this.WW(14, 0.0F, 0.0F, 0.0F, px_1.ep0(0))).y80(this.li0()).mz0().Ms(this.Vs.wP);
         this.Vs.jH(var13);
      }

      this.jq.Ws0.rB0();
      vr_1 var9;
      Texture var14;
      if ((var14 = (var9 = this.Vs).fB) != null) {
         var14.dispose();
         var9.fB = null;
      }

      var9.SE0.a = 0.0F;
      var9.vJ0 = false;
      var9.fo = false;
      var9.RH = false;
   }

   public boolean bL() {
      return this.nJ0;
   }

   public final ParticleEffectExt Jv(String var1) {
      ParticleEffectExt effect;
      try {
         effect = this.Vs.OB0.UH0(var1);
      } catch (Exception exception) {
         UF.info("Couldn't load move effect {}", var1, exception);
         effect = new ParticleEffectExt();
      }

      this.JA0.Ue0(effect);
      return effect;
   }

   public final void Mr0(ParticleEffectExt var1) {
      this.JA0.sj0(var1, true);
      this.ro.Ue0(var1);
      if (!this.Am) {
         this.Vs.OB0.fY(var1);
      }

      var1.init();
      var1.start();
   }

   public final boolean nn0() {
      return this.Lpt5 == tw0_0.PK0.eI();
   }

   public final pw_1 i6(byte var1, short var2, int var3, int var4, float var5, float var6, PF var7) {
      float var8 = 0.0F;
      if (var4 != 14) {
         if (var4 == 16) {
            var8 = 1.0F;
         }
      } else {
         var8 = -1.0F;
      }

      a10_0 var9;
      if (var7 != null && (var9 = tw0_0.PK0) != null && var7.cD0 != var9.Ez0()) {
         var8 *= -1.0F;
      }

      pw_1 var10000 = pw_1.xC();
      var10000.y80(ao_1.pc(new yd0_0(this.asBridge(), var3, var1, var2, var8, var6, var5)));
      return var10000;
   }

   public final ao_1 QO(int var1) {
      return ao_1.pc((var2, var3) -> this.Vs.rj0(var1, (new Color()).set(Color.WHITE)));
   }

   public final ao_1 Zb0(int var1, Color var2) {
      return ao_1.pc((var3, var4) -> this.Vs.rj0(var1, var2));
   }

   public final pw_1 mf0(int var1, int var2, int var3, float var4) {
      pw_1 var5;
      (var5 = pw_1.xC()).y80(ao_1.pc(new nr_2(this.asBridge(), var1, var2, var3, var4)));
      return this.Tc0 ? var5 : var5.p1(var4);
   }

   public final ao_1 Qh0(int var1) {
      ParticleEffectExt var2;
      if (var1 >= 1000) {
         var2 = this.Jv("custom/" + var1);
      } else {
         var2 = this.Jv("auto/" + var1);
      }

      SQ var10003 = this.O70;
      var10003.j10(((GX)var10003).yw0(var1), var2);
      this.ro.Ue0(var2);
      this.Vs.OB0.fY(var2);
      var2.end();
      ao_1 var10000 = (ao_1)ao_1.Sk0.u9();
      var10000.r70((Object)null, -1, 0.0F);
      return var10000;
   }

   public final pw_1 WW(int var1, float var2, float var3, float var4, Color var5) {
      this.g10.clear();
      pw_1 var6 = pw_1.xC();
      if (var1 != 14) {
         if (var1 != 16) {
            if (!this.Am) {
               UF.error("Unknown target_id for getMoveAnimation = {}", var1);
            }

            return var6;
         }

         es_1 var9;
         if ((var9 = this.aZ) != null && var9.KB > 0) {
            es_1 var7;
            es_1 var10000 = var7 = this.g10;
            es_1 var10001 = var9;
            var7.getClass();
            Object[] var10 = var9.rZ;
            int var17 = var10001.KB;
            var10000.G6(var10, 0, var17);
         }
      } else {
         es_1 var11;
         es_1 var20 = var11 = this.g10;
         com3__3[] var18;
         com3__3[] var21 = var18 = this.lu;
         var11.getClass();
         int var12 = var21.length;
         var20.G6(var18, 0, var12);
      }

      T8.set(var5);
      var6.Xf0();
      I2 var13 = this.g10.ZD();

      while(var13.hasNext()) {
         ao_1 var22 = ao_1.yp(10, (com3__3)var13.next());
         float[] var16;
         float[] var10002 = var16 = new float[4];
         Color var19;
         Color var10005 = var19 = T8;
         var16[0] = var19.r;
         var16[1] = var19.g;
         var10002[2] = var10005.b;
         var10002[3] = var3;
         var6.y80(var22.Om0(var10002));
      }

      var6.mz0();
      var6.Xf0();
      I2 var8 = this.g10.ZD();

      while(var8.hasNext()) {
         ao_1 var23 = ao_1.DX((com3__3)var8.next(), 10, var2);
         float[] var14;
         float[] var24 = var14 = new float[4];
         Color var15;
         Color var25 = var15 = T8;
         var14[0] = var15.r;
         var14[1] = var15.g;
         var24[2] = var25.b;
         var24[3] = var4;
         var6.y80(var23.Om0(var24));
      }

      var6.mz0();
      return var6;
   }

   public final pw_1 df0(int var1, int var2) {
      this.g10.clear();
      pw_1 var3 = pw_1.xC();
      if (var1 != 14) {
         if (var1 != 16) {
            if (!this.Am) {
               UF.error("Unknown target_id for getMoveAnimation = {}", var1);
            }

            return var3;
         }

         es_1 var7;
         if ((var7 = this.aZ) != null && var7.KB > 0) {
            es_1 var4;
            es_1 var10000 = var4 = this.g10;
            es_1 var10001 = var7;
            var4.getClass();
            Object[] var8 = var7.rZ;
            int var14 = var10001.KB;
            var10000.G6(var8, 0, var14);
         }
      } else {
         es_1 var9;
         es_1 var16 = var9 = this.g10;
         com3__3[] var15;
         com3__3[] var17 = var15 = this.lu;
         var9.getClass();
         int var10 = var17.length;
         var16.G6(var15, 0, var10);
      }

      var3.Xf0();
      if (var2 != 3) {
         if (var2 == 4) {
            I2 var5 = this.g10.ZD();

            while(var5.hasNext()) {
               com3__3 var11;
               (var11 = (com3__3)var5.next()).getClass();
               var3.y80(ao_1.yp(8, var11).Om0(new float[]{1.0F, 1.0F, 1.0F, 1.0F}));
            }
         }
      } else {
         I2 var6 = this.g10.ZD();

         while(var6.hasNext()) {
            com3__3 var12;
            (var12 = (com3__3)var6.next()).getClass();
            ao_1 var18 = ao_1.yp(9, var12);
            float var13 = 0.0F;
            var18.h5[0] = var13;
            var3.y80(var18);
         }
      }

      var3.mz0();
      return var3;
   }

   public final pw_1 nM(int var1, int var2) {
      this.g10.clear();
      pw_1 var3 = pw_1.xC();
      if (var1 != 14) {
         if (var1 != 16) {
            if (var1 == 18) {
               es_1 var6;
               es_1 var10001 = var6 = this.g10;
               com3__3[] var4;
               com3__3[] var10002 = var4 = this.lu;
               var6.getClass();
               int var7 = var10002.length;
               var10001.G6(var4, 0, var7);
               es_1 var8;
               if ((var8 = this.aZ) != null && var8.KB > 0) {
                  es_1 var15;
                  es_1 var10000 = var15 = this.g10;
                  var10001 = var8;
                  var15.getClass();
                  Object[] var9 = var8.rZ;
                  int var16 = var10001.KB;
                  var10000.G6(var9, 0, var16);
               }
            }
         } else {
            es_1 var10;
            if ((var10 = this.aZ) != null && var10.KB > 0) {
               es_1 var17;
               es_1 var20 = var17 = this.g10;
               es_1 var23 = var10;
               var17.getClass();
               Object[] var11 = var10.rZ;
               int var18 = var23.KB;
               var20.G6(var11, 0, var18);
            }
         }
      } else {
         es_1 var12;
         es_1 var21 = var12 = this.g10;
         com3__3[] var19;
         com3__3[] var24 = var19 = this.lu;
         var12.getClass();
         int var13 = var24.length;
         var21.G6(var19, 0, var13);
      }

      if (var2 != 0) {
         if (var2 == 1) {
            I2 var5 = this.g10.ZD();

            while(var5.hasNext()) {
               ao_1 var25 = ao_1.yp(13, (com3__3)var5.next());
               float var14 = 0.0F;
               var25.h5[0] = var14;
               var3.y80(var25);
            }
         }
      } else {
         var3.y80(ao_1.pc((var1x, var2x) -> {
            PF var5;
            if ((var5 = this.Vz0) != null) {
               var5.no();
            }

            es_1 var6;
            if ((var6 = this.CoM9) != null) {
               I2 var4 = var6.ZD();

               while(var4.hasNext()) {
                  ((PF)var4.next()).no();
               }
            }

         }));
      }

      return var3;
   }

   public final pw_1 dA0(int var1, int var2, int var3, int var4, float var5, float var6) {
      ParticleEffectExt effect = (ParticleEffectExt)this.O70.get(var1);
      if (effect.getControllers().KB == 0 || effect.getControllers().KB <= var2) {
         return pw_1.gb0();
      }

      ParticleControllerExt controller = (ParticleControllerExt)((ParticleController)effect.getControllers().get(var2)).copy();
      effect.getControllers().Ue0(controller);
      pw_1 animation = pw_1.xC();
      if (var3 == 1 || var3 == 2 || var3 == 11) {
         co_1.Xh = ri_0.pN;
      } else if (var3 == 0 || var3 == 9 || var3 == 13) {
         co_1.Xh = ri_0.xQ;
      } else if (!this.Am) {
         UF.error("UNK TARGET TYPE = {}", var3);
      }

      if (var4 == 1 || var4 == 11) {
         co_1.RC0 = ri_0.pN;
      } else if (var4 == 8) {
         co_1.RC0 = ri_0.w8;
      } else if (var4 == 9) {
         co_1.RC0 = ri_0.xQ;
      }

      int forceCount = 0;
      I2 influencers = controller.influencers.ZD();
      while (influencers.hasNext()) {
         Influencer influencer = (Influencer)influencers.next();
         if (influencer instanceof ControllerSpawnInfluencer) {
            ControllerSpawnInfluencer spawn = (ControllerSpawnInfluencer)influencer;
            spawn.spawnType.setValue(co_1.Xh == ri_0.pN ? 1.0F : 0.0F);
            spawn.spawnAdjustment.na(0.0F, var5 - 0.5F, 0.0F);
         } else if (influencer instanceof DynamicsInfluencerExt) {
            I2 modifiers = ((DynamicsInfluencerExt)influencer).velocities.ZD();
            while (modifiers.hasNext()) {
               DynamicsModifier modifier = (DynamicsModifier)modifiers.next();
                if (isDynamicsModifierType(modifier, "DragForce")
                      || isDynamicsModifierType(modifier, "CentripetalAccelerationExt")
                      || isDynamicsModifierType(modifier, "CircuralModifier")) {
                  ++forceCount;
               }
                if (isDynamicsModifierType(modifier, "VectorPathModifier")) {
                  var6 = 0.0F;
               }
            }
         }
      }

      if (var6 > 0.0F) {
         DynamicsModifier vectorPath = createVectorPathModifier(var6, forceCount, co_1.RC0 != ri_0.pN);
         if (vectorPath != null) {
            controller.influencers.Ue0(vectorPath);
         }
      }

      controller.init();
      ParticleControllerExt trailController = null;
      if (controller.trailController >= 0) {
         trailController = (ParticleControllerExt)effect.getControllers().get(controller.trailController);
         trailController.init();
         controller.updateTrailController(trailController);
      }

      RegularEmitter emitter = (RegularEmitter)controller.emitter;
      float duration = emitter.delayValue.getLowMax() + emitter.durationValue.getLowMax() + emitter.lifeValue.getHighMax();
      animation.y80(ao_1.pc(new p1_0(controller, trailController)));
      return this.Tc0 ? animation : animation.p1(duration / 1000.0F);
   }

   private static boolean isDynamicsModifierType(DynamicsModifier modifier, String simpleName) {
      String expectedName = "com.badlogic.gdx.graphics.g3d.particles.DynamicsModifierExt$" + simpleName;

      for (Class<?> type = modifier.getClass(); type != null; type = type.getSuperclass()) {
         if (expectedName.equals(type.getName())) {
            return true;
         }
      }

      return false;
   }

   private static DynamicsModifier createVectorPathModifier(float duration, int forceCount, boolean swapEndpoints) {
      try {
         Class<?> modifierType = Class.forName("com.badlogic.gdx.graphics.g3d.particles.DynamicsModifierExt$VectorPathModifier");
         DynamicsModifier modifier = (DynamicsModifier)modifierType.getConstructor().newInstance();
         if (swapEndpoints) {
            es_1 vectorPath = (es_1)modifierType.getField("vectorPath").get(modifier);
            vectorPath.get(0).getClass().getField("modifier").setInt(vectorPath.get(0), 2);
            vectorPath.get(1).getClass().getField("modifier").setInt(vectorPath.get(1), 1);
         }

         ScaledNumericValue strengthValue = (ScaledNumericValue)modifierType.getField("strengthValue").get(modifier);
         strengthValue.setRelative(forceCount > 0);
         NumericValue travelDuration = (NumericValue)modifierType.getField("travelDuration").get(modifier);
         travelDuration.setActive(true);
         travelDuration.setValue(duration);
         return modifier;
      } catch (ReflectiveOperationException exception) {
         UF.error("Couldn't create vector path modifier", exception);
         return null;
      }
   }

   public final pw_1 kL0(PF var1) {
      this.vv(var1);
      return pw_1.xC().y80(ao_1.pc((var2, var3) -> this.vv(var1)));
   }

   public boolean Bv0(boolean var1) {
      a10_0 var2 = tw0_0.PK0;
      int var3 = dw_2.le;
      if (var2 != null && var3 > 0) {
         if (var3 >= 1 && var2.m40) {
            return false;
         }

         if (var3 >= 2) {
            return false;
         }
      }

      return true;
   }

   public final void lD() {
      pw_1 var1;
      if ((var1 = this.E8) != null) {
         var1.w6 = true;
      }

      I2 var2 = this.JA0.ZD();

      while(var2.hasNext()) {
         ((fy0_0)var2.next()).dispose();
      }

   }

   public final pw_1 Xq0(int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      this.g10.clear();
      pw_1 var8 = pw_1.xC();
      if (var1 != 14) {
         if (var1 != 16) {
            if (!this.Am) {
               UF.error("Unknown target_id for getScaleAnimation = {}", var1);
            }

            return var8;
         }

         es_1 var9;
         if ((var9 = this.aZ) != null && var9.KB > 0) {
            es_1 var10;
            es_1 var10000 = var10 = this.g10;
            es_1 var10001 = var9;
            var10.getClass();
            Object[] var37 = var9.rZ;
            int var42 = var10001.KB;
            var10000.G6(var37, 0, var42);
         }
      } else {
         es_1 var38;
         es_1 var45 = var38 = this.g10;
         com3__3[] var43;
         com3__3[] var54 = var43 = this.lu;
         var38.getClass();
         int var39 = var54.length;
         var45.G6(var43, 0, var39);
      }

      label87: {
         int var46 = var2;
         var2 = var3 - 1;
         float var29 = var5 + var4;
         switch (var46) {
            case 0:
               var8.Xf0();
               I2 var15 = this.g10.ZD();

               while(true) {
                  if (!var15.hasNext()) {
                     break label87;
                  }

                  com3__3 var22;
                  C8 var61 = (var22 = (com3__3)var15.next()).oW;
                  float var28 = var61.x * 100.0F * var6;
                  var4 = var61.y * 100.0F * var7;
                  pw_1 var53 = var8.TD0().Xf0().y80(ao_1.DX(var22, 7, var29).UD(var28, var4));
                  ao_1 var62 = ao_1.DX(var22, 2, var29);
                  float var23 = var22.j.y - var4;
                  var62.h5[0] = var23;
                  var53.y80(var62).mz0().mz0();
               }
            case 1:
               var8.Xf0();
               I2 var14 = this.g10.ZD();

               while(var14.hasNext()) {
                  com3__3 var20 = (com3__3)var14.next();
                  var4 = (1.0F - var7) / 2.0F;
                  pw_1 var52 = var8.TD0().Xf0().y80(ao_1.DX(var20, 7, var29).UD(var6, var7));
                  ao_1 var60 = ao_1.DX(var20, 2, var29);
                  float var21 = var20.j.y - var4;
                  var60.h5[0] = var21;
                  var52.y80(var60).mz0().mz0();
               }

               var8.mz0();
               if (var2 <= 1) {
                  return var8;
               }
               break;
            case 2:
               var8.Xf0();
               I2 var13 = this.g10.ZD();

               while(var13.hasNext()) {
                  com3__3 var18 = (com3__3)var13.next();
                  var4 = var6 + 1.0F;
                  var5 = var7 + 1.0F;
                  float var41 = (1.0F - var5) / 2.0F;
                  pw_1 var50 = var8.TD0().Xf0().y80(ao_1.DX(var18, 7, var29).UD(var4, var5));
                  ao_1 var58 = ao_1.DX(var18, 2, var29);
                  var4 = var18.j.y - var41;
                  var58.h5[0] = var4;
                  var50 = var50.y80(var58).mz0().Xf0().y80(ao_1.DX(var18, 7, var29).UD(1.0F, 1.0F));
                  var58 = ao_1.DX(var18, 2, var29);
                  float var19 = var18.j.y;
                  var58.h5[0] = var19;
                  var50.y80(var58).mz0().mz0();
               }

               var8.mz0();
               if (var2 <= 1) {
                  return var8;
               }
               break;
            case 3:
               var8.Xf0();
               I2 var12 = this.g10.ZD();

               while(true) {
                  if (!var12.hasNext()) {
                     break label87;
                  }

                  com3__3 var16 = (com3__3)var12.next();
                  float var25 = var6 + 1.0F;
                  var4 = var7 + 1.0F;
                  var5 = (1.0F - var4) / 2.0F;
                  float var40 = 1.0F - var6;
                  float var44 = 1.0F - var7;
                  float var11 = (1.0F - var44) / 2.0F;
                  pw_1 var47 = var8.TD0().Xf0().y80(ao_1.DX(var16, 7, var29).UD(var25, var4));
                  ao_1 var55 = ao_1.DX(var16, 2, var29);
                  var25 = var16.j.y - var5;
                  var55.h5[0] = var25;
                  var47 = var47.y80(var55).mz0().Xf0().y80(ao_1.DX(var16, 7, var29).UD(var40, var44));
                  var55 = ao_1.DX(var16, 2, var29);
                  var25 = var16.j.y - var11;
                  var55.h5[0] = var25;
                  var47 = var47.y80(var55).mz0().Xf0().y80(ao_1.DX(var16, 7, var29).UD(1.0F, 1.0F));
                  var55 = ao_1.DX(var16, 2, var29);
                  float var17 = var16.j.y;
                  var55.h5[0] = var17;
                  var47.y80(var55).mz0().mz0();
               }
            default:
               if (!this.Am) {
                  UF.error("Unknown type_id for getScaleAnimation = {}", var1);
               }

               return var8;
         }

         ((D2)var8).Yu0(var2, 0.0F);
         return var8;
      }

      var8.mz0();
      return var8;
   }

   public final pw_1 EN(int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      this.g10.clear();
      pw_1 var8 = pw_1.xC();
      if (var1 != 14) {
         if (var1 != 16) {
            if (!this.Am) {
               UF.error("Unknown target_id for getMoveAnimation = {}", var1);
            }

            return var8;
         }

         es_1 var9;
         if ((var9 = this.aZ) != null && var9.KB > 0) {
            es_1 var10;
            es_1 var10000 = var10 = this.g10;
            es_1 var10001 = var9;
            var10.getClass();
            Object[] var52 = var9.rZ;
            int var55 = var10001.KB;
            var10000.G6(var52, 0, var55);
         }
      } else {
         es_1 var53;
         es_1 var57 = var53 = this.g10;
         com3__3[] var56;
         com3__3[] var80 = var56 = this.lu;
         var53.getClass();
         int var54 = var80.length;
         var57.G6(var56, 0, var54);
      }

      label93: {
         float var81 = var5;
         float var10002 = var4;
         var4 = var6 / 4.0F;
         var5 = var7 / 4.0F;
         var6 = (var81 + var10002) / 2.0F;
         if (var2 != 14) {
            if (var2 != 15) {
               switch (var2) {
                  case 0:
                  case 4:
                     var8.Xf0();
                     I2 var14 = this.g10.ZD();

                     while(var14.hasNext()) {
                        com3__3 var24 = (com3__3)var14.next();
                        pw_1 var72 = var8.TD0();
                        ao_1 var95 = ao_1.DX(var24, 1, var6);
                        float var40 = var24.j.x + var4;
                        var95.h5[0] = var40;
                        var72 = var72.y80(var95);
                        var95 = ao_1.DX(var24, 1, var6);
                        float var25 = var24.j.x;
                        var95.h5[0] = var25;
                        var72.y80(var95).mz0();
                     }
                     break;
                  case 1:
                     var8.Xf0();
                     I2 var13 = this.g10.ZD();

                     while(var13.hasNext()) {
                        com3__3 var22 = (com3__3)var13.next();
                        pw_1 var68 = var8.TD0();
                        ao_1 var91 = ao_1.DX(var22, 1, var6);
                        float var37 = var22.j.x + var4;
                        var91.h5[0] = var37;
                        var68 = var68.y80(var91);
                        var91 = ao_1.DX(var22, 1, var6);
                        var37 = var22.j.x;
                        var91.h5[0] = var37;
                        var68.y80(var91).mz0();
                        var68 = var8.TD0();
                        var91 = ao_1.DX(var22, 2, var6);
                        var37 = var22.j.y + var5;
                        var91.h5[0] = var37;
                        var68 = var68.y80(var91);
                        var91 = ao_1.DX(var22, 2, var6);
                        float var23 = var22.j.y;
                        var91.h5[0] = var23;
                        var68.y80(var91).mz0();
                     }
                     break;
                  case 2:
                     var8.Xf0();
                     I2 var12 = this.g10.ZD();

                     while(var12.hasNext()) {
                        com3__3 var20 = (com3__3)var12.next();
                        pw_1 var64 = var8.TD0();
                        ao_1 var87 = ao_1.DX(var20, 1, var6);
                        float var34 = var20.j.x + var4;
                        var87.h5[0] = var34;
                        var64 = var64.y80(var87);
                        var87 = ao_1.DX(var20, 1, var6);
                        var34 = var20.j.x;
                        var87.h5[0] = var34;
                        var64.y80(var87).mz0();
                        var64 = var8.TD0();
                        var87 = ao_1.DX(var20, 2, var6);
                        var34 = var20.j.y + var5;
                        var87.h5[0] = var34;
                        var64 = var64.y80(var87);
                        var87 = ao_1.DX(var20, 2, var6);
                        float var21 = var20.j.y;
                        var87.h5[0] = var21;
                        var64.y80(var87).mz0();
                     }

                     var8.mz0().Yu0(var3, 0.0F);
                     return var8;
                  case 3:
                     var8.Xf0();
                     I2 var17 = this.g10.ZD();

                     while(var17.hasNext()) {
                        com3__3 var30 = (com3__3)var17.next();
                        pw_1 var58 = var8.TD0();
                        ao_1 var82 = ao_1.DX(var30, 1, var6);
                        var7 = var30.j.x + var4;
                        var82.h5[0] = var7;
                        var58 = var58.y80(var82);
                        var82 = ao_1.DX(var30, 1, var6);
                        var7 = var30.j.x - var4;
                        var82.h5[0] = var7;
                        var58.y80(var82).mz0();
                        var58 = var8.TD0();
                        var82 = ao_1.DX(var30, 3, var6);
                        var7 = var30.j.z + var5;
                        var82.h5[0] = var7;
                        var58 = var58.y80(var82);
                        var82 = ao_1.DX(var30, 3, var6);
                        float var31 = var30.j.z - var5;
                        var82.h5[0] = var31;
                        var58.y80(var82).mz0();
                     }

                     var8.mz0().Yu0(var3, 0.0F);
                     I2 var11 = this.g10.ZD();

                     while(var11.hasNext()) {
                        com3__3 var18;
                        com3__3 var62 = var18 = (com3__3)var11.next();
                        ao_1 var32;
                        ao_1 var86 = var32 = ao_1.DX(var62, 1, var6);
                        float var45 = var18.j.x;
                        var86.h5[0] = var45;
                        var8.y80(var32);
                        ao_1 var63 = var32 = ao_1.DX(var62, 3, var6);
                        float var19 = var18.j.z;
                        var63.h5[0] = var19;
                        var8.y80(var32);
                     }
                     break label93;
                  case 5:
                     return var8;
                  default:
                     if (!this.Am) {
                        UF.error("Unknown type_id for getMoveAnimation = {}", var1);
                     }

                     return var8;
               }
            } else {
               this.Ue0(var2, 0, 0.0F, 1.0F, 3.0F);
               var8.Xf0();
               I2 var15 = this.g10.ZD();

               while(var15.hasNext()) {
                  com3__3 var26 = (com3__3)var15.next();
                  pw_1 var74 = var8.Xf0().y80(ao_1.yp(8, var26).Om0(new float[]{1.0F, 1.0F, 1.0F, 1.0F}));
                  ao_1 var97 = ao_1.DX(var26, 1, var6);
                  float var41 = var26.j.x - var4;
                  var97.h5[0] = var41;
                  var74.y80(var97).mz0();
                  var74 = var8.Xf0().y80(ao_1.yp(8, var26).Om0(new float[]{1.0F, 1.0F, 1.0F, 1.0F}));
                  var97 = ao_1.DX(var26, 2, var6);
                  float var27 = var26.j.y - var5;
                  var97.h5[0] = var27;
                  var74.y80(var97).mz0();
               }
            }
         } else {
            this.Ue0(var2, 0, 1.0F, 0.0F, 3.0F);
            var8.Xf0();
            I2 var16 = this.g10.ZD();

            while(var16.hasNext()) {
               com3__3 var28 = (com3__3)var16.next();
               pw_1 var76 = var8.Xf0();
               ao_1 var99 = ao_1.DX(var28, 9, var6);
               float var42 = 0.0F;
               var99.h5[0] = var42;
               var76 = var76.y80(var99);
               var99 = ao_1.DX(var28, 1, var6);
               var42 = var28.j.x + var4;
               var99.h5[0] = var42;
               var76.y80(var99).mz0();
               var76 = var8.Xf0();
               var99 = ao_1.DX(var28, 9, var6);
               var42 = 0.0F;
               var99.h5[0] = var42;
               var76 = var76.y80(var99);
               var99 = ao_1.DX(var28, 2, var6);
               float var29 = var28.j.y + var5;
               var99.h5[0] = var29;
               var76.y80(var99).mz0();
            }
         }

         var8.mz0();
      }

      return var8;
   }

   public final pw_1 Ue0(int var1, int var2, float var3, float var4, float var5) {
      pw_1 var6 = pw_1.gb0();
      vr_1 var7;
      if ((var7 = this.Vs) != null && var4 == 0.0F) {
         Color var17 = T8;
         float[] var36;
         float[] var10000 = var36 = var7.lw;
         var17.r = var36[0];
         var17.g = var36[1];
         var17.b = var36[2];
         var4 = var10000[3];
      } else {
         T8.set(px_1.ep0(var2));
      }

      int var43 = var1;
      float var14 = 10.0F;
      switch (var43) {
         case 0:
            I2 var26 = this.Vs.vr.Y3.ZD();

            while(var26.hasNext()) {
               ao_1 var51 = ao_1.DX((BM)var26.next(), 10, var5 * var14);
               float[] var34;
               float[] var61 = var34 = new float[4];
               Color var42;
               Color var70 = var42 = T8;
               var34[0] = var42.r;
               var34[1] = var42.g;
               var61[2] = var70.b;
               var61[3] = var4;
               var6.y80(var51.Om0(var61));
            }

            I2 var13 = this.Vs.E9.Y3.ZD();

            while(var13.hasNext()) {
               ao_1 var52 = ao_1.DX((BM)var13.next(), 10, var5 * var14);
               float[] var27;
               float[] var62 = var27 = new float[4];
               Color var35;
               Color var71 = var35 = T8;
               var27[0] = var35.r;
               var27[1] = var35.g;
               var62[2] = var71.b;
               var62[3] = var4;
               var6.y80(var52.Om0(var62));
            }
            break;
         case 1:
            I2 var12 = this.Vs.sJ.Y3.ZD();

            while(var12.hasNext()) {
               ao_1 var50 = ao_1.DX((BM)var12.next(), 10, var5 * var14);
               float[] var25;
               float[] var60 = var25 = new float[4];
               Color var33;
               Color var69 = var33 = T8;
               var25[0] = var33.r;
               var25[1] = var33.g;
               var60[2] = var69.b;
               var60[3] = var4;
               var6.y80(var50.Om0(var60));
            }
            break;
         case 2:
            I2 var22 = this.Vs.sJ.Y3.ZD();

            while(var22.hasNext()) {
               ao_1 var47 = ao_1.DX((BM)var22.next(), 10, var5 * var14);
               float[] var30;
               float[] var57 = var30 = new float[4];
               Color var40;
               Color var66 = var40 = T8;
               var30[0] = var40.r;
               var30[1] = var40.g;
               var57[2] = var66.b;
               var57[3] = var4;
               var6.y80(var47.Om0(var57));
            }

            var22 = this.Vs.vr.Y3.ZD();

            while(var22.hasNext()) {
               ao_1 var48 = ao_1.DX((BM)var22.next(), 10, var5 * var14);
               float[] var31;
               float[] var58 = var31 = new float[4];
               Color var41;
               Color var67 = var41 = T8;
               var31[0] = var41.r;
               var31[1] = var41.g;
               var58[2] = var67.b;
               var58[3] = var4;
               var6.y80(var48.Om0(var58));
            }

            I2 var11 = this.Vs.E9.Y3.ZD();

            while(var11.hasNext()) {
               ao_1 var49 = ao_1.DX((BM)var11.next(), 10, var5 * var14);
               float[] var24;
               float[] var59 = var24 = new float[4];
               Color var32;
               Color var68 = var32 = T8;
               var24[0] = var32.r;
               var24[1] = var32.g;
               var59[2] = var68.b;
               var59[3] = var4;
               var6.y80(var49.Om0(var59));
            }
            break;
         case 3:
            ao_1 var46 = ao_1.DX(this.Vs.SE0, 0, var5 * var14);
            float[] var10;
            float[] var56 = var10 = new float[4];
            Color var16;
            Color var65 = var16 = T8;
            var10[0] = var16.r;
            var10[1] = var16.g;
            var56[2] = var65.b;
            var56[3] = var3;
            var6.y80(var46.Om0(var56));
            break;
         case 4:
            I2 var18 = this.Vs.sJ.Y3.ZD();

            while(var18.hasNext()) {
               ao_1 var10001 = ao_1.DX((BM)var18.next(), 10, var5 * var14);
               float[] var39;
               float[] var10002 = var39 = new float[4];
               Color var8;
               Color var10005 = var8 = T8;
               var39[0] = var8.r;
               var39[1] = var8.g;
               var10002[2] = var10005.b;
               var10002[3] = var4;
               var6.y80(var10001.Om0(var10002));
            }

            var14 = var5 * var14;
            ao_1 var53 = ao_1.DX(this.Vs.SE0, 0, var14);
            float[] var19;
            float[] var10003 = var19 = new float[4];
            Color var37;
            Color var10006 = var37 = T8;
            var19[0] = var37.r;
            var19[1] = var37.g;
            var10003[2] = var10006.b;
            var10003[3] = var3;
            var6.y80(var53.Om0(var10003));
            I2 var20 = this.Vs.vr.Y3.ZD();

            while(var20.hasNext()) {
               ao_1 var44 = ao_1.DX((BM)var20.next(), 10, var14);
               float[] var28;
               float[] var54 = var28 = new float[4];
               Color var63 = var37 = T8;
               var28[0] = var37.r;
               var28[1] = var37.g;
               var54[2] = var63.b;
               var54[3] = var4;
               var6.y80(var44.Om0(var54));
            }

            I2 var9 = this.Vs.E9.Y3.ZD();

            while(var9.hasNext()) {
               ao_1 var45 = ao_1.DX((BM)var9.next(), 10, var14);
               float[] var21;
               float[] var55 = var21 = new float[4];
               Color var29;
               Color var64 = var29 = T8;
               var21[0] = var29.r;
               var21[1] = var29.g;
               var55[2] = var64.b;
               var55[3] = var4;
               var6.y80(var45.Om0(var55));
            }
      }

      return var6;
   }

   public void kA0(PF[] var1) {
      es_1 var2;
      var2 = new es_1();
      this.CoM9 = var2;
      var2 = new es_1();
      this.aZ = var2;
      int var7 = var1.length;

      for(int var3 = 0; var3 < var7; ++var3) {
         PF var4;
         if ((var4 = var1[var3]) != null && !var4.ZM && var4.hL) {
            if (this.Xp == null) {
               this.Xp = var4;
            }

            this.CoM9.Ue0(var4);
            es_1 var5;
            es_1 var10002 = var5 = this.aZ;
            com3__3[] var10003 = var4.Br0;
            var5.getClass();
            var10002.G6(var10003, 0, var10003.length);
            this.ei0 = var4.cD0;
         }
      }

      this.Vc();
   }

   public final ao_1 sv0() {
      ParticleEffectExt var1 = this.Jv("items/item_use");
      return ao_1.pc((var2, var3) -> this.Mr0(var1));
   }

   public final ao_1 m20(i40_0 var1) {
      ParticleEffectExt var2 = this.Jv(var1.name().toLowerCase(java.util.Locale.ENGLISH) + "/33");
      return ao_1.pc((var3, var4) -> this.Mr0(var2));
   }

   public final pw_1 Sv0(int var1, int var2, float var3, float var4) {
      int var10000 = var2;
      pw_1 var5 = pw_1.xC();
      if (var10000 == 1) {
         var5.y80(ao_1.pc(new hn_0(this.asBridge(), var1, var3, var4)));
      }

      return var5;
   }

   public final pw_1 fE0(int var1, int var2, int var3, int var4, int var5, float var6) {
      ParticleEffectExt effect = (ParticleEffectExt)this.O70.get(var2);
      if (effect.getControllers().KB == 0 || effect.getControllers().KB <= var3) {
         return pw_1.gb0();
      }

      ParticleControllerExt controller = (ParticleControllerExt)((ParticleController)effect.getControllers().get(var3)).copy();
      effect.getControllers().Ue0(controller);
      pw_1 animation = pw_1.xC();
      if (var4 == 1 || var4 == 2 || var4 == 3 || var4 == 11) {
         co_1.Xh = ri_0.pN;
      } else if (var4 == 0 || var4 == 4 || var4 == 9 || var4 == 13) {
         co_1.Xh = ri_0.xQ;
      } else if (!this.Am) {
         UF.error("UNK TARGET TYPE = {}", var4);
      }

      if (var5 == 1 || var5 == 11) {
         co_1.RC0 = ri_0.pN;
      } else if (var5 == 8) {
         co_1.RC0 = ri_0.w8;
      } else if (var5 == 9) {
         co_1.RC0 = ri_0.xQ;
      }

      I2 influencers = controller.influencers.ZD();
      while (influencers.hasNext()) {
         Influencer influencer = (Influencer)influencers.next();
         if (influencer instanceof ControllerSpawnInfluencer) {
            ControllerSpawnInfluencer spawn = (ControllerSpawnInfluencer)influencer;
            if (var1 >= 0) {
               spawn.setSpawnPosition(new C8(((com3__3)this.aZ.get(var1)).j));
               spawn.spawnType.setValue(5.0F);
            } else if (var4 == 3 || var4 == 4) {
               spawn.spawnType.setValue(co_1.Xh == ri_0.pN ? 4.0F : 3.0F);
            } else {
               spawn.spawnType.setValue(co_1.Xh == ri_0.pN ? 1.0F : 0.0F);
            }
            spawn.spawnAdjustment.na(0.0F, var6 - 0.5F, 0.0F);
         }
      }

      this.ro.Ue0(effect);
      controller.init();
      ParticleControllerExt trailController = null;
      if (controller.trailController >= 0) {
         trailController = (ParticleControllerExt)effect.getControllers().get(controller.trailController);
         trailController.init();
         controller.updateTrailController(trailController);
      }

      RegularEmitter emitter = (RegularEmitter)controller.emitter;
      float duration = emitter.delayValue.getLowMax() + emitter.durationValue.getLowMax() + emitter.lifeValue.getHighMax();
      ParticleControllerExt finalTrailController = trailController;
      animation.y80(ao_1.pc((var7, var8) -> {
         controller.start();
         if (finalTrailController != null) {
            finalTrailController.start();
         }
      }));
      return this.Tc0 ? animation : animation.p1(duration / 1000.0F);
   }

   public final pw_1 Uv(boolean var1, float var2) {
      pw_1 var3 = pw_1.xC();
      if (var1) {
         return var3;
      }

      ao_1 var4 = ao_1.pc((var5, var6) -> this.og0(14, var5, var6));
      var4.Sq0 += var2 / 1000.0F;
      var3.y80((ao_1)((D2)var4).Ms(this.Vs.wP));
      return var3;
   }

   // $FF: synthetic method
   public void f30(PF var1, int var2, D2 var3) {
      this.vv(var1);
   }

   // $FF: synthetic method
   public void ZX(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   // $FF: synthetic method
   public void ze0(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   // $FF: synthetic method
   public void ZS(PF var1, int var2, D2 var3) {
      this.g20(var1);
   }

   // $FF: synthetic method
   public void Gw0(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

   // $FF: synthetic method
   public void pn0(ParticleEffectExt var1, int var2, D2 var3) {
      this.Mr0(var1);
   }

    // ==========================================
    // 现代可读 API 封装 (Modern APIs)
    // ==========================================

    public final PF getSourcePokemon() {
        return this.Vz0;
    }

    public final PF getTargetPokemon() {
        return this.Xp;
    }

    public final void setSourcePokemon(PF pokemon) {
        this.g20(pokemon);
    }

    public final MU setTargetPokemon(PF pokemon) {
        return this.vv(pokemon);
    }

    public final pw_1 getTimeline() {
        return this.E8;
    }

    public final vr_1 getBattleScene() {
        return this.Vs;
    }

    public final BJ0 getCameraController() {
        return this.jq;
    }

    public final MU asBridge() {
        return ((Object) this) instanceof MU ? (MU) (Object) this : null;
    }

}
