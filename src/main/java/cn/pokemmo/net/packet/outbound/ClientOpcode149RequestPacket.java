package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode149RequestPacket extends RE {
   public final String PG;
   public final String S00;
   public final String Rx0;
   public final com1__3[] ii0;

   public ClientOpcode149RequestPacket(String var1, String var2, String var3, com1__3[] var4) {
      super(149);
      this.PG = var1;
      this.S00 = var2;
      this.Rx0 = var3;
      this.ii0 = var4;
   }

   @Override
   public final void ig0(k20_0 var1, ByteBuffer var2) {
      bo_1.cK(this.PG, var2);
      bo_1.cK(this.S00, var2);
      bo_1.cK(this.Rx0, var2);
      var2.put((byte)this.ii0.length);
      com1__3[] var6;
      int var7 = (var6 = this.ii0).length;

      for (int var3 = 0; var3 < var7; var3++) {
         com1__3 var4;
         com1__3 var10000 = var4 = var6[var3];
         var2.put(var4.KE);
         byte var5;
         if ((var5 = var10000.KE) != 0) {
            if (var5 != 1) {
               if (var5 == 2) {
                  if (var5 != 2) {
                     throw new UnsupportedOperationException();
                  }

                  var2.putInt(var4.c4);
               }
            } else {
               if (var5 != 0 && var5 != 1) {
                  throw new UnsupportedOperationException();
               }

               var2.putLong(var4.Ol.Sa);
            }
         } else {
            if (var5 != 0 && var5 != 1) {
               throw new UnsupportedOperationException();
            }

            var2.putLong(var4.Ol.Sa);
            var2.putShort(var4.Gz);
         }
      }
   }
}
