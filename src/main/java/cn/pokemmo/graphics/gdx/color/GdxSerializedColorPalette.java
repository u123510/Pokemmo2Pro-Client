package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.io.Serializable;

public class GdxSerializedColorPalette implements Serializable {
    private static final long serialVersionUID = 7907569533774959788L;
    public final float[] Z2;
    public final float[] Tf;

    public GdxSerializedColorPalette() {
        this.Z2 = new float[9];
        this.Tf = new float[9];
        this.Tf[8] = 1.0f;
        j6();
    }

    public GdxSerializedColorPalette(GdxSerializedColorPalette other) {
        this.Z2 = new float[9];
        this.Tf = new float[9];
        this.Tf[8] = 1.0f;
        pa0(other);
    }

    public GdxSerializedColorPalette(float[] values) {
        this.Z2 = new float[9];
        this.Tf = new float[9];
        this.Tf[8] = 1.0f;
        m90(values);
    }

    @Override
    public final String toString() {
        return "[" + this.Z2[0] + "|" + this.Z2[3] + "|" + this.Z2[6] + "]\n["
                + this.Z2[1] + "|" + this.Z2[4] + "|" + this.Z2[7] + "]\n["
                + this.Z2[2] + "|" + this.Z2[5] + "|" + this.Z2[8] + "]";
    }

    public GdxSerializedColorPalette aM() {
        float[] val = this.Z2;
        float v0 = val[0];
        float v1 = val[1];
        float v2 = val[2];
        float v3 = val[3];
        float v4 = val[4];
        float v5 = val[5];
        float v6 = val[6];
        float v7 = val[7];
        float v8 = val[8];

        float det = v0 * v4 * v8 + v3 * v7 * v2 + v6 * v1 * v5
                - v0 * v7 * v5 - v3 * v1 * v8 - v6 * v4 * v2;
        if (det == 0.0f) {
            throw new nf_1("Can't invert a singular matrix");
        }
        float invDet = 1.0f / det;

        float m00 = v4 * v8 - v5 * v7;
        float m10 = v2 * v7 - v1 * v8;
        float m20 = v1 * v5 - v2 * v4;
        float m01 = v5 * v6 - v3 * v8;
        float m11 = v0 * v8 - v2 * v6;
        float m21 = v2 * v3 - v0 * v5;
        float m02 = v3 * v7 - v4 * v6;
        float m12 = v1 * v6 - v0 * v7;
        float m22 = v0 * v4 - v1 * v3;

        val[0] = invDet * m00;
        val[1] = invDet * m10;
        val[2] = invDet * m20;
        val[3] = invDet * m01;
        val[4] = invDet * m11;
        val[5] = invDet * m21;
        val[6] = invDet * m02;
        val[7] = invDet * m12;
        val[8] = invDet * m22;

        return this;
    }

    public GdxSerializedColorPalette T4(Matrix4 mat) {
        float[] val = this.Z2;
        float[] m = mat.EW;
        val[0] = m[0];
        val[1] = m[1];
        val[2] = m[2];
        val[3] = m[4];
        val[4] = m[5];
        val[5] = m[6];
        val[6] = m[8];
        val[7] = m[9];
        val[8] = m[10];
        return this;
    }

    public GdxSerializedColorPalette Se0() {
        float[] val = this.Z2;
        float v1 = val[1];
        float v2 = val[2];
        float v3 = val[3];
        float v5 = val[5];
        float v6 = val[6];
        float v7 = val[7];
        val[3] = v1;
        val[6] = v2;
        val[1] = v3;
        val[7] = v5;
        val[2] = v6;
        val[5] = v7;
        return this;
    }

    public final void j6() {
        this.Z2[0] = 1.0f;
        this.Z2[1] = 0.0f;
        this.Z2[2] = 0.0f;
        this.Z2[3] = 0.0f;
        this.Z2[4] = 1.0f;
        this.Z2[5] = 0.0f;
        this.Z2[6] = 0.0f;
        this.Z2[7] = 0.0f;
        this.Z2[8] = 1.0f;
    }

    public final void Qt(C8 axis, float cos, float sin) {
        float[] val = this.Z2;
        float oc = 1.0f - cos;
        val[0] = oc * axis.x * axis.x + cos;
        val[3] = oc * axis.x * axis.y - axis.z * sin;
        val[6] = oc * axis.x * axis.z + axis.y * sin;
        val[1] = oc * axis.x * axis.y + axis.z * sin;
        val[4] = oc * axis.y * axis.y + cos;
        val[7] = oc * axis.y * axis.z - axis.x * sin;
        val[2] = oc * axis.x * axis.z - axis.y * sin;
        val[5] = oc * axis.y * axis.z + axis.x * sin;
        val[8] = oc * axis.z * axis.z + cos;
    }

    public final void pa0(GdxSerializedColorPalette other) {
        System.arraycopy(other.Z2, 0, this.Z2, 0, this.Z2.length);
    }

    public final void m90(float[] values) {
        System.arraycopy(values, 0, this.Z2, 0, this.Z2.length);
    }

    public static void mC(float[] mata, float[] matb) {
        float v00 = mata[0] * matb[0] + mata[3] * matb[1] + mata[6] * matb[2];
        float v01 = mata[0] * matb[3] + mata[3] * matb[4] + mata[6] * matb[5];
        float v02 = mata[0] * matb[6] + mata[3] * matb[7] + mata[6] * matb[8];

        float v10 = mata[1] * matb[0] + mata[4] * matb[1] + mata[7] * matb[2];
        float v11 = mata[1] * matb[3] + mata[4] * matb[4] + mata[7] * matb[5];
        float v12 = mata[1] * matb[6] + mata[4] * matb[7] + mata[7] * matb[8];

        float v20 = mata[2] * matb[0] + mata[5] * matb[1] + mata[8] * matb[2];
        float v21 = mata[2] * matb[3] + mata[5] * matb[4] + mata[8] * matb[5];
        float v22 = mata[2] * matb[6] + mata[5] * matb[7] + mata[8] * matb[8];

        mata[0] = v00;
        mata[1] = v10;
        mata[2] = v20;
        mata[3] = v01;
        mata[4] = v11;
        mata[5] = v21;
        mata[6] = v02;
        mata[7] = v12;
        mata[8] = v22;
    }
}
