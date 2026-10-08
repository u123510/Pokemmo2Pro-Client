package cn.pokemmo.rom.nds.model;

import f.Bp0;
import f.bc0_1;
import f.kh0_0;
import java.nio.ByteBuffer;

/**
 * NDS Nitro OAM 单元数据 (Nitro OAM Cell)
 * <p>
 * 原始混淆类: {@code f.dg_0}
 */
public class NitroOamCell {
    public final short XG;
    public final int Xh;
    public int wu0;
    public kh0_0[] R3;
    public kh0_0[] mm0;
    public final Bp0 Ix0;
    public final Bp0 Zw0;

    public NitroOamCell(bc0_1 bc0_12, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.Ix0 = new Bp0();
        this.Zw0 = new Bp0();
        this.XG = byteBuffer.getShort();
        byteBuffer2.getShort();
        this.Xh = byteBuffer2.getInt();
        if (bc0_12.v80 == 1) {
            ByteBuffer byteBuffer3 = byteBuffer;
            byteBuffer3.getShort();
            byteBuffer3.getShort();
            byteBuffer3.getShort();
            byteBuffer3.getShort();
        }
    }
}
