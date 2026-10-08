/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.math;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import f.px_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.p8
 */
public class GdxMatrixBuffer {
    public final Matrix4 np = new Matrix4().F();
    public final Matrix4 cC0 = new Matrix4().F();

    public GdxMatrixBuffer(ByteBuffer byteBuffer) {
        int n;
        int n2;
        for (n2 = 0; n2 < 4; ++n2) {
            for (n = 0; n < 3; ++n) {
                this.np.EW[n2 * 4 + n] = px_1.Ei0(byteBuffer.getInt());
            }
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 3; ++n) {
                this.cC0.EW[n2 * 4 + n] = px_1.Ei0(byteBuffer.getInt());
            }
        }
    }
}

