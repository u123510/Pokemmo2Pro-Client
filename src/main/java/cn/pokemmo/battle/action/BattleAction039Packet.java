package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction039Packet extends ka_0 {
   public BattleAction039Packet(short var1) {
      super(var1);
   }

   @Override
   public final byte BL0() {
      return 39;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      var2.F(super.rA);
      ii_1 var9 = new ii_1(var2, var7.Hi(var2), null, var3, var4);
      var7.lZ.add(var9);
      lpt6__2 var10 = lpt6__2.Q80;
      byte var11 = 14;
      int var12 = var7.yd0.QX(739, var2);
      String[] var13;
      (var13 = new String[1])[0] = var2.A60();
      var7.wJ(sm0_0.fg0((byte)2, var10, var11, var12, var13), "", null);
   }
}
