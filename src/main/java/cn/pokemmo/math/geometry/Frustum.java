package cn.pokemmo.math.geometry;

import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.kg_0;

public class Frustum {
    public static final float[] L6;
    public static final C8 V10;
    public final kg_0[] Bu;
    public final C8[] pp;
    public final float[] Tu0;

    public Frustum() {
        this.Bu = new kg_0[6];
        this.pp = new C8[8];
        for (int i = 0; i < this.pp.length; i++) {
            this.pp[i] = new C8();
        }
        this.Tu0 = new float[24];
        for (int i = 0; i < this.Bu.length; i++) {
            this.Bu[i] = new kg_0(new C8(), 0.0F);
        }
    }

    static {
        C8[] points = {
                new C8(-1.0F, -1.0F, -1.0F),
                new C8(1.0F, -1.0F, -1.0F),
                new C8(1.0F, 1.0F, -1.0F),
                new C8(-1.0F, 1.0F, -1.0F),
                new C8(-1.0F, -1.0F, 1.0F),
                new C8(1.0F, -1.0F, 1.0F),
                new C8(1.0F, 1.0F, 1.0F),
                new C8(-1.0F, 1.0F, 1.0F)
        };
        L6 = new float[24];
        int offset = 0;
        for (C8 point : points) {
            L6[offset++] = point.x;
            L6[offset++] = point.y;
            L6[offset++] = point.z;
        }
        V10 = new C8();
    }

    public void la(Matrix4 matrix) {
        System.arraycopy(L6, 0, this.Tu0, 0, this.Tu0.length);
        Matrix4.prj(matrix.EW, this.Tu0, 0, 8, 3);
        int offset = 0;
        for (int i = 0; i < this.pp.length; i++) {
            C8 point = this.pp[i];
            point.x = this.Tu0[offset++];
            point.y = this.Tu0[offset++];
            point.z = this.Tu0[offset++];
        }
        this.Bu[0].WT(this.pp[1], this.pp[0], this.pp[2]);
        this.Bu[1].WT(this.pp[4], this.pp[5], this.pp[7]);
        this.Bu[2].WT(this.pp[0], this.pp[4], this.pp[3]);
        this.Bu[3].WT(this.pp[5], this.pp[1], this.pp[6]);
        this.Bu[4].WT(this.pp[2], this.pp[3], this.pp[6]);
        this.Bu[5].WT(this.pp[4], this.pp[0], this.pp[1]);
    }
}
