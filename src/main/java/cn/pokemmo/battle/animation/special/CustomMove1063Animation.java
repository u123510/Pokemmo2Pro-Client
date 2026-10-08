package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1063]
 * 原始类: f.Jz0
 */
public class CustomMove1063Animation extends MU {
   public static final Color T3 = Color.valueOf("#71797e");
   public static final Color Un0;

   public CustomMove1063Animation(PF var1) {
      super(var1);
      super.kA0(Arrays.stream(tw0_0.PK0.QY()).flatMap(Stream::of).filter(CustomMove1063Animation::Ig).toArray(CustomMove1063Animation::TU));
   }

   public static PF[] TU(int var0) {
      return new PF[var0];
   }

   public static boolean Ig(PF var0) {
      return var0 != null && !var0.zi0.hf0();
   }

   static {
      (Un0 = new Color(Color.BLUE)).a = 0.8F;
   }

   @Override
   public final void kA0(PF[] var1) {
   }

   @Override
   public final MU vv(PF var1) {
      return this;
   }

   @Override
   public final MU us() {
      pw_1 var10000 = pw_1.xC().Xf0();
      short var1 = 1728;
      byte var2 = 1;
      byte var3 = 14;
      float var4 = 0.0F;
      float var5 = 1.0F;
      PF var6 = super.Vz0;
      var10000 = var10000.xi0(this.i6((byte)2, var1, var2, var3, var4, var5, var6));
      Color var7 = Un0;
      var10000 = var10000.y80(this.Zb0(38, var7));
      short var8 = 2;
      boolean var15 = true;
      var10000 = var10000.y80(ao_1.pc(new lpt4__4(this, var8, var15))).xi0(this.Ue0(4, 0, 0.0F, 1.0F, 0.05F)).xi0(this.Wt(4, 0.7F)).mz0().Xf0();
      var8 = 0;
      var15 = false;
      var10000 = var10000.y80(ao_1.pc(new lpt4__4(this, var8, var15)));
      var8 = 1;
      var15 = false;
      var10000 = var10000.y80(ao_1.pc(new lpt4__4(this, var8, var15)))
         .xi0(this.Ue0(3, 0, 1.0F, 0.0F, 0.05F))
         .xi0(this.mf0(4, 0, -4, 1.4F))
         .y80(this.E2(14, true))
         .y80(this.E2(16, true))
         .TD0()
         .p1(0.64F);
      Color var11 = T3;
      var10000 = var10000.xi0(this.WW(16, 0.15F, 0.0F, 0.8125F, var11))
         .mz0()
         .TD0()
         .p1(0.96F)
         .xi0(this.WW(16, 0.5F, 0.8125F, 0.0F, var11))
         .mz0()
         .mz0()
         .xi0(this.Ue0(3, 0, 0.0F, 0.9375F, 0.05F))
         .Xf0();
      var8 = 1694;
      int var12 = 1;
      var3 = 14;
      var4 = 0.0F;
      var5 = 1.0F;
      var6 = super.Vz0;
      var10000 = var10000.xi0(this.i6((byte)2, var8, var12, var3, var4, var5, var6));
      byte var13 = 0;
      boolean var19 = true;
      var10000 = var10000.y80(ao_1.pc(new lpt4__4(this, var13, var19)));
      var13 = 1;
      var19 = true;
      (super.E8 = var10000.y80(ao_1.pc(new lpt4__4(this, var13, var19)))
            .xi0(this.Ue0(2, 0, 0.9375F, 0.0F, 0.05F))
            .xi0(this.nM(16, 0))
            .y80(this.E2(14, false))
            .y80(this.E2(16, false))
            .xi0(this.tP(0.4F))
            .y80(this.E2(18, false))
            .mz0())
         .Ms(super.Vs.wP);
      super.Vs.jH(super.E8);
      this.Vc();
      return this;
   }
}
