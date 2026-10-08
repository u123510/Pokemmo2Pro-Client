package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class PaletteRomChunk extends BaseRomResourceChunk {
   public static final dl_1 Rj0 = Cq0.E1(PaletteRomChunk.class);
   public int VA0;
   public int er;
   public int[] qu;

   public final void pH(ByteBuffer var1, int... var2) {
      super.a00 = var1.getInt();
   }

   public final void vD(ByteBuffer var1) {
      if (var1.getInt() != 1447100502) {
         var1.position(((Buffer)var1).position() - 4);
         byte[] var4;
         var1.get(var4 = new byte[4]);
         dl_1 var10000 = Rj0;
         new String(var4);
         var10000.getClass();
      } else {
         this.VA0 = var1.getShort() & '\uffff';
         this.er = var1.getShort() & '\uffff';
         var1.getShort();
         var1.getShort();
         this.qu = new int[(this.VA0 * this.er >> 5) + 1];
         if (((Buffer)var1).remaining() / 4 < this.qu.length) {
            dl_1 var10002 = Rj0;
            int var10004 = ((Buffer)var1).remaining() / 4;
            int var10003 = this.qu.length;
            var10002.getClass();
            this.qu = new int[((Buffer)var1).remaining() / 4];
         }

         int[] var3;
         for(int var2 = 0; var2 < (var3 = this.qu).length; ++var2) {
            var3[var2] = var1.getInt();
         }

      }
   }
}
