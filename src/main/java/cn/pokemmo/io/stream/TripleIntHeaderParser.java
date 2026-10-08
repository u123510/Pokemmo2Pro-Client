package cn.pokemmo.io.stream;

import java.nio.ByteBuffer;

public class TripleIntHeaderParser {
    public final int S30;
    public final int Az0;
    public final int nN;

    public TripleIntHeaderParser(ByteBuffer byteBuffer) {
        this.S30 = byteBuffer.getInt();
        this.Az0 = byteBuffer.getInt();
        this.nN = byteBuffer.getInt();
    }
}
