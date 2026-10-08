package cn.pokemmo.rom.nds.fs;

import f.J5;
import java.nio.ByteBuffer;

/**
 * NDS Nitro 归档分块信息 (Nitro Archive Block)
 * <p>
 * 原始混淆类: {@code f.wm_1}
 */
public class NitroArchiveBlock {
    public final int sk;
    public final int O7;
    public final int Sh0;
    public J5 G3;
    public final boolean Zx;

    public NitroArchiveBlock(boolean bl, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.sk = byteBuffer.getInt();
        this.O7 = byteBuffer.getInt();
        byteBuffer2.getInt();
        byteBuffer2.getInt();
        byteBuffer2.getInt();
        byteBuffer2.getInt();
        this.Sh0 = byteBuffer2.getInt();
        byteBuffer.getInt();
        this.Zx = bl;
    }

    public ByteBuffer AO() {
        return this.G3.MH(this.Zx);
    }
}
