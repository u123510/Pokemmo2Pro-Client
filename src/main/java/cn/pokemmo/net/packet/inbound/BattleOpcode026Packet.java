package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode026Packet extends GH {
   public CH0 Kx0 = CH0.j1;
   public byte J2;
   public byte py;

   public BattleOpcode026Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.Kx0 = this.pE();
      this.J2 = super.Rj.get();
      this.py = super.Rj.get();
   }

   @Override
   public final void os0() {
      a10_0 var1 = tw0_0.PK0;
      PF var8;
      if (tw0_0.PK0 != null && (var8 = var1.nd0(this.Kx0)) != null) {
         byte var2 = this.J2;
         byte var3 = this.py;
         byte[] var4 = var8.xJ;
         if (var8.xJ != null) {
            var4[var2] = var3;
            return;
         }

         short[] var12 = var8.Cd0;
         if (var8.Cd0 != null && var12[var2] > 0) {
            var8.sh0[var2] = var3;
            return;
         }
      }

      VU var9;
      if ((var9 = this.sr0().FJ0(this.Kx0, _volatile.pG0)) != null) {
         CE var10 = var9.I8;
         byte var11 = this.J2;
         byte var13;
         byte var10000 = var13 = this.py;
         byte var5 = 0;
         byte var6 = 100;
         if (var10000 < 0) {
            var13 = var5;
         } else if (var13 > var6) {
            var13 = var6;
         }

         byte var7 = (byte)var13;
         var10.TC0[var11] = var7;
         this.sr0().CA(var9);
      }
   }
}
