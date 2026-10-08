package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;

public class GdxBoneTransformData {
    public final short[] wg0 = new short[5];

    public GdxBoneTransformData(ByteBuffer data) {
        for (int index = 0; index < this.wg0.length; index++) {
            this.wg0[index] = data.getShort();
        }
    }

    public final Matrix4 P9() {
        short packed = this.wg0[4];
        short a = (short)(packed >> 3);
        short b = (short)(this.wg0[0] >> 3);
        short c = (short)(this.wg0[1] >> 3);
        short d = (short)(this.wg0[2] >> 3);
        short e = (short)(this.wg0[3] >> 3);
        int assembled = (packed & 7) << 12
            | (this.wg0[0] & 7) << 9
            | (this.wg0[1] & 7) << 6
            | (this.wg0[2] & 7) << 3
            | (this.wg0[3] & 7);
        short f = (short)((short)(assembled << 3) >> 3);

        Matrix4 matrix = RJ.f7;
        matrix.F();
        float[] values = matrix.EW;
        float fb = b;
        float fc = c;
        float fd = d;
        float fe = e;
        float fa = a;
        float ff = f;
        values[0] = fb;
        values[1] = fc;
        values[2] = fd;
        values[4] = fe;
        values[5] = fa;
        values[6] = ff;

        C8 cross = RJ.gn0;
        float x = fc * ff - fd * fa;
        float y = fd * fe - fb * ff;
        float z = fb * fa - fc * fe;
        cross.x = x;
        cross.y = y;
        cross.z = z;
        values[8] = x / 4096.0f;
        values[9] = y / 4096.0f;
        values[10] = z / 4096.0f;
        return new Matrix4(matrix);
    }
}
