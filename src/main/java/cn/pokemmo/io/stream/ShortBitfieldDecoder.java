package cn.pokemmo.io.stream;

import java.nio.ByteBuffer;

public class ShortBitfieldDecoder {
    public final short E70;

    public ShortBitfieldDecoder(ByteBuffer byteBuffer) {
        this.E70 = byteBuffer.getShort();
    }

    public byte gs() {
        return (byte) (this.E70 >> 12 & 0xF);
    }
}
