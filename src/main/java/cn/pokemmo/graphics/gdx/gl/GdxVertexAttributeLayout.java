package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.io.Serializable;

public class GdxVertexAttributeLayout implements Serializable {
    private static final long serialVersionUID = -1286036817192127343L;
    public static final C8 aux = new C8();
    public final C8 jG0;
    public final C8 Xa0;
    public final C8 Xm0;
    public final C8 ec0;

    public GdxVertexAttributeLayout() {
        this.jG0 = new C8();
        this.Xa0 = new C8();
        this.Xm0 = new C8();
        this.ec0 = new C8();
        zq();
    }

    public GdxVertexAttributeLayout(GdxVertexAttributeLayout v1) {
        this.jG0 = new C8();
        this.Xa0 = new C8();
        this.Xm0 = new C8();
        this.ec0 = new C8();
        return$(v1);
    }

    public GdxVertexAttributeLayout(C8 v1, C8 v2) {
        this.jG0 = new C8();
        this.Xa0 = new C8();
        this.Xm0 = new C8();
        this.ec0 = new C8();
        nF(v1, v2);
    }

    public static float t5(float f0, float f1) {
        if (f0 > f1) {
            f0 = f1;
        }
        return f0;
    }

    public static float f7(float f0, float f1) {
        if (f0 <= f1) {
            f0 = f1;
        }
        return f0;
    }

    public GdxVertexAttributeLayout nF(C8 v1, C8 v2) {
        float minX = v1.x < v2.x ? v1.x : v2.x;
        float minY = v1.y < v2.y ? v1.y : v2.y;
        float minZ = v1.z < v2.z ? v1.z : v2.z;
        this.jG0.x = minX;
        this.jG0.y = minY;
        this.jG0.z = minZ;

        float maxX = v1.x > v2.x ? v1.x : v2.x;
        float maxY = v1.y > v2.y ? v1.y : v2.y;
        float maxZ = v1.z > v2.z ? v1.z : v2.z;
        this.Xa0.x = maxX;
        this.Xa0.y = maxY;
        this.Xa0.z = maxZ;

        this.Xm0.np(this.jG0).na(this.Xa0.x, this.Xa0.y, this.Xa0.z).Fg0(0.5f);
        this.ec0.np(this.Xa0).Vy(this.jG0.x, this.jG0.y, this.jG0.z);
        return this;
    }

    public GdxVertexAttributeLayout br() {
        this.jG0.x = Float.POSITIVE_INFINITY;
        this.jG0.y = Float.POSITIVE_INFINITY;
        this.jG0.z = Float.POSITIVE_INFINITY;
        this.Xa0.x = Float.NEGATIVE_INFINITY;
        this.Xa0.y = Float.NEGATIVE_INFINITY;
        this.Xa0.z = Float.NEGATIVE_INFINITY;
        this.Xm0.x = 0.0f;
        this.Xm0.y = 0.0f;
        this.Xm0.z = 0.0f;
        this.ec0.x = 0.0f;
        this.ec0.y = 0.0f;
        this.ec0.z = 0.0f;
        return this;
    }

    public final boolean hC0(GdxVertexAttributeLayout v1) {
        if (this.jG0.x > this.Xa0.x || this.jG0.y > this.Xa0.y || this.jG0.z > this.Xa0.z) {
            return false;
        }
        float dx = Math.abs(this.Xm0.x - v1.Xm0.x);
        float lx = (this.ec0.x / 2.0f) + (v1.ec0.x / 2.0f);
        float dy = Math.abs(this.Xm0.y - v1.Xm0.y);
        float ly = (this.ec0.y / 2.0f) + (v1.ec0.y / 2.0f);
        float dz = Math.abs(this.Xm0.z - v1.Xm0.z);
        float lz = (this.ec0.z / 2.0f) + (v1.ec0.z / 2.0f);
        return dx <= lx && dy <= ly && dz <= lz;
    }

    public final boolean dL(C8 v1) {
        if (this.jG0.x > v1.x || this.Xa0.x < v1.x) {
            return false;
        }
        if (this.jG0.y > v1.y || this.Xa0.y < v1.y) {
            return false;
        }
        if (this.jG0.z > v1.z || this.Xa0.z < v1.z) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return "[" + this.jG0 + "|" + this.Xa0 + "]";
    }

    public final void return$(GdxVertexAttributeLayout v1) {
        nF(v1.jG0, v1.Xa0);
    }

    public final void Zi(C8 v1) {
        this.jG0.x = t5(this.jG0.x, v1.x);
        this.jG0.y = t5(this.jG0.y, v1.y);
        this.jG0.z = t5(this.jG0.z, v1.z);
        this.Xa0.x = Math.max(this.Xa0.x, v1.x);
        this.Xa0.y = Math.max(this.Xa0.y, v1.y);
        this.Xa0.z = Math.max(this.Xa0.z, v1.z);
        nF(this.jG0, this.Xa0);
    }

    public final void zq() {
        this.jG0.x = 0.0f;
        this.jG0.y = 0.0f;
        this.jG0.z = 0.0f;
        this.Xa0.x = 0.0f;
        this.Xa0.y = 0.0f;
        this.Xa0.z = 0.0f;
        nF(this.jG0, this.Xa0);
    }

    public final void qK0(GdxVertexAttributeLayout v1) {
        this.jG0.x = t5(this.jG0.x, v1.jG0.x);
        this.jG0.y = t5(this.jG0.y, v1.jG0.y);
        this.jG0.z = t5(this.jG0.z, v1.jG0.z);
        this.Xa0.x = f7(this.Xa0.x, v1.Xa0.x);
        this.Xa0.y = f7(this.Xa0.y, v1.Xa0.y);
        this.Xa0.z = f7(this.Xa0.z, v1.Xa0.z);
        nF(this.jG0, this.Xa0);
    }

    public final void R00(Matrix4 v1) {
        float minX = this.jG0.x;
        float minY = this.jG0.y;
        float minZ = this.jG0.z;
        float maxX = this.Xa0.x;
        float maxY = this.Xa0.y;
        float maxZ = this.Xa0.z;
        br();
        aux.x = minX;
        aux.y = minY;
        aux.z = minZ;
        Zi(aux.cu(v1));
        aux.x = minX;
        aux.y = minY;
        aux.z = maxZ;
        Zi(aux.cu(v1));
        aux.x = minX;
        aux.y = maxY;
        aux.z = minZ;
        Zi(aux.cu(v1));
        aux.x = minX;
        aux.y = maxY;
        aux.z = maxZ;
        Zi(aux.cu(v1));
        aux.x = maxX;
        aux.y = minY;
        aux.z = minZ;
        Zi(aux.cu(v1));
        aux.x = maxX;
        aux.y = minY;
        aux.z = maxZ;
        Zi(aux.cu(v1));
        aux.x = maxX;
        aux.y = maxY;
        aux.z = minZ;
        Zi(aux.cu(v1));
        aux.x = maxX;
        aux.y = maxY;
        aux.z = maxZ;
        Zi(aux.cu(v1));
    }

    public final void CoM9(float f1, float f2, float f3) {
        this.jG0.x = t5(this.jG0.x, f1);
        this.jG0.y = t5(this.jG0.y, f2);
        this.jG0.z = t5(this.jG0.z, f3);
        this.Xa0.x = f7(this.Xa0.x, f1);
        this.Xa0.y = f7(this.Xa0.y, f2);
        this.Xa0.z = f7(this.Xa0.z, f3);
        nF(this.jG0, this.Xa0);
    }
}
