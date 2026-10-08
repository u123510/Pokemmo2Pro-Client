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
 * Renamed from f.ot
 */
public class ConvexHullCollisionGeometry extends BaseCollisionGeometry {
    @Override
    public final Bp0 ZA(float f, float f2, float f3, float f4) {
        P9.zg.x = f3;
        P9.zg.y = f2;
        return P9.zg;
    }
}

