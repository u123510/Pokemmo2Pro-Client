package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.IOException;

public abstract class BitPackedByteBuffer extends BaseNetworkByteBuffer {
   static final long serialVersionUID = 1L;
   public transient int[] kQ;
   public int Aa = 0;
   public int dJ = 0;
   public boolean bf0;

   public BitPackedByteBuffer() {
   }

   public BitPackedByteBuffer(int var1) {
      super(var1);
   }

   @Override
   public int La(int var1) {
      int var10000 = super.La(var1);
      this.kQ = new int[var10000];
      return var10000;
   }

   @Override
   public void dx0(int var1) {
      this.kQ[var1] = this.Aa;
      super.dx0(var1);
   }

   public final int IJ0(int var1) {
      int[] keys = this.kQ;
      int length = super.Ut.length;
      int hash = var1 & Integer.MAX_VALUE;
      int index = hash % length;
      byte state = super.Ut[index];
      if (state == 0) {
         return -1;
      }
      if (state == 1 && keys[index] == var1) {
         return index;
      }
      int step = sj_0.oC0(keys.length, 2, hash, 1);
      int probe = index;
      while (true) {
         probe -= step;
         if (probe < 0) {
            probe += keys.length;
         }
         state = super.Ut[probe];
         if (state == 0) {
            return -1;
         }
         if (keys[probe] == var1 && state != 2) {
            return probe;
         }
         if (probe == index) {
            return -1;
         }
      }
   }

   public final int q3(int var1) {
      int var2 = var1 & 2147483647;
      byte[] var3 = super.Ut;
      int var4;
      byte var5;
      byte var10000 = var5 = super.Ut[var4 = var2 % var3.length];
      this.bf0 = false;
      if (var10000 == 0) {
         this.bf0 = true;
         this.kQ[var4] = var1;
         var3[var4] = 1;
         return var4;
      }

      if (var5 == 1 && this.kQ[var4] == var1) {
         return -var4 - 1;
      }

      int var10;
      var2 = sj_0.oC0(var10 = this.kQ.length, 2, var2, 1);
      int var6 = -1;
      int var7 = var4;

      while (true) {
         if (var5 == 2 && var6 == -1) {
            var6 = var7;
         }

         int probe = var7 - var2;
         if (probe < 0) {
            probe += var10;
         }

         byte[] var12 = super.Ut;
         byte var8;
         if ((var8 = super.Ut[probe]) == 0) {
            if (var6 != -1) {
               this.kQ[var6] = var1;
               var12[var6] = 1;
            } else {
               this.bf0 = true;
                this.kQ[probe] = var1;
                var12[probe] = 1;
                var6 = probe;
            }
            break;
         }

          if (var8 == 1 && this.kQ[probe] == var1) {
             var6 = -probe - 1;
            break;
         }

          if (probe == var4) {
            if (var6 == -1) {
               throw new IllegalStateException("No free or removed slots available. Key set full?!!");
            }

            this.kQ[var6] = var1;
            var12[var6] = 1;
            break;
         }

          var7 = probe;
         var5 = var8;
      }

      return var6;
   }

   @Override
   public void writeExternal(ObjectOutput var1) {
      try {
         var1.writeByte(0);
         var1.writeByte(0);
         var1.writeFloat(super.na0);
         var1.writeFloat(super.yk0);
         var1.writeInt(this.Aa);
         var1.writeInt(this.dJ);
      } catch (IOException exception) {
         BitPackedByteBuffer.<RuntimeException>sneakyThrow(exception);
      }
   }

   @Override
   public void readExternal(ObjectInput var1) {
      try {
         var1.readByte();
         super.readExternal(var1);
         this.Aa = var1.readInt();
         this.dJ = var1.readInt();
      } catch (ClassNotFoundException | IOException exception) {
         BitPackedByteBuffer.<RuntimeException>sneakyThrow(exception);
      }
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
      throw (T)throwable;
   }
}
