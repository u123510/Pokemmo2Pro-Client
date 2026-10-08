package cn.pokemmo.rom.nds.audio;

import f.*;
import java.nio.ByteBuffer;

/**
 * SDAT 符号表 (SYMB) 块解析器 (SDAT Symbol Block)
 * 
 * 职责:
 * 继承 SdatBlockSection, 解析 SDAT 中 SEQ、BANK、WAVEARC、PLAYER、GROUP、STREAM 等 8 大类符号名与偏移表。
 * 
 * 原混淆类: f.po0_0
 */

import java.nio.ByteBuffer;

public class SdatSymbolBlock extends qe0_0 {
    public final uu0[] Pp;

    public SdatSymbolBlock(hx_2 source) {
        super(source, source.oH0, source.ym);
        ByteBuffer buffer = this.X60();
        buffer.get(new byte[4]);
        buffer.getInt();
        int[] offsets = new int[8];
        for (int i = 0; i < offsets.length; i++) {
            offsets[i] = buffer.getInt();
        }
        buffer.position(buffer.position() + 24);
        xd_1[] factories = new xd_1[]{aq0_0::new, ik0_2::new, LPT9_::new, fl0_0::new,
                jg_1::new, kx_0::new, kf_2::new, RW::new};
        this.Pp = new uu0[8];
        for (int i = 0; i < this.Pp.length; i++) {
            buffer.position(offsets[i]);
            this.Pp[i] = new uu0(buffer, factories[i]);
        }
    }
}
