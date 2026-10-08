/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.O00;
import f.TG0;
import java.util.Random;

public final class RectangleSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
    private final Random random = new O00();

    public RectangleSpawnShapeValueExt(RectangleSpawnShapeValueExt value) {
        super(value);
        load(value);
    }

    public RectangleSpawnShapeValueExt() {
    }

    @Override
    public void reSeed() {
        super.reSeed();
        if (this.seed.isActive()) {
            this.random.setSeed(this.seed.getValue());
        }
    }

    @Override
    public void spawnAux(C8 vector, float percent) {
        float width = TG0.u9(this.spawnWidthValue, percent,
            this.spawnWidthDiff, this.spawnWidth);
        float height = TG0.u9(this.spawnHeightValue, percent,
            this.spawnHeightDiff, this.spawnHeight);
        float depth = TG0.u9(this.spawnDepthValue, percent,
            this.spawnDepthDiff, this.spawnDepth);

        if (this.edges) {
            int side = this.random.nextInt(3) - 1;
            float x = 0.0f;
            float y = 0.0f;
            float z = 0.0f;

            if (side == -1) {
                x = this.random.nextInt(2) == 0 ? -width / 2.0f : width / 2.0f;
                if (x == 0.0f) {
                    y = this.random.nextInt(2) == 0 ? -height / 2.0f : height / 2.0f;
                    z = this.random.nextInt(2) == 0 ? -depth / 2.0f : depth / 2.0f;
                } else {
                    y = this.random.nextFloat() * height - height / 2.0f;
                    z = this.random.nextFloat() * depth - depth / 2.0f;
                }
            } else if (side == 0) {
                z = this.random.nextInt(2) == 0 ? -depth / 2.0f : depth / 2.0f;
                if (z == 0.0f) {
                    y = this.random.nextInt(2) == 0 ? -height / 2.0f : height / 2.0f;
                    x = this.random.nextInt(2) == 0 ? -width / 2.0f : width / 2.0f;
                } else {
                    y = this.random.nextFloat() * height - height / 2.0f;
                    x = this.random.nextFloat() * width - width / 2.0f;
                }
            } else {
                y = this.random.nextInt(2) == 0 ? -height / 2.0f : height / 2.0f;
                if (y == 0.0f) {
                    x = this.random.nextInt(2) == 0 ? -width / 2.0f : width / 2.0f;
                    z = this.random.nextInt(2) == 0 ? -depth / 2.0f : depth / 2.0f;
                } else {
                    x = this.random.nextFloat() * width - width / 2.0f;
                    z = this.random.nextFloat() * depth - depth / 2.0f;
                }
            }

            vector.x = x;
            vector.y = y;
            vector.z = z;
        } else {
            vector.x = this.random.nextFloat() * width - width / 2.0f;
            vector.y = this.random.nextFloat() * height - height / 2.0f;
            vector.z = this.random.nextFloat() * depth - depth / 2.0f;
        }
    }

    @Override
    public SpawnShapeValueExt copy() {
        return new RectangleSpawnShapeValueExt(this);
    }
}
