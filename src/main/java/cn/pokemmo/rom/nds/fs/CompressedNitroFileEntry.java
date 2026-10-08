package cn.pokemmo.rom.nds.fs;

import f.Ae;
import f.l70_0;
import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 压缩型 NitroFS 文件条目 (Compressed NitroFS File Entry)
 * 
 * 职责:
 * 继承 Ae (NitroFileEntry)，在通过 MH() 读取数据流时，自动调用 BlzDecompressor 进行逆向展开。
 * 
 * 原混淆类: f.J5
 */
public class CompressedNitroFileEntry extends Ae {
   public CompressedNitroFileEntry(AbstractNdsRom var1, String var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public final ByteBuffer MH(boolean var1) {
      ByteBuffer var2 = super.MH(var1);
      if (var1) {
         byte[] var3;
         var2.get(var3 = new byte[var2.remaining()]);
         var2 = ByteBuffer.wrap(l70_0.lF0(var3)).order(ByteOrder.LITTLE_ENDIAN);
      }

      return var2;
   }
}
