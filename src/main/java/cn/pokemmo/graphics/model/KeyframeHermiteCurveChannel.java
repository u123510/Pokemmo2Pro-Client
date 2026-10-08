package cn.pokemmo.graphics.model;

import f.px_1;
import java.nio.ByteBuffer;

/**
 * 关键帧 Hermite 样条曲线动画通道 (Keyframe Hermite Curve Channel)
 * <p>
 * 原始混淆类: {@code f.Gn0}
 */
public class KeyframeHermiteCurveChannel {
    public final boolean jn0;
    public final float Cn0;
    public final long zE0;
    public final float[] DH;

    public KeyframeHermiteCurveChannel(ByteBuffer buffer, int baseOffset, boolean constant, int valueCount) {
        if (constant) {
            this.Cn0 = px_1.f8(buffer.getInt());
            this.jn0 = true;
            this.zE0 = 0L;
            this.DH = null;
            return;
        }

        this.jn0 = false;
        this.Cn0 = 0.0F;
        long metadata = Integer.toUnsignedLong(buffer.getInt());
        this.zE0 = metadata;
        long offsetAndFlags = Integer.toUnsignedLong(buffer.getInt());
        int returnPosition = buffer.position();
        int targetPosition = (int) (offsetAndFlags + baseOffset);
        if (targetPosition > buffer.limit()) {
            targetPosition = buffer.limit();
        } else if (targetPosition < 0) {
            targetPosition = 0;
        }
        buffer.position(targetPosition);
        this.DH = new float[valueCount];

        if ((metadata & 536870912L) != 0L) {
            for (int i = 0; i < this.DH.length; ++i) {
                this.DH[i] = (float) buffer.getShort() / 4096.0F;
            }
        } else {
            for (int i = 0; i < this.DH.length; ++i) {
                if (!buffer.hasRemaining()) {
                    buffer.position(buffer.position() - 4);
                }
                this.DH[i] = (float) buffer.getInt() / 4096.0F;
            }
        }

        buffer.position(returnPosition);
    }

    public float evaluate(int index) {
        if (this.jn0) {
            return this.Cn0;
        }

        long metadata = this.zE0;
        int boundary = (int) ((metadata & 536805376L) >> 16);
        if ((metadata & 3221225472L) == 0L) {
            return this.DH[index];
        }

        if ((metadata & 1073741824L) != 0L) {
            if ((index & 1) == 0) {
                return this.DH[index >> 1];
            }
            if (index > boundary) {
                return this.DH[(boundary >> 1) + 1];
            }
            return this.DH[index >> 1] / 2.0F + this.DH[(index >> 1) + 1] / 2.0F;
        }

        if ((metadata & 2147483648L) == 0L) {
            return 0.0F;
        }

        int remainder = index & 3;
        if (remainder == 0) {
            return this.DH[index >> 2];
        }
        if (index > boundary) {
            return this.DH[(boundary >> 2) + remainder];
        }
        if ((index & 1) == 0) {
            return this.DH[index >> 2] / 2.0F + this.DH[(index >> 2) + 1] / 2.0F;
        }

        int first;
        int second;
        if ((index & 2) != 0) {
            first = index >> 2;
            second = first + 1;
        } else {
            second = index >> 2;
            first = second + 1;
        }
        float firstValue = this.DH[first];
        float secondValue = this.DH[second];
        return (firstValue + secondValue + firstValue + secondValue) / 4.0F;
    }

    public float lp0(int index) {
        return evaluate(index);
    }
}
