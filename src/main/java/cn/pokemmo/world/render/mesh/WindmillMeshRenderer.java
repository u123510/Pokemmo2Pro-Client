package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.org.json.*;

public class WindmillMeshRenderer extends BaseMapMeshRenderer {
    public static final short[][] Gy0;
    public final Ou0 Mc0;
    public byte ht0;
    public byte NF0;
    public byte xM;
    public byte c70;
    public float Tr0;
    public float Wk0;
    public short Ud;

    static {
        Gy0 = new short[][]{
            {62, 39},
            {69, 39},
            {62, 81},
            {69, 81},
            {62, 107},
            {69, 107}
        };
    }

    public WindmillMeshRenderer(cb_0 cb_0Var) {
        super(cb_0Var);
        this.ht0 = 5;
        this.NF0 = 5;
        this.xM = 5;
        this.c70 = 0;
        this.Tr0 = 107.0f;
        this.Wk0 = 107.0f;
        this.Ud = 0;
        v80_0.Cb0().getClass();
        Ou0 vh = v80_0.VH(475);
        this.Mc0 = vh;
        vh.ho.m80(16.5f, 0.125f, this.Tr0 * 0.25f + 0.125f);
        vh.sY = false;
        yS(vh);
    }

    @Override
    public final void lpt1(float f1) {
        byte b = this.c70;
        if (b == 1) {
            this.Tr0 = (float) Gy0[this.NF0][1];
        } else if (b == 4) {
            this.Tr0 = (float) Gy0[this.xM][1];
        }
        E90 e90 = tw0_0.e60.jB0;
        if (e90 == null) {
            this.c70 = 0;
            return;
        }
        float targetZ = this.Tr0 * 0.25f + 0.125f;
        C8 c8 = new C8();
        this.Mc0.ho.V1(c8);
        float diffWk = Math.abs(c8.z - this.Wk0);
        float diffTarget = Math.abs(c8.z - targetZ);
        float minDiff = Math.min(diffWk, diffTarget);
        float speed;
        if (minDiff > 1.0f) {
            speed = 1.5f;
        } else if (minDiff > 0.25f) {
            speed = 1.0f;
        } else {
            speed = 0.5f;
        }
        if (LW.LH0(c8.z, targetZ)) {
            this.Wk0 = targetZ;
            if (this.Ud != 0) {
                tw0_0.RE0.Hq0((byte) 3, (short) 1755);
                this.Ud = 0;
            }
            byte b2 = this.c70;
            if (b2 == 1) {
                this.c70 = 2;
                this.ht0 = this.NF0;
            } else if (b2 == 4) {
                this.c70 = 5;
                this.ht0 = this.xM;
            }
        } else {
            if (this.Ud != 0 && diffWk >= 1.0f) {
                if (diffTarget < 1.0f) {
                    this.Ud = 1754;
                    tw0_0.RE0.Hq0((byte) 3, (short) 1754);
                    tw0_0.RE0.wp0((byte) 3, (short) 1753);
                }
            } else {
                this.Ud = 1753;
                tw0_0.RE0.Hq0((byte) 3, (short) 1755);
                tw0_0.RE0.Hq0((byte) 3, (short) 1753);
                tw0_0.RE0.wp0((byte) 3, (short) 1754);
            }
            float currentZ = c8.z;
            if (currentZ < targetZ) {
                float newZ = currentZ + lg_0.S4.uL * speed;
                c8.z = newZ;
                if (newZ > targetZ) {
                    c8.z = targetZ;
                }
            } else {
                float newZ = currentZ - lg_0.S4.uL * speed;
                c8.z = newZ;
                if (newZ < targetZ) {
                    c8.z = targetZ;
                }
            }
        }
        byte b3 = this.c70;
        if (b3 == 2) {
            zv_2 ba0 = e90.ba0;
            if (ba0.Lq0 < 63) {
                e90.il0.LE(new nk_0[]{nk_0.uU, nk_0.uU, nk_0.uU, nk_0.h8});
            } else {
                e90.il0.LE(new nk_0[]{nk_0.A70, nk_0.A70, nk_0.A70, nk_0.A70, nk_0.h8});
            }
            e90.il0.Cp(new Q5((f._strictfp)(Object)this, e90));
            this.c70 = 3;
        } else if (b3 == 5) {
            zv_2 ba0 = e90.ba0;
            short[][] gy0 = Gy0;
            short s2 = gy0[this.xM][1];
            byte b4 = (byte) ((this.xM & 1) != 0 ? 3 : 2);
            ba0.PX(false, (short) 65, s2, (byte) 0, b4);
            e90.il0.p6(e90.ba0);
            e90.il0.getClass();
            e90.il0.f60(null, false, C8.Zero);
            if (gy0[this.xM][0] < 63) {
                e90.il0.LE(new nk_0[]{nk_0.df, nk_0.A70, nk_0.A70, nk_0.A70});
            } else {
                e90.il0.LE(new nk_0[]{nk_0.df, nk_0.uU, nk_0.uU, nk_0.uU, nk_0.uU});
            }
            e90.il0.Cp(new PZ((f._strictfp)(Object)this));
            this.c70 = 6;
        }
        this.Mc0.ho.m80(16.5f, 0.125f, c8.z);
    }

    @Override
    public final void sn0(short[] v1) {
        if (v1.length < 1) {
            return;
        }
        if (v1[0] != 4624) {
            return;
        }
        byte targetFloor = (byte) v1[1];
        E90 e90 = tw0_0.e60.jB0;
        byte currentFloor = 0;
        if (e90 != null) {
            zv_2 ba0 = e90.ba0;
            for (byte i = 0; i < 6; i = (byte) (i + 1)) {
                short[] pos = Gy0[i];
                if (ba0.Lq0 == pos[0] && ba0.B5 == pos[1]) {
                    currentFloor = i;
                    break;
                }
            }
        }
        this.NF0 = currentFloor;
        this.xM = targetFloor;
        if ((currentFloor | 1) == (this.ht0 | 1)) {
            this.c70 = 2;
        } else {
            this.c70 = 1;
        }
        tw0_0.rl.xm = new sl0_2((f._strictfp)(Object)this);
    }
}
