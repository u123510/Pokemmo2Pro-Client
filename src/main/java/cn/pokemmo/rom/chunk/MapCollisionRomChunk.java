package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;

public class MapCollisionRomChunk extends BaseRomResourceChunk {
    public int com8;
    public es_1 P2;

    public MapCollisionRomChunk() {
        super();
    }

    @Override
    public final void pH(ByteBuffer buffer, int... positions) {
        this.a00 = buffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer buffer) {
        buffer.getInt();
        this.com8 = buffer.getShort() & 65535;
        buffer.get();
        buffer.get();
        aux__1 records = new aux__1(buffer, lm0_0::new, this.a00);
        this.P2 = records.Ks;
    }
}
