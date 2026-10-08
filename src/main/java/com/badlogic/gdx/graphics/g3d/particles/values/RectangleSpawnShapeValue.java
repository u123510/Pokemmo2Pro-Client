/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import f.C8;
import f.LW;
import f.hk0_0;

public final class RectangleSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public RectangleSpawnShapeValue(RectangleSpawnShapeValue value) {
        super(value);
        load(value);
    }

    public RectangleSpawnShapeValue() {
    }

    @Override
    public void spawnAux(C8 vector, float percent) {
        float width = hk0_0.gb0(this.spawnWidthValue, percent,
            this.spawnWidthDiff, this.spawnWidth);
        float height = hk0_0.gb0(this.spawnHeightValue, percent,
            this.spawnHeightDiff, this.spawnHeight);
        float depth = hk0_0.gb0(this.spawnDepthValue, percent,
            this.spawnDepthDiff, this.spawnDepth);

        if (this.edges) {
            int side = (int) LW.Yu.nextLong(3) - 1;
            float x = 0.0f;
            float y = 0.0f;
            float z = 0.0f;

            if (side == -1) {
                x = LW.Yu.nextLong(2) == 0L ? -width / 2.0f : width / 2.0f;
                if (x == 0.0f) {
                    y = LW.Yu.nextLong(2) == 0L ? -height / 2.0f : height / 2.0f;
                    z = LW.Yu.nextLong(2) == 0L ? -depth / 2.0f : depth / 2.0f;
                } else {
                    y = LW.Yu.nextFloat() * height - height / 2.0f;
                    z = LW.Yu.nextFloat() * depth - depth / 2.0f;
                }
            } else if (side == 0) {
                z = LW.Yu.nextLong(2) == 0L ? -depth / 2.0f : depth / 2.0f;
                if (z == 0.0f) {
                    y = LW.Yu.nextLong(2) == 0L ? -height / 2.0f : height / 2.0f;
                    x = LW.Yu.nextLong(2) == 0L ? -width / 2.0f : width / 2.0f;
                } else {
                    y = LW.Yu.nextFloat() * height - height / 2.0f;
                    x = LW.Yu.nextFloat() * width - width / 2.0f;
                }
            } else {
                y = LW.Yu.nextLong(2) == 0L ? -height / 2.0f : height / 2.0f;
                if (y == 0.0f) {
                    x = LW.Yu.nextLong(2) == 0L ? -width / 2.0f : width / 2.0f;
                    z = LW.Yu.nextLong(2) == 0L ? -depth / 2.0f : depth / 2.0f;
                } else {
                    x = LW.Yu.nextFloat() * width - width / 2.0f;
                    z = LW.Yu.nextFloat() * depth - depth / 2.0f;
                }
            }

            vector.x = x;
            vector.y = y;
            vector.z = z;
        } else {
            vector.x = LW.Yu.nextFloat() * width - width / 2.0f;
            vector.y = LW.Yu.nextFloat() * height - height / 2.0f;
            vector.z = LW.Yu.nextFloat() * depth - depth / 2.0f;
        }
    }

    @Override
    public SpawnShapeValue copy() {
        return new RectangleSpawnShapeValue(this);
    }
}
