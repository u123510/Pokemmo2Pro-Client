package cn.pokemmo.math.geometry;

import f.*;
import java.io.Serializable;

/** Normalized plane represented by a normal and the signed offset. */
public class CollisionPlane3D implements Serializable {
    private static final long serialVersionUID = -1240652082930747866L;
    public final C8 Nf;
    public float w2;

    public CollisionPlane3D() {
        this.Nf = new C8();
        this.w2 = 0.0f;
    }

    public CollisionPlane3D(C8 normal, float offset) {
        this.Nf = new C8().np(normal).KM();
        this.w2 = offset;
    }

    public CollisionPlane3D(C8 normal, C8 point) {
        this.Nf = new C8().np(normal).KM();
        this.w2 = -this.Nf.S60(point);
    }

    public CollisionPlane3D(C8 a, C8 b, C8 c) {
        this.Nf = new C8();
        this.w2 = 0.0f;
        this.WT(a, b, c);
    }

    public final void WT(C8 a, C8 b, C8 c) {
        this.Nf.np(a);
        this.Nf.Vy(b.x, b.y, b.z);
        float dx = b.x - c.x;
        float dy = b.y - c.y;
        float dz = b.z - c.z;
        float ax = this.Nf.x;
        float ay = this.Nf.y;
        float az = this.Nf.z;
        this.Nf.x = ay * dz - az * dy;
        this.Nf.y = az * dx - ax * dz;
        this.Nf.z = ax * dy - ay * dx;
        this.Nf.KM();
        this.w2 = -this.Nf.S60(a);
    }

    public final lpt2__2 OA(C8 point) {
        float value = this.Nf.S60(point) + this.w2;
        if (value == 0.0f) {
            return lpt2__2.Cr;
        }
        return value < 0.0f ? lpt2__2.Kj : lpt2__2.n9;
    }

    public final lpt2__2 Jj0(float x, float y, float z) {
        float value = this.Nf.x * x + this.Nf.y * y + this.Nf.z * z + this.w2;
        if (value == 0.0f) {
            return lpt2__2.Cr;
        }
        return value < 0.0f ? lpt2__2.Kj : lpt2__2.n9;
    }

    @Override
    public final String toString() {
        return this.Nf + ", " + this.w2;
    }
}
