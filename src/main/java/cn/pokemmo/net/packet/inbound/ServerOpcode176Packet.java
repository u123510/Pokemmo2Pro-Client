package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode176Packet extends GH {
   public CH0 lx;
   public byte dj0;

   public ServerOpcode176Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.lx = this.pE();
      this.dj0 = super.Rj.get();
   }

   @Override
   public final void os0() {
      G40 var1 = tw0_0.LD0.KJ0;
      if (tw0_0.LD0.KJ0 != null) {
         CH0 var2 = this.lx;
         var1.jA0(this.dj0, var2);
      }
   }
}
