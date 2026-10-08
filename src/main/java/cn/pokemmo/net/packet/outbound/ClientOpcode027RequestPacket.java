package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode027RequestPacket extends RE {
   public final int[] rp;
   public final short AQ;
   public final _volatile zC;

   public ClientOpcode027RequestPacket(_volatile var1, int[] var2, short var3) {
      super(27);
      this.zC = var1;
      this.rp = var2;
      this.AQ = var3;
   }

   @Override
   public final void ig0(k20_0 var1, ByteBuffer var2) {
      var2.put(this.zC.Go0);
      var2.put((byte)this.rp.length);
      int[] var5 = this.rp;
      int var3 = this.rp.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2.putInt(var5[var4]);
      }

      var2.putShort(this.AQ);
   }
}
