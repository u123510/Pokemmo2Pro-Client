package cn.pokemmo.graphics.geometry;

import f.T1;
import f.YA;

public class GeometryTexturePair {
    public final T1 i6;

    public GeometryTexturePair() {
        this.i6 = null;
    }

    public GeometryTexturePair(T1 t1, YA yA) {
        this.i6 = t1;
    }

    public GeometryTexturePair(GeometryTexturePair lD0) {
        this.i6 = new T1(lD0.i6);
    }
}
