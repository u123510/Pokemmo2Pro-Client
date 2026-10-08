package cn.pokemmo.graphics.model;

import f.sl0_0;
import f.zy_0;
import java.nio.ByteBuffer;

/**
 * 关键帧样条曲线动画插值通道 (Keyframe Spline Animation Channel)
 * <p>
 * 原始混淆类: {@code f.O20}
 */
public class KeyframeSplineAnimationChannel {
    public final float sz;
    public final long ee;
    public final sl0_0[] Ri0;
    public final zy_0[] ce0;

    public KeyframeSplineAnimationChannel(ByteBuffer buffer, int offset, boolean constant, int count) {
        if (constant) {
            this.sz = (float) buffer.getInt() / 4096.0F;
            buffer.getInt();
            this.ee = 0L;
            this.Ri0 = null;
            this.ce0 = null;
            return;
        }

        long flags = (long) buffer.getInt();
        this.ee = flags & 4294967295L;
        int dataOffset = buffer.getInt();
        int restorePosition = buffer.position();
        buffer.position(dataOffset + offset);
        if ((flags & 536870912L) != 0L) {
            this.Ri0 = new sl0_0[count];
            for (int index = 0; index < count; index++) {
                this.Ri0[index] = new sl0_0(buffer);
            }
            this.ce0 = null;
        } else {
            this.ce0 = new zy_0[count];
            for (int index = 0; index < count; index++) {
                this.ce0[index] = new zy_0(buffer);
            }
            this.Ri0 = null;
        }
        this.sz = 0.0F;
        buffer.position(restorePosition);
    }

    public float evaluate(int index) {
        sl0_0[] shortValues = this.Ri0;
        if (shortValues == null && this.ce0 == null) {
            return this.sz;
        }

        long flags = this.ee;
        int limit = (int) ((flags & 536805376L) >> 16);
        if ((flags & 3221225472L) == 0L) {
            if (shortValues != null) {
                return shortValues[index].A2;
            }
            return this.ce0[index].C8;
        }

        if ((flags & 1073741824L) == 0L) {
            if ((flags & 2147483648L) == 0L) {
                return 1.0F;
            }

            int phase = index & 3;
            if (phase == 0) {
                if (shortValues != null) {
                    return shortValues[index >> 2].A2;
                }
                return this.ce0[index >> 2].C8;
            }
            if (index > limit) {
                if (shortValues != null) {
                    return shortValues[(limit >> 2) + phase].A2;
                }
                return this.ce0[(limit >> 2) + phase].C8;
            }
            if ((index & 1) != 0) {
                int first;
                int second;
                if ((index & 2) != 0) {
                    first = index >> 2;
                    second = first + 1;
                } else {
                    second = index >> 2;
                    first = second + 1;
                }
                if (shortValues != null) {
                    float firstValue = shortValues[first].A2;
                    float secondValue = shortValues[second].A2;
                    return (firstValue + firstValue + firstValue + secondValue) / 4.0F;
                }
                zy_0[] values = this.ce0;
                double firstValue = values[first].C8;
                double secondValue = values[second].C8;
                return (float) ((firstValue + firstValue + firstValue + secondValue) / 2.0D);
            }

            int base = index >> 2;
            if (shortValues != null) {
                return (shortValues[base].A2 + shortValues[base + 1].A2) / 2.0F;
            }
            zy_0[] values = this.ce0;
            return values[base].C8 / 2.0F + values[base + 1].C8 / 2.0F;
        }

        if ((index & 1) == 0) {
            if (shortValues != null) {
                return shortValues[index >> 1].A2;
            }
            return this.ce0[index >> 1].C8;
        }
        if (index > limit) {
            if (shortValues != null) {
                return shortValues[(limit >> 1) + 1].A2;
            }
            return this.ce0[(limit >> 1) + 1].C8;
        }
        if (shortValues != null) {
            return (shortValues[index >> 1].A2 + shortValues[(index >> 1) + 1].A2) / 2.0F;
        }
        zy_0[] values = this.ce0;
        return (values[index >> 1].C8 + values[(index >> 1) + 1].C8) / 2.0F;
    }

    public float cj0(int index) {
        return evaluate(index);
    }
}
