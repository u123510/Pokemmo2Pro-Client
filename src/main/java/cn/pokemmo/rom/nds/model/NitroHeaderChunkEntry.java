package cn.pokemmo.rom.nds.model;

import f.t70_0;
import java.nio.ByteBuffer;

public class NitroHeaderChunkEntry {
    public final int Xb;
    public final byte new$;
    public final short ch;
    public final short Mu;
    public final short I1;
    public final short x0;
    public final short jH0;

    public NitroHeaderChunkEntry(ByteBuffer byteBuffer) {
        this.Xb = byteBuffer.getInt();
        this.new$ = t70_0.PZ((byte) byteBuffer.getShort());
        this.ch = byteBuffer.getShort();
        this.Mu = byteBuffer.getShort();
        byteBuffer.getShort();
        this.I1 = byteBuffer.getShort();
        this.x0 = byteBuffer.getShort();
        byteBuffer.getShort();
        this.jH0 = byteBuffer.getShort();
    }
}
