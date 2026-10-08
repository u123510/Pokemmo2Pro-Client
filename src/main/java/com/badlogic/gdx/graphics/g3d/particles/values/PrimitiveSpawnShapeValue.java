/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public abstract class PrimitiveSpawnShapeValue
extends SpawnShapeValue {
    protected static final C8 TMP_V1 = new C8();
    public ScaledNumericValue spawnWidthValue;
    public ScaledNumericValue spawnHeightValue;
    public ScaledNumericValue spawnDepthValue;
    protected float spawnWidth;
    protected float spawnWidthDiff;
    protected float spawnHeight;
    protected float spawnHeightDiff;
    protected float spawnDepth;
    protected float spawnDepthDiff;
    boolean edges = false;

    public PrimitiveSpawnShapeValue() {
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnDepthValue = new ScaledNumericValue();
    }

    public PrimitiveSpawnShapeValue(PrimitiveSpawnShapeValue primitiveSpawnShapeValue) {
        super(primitiveSpawnShapeValue);
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnDepthValue = new ScaledNumericValue();
    }

    @Override
    public void setActive(boolean bl) {
        PrimitiveSpawnShapeValue primitiveSpawnShapeValue = this;
        super.setActive(bl);
        primitiveSpawnShapeValue.spawnWidthValue.setActive(true);
        primitiveSpawnShapeValue.spawnHeightValue.setActive(true);
        primitiveSpawnShapeValue.spawnDepthValue.setActive(true);
    }

    public boolean isEdges() {
        return this.edges;
    }

    public void setEdges(boolean bl) {
        this.edges = bl;
    }

    public ScaledNumericValue getSpawnWidth() {
        return this.spawnWidthValue;
    }

    public ScaledNumericValue getSpawnHeight() {
        return this.spawnHeightValue;
    }

    public ScaledNumericValue getSpawnDepth() {
        return this.spawnDepthValue;
    }

    public void setDimensions(float f, float f2, float f3) {
        PrimitiveSpawnShapeValue primitiveSpawnShapeValue = this;
        primitiveSpawnShapeValue.spawnWidthValue.setHigh(f);
        primitiveSpawnShapeValue.spawnHeightValue.setHigh(f2);
        primitiveSpawnShapeValue.spawnDepthValue.setHigh(f3);
    }

    @Override
    public void start() {
        this.spawnWidth = this.spawnWidthValue.newLowValue();
        this.spawnWidthDiff = this.spawnWidthValue.newHighValue();
        if (!this.spawnWidthValue.isRelative()) {
            this.spawnWidthDiff -= this.spawnWidth;
        }
        this.spawnHeight = this.spawnHeightValue.newLowValue();
        this.spawnHeightDiff = this.spawnHeightValue.newHighValue();
        if (!this.spawnHeightValue.isRelative()) {
            this.spawnHeightDiff -= this.spawnHeight;
        }
        this.spawnDepth = this.spawnDepthValue.newLowValue();
        this.spawnDepthDiff = this.spawnDepthValue.newHighValue();
        if (!this.spawnDepthValue.isRelative()) {
            this.spawnDepthDiff -= this.spawnDepth;
        }
    }

    @Override
    public void load(com.badlogic.gdx.graphics.g3d.particles.values.ParticleValue particleValue) {
        super.load(particleValue);
        PrimitiveSpawnShapeValue shape = (PrimitiveSpawnShapeValue) particleValue;
        this.edges = shape.edges;
        this.spawnWidthValue.load(shape.spawnWidthValue);
        this.spawnHeightValue.load(shape.spawnHeightValue);
        this.spawnDepthValue.load(shape.spawnDepthValue);
    }

    @Override
    public void write(gp_1 gp_12) {
        PrimitiveSpawnShapeValue primitiveSpawnShapeValue = this;
        super.write(gp_12);
        gp_12.v80(primitiveSpawnShapeValue.spawnWidthValue, "spawnWidthValue");
        gp_12.v80(this.spawnHeightValue, "spawnHeightValue");
        gp_12.v80(this.spawnDepthValue, "spawnDepthValue");
        gp_12.v80(this.edges, "edges");
    }

    @Override
    public void read(gp_1 object, oe_0 oe_02) {
        super.read(object, oe_02);
        this.spawnWidthValue = (ScaledNumericValue) h4_0.Lpt6(
            object, oe_02, "spawnWidthValue", ScaledNumericValue.class, null);
        this.spawnHeightValue = (ScaledNumericValue) object.b20(
            ScaledNumericValue.class, null, oe_02.Is("spawnHeightValue"));
        this.spawnDepthValue = (ScaledNumericValue) object.b20(
            ScaledNumericValue.class, null, oe_02.Is("spawnDepthValue"));
        this.edges = (Boolean) object.b20(Boolean.TYPE, null, oe_02.Is("edges"));
    }

    public enum SpawnSide {
        both, top, bottom
    }
}
