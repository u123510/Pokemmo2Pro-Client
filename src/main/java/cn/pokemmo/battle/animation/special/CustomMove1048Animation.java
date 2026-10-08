package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1048, 1052]
 * 原始类: f.cm_1
 */
public class CustomMove1048Animation extends MU {
   public CustomMove1048Animation(PF var1) {
      super(var1);
   }

   public static void Za0(PF var0, int var1, D2 var2) {
      var0.no();
   }

   public final MU us() {
      this.E8 = pw_1.xC()
         .xi0(this.Wt(1, 0.4F))
         .xi0(this.nM(16, 1))
         .Xf0()
         .xi0(this.Ue0(2, 13311, 0.0F, 0.5F, 0.1F))
         .xi0(this.WW(16, 0.75F, 0.0F, 0.875F, px_1.ep0(13014)))
         .xi0(this.i6((byte)2, (short)1757, 1, 0, 500.0F, 0.9375F, this.Vz0))
         .mz0()
         .y80(this.Qh0(1048))
         .y80(this.wn0("1048_2"))
         .Xf0();

      int var1 = 0;
      I2 var2 = this.CoM9.ZD();
      while (var2.hasNext()) {
         PF var3 = (PF)var2.next();
         pw_1 var4 = this.E8.TD0()
            .y80(ao_1.pc(new LB0() {
               public void LPT3(int var0, D2 var5) {
                  CustomMove1048Animation.this.f30(var3, var0, var5);
               }
            }))
            .Xf0()
            .xi0(this.fE0(-1, 1048, 0, 11, 8, 0.5F))
            .xi0(this.fE0(-1, 1048, 1, 11, 8, 0.5F))
            .xi0(this.fE0(-1, 1048, 2, 11, 8, 0.5F))
            .xi0(this.fE0(-1, 1048, 3, 11, 8, 0.5F))
            .xi0(this.fE0(-1, 1048, 4, 11, 8, 0.5F));
         HB.p30(var4, this.i6((byte)2, (short)1516, ++var1, 11, 700.0F, 0.9375F, this.Vz0))
            .xi0(this.Ue0(2, 13311, 0.5F, 0.0F, 0.1F))
            .xi0(this.WW(16, 0.75F, 0.875F, 0.0F, px_1.ep0(13014)))
            .mz0()
            .mz0();
      }

      this.E8.mz0();
      I2 var5 = this.CoM9.ZD();
      while (var5.hasNext()) {
         PF var6 = (PF)var5.next();
         this.E8.y80(ao_1.pc(new LB0() {
            public void LPT3(int var0, D2 var3) {
               Za0(var6, var0, var3);
            }
         }));
      }

      this.E8.xi0(this.tP(0.4F));
      this.E8.Ms(this.Vs.wP);
      this.Vs.jH(this.E8);
      this.Vc();
      return this;
   }
}
