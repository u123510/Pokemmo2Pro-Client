package cn.pokemmo.graphics.render;

import f.*;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;

public class IndexedQuadMeshBatch {
    public final int RP;
    public final float em;
    public final float IK0;

    public IndexedQuadMeshBatch(ByteBuffer buffer) {
        this.RP = buffer.getShort() & 0xffff;
        this.em = buffer.getShort() / 4096.0f;
        this.IK0 = buffer.getShort() / 4096.0f;
    }

    public final Matrix4 lpT2() {
        float[] values = new float[16];
        values[15] = 1.0f;
        int axis = this.RP & 15;
        int parity = (this.RP >> 4) & 15;
        float sign = 1.0f;
        // The packed rotation stores the two non-axis components immediately
        // after the axis/parity bits.  The previous decompile left these as
        // zero constants, which produced a degenerate Matrix4 and broke the
        // 3D login background model.
        float x = this.em;
        float y = this.IK0;
        if (parity == 1 || parity == 3 || parity == 5 || parity == 7
                || parity == 9 || parity == 11 || parity == 13 || parity == 15) {
            sign = -1.0f;
        }
        float signedY = (parity == 2 || parity == 3 || parity == 6 || parity == 7
                || parity == 10 || parity == 11 || parity == 14 || parity == 15) ? -y : y;
        float signedX = (parity >= 4 && parity <= 7) || (parity >= 12 && parity <= 15) ? -x : x;

        switch (axis) {
            case 0:
                values[0] = sign;
                values[5] = x;
                values[6] = y;
                values[9] = signedY;
                values[10] = signedX;
                break;
            case 1:
                values[1] = sign;
                values[4] = x;
                values[6] = y;
                values[8] = signedY;
                values[10] = signedX;
                break;
            case 2:
                values[2] = sign;
                values[4] = x;
                values[5] = y;
                values[8] = signedY;
                values[9] = signedX;
                break;
            case 3:
                values[4] = sign;
                values[1] = x;
                values[2] = y;
                values[9] = signedY;
                values[10] = signedX;
                break;
            case 4:
                values[5] = sign;
                values[0] = x;
                values[2] = y;
                values[8] = signedY;
                values[10] = signedX;
                break;
            case 5:
                values[6] = sign;
                values[0] = x;
                values[1] = y;
                values[8] = signedY;
                values[9] = signedX;
                break;
            case 6:
                values[8] = sign;
                values[1] = x;
                values[2] = y;
                values[5] = signedY;
                values[6] = signedX;
                break;
            case 7:
                values[9] = sign;
                values[0] = x;
                values[2] = y;
                values[4] = signedY;
                values[6] = signedX;
                break;
            case 8:
                values[10] = sign;
                values[0] = x;
                values[1] = y;
                values[4] = signedY;
                values[5] = signedX;
                break;
            case 9:
                values[0] = -x;
                break;
            default:
                break;
        }
        return new Matrix4(values);
    }
}
