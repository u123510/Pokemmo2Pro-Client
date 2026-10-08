package cn.pokemmo.math;

import java.nio.ByteBuffer;

public class FixedPointShortScalar {
    public final float A2;

    public FixedPointShortScalar(ByteBuffer byteBuffer) {
        this.A2 = (float) byteBuffer.getShort() / 4096.0f;
        byteBuffer.getShort();
    }
}
