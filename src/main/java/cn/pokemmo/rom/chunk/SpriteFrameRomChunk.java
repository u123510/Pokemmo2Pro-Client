package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

public class SpriteFrameRomChunk extends BaseRomResourceChunk {
   public int rm0;
   public byte JO;
   public byte xg0;
   public int JX;
   public int COm6;
   public es_1 nN;
   public es_1 zq0;
   public es_1 iH;

   public final void pH(ByteBuffer var1, int... var2) {
      super.a00 = var1.getInt();
   }

   public final void vD(ByteBuffer var1) {
      if (var1.getInt() != 1414529101) {
         var1.position(((Buffer)var1).position() - 4);
         byte[] var4;
         var1.get(var4 = new byte[4]);
         System.out.println("NOT MPT header: " + (new String(var4)).trim());
      } else {
         this.rm0 = var1.getShort() & '\uffff';
         this.JO = var1.get();
         this.xg0 = var1.get();
         this.JX = var1.getShort() & '\uffff';
         this.COm6 = var1.getShort() & '\uffff';
         Supplier var2 = lb_0::new;
         this.iH = (new aux__1(var1, var2, super.a00)).Ks;
         var1.position(super.a00 + this.JX);
         this.nN = new es_1(this.JO);

         for(int var5 = 0; var5 < this.JO; ++var5) {
            es_1 var10000 = this.nN;
            byte[] var3;
            var1.get(var3 = new byte[16]);
            var10000.Ue0((new String(var3)).trim());
         }

         var1.position(super.a00 + this.COm6);
         this.zq0 = new es_1(this.xg0);

         for(int var6 = 0; var6 < this.xg0; ++var6) {
            es_1 var8 = this.zq0;
            byte[] var7;
            var1.get(var7 = new byte[16]);
            var8.Ue0((new String(var7)).trim());
         }

      }
   }
}
