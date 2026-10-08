/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles;

import f.fe_2;
import java.util.Random;

public class SeedRandom {
    public static int random(Random random, int n) {
        return random.nextInt(n + 1);
    }

    public static float random(Random random, float f, float f2) {
        return fe_2.Ga0(f2, f, random.nextFloat(), f);
    }

    public static float random(Random random, float f) {
        return random.nextFloat() * f;
    }
}

