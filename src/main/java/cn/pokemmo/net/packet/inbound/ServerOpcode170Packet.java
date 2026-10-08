package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode170Packet extends GH {
   public tu_0 we;
   public ys_1 VI;
   public int Qv;

   public ServerOpcode170Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   public final void Oj0() {
      this.we = tu_0.BE0(super.Rj.get());
      byte var1;
      ys_1 var2;
      if ((var1 = super.Rj.get()) == -1) {
         ys_1 var10000 = ys_1.uR;
         var2 = null;
      } else {
         var2 = (ys_1)t_0.BI0(ys_1.Com3.BM(var1), ys_1.class, var1);
      }

      this.VI = var2;
      this.Qv = super.Rj.getInt();
   }

   public final void os0() {
      BR registry = tw0_0.rl;
      if (registry == null) {
         return;
      }
      tu_0 type = this.we;
      ys_1 state = this.VI;
      int value = this.Qv;
      byte key = type.OE0;
      synchronized (registry.mG) {
         if (state == ys_1.uR) {
            registry.mG.lz0(key);
            return;
         }
         if (registry.mG.dg(key)) {
            N3 entry = (N3)registry.mG.BM(key);
            entry.LPt5 = (int)(System.currentTimeMillis() / 1000L);
            entry.Jm0 = state;
            entry.py0 = value;
         } else {
            registry.mG.gE0(key, new N3(state, value));
         }
      }
   }
}

