package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode109Packet extends GH {
   public final bm0_1 JW = new bm0_1();
   public byte[] RB = new byte[0];

   public ServerOpcode109Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   public final void Oj0() {
      byte var1;
      if (((var1 = super.Rj.get()) & 1) != 0) {
         this.RB = new byte[super.Rj.get()];
         int var2 = 0;

         while (true) {
            byte[] var3 = this.RB;
            if (var2 >= this.RB.length) {
               break;
            }

            var3[var2] = super.Rj.get();
            var2++;
         }
      }

      if ((var1 & 2) != 0) {
         var1 = super.Rj.get();

         for (int var5 = 0; var5 < var1; var5++) {
            bm0_1 var10000 = this.JW;
            byte var6 = super.Rj.get();
            var10000.gE0(var6, this.q60());
         }
      }
   }

   public final void os0() {
      Ge0 var1;
      if ((var1 = this.sr0()) != null) {
         LH var4 = var1.y8;
         bm0_1 var2;
         bm0_1 var10000 = var2 = this.JW;
         byte[] var3 = this.RB;
         var4.getClass();
         if (var10000 == null) {
            var2 = new bm0_1();
         }

         if (var3 == null) {
            var3 = LH.Ed;
         }

         var4.ou = var2;
         var4.pw0 = var3;
         iz0_0.va = (value, id) -> var4.P2((_volatile)value, (Byte)id);
      }
   }
}
