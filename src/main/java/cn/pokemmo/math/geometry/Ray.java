package cn.pokemmo.math.geometry;

import f.C8;
import java.io.Serializable;

public class Ray implements Serializable {
    private static final long serialVersionUID = -620692054835390878L;
    public final C8 er0;
    public final C8 Vq;

    public Ray() {
        this.er0 = new C8();
        this.Vq = new C8();
    }

    public Ray(C8 origin, C8 direction) {
        this.er0 = new C8();
        this.Vq = new C8();
        this.er0.np(origin);
        this.Vq.np(direction).KM();
    }

    @Override
    public String toString() {
        return "ray [" + this.er0 + ":" + this.Vq + "]";
    }

    @Override
    public boolean equals(Object value) {
        if (value == this) {
            return true;
        }
        if (value == null || !(value instanceof Ray)) {
            return false;
        }
        Ray other = (Ray) value;
        return this.Vq.equals(other.Vq) && this.er0.equals(other.er0);
    }

    @Override
    public int hashCode() {
        int result = (this.Vq.hashCode() + 73) * 73;
        return this.er0.hashCode() + result;
    }
}
