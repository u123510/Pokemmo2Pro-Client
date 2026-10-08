package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode134Packet extends GH {
   public CH0 G10;
   public boolean fT;

   public ServerOpcode134Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.G10 = this.pE();
      boolean var1;
      if ((super.Rj.get() & 255) == 1) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.fT = var1;
   }

   @Override
   public final void os0() {
      pk_0 var1;
      if ((var1 = this.sr0().xI0) != null) {
         ce0_0 var2;
         if ((var2 = var1.ci(this.G10)) != null) {
            boolean var3 = var2.mo0;
            boolean var4 = this.fT;
            if (var2.mo0 != this.fT || var4) {
               short var5;
               if (var4) {
                  var5 = 2604;
               } else {
                  var5 = 2605;
               }

               if (var4 && var3) {
                  var5 = 2623;
               }

               var2.mo0 = var4;
               int var6 = (int)(System.currentTimeMillis() / 1000L);
               var2.GG0.gw = var6;
               var1.Ov = true;
               yt_1 var7 = tw0_0.e60;
               if (tw0_0.e60 == null || this.G10.equals(var7.dj0)) {
                  return;
               }

               this.sr0().jC(sm0_0.wa0(var5, var2.GG0.DR), zo_0.kJ0);
               fa0_0 var8 = this.sr0().q50;
               if (var8.lx.containsKey(this.G10)) {
                  return;
               }

               this.sr0().qK(sm0_0.wa0(var5, var2.GG0.DR));
            }
         }
      }
   }
}
