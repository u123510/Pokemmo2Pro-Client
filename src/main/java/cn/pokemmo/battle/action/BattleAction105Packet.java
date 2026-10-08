package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction105Packet extends Nt implements eb0_0 {
   public final short bh0;

   public BattleAction105Packet(short var1) {
      this.bh0 = var1;
   }

   @Override
   public final byte BL0() {
      return 105;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      lpt6__2 var9 = lpt6__2.Q80;
      byte var11 = 14;
      int var13 = var7.yd0.QX(0, var2);
      String[] var14;
      (var14 = new String[1])[0] = var2.A60();
      String var10 = sm0_0.fg0((byte)2, var9, var11, var13, var14);
      Runnable var12 = () -> this.nc(var2, var7);
      var7.wJ(var10, "", var12);
   }

   public final void nc(PF var1, ML0 var2) {
      C8 var3 = var1.LpT9.j;
      var1.LpT9.j.getClass();
      new C8(var3);
      fy_1 var4 = new fy_1(var2, var1, this.bh0, var1);
      var2.lZ.add(new kw_0(var4));
   }
}
