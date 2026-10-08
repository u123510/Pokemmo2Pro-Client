package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;
import java.util.function.Supplier;

public class SoundSampleRomChunk extends BaseRomResourceChunk {
   public int Zj;
   public es_1 La0;

   public final void pH(ByteBuffer var1, int... var2) {
      super.a00 = var1.getInt();
   }

   public final void vD(ByteBuffer var1) {
      SoundSampleRomChunk var10000 = this;
      var1.getInt();
      this.Zj = var1.getShort();
      var1.getShort();
      SoundSampleRomChunk var10004 = this;
      Supplier var2 = zw_0::new;
      var10000.La0 = (new aux__1(var1, var2, var10004.a00)).Ks;
   }
}
