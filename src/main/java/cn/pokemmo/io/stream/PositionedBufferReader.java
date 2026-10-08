package cn.pokemmo.io.stream;

import java.nio.ByteBuffer;

public abstract class PositionedBufferReader {
    public short EY;
    public boolean r20;

    public PositionedBufferReader(ByteBuffer byteBuffer) {
        byteBuffer.position();
    }
}
