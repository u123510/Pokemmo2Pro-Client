package cn.pokemmo.io.stream;

import java.io.ByteArrayOutputStream;

public class CustomByteArrayOutputStream extends ByteArrayOutputStream {
    public CustomByteArrayOutputStream() {
        super();
    }

    public CustomByteArrayOutputStream(int initialCapacity) {
        super(initialCapacity);
    }

    public final byte[] getBuffer() {
        return this.buf;
    }
}
