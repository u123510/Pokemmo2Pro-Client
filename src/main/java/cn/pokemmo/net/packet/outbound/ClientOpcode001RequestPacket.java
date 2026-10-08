package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Locale;

public class ClientOpcode001RequestPacket extends RE {
   public ClientOpcode001RequestPacket() {
      super(1);
   }

   public final void ig0(k20_0 var1, ByteBuffer var2) {
      if (var1.uH0.BX.uI0()) {
         var2.put((byte)1);
         long var3 = var1.uH0.BX.Sa;
         var2.putLong(var3);
         var2.put((byte)var1.uH0.om.length);
         var2.put(var1.uH0.om);
      } else {
         var2.put((byte)0);
         var2.putInt(var1.uH0.yE);
         var2.put((byte)var1.uH0.hE0.length);
         var2.put(var1.uH0.hE0);
      }

      Socket var8;
      byte[] var9;
      if ((var8 = var1.vD.socket()) != null && !var8.isClosed()) {
         var9 = tx_1.PrN(var1.vD.socket().getLocalAddress());
      } else {
         var9 = tx_1.PrN((InetAddress)null);
      }

      var2.put(var9);
      int var10001 = x0_0.k40;
      var2.putInt(28887);
      var2.putInt(x0_0.k40);
      var2.put(G50.Rw(dw_2.fP).Sf0);
      var2.putShort(var1.uH0.Wv0);
      var2.putShort(dw_2.Mt0);
      byte var19;
      if ((var9 = tw0_0.Ll0.Nl0) != null && var9.length >= 1) {
         var19 = 0;
         int var22 = var9.length;

         for(int var4 = 0; var4 < var22; ++var4) {
            var19 = (byte)(var19 | 1 << var9[var4]);
         }
      } else {
         var19 = 0;
      }

      var2.put(var19);
      int var11 = 0;
      aa0_2 var20;
      if ((var20 = tw0_0.Ll0).YB0 != null) {
         var11 = 1;
      }

      if (var20.LPT2 != null) {
         ++var11;
      }

      if (var20.t1 != null) {
         ++var11;
      }

      if (var20.Qz0 != null) {
         ++var11;
      }

      var2.put((byte)var11);
      qa0_1 var12;
      if ((var12 = tw0_0.Ll0.YB0) != null) {
         bo_1.cK(var12.iq0.toUpperCase(Locale.ENGLISH), var2);
         var2.put(tw0_0.Ll0.YB0.I40);
         var2.put((byte)0);
      }

      if ((var12 = tw0_0.Ll0.LPT2) != null) {
         bo_1.cK(var12.iq0.toUpperCase(Locale.ENGLISH), var2);
         var2.put(tw0_0.Ll0.LPT2.I40);
         var2.put((byte)0);
      }

      UY var14;
      if ((var14 = tw0_0.Ll0.t1) != null) {
         bo_1.cK(var14.z40.const$.toUpperCase(Locale.ENGLISH), var2);
         var2.put(tw0_0.Ll0.t1.z40.AN);
         var2.put((byte)1);
      }

      nj0_0 var15;
      if ((var15 = tw0_0.Ll0.Qz0) != null) {
         bo_1.cK(var15.z40.const$.toUpperCase(Locale.ENGLISH), var2);
         var2.put(tw0_0.Ll0.Qz0.z40.AN);
         var2.put((byte)1);
      }

      mh0_2 var10000 = tw0_0.Ht0;
      var2.put((byte)var10000.qE0.Rv);
      bm0_1 var16;
      bm0_1 var26 = var16 = var10000.qE0;
      int var21;
      byte[] var23 = new byte[var21 = var26.Rv];
      byte[] var24;
      byte[] var27 = var24 = var26.MO;
      byte[] var17 = var16.Ut;
      int var5 = var27.length;
      int var6 = 0;

      while(true) {
         int var28 = var5;
         var5 += -1;
         if (var28 <= 0) {
            for(int var18 = 0; var18 < var21; ++var18) {
               byte var25 = var23[var18];
               var2.put(var25);
               bo_1.cK((String)tw0_0.Ht0.qE0.BM(var25), var2);
            }

            var2.put(qt_1.zm0.LG);
            var2.put((byte)ea0_1.xz0.ordinal());
            var2.put((byte)ea0_1.su0.ordinal());
            var2.put(xs_0.f20);
            var2.put(xs_0.fe0);
            return;
         }

         if (var17[var5] == 1) {
            int var7 = var6 + 1;
            var23[var6] = var24[var5];
            var6 = var7;
         }
      }
   }
}
