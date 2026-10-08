package cn.pokemmo.rom.nds.audio;

import f.OL;
import f.hx_2;
import f.lh0_0;
import f.qe0_0;
import java.nio.ByteBuffer;

/**
 * SDAT 字符串/符号信息块 (SDAT String Block)
 * <p>
 * 原始混淆类: {@code f.Uz0}
 */
public class SdatStringBlock extends qe0_0 {
    public final OL[] Rw;

    public SdatStringBlock(hx_2 source) {
        super(source, source.is, source.Wo);
        ByteBuffer buffer = this.X60();
        buffer.get(new byte[4]);
        buffer.getInt();
        int[] offsets = new int[8];
        for (int index = 0; index < offsets.length; index++) {
            offsets[index] = buffer.getInt();
        }
        buffer.position(buffer.position() + 24);
        this.Rw = new OL[8];
        for (int index = 0; index < this.Rw.length; index++) {
            buffer.position(offsets[index]);
            this.Rw[index] = index == 1 ? new lh0_0(buffer) : new OL(buffer);
        }
    }
}
