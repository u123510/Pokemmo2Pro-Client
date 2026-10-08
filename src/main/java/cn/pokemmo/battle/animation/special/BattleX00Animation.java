package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleX00Animation
 * 原始类: f.X00
 */
public class BattleX00Animation extends MU {
   public final ML0 w90;
   public final PF kW;
   public final boolean Ql;

   public BattleX00Animation(ML0 var1, PF var2, boolean var3) {
      super(var2);
      this.kW = var2;
      this.w90 = var1;
      this.Ql = var3;
   }

   @Override
   public final MU us() {
      com3__3[] var1 = this.kW.Br0;
      C8 var2 = T3.hf(this.kW.LpT9.j, this.kW.LpT9.j);
      if (this.Ql) {
         this.kW.U7(0.75F);
      }

      this.E8 = pw_1.xC();
      this.E8.TD0().Sq0 += (float)di0_0.Ks(this.kW.p10()) / 1000.0F + 0.25F;
      this.E8.y80(MU.eK0((short)1388, this.kW.COm2()));
      this.E8.Xf0();

      for(com3__3 var5 : var1) {
         this.E8.TD0().Xf0().y80(ao_1.DX(var5, 4, 0.200000003F).kt(var2.x, var2.y - 1.0F, var2.z)).mz0();
         this.E8.y80(ao_1.pc(this::UU)).mz0();
      }

      this.E8.mz0();
      this.E8.mz0();
      this.E8.Ms(this.Vs.wP);
      this.Vs.jH(this.E8);
      this.Vc();
      return this;
   }

   @Override
   public final boolean Bv0(boolean var1) {
      a10_0 var2 = tw0_0.PK0;
      return var2 != null ? var2.nf == Cq.Jz0 && !this.nn0() : super.Bv0(var1);
   }

   public final void UU(int var1, D2 var2) {
      this.kW.Ry0((byte)0);
      this.w90.yd0.Jm(this.kW);
      jd0_1 var3 = this.w90.Hi(this.kW);
      if (var3 != null) {
         var3.Hm(false);
      }
   }
}
