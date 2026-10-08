package cn.pokemmo.rom.nds.model;

import f.dg_0;
import java.nio.ByteBuffer;

/**
 * NDS Nitro OAM 数据头 (Nitro OAM Data Header)
 * <p>
 * 原始混淆类: {@code f.bc0_1}
 */
public class NitroOamDataHeader {
    public final short j2;
    public final short v80;
    public final int Hp;
    public final int lN;
    public final int BZ;
    public final dg_0[] bL0;
    public int Nv;

    public NitroOamDataHeader(ByteBuffer byteBuffer) {
        short s;
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.get(new byte[4]);
        byteBuffer2.getInt();
        this.j2 = s = byteBuffer2.getShort();
        this.v80 = byteBuffer.getShort();
        this.Hp = byteBuffer.getInt();
        this.lN = byteBuffer.getInt();
        this.BZ = byteBuffer.getInt();
        byteBuffer.getLong();
        this.bL0 = new dg_0[s];
    }
}
