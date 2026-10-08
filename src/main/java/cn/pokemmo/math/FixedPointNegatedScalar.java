package cn.pokemmo.math;

import java.nio.ByteBuffer;

public class FixedPointNegatedScalar {
    public final float xU;

    public FixedPointNegatedScalar(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        float f = (float) (byteBuffer2.getShort() & 0xFFFF) / 65536.0f;
        this.xU = (float) (-byteBuffer2.getShort()) - f;
    }
}
