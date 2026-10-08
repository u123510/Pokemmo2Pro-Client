package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode052Packet extends GH {
   public b30_0 Xp;
   public K10 k;

   public BattleOpcode052Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   public final void Oj0() {
      this.Xp = b30_0.f5(super.Rj.get());
      K10 var1;
      switch (super.Rj.get()) {
         case 0:
            var1 = K10.yB;
            break;
         case 1:
         default:
            var1 = K10.m90;
            break;
         case 2:
            var1 = K10.Bs;
            break;
         case 3:
            var1 = K10.Ca0;
            break;
         case 4:
            var1 = K10.Qo0;
            break;
         case 5:
            var1 = K10.GM;
      }

      this.k = var1;
   }

   public final void os0() {
      a10_0 var1;
      if ((var1 = tw0_0.PK0) != null) {
         a10_0 var10000 = var1;
         BattleOpcode052Packet var10001 = this;
         b30_0 var2 = this.Xp;
         K10 var3 = var10001.k;
         var10000.Tk0.add(new JL0(var2, var3));
      }

   }
}
