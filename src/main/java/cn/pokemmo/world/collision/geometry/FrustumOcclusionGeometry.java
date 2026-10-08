/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.collision.geometry;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.world.collision.geometry.BaseCollisionGeometry;

import f.Bp0;
import f.P9;

/*
 * Renamed from f.xH0
 */
public class FrustumOcclusionGeometry extends BaseCollisionGeometry {
    @Override
    public final Bp0 ZA(float f, float f2, float f3, float f4) {
        float f5 = f4 / f3 > f2 / f ? f3 / f : f4 / f2;
        Bp0 bp0 = P9.zg;
        bp0.x = f * f5;
        bp0.y = f2 * f5;
        return bp0;
    }
}

