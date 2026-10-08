package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction021Packet extends Nt implements eb0_0 {
   public final byte Qx;

   public BattleAction021Packet(byte value) {
      super();
      this.Qx = value;
   }

   @Override
   public final byte BL0() {
      return 21;
   }

   @Override
   public final void IE0(PF first, PF second, boolean unused1, boolean unused2, short unused3, boolean unused4, ML0 ui, qn_1 unused5) {
      if (this.Qx == 1) {
         int amount = ui.yd0.eH0(754, second, first);
         ui.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, amount, new String[]{second.A60(), first.A60()}), "", null);
      } else if (this.Qx == 0) {
         int amount = ui.yd0.QX(751, first);
         ui.wJ(sm0_0.fg0((byte)1, lpt6__2.Q80, 14, amount, new String[]{first.A60()}), "", null);
      }
   }
}
