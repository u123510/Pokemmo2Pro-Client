package cn.pokemmo.net.packet.protocol;

import f.*;

import java.nio.ByteBuffer;

public class HeartbeatPingPacket extends BaseSystemProtocolPacket {
   public final short Un;

   public HeartbeatPingPacket(short var1) {
      super((byte)16);
      this.Un = var1;
   }

   @Override
   public final void hG(ByteBuffer var1) {
      var1.put(super.mG);
      var1.putShort(this.Un);
   }

   @Override
   public final boolean Ev0(CE var1, cq_0 var2) {
      if (var1 != null) {
         short[] var4;
         int var5 = (var4 = var1.Gu).length;

         for (int var3 = 0; var3 < var5; var3++) {
            if (var4[var3] == this.Un) {
               return true;
            }
         }
      }

      return false;
   }
}
