package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode040Packet extends GH {
   public CH0 Ni0 = CH0.j1;
   public byte dc;

   public ServerOpcode040Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.Ni0 = this.pE();
      this.dc = super.Rj.get();
   }

   @Override
   public final void os0() {
      CH0 var1 = this.Ni0;
      this.sr0().cJ0.gu0(this.dc, var1);
   }
}
