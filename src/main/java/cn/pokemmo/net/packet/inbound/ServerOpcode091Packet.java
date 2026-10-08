package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode091Packet extends GH {
   public byte Ha;
   public AU[] rk0;

   public ServerOpcode091Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.Ha = super.Rj.get();
      this.rk0 = new AU[super.Rj.get() & 0xFF];
      int var1 = 0;

      while (true) {
         AU[] var2 = this.rk0;
         if (var1 >= this.rk0.length) {
            return;
         }

         this.pE();
         super.Rj.get();
         byte var9;
         byte var10004 = var9 = super.Rj.get();
         byte var3 = super.Rj.get();
         short var4 = super.Rj.getShort();
         short var5 = super.Rj.getShort();
         short var6 = super.Rj.getShort();
         short var7 = super.Rj.getShort();
         short var8 = super.Rj.getShort();
         var2[var1] = new AU(var10004, var9, var3, var4, var5, var6, var7, var8);
         var1++;
      }
   }

   @Override
   public final void os0() {
      Ge0 var4 = this.sr0();
      byte var1 = this.Ha;
      AU[] var2 = this.rk0;
      BU var5;
      if ((var5 = ((BR)var4).lZ.zK0) != null) {
         var5.Is0();
         WG0 var3 = new WG0(var5, var1, var2);
         var5.Cs = var3;
         var5.SL(var3);
         var5.Cs.lt0();
         var5.Cs.E40(tw0_0.LD0.ew0() / 2 - var5.Cs.Mx / 2, tw0_0.LD0.Hv0() / 2 - var5.Cs.OB / 2);
      }
   }
}
