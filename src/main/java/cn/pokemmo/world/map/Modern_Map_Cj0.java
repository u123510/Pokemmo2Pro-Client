package cn.pokemmo.world.map;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.cj_0
 */
public class Modern_Map_Cj0 extends a10_0 {

   public ib0_0 v5;
   public byte A3;

   public Modern_Map_Cj0(Cq var1, zg0_0 var2, int var3, byte var4, rh0_1 var5, XA0 var6, _volatile var7, N2[] var8, lq0[] var9, byte var10, boolean var11, O8[] var12, PF[][] var13) {
      super(var1, var2, var3, var4, (byte)0, var5, var6, (byte)-1, (short)0, var7, false, (byte)-1, (byte)0, var8, var9, null, gc_2.Uu, var10, (byte)0, var11, var12, var13, false);
      this.v5 = ib0_0.sh;
      this.A3 = 0;
   }

   public final byte cOM1() { return 1; }

   public final short QA() {
      if (this.v5 == ib0_0.sh) return 393;
      if (this.v5 == ib0_0.Ah0) return 394;
      if (this.v5 == ib0_0.LpT4) return 395;
      if (this.v5 == ib0_0.ms) return 396;
      if (this.v5 == ib0_0.V70) return 392;
      return super.QA();
   }

   public final PF Ce(byte var1, byte var2) {
      if (var1 >= 0 && var1 <= 3 && var2 < this.wI0[var1].length) {
         return this.wI0[var1][var2];
      }
      return null;
   }
}

