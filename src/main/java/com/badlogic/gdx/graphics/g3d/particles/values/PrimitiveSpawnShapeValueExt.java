/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValueExt;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValueExt;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public abstract class PrimitiveSpawnShapeValueExt
extends SpawnShapeValueExt {
    protected static final C8 TMP_V1 = new C8();
    public ScaledNumericValueExt spawnWidthValue;
    public ScaledNumericValueExt spawnHeightValue;
    public ScaledNumericValueExt spawnDepthValue;
    protected float spawnWidth;
    protected float spawnWidthDiff;
    protected float spawnHeight;
    protected float spawnHeightDiff;
    protected float spawnDepth;
    protected float spawnDepthDiff;
    boolean edges;

    public PrimitiveSpawnShapeValueExt() {
        this.edges = false;
        this.spawnWidthValue = new ScaledNumericValueExt();
        this.spawnHeightValue = new ScaledNumericValueExt();
        this.spawnDepthValue = new ScaledNumericValueExt();
    }

    public PrimitiveSpawnShapeValueExt(PrimitiveSpawnShapeValueExt primitiveSpawnShapeValueExt) {
        super(primitiveSpawnShapeValueExt);
        this.edges = false;
        this.spawnWidthValue = new ScaledNumericValueExt();
        this.spawnHeightValue = new ScaledNumericValueExt();
        this.spawnDepthValue = new ScaledNumericValueExt();
        this.edges = primitiveSpawnShapeValueExt.edges;
    }

    @Override
    public void setActive(boolean bl) {
        PrimitiveSpawnShapeValueExt primitiveSpawnShapeValueExt = this;
        super.setActive(bl);
        primitiveSpawnShapeValueExt.spawnWidthValue.setActive(true);
        primitiveSpawnShapeValueExt.spawnHeightValue.setActive(true);
        primitiveSpawnShapeValueExt.spawnDepthValue.setActive(true);
    }

    public boolean isEdges() {
        return this.edges;
    }

    public void setEdges(boolean bl) {
        this.edges = bl;
    }

    public ScaledNumericValueExt getSpawnWidth() {
        return this.spawnWidthValue;
    }

    public ScaledNumericValueExt getSpawnHeight() {
        return this.spawnHeightValue;
    }

    public ScaledNumericValueExt getSpawnDepth() {
        return this.spawnDepthValue;
    }

    public void setDimensions(float f, float f2, float f3) {
        PrimitiveSpawnShapeValueExt primitiveSpawnShapeValueExt = this;
        primitiveSpawnShapeValueExt.spawnWidthValue.setHigh(f);
        primitiveSpawnShapeValueExt.spawnHeightValue.setHigh(f2);
        primitiveSpawnShapeValueExt.spawnDepthValue.setHigh(f3);
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
        PrimitiveSpawnShapeValueExt shape = (PrimitiveSpawnShapeValueExt) particleValue;
        this.edges = shape.edges;
        this.spawnWidthValue.load(shape.spawnWidthValue);
        this.spawnHeightValue.load(shape.spawnHeightValue);
        this.spawnDepthValue.load(shape.spawnDepthValue);
    }

    @Override
    public void write(gp_1 gp_12) {
        PrimitiveSpawnShapeValueExt primitiveSpawnShapeValueExt = this;
        super.write(gp_12);
        gp_12.v80(primitiveSpawnShapeValueExt.spawnWidthValue, "spawnWidthValue");
        gp_12.v80(this.spawnHeightValue, "spawnHeightValue");
        gp_12.v80(this.spawnDepthValue, "spawnDepthValue");
        gp_12.v80(this.edges, "edges");
    }

    @Override
    public void read(gp_1 object, oe_0 oe_02) {
        super.read(object, oe_02);
        this.spawnWidthValue = (ScaledNumericValueExt) h4_0.Lpt6(
            object, oe_02, "spawnWidthValue", ScaledNumericValueExt.class, null);
        this.spawnHeightValue = (ScaledNumericValueExt) object.b20(
            ScaledNumericValueExt.class, null, oe_02.Is("spawnHeightValue"));
        this.spawnDepthValue = (ScaledNumericValueExt) object.b20(
            ScaledNumericValueExt.class, null, oe_02.Is("spawnDepthValue"));
        this.edges = (Boolean) object.b20(Boolean.TYPE, null, oe_02.Is("edges"));
    }

    public enum SpawnSide {
        both, top, bottom
    }
}
