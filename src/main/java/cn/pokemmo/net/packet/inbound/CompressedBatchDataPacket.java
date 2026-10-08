package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class CompressedBatchDataPacket extends GH {
   public ap_0 ds0;

   public CompressedBatchDataPacket(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.ds0 = new ap_0();
      int var1 = super.Rj.get() & 255;

      for (byte var2 = 0; var2 < var1; var2 = (byte)(var2 + 1)) {
         ap_0 var10001 = this.ds0;
         byte[] var3 = new byte[super.Rj.getShort() & 65535];
         super.Rj.get(var3);
         var10001.AY(var2, var3);
      }
   }

   @Override
   public final void os0() {
      if (this.sr0() != null) {
         this.sr0().tp0 = this.ds0;
      }
   }
}
