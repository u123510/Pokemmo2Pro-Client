package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction060Packet extends Nt implements eb0_0 {
   public final short[] K50;

   public BattleAction060Packet(short... var1) {
      this.K50 = var1;
   }

   public final byte BL0() {
      return 60;
   }

   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      short[] var9;
      if ((var9 = this.K50).length > 0) {
         var2.Eu = var9;
      } else {
         var2.Eu = new short[0];
      }

   }
}
