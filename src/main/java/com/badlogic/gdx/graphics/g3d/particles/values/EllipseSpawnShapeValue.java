/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue;
import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue;
import f.C8;
import f.LW;
import f.O00;
import f.fe_2;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.oe_0;

public final class EllipseSpawnShapeValue
extends PrimitiveSpawnShapeValue {
    PrimitiveSpawnShapeValue.SpawnSide side = PrimitiveSpawnShapeValue.SpawnSide.both;

    public EllipseSpawnShapeValue(EllipseSpawnShapeValue ellipseSpawnShapeValue) {
        super(ellipseSpawnShapeValue);
        this.load(ellipseSpawnShapeValue);
    }

    public EllipseSpawnShapeValue() {
    }

    @Override
    public void spawnAux(C8 c8, float f) {
        EllipseSpawnShapeValue ellipseSpawnShapeValue = this;
        float f2 = ellipseSpawnShapeValue.spawnWidth;
        float f3 = ellipseSpawnShapeValue.spawnWidthDiff;
        f2 = hk0_0.gb0(ellipseSpawnShapeValue.spawnWidthValue, f, f3, f2);
        f3 = ellipseSpawnShapeValue.spawnHeight;
        float f4 = ellipseSpawnShapeValue.spawnHeightDiff;
        f3 = hk0_0.gb0(ellipseSpawnShapeValue.spawnHeightValue, f, f4, f3);
        f4 = ellipseSpawnShapeValue.spawnDepth;
        float f5 = ellipseSpawnShapeValue.spawnDepthDiff;
        f = hk0_0.gb0(ellipseSpawnShapeValue.spawnDepthValue, f, f5, f4);
        f4 = 0.0f;
        f5 = (float)Math.PI * 2;
        PrimitiveSpawnShapeValue.SpawnSide spawnSide = ellipseSpawnShapeValue.side;
        if (spawnSide == PrimitiveSpawnShapeValue.SpawnSide.top) {
            f5 = (float)Math.PI;
        } else if (spawnSide == PrimitiveSpawnShapeValue.SpawnSide.bottom) {
            f5 = (float)(-Math.PI);
        }
        float f6 = fe_2.Ga0(f5, f4, LW.Yu.nextFloat(), f4);
        if (this.edges) {
            if (f2 == 0.0f) {
                C8 c82 = c8;
                float f7 = f;
                float f8 = 0.0f;
                f = f3 / 2.0f;
                f = LW.Po0(f6) * f;
                f2 = f7 / 2.0f;
                f6 = LW.Fm0(f6) * f2;
                c82.x = f8;
                c82.y = f;
                c82.z = f6;
                return;
            }
            if (f3 == 0.0f) {
                C8 c83 = c8;
                float f9 = f;
                float f10 = f2 / 2.0f;
                f10 = LW.Fm0(f6) * f10;
                f = 0.0f;
                f2 = f9 / 2.0f;
                f6 = LW.Po0(f6) * f2;
                c83.x = f10;
                c83.y = f;
                c83.z = f6;
                return;
            }
            if (f == 0.0f) {
                C8 c84 = c8;
                float f11 = f2 / 2.0f;
                f11 = LW.Fm0(f6) * f11;
                f = f3 / 2.0f;
                float f12 = f11;
                f6 = LW.Po0(f6) * f;
                f11 = 0.0f;
                c84.x = f12;
                c84.y = f6;
                c84.z = f11;
                return;
            }
            float f13 = f;
            f = f2 / 2.0f;
            f2 = f3 / 2.0f;
            f3 = f13 / 2.0f;
        } else {
            O00 o00 = LW.Yu;
            f2 = o00.nextFloat() * (f2 / 2.0f);
            f3 = o00.nextFloat() * (f3 / 2.0f);
            f = o00.nextFloat() * (f / 2.0f);
            float f14 = f2;
            float f15 = f3;
            f3 = f;
            f2 = f15;
            f = f14;
        }
        C8 c85 = c8;
        float f16 = f2;
        float f17 = f;
        float f18 = LW.Yu.nextFloat() * 2.0f + -1.0f;
        f = (float)Math.sqrt(1.0f - f18 * f18);
        f2 = f17 * f;
        float f19 = f;
        f = LW.Fm0(f6) * f2;
        f2 = f16 * f19;
        f6 = LW.Po0(f6) * f2;
        f18 = f3 * f18;
        c85.x = f;
        c85.y = f6;
        c85.z = f18;
    }

    public PrimitiveSpawnShapeValue.SpawnSide getSide() {
        return this.side;
    }

    public void setSide(PrimitiveSpawnShapeValue.SpawnSide spawnSide) {
        this.side = spawnSide;
    }

    @Override
    public void load(ParticleValue particleValue) {
        super.load(particleValue);
        this.side = ((EllipseSpawnShapeValue)particleValue).side;
    }

    @Override
    public SpawnShapeValue copy() {
        return new EllipseSpawnShapeValue(this);
    }

    @Override
    public void write(gp_1 gp_12) {
        EllipseSpawnShapeValue ellipseSpawnShapeValue = this;
        super.write(gp_12);
        gp_12.v80((Object)ellipseSpawnShapeValue.side, "side");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        super.read(gp_12, oe_02);
        this.side = (PrimitiveSpawnShapeValue.SpawnSide)((Object)h4_0.Lpt6(gp_12, oe_02, "side", PrimitiveSpawnShapeValue.SpawnSide.class, null));
    }
}

