package cn.pokemmo.graphics.geometry;

import f.GS;

public class TimestampedBoundingBox extends GS {
    public final long QL0;

    public TimestampedBoundingBox(long l, int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
        this.QL0 = l;
    }
}
