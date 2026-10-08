package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode123Packet extends GH {
   public U80[] ee;

   public ServerOpcode123Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   public final void Oj0() {
      zp0_0 var1 = tw0_0.rl.LPt1;
      if (tw0_0.rl.LPt1 != null) {
         JN[] var11 = var1.SM;
         int var2;
         this.ee = new U80[var2 = super.Rj.getShort() & 65535];

         for (short var3 = 0; var3 < var2; var3++) {
            short var4 = super.Rj.getShort();
            byte var5;
            byte var10000 = var5 = super.Rj.get();
            CH0 var6 = this.pE();
            JN[] var7 = U80.catch$;
            if (var10000 != 0) {
               byte var12 = 2;
               JN[] var8 = new JN[2];

               for (int var9 = 0; var9 < var12; var9++) {
                  short var10;
                  JN var14;
                  if ((var10 = super.Rj.getShort()) == -1) {
                     var14 = null;
                  } else {
                     var14 = var11[var10];
                  }

                  var8[var9] = var14;
               }

               var7 = var8;
            }

            zp0_0.dR(var3, (short)var11.length);
            this.ee[var3] = new U80(var3, var4, var5, var6, var7);
         }
      }
   }

   public final void os0() {
   }

   public final void km() {
      zp0_0 var1 = tw0_0.rl.LPt1;
      if (tw0_0.rl.LPt1 != null) {
         U80[] var2 = this.ee;
         var1.eY = new U80[(short)(var1.H10 - 1)];
         int var3 = 0;

         while (true) {
            U80[] var4 = var1.eY;
            if (var3 >= var1.eY.length) {
               var3 = var2.length;

               for (int var9 = 0; var9 < var3; var9++) {
                  U80 var5;
                  if ((var5 = var2[var9]) != null) {
                     label30: {
                        JN var6 = var5.e40;
                        if (var5.e40 == null) {
                           int var7 = var5.Io;
                           if (var5.Io >= 0) {
                              var1.eY[var5.Cb0].e40 = var1.SM[var7];
                              break label30;
                           }
                        }

                        var1.eY[var5.Cb0].e40 = var6;
                     }

                     U80 var11;
                     U80 var10001 = var11 = var1.eY[var5.Cb0];
                     var11.kX = var5.kX;
                     var10001.uL0 = var5.uL0;
                     JN[] var10;
                     if ((var10 = var5.GZ).length == 2) {
                        var11.GZ = var10;
                     }
                  }
               }

               this.sr0().WK0(var1);
               return;
            }

            var4[var3] = new U80((short)var3, zp0_0.dR((short)var3, var1.H10));
            var3++;
         }
      }
   }
}
