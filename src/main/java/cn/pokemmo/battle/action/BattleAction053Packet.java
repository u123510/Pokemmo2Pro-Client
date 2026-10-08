package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction053Packet extends Nt implements eb0_0 {
   public final short Kg;

   public BattleAction053Packet(short var1) {
      this.Kg = var1;
   }

   @Override
   public final byte BL0() {
      return 53;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      mc0_1 var9 = gu0.l2.lPT6(this.Kg);
      lpt6__2 var10 = lpt6__2.Q80;
      byte style = 14;
      int textId = var7.yd0.QX(932, var2);
      String[] var13;
      String[] var10001 = var13 = new String[2];
      var10001[0] = var2.A60();
      var10001[1] = sm0_0.c0(var9.Nl);
      var7.wJ(sm0_0.fg0((byte)2, var10, style, textId, var13), "", null);
   }
}
