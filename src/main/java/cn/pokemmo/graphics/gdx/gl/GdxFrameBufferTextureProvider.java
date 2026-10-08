package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;

public class GdxFrameBufferTextureProvider {
    public final tl0_2 jf;
    public final I90 Ua0;
    public final long Bk0;
    public final int UJ0;
    public final tl0_2[] uC;
    public final I90[] UB0;

    public GdxFrameBufferTextureProvider(int base, int translationTable, int rotationTable, boolean single,
                  int count, ByteBuffer buffer) {
        if (single) {
            long reference = buffer.getInt();
            int position = buffer.position();
            this.Bk0 = 0L;
            this.UJ0 = 0;
            this.uC = null;
            this.UB0 = null;
            if ((reference >> 15) == 1L) {
                buffer.position(base + translationTable + (int)((reference & 32767L) * 6L));
                this.jf = new tl0_2(buffer);
                this.Ua0 = null;
            } else {
                buffer.position(base + rotationTable + (int)((reference & 32767L) * 10L));
                this.jf = null;
                this.Ua0 = new I90(buffer);
            }
            buffer.position(position);
            return;
        }

        this.jf = null;
        this.Ua0 = null;
        this.Bk0 = buffer.getInt() & 0xFFFFFFFFL;
        this.UJ0 = buffer.getInt();
        int position = buffer.position();
        this.uC = new tl0_2[count];
        this.UB0 = new I90[count];
        for (int i = 0; i < count; ++i) {
            buffer.position(i * 2 + this.UJ0 + base);
            short reference = buffer.getShort();
            if (((reference & 0xFFFF) >> 15) == 1) {
                int entryPosition = base + translationTable + (reference & 32767) * 6;
                if (buffer.limit() > entryPosition) {
                    buffer.position(entryPosition);
                }
                this.uC[i] = new tl0_2(buffer);
            } else {
                buffer.position(base + rotationTable + (reference & 32767) * 10);
                this.UB0[i] = new I90(buffer);
            }
        }
        buffer.position(position);
    }

    public final Matrix4 sd(int index) {
        if (this.UB0 == null && this.uC == null) {
            return this.jf == null ? this.Ua0.P9() : this.jf.lpT2();
        }

        long flags = this.Bk0;
        int limit = (int)((flags & 536805376L) >> 16);
        if ((flags & 3221225472L) == 0L) {
            return this.matrixAt(index);
        }

        if ((flags & 1073741824L) != 0L) {
            if ((index & 1) == 0) {
                return this.matrixAt(index >> 1);
            }
            if (index > limit) {
                return this.matrixAt((limit >> 1) + 1);
            }
            int first = index >> 1;
            return new Matrix4(RJ.Dw0(this.matrixAt(first).EW, this.matrixAt(first + 1).EW));
        }

        if ((flags & 2147483648L) == 0L) {
            return new Matrix4().F();
        }

        int remainder = index & 3;
        if (remainder == 0) {
            return this.matrixAt(index >> 2);
        }
        if (index > limit) {
            return this.matrixAt((limit >> 2) + remainder);
        }
        if ((index & 1) == 0) {
            int first = index >> 2;
            return new Matrix4(RJ.Dw0(this.matrixAt(first).EW, this.matrixAt(first + 1).EW));
        }

        int left;
        int right;
        if ((index & 2) != 0) {
            left = index >> 2;
            right = left + 1;
        } else {
            right = (left = index >> 2) + 1;
        }
        return this.cubic(this.matrixAt(left).EW, this.matrixAt(right).EW);
    }

    private Matrix4 matrixAt(int index) {
        tl0_2 packed = this.uC[index];
        return packed == null ? this.UB0[index].P9() : packed.lpT2();
    }

    private Matrix4 cubic(float[] first, float[] second) {
        kr0_0 curve = new kr0_0(first);
        curve.Jg(0, 0, curve.VD(0, 0) * 3.0f + second[0]);
        curve.Jg(1, 0, curve.VD(1, 0) * 3.0f + second[1]);
        curve.Jg(2, 0, curve.VD(2, 0) * 3.0f + second[2]);
        this.normalize(curve, 0);

        curve.Jg(0, 1, curve.VD(0, 1) * 3.0f + second[4]);
        curve.Jg(1, 1, curve.VD(1, 1) * 3.0f + second[5]);
        curve.Jg(2, 1, curve.VD(2, 1) * 3.0f + second[6]);
        this.normalize(curve, 1);

        curve.Jg(0, 2, curve.VD(0, 2) * 3.0f + second[8]);
        curve.Jg(1, 2, curve.VD(1, 2) * 3.0f + second[9]);
        curve.Jg(2, 2, curve.VD(2, 2) * 3.0f + second[10]);
        this.normalize(curve, 2);
        return new Matrix4(first);
    }

    private void normalize(kr0_0 curve, int column) {
        C8 vector = RJ.gn0;
        vector.x = curve.VD(0, column);
        vector.y = curve.VD(1, column);
        vector.z = curve.VD(2, column);
        vector.KM();
        curve.Jg(0, column, vector.x);
        curve.Jg(1, column, vector.y);
        curve.Jg(2, column, vector.z);
    }
}
