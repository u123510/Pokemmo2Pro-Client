package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode216Packet extends GH {
   public og0_2 Ow0;

   public ServerOpcode216Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      byte var1 = super.Rj.get();
      this.Ow0 = (og0_2)t_0.BI0(og0_2.So.BM(var1), og0_2.class, var1);
   }

   @Override
   public final void os0() {
      og0_2 var2 = this.Ow0;
      BR var1;
      (var1 = (BR)this.sr0()).getClass();
      if (dw_2.q0()) {
         G50[] var3 = (G50[])dw_2.AL().toArray(new G50[0]);
         var1.fk0.uQ(new XQ(var3));
      } else {
         var1.lZ.BE(var2);
      }
   }
}
