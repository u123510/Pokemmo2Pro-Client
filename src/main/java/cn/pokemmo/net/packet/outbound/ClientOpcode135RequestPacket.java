package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode135RequestPacket extends RE {
   public final boolean Ov0;
   public final CH0 qS;

   public ClientOpcode135RequestPacket(CH0 var1, boolean var2) {
      super(135);
      this.Ov0 = var2;
      this.qS = var1;
   }

   public final void ig0(k20_0 var1, ByteBuffer var2) {
      var2.put(this.Ov0 ? (byte)1 : (byte)0);
      var2.putLong(this.qS.Sa);
   }
}
