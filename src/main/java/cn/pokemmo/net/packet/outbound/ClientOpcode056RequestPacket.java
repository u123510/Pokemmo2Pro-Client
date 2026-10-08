package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode056RequestPacket extends RE {
   public final CH0[] na0;

   public ClientOpcode056RequestPacket(CH0[] var1) {
      super(56);
      this.na0 = var1;
   }

   public final void ig0(k20_0 var1, ByteBuffer var2) {
      var2.put((byte)this.na0.length);
      CH0[] var4;
      int var5 = (var4 = this.na0).length;

      for(int var3 = 0; var3 < var5; ++var3) {
         var2.putLong(var4[var3].Sa);
      }

   }
}
