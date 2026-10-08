package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;

public class TextCharsetRomChunk extends BaseRomResourceChunk {
    public byte[] t70;
    public ByteBuffer l50;
    public int rg;
    public int mp0;
    public int fO;

    public TextCharsetRomChunk() {
        super();
        this.l50 = null;
        this.rg = 0;
    }

    public final void pH(ByteBuffer v1, int... v2) {
        this.a00 = v1.getInt();
    }

    public final void vD(ByteBuffer v1) {
        v1.getShort();
        v1.getShort();
        v1.getInt();
        int offset = v1.getInt();
        int len = v1.getInt();
        v1.position(this.a00 + offset);
        this.t70 = new byte[len];
        v1.get(this.t70);
    }
}
