package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class TileMapCollisionPacket extends GH {
   public fc0_0 KI;
   public byte[][] prn;

   public TileMapCollisionPacket(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      int var1 = super.Rj.get();
      fc0_0[] var2 = fc0_0.p60;
      int var3 = fc0_0.p60.length;
      int var4 = 0;

      fc0_0 var5;
      while (true) {
         if (var4 >= var3) {
            var5 = fc0_0.i4;
            break;
         }

         if ((var5 = var2[var4]).wf0 == var1) {
            break;
         }

         var4++;
      }

      this.KI = var5;
      if (var5 == fc0_0.KE) {
         this.prn = new byte[super.Rj.get() & 0xFF][];
         var1 = 0;

         while (true) {
            byte[][] var7 = this.prn;
            if (var1 >= this.prn.length) {
               break;
            }

            byte[] var8 = new byte[super.Rj.get() & 0xFF];
            super.Rj.get(var8);
            var7[var1] = var8;
            var1++;
         }
      }
   }

   @Override
   public final void km() {
      if (this.KI == fc0_0.sn) {
         lg_0.k.T0 = false;
      }

      Ge0 var1 = this.sr0();
      if ((var1.Dv0 = this.KI) == fc0_0.KE) {
         Ge0 var3 = this.sr0();
         byte[][] var5 = this.prn;
         Iterator var4 = var3.cb0.iterator();

         while (var4.hasNext()) {
            if (var4.next() != null) {
               throw new ClassCastException();
            }

            int var6 = var5.length;
            byte var2 = 0;
            if (var6 > 0) {
               byte[] var7 = var5[var2];
               throw null;
            }
         }
      }
   }

   @Override
   public final void os0() {
   }
}
