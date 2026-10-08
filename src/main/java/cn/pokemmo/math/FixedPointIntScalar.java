package cn.pokemmo.math;

import java.nio.ByteBuffer;

public class FixedPointIntScalar {
    public final float C8;

    public FixedPointIntScalar(ByteBuffer byteBuffer) {
        this.C8 = (float) byteBuffer.getInt() / 4096.0f;
        byteBuffer.getInt();
    }
}
