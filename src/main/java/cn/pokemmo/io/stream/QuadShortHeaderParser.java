package cn.pokemmo.io.stream;

import java.nio.ByteBuffer;

public class QuadShortHeaderParser {
    public QuadShortHeaderParser(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }
}
