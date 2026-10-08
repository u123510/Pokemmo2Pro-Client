package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode067Packet extends GH {
   public A5 Com2;
   public CH0 VJ0;

   public ServerOpcode067Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      byte value = super.Rj.get();
      this.Com2 = (A5)t_0.BI0(A5.N8.BM(value), A5.class, value);
      this.VJ0 = this.pE();
   }

   @Override
   public final void os0() {
      RJ0 state = super.sr0().Bb(this.Com2);
      if (state == null) {
         return;
      }
      synchronized (state.pb0) {
         state.pb0.remove(this.VJ0);
      }
      super.sr0().yt0();
   }
}
