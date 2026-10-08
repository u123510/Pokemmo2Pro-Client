/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.VD0;
import f.fy0_0;
import f.gp_1;
import f.hd0_2;
import f.i00_0;
import f.me0_2;
import f.oe_0;

public abstract class ParticleControllerComponent
implements fy0_0,
VD0,
ResourceData.Configurable {
    protected static final C8 TMP_V1 = new C8();
    protected static final C8 TMP_V2 = new C8();
    protected static final C8 TMP_V3 = new C8();
    protected static final C8 TMP_V4 = new C8();
    protected static final C8 TMP_V5 = new C8();
    protected static final C8 TMP_V6 = new C8();
    protected static final me0_2 TMP_Q = new me0_2();
    protected static final me0_2 TMP_Q2 = new me0_2();
    protected static final i00_0 TMP_M3 = new i00_0();
    protected static final Matrix4 TMP_M4 = new Matrix4();
    protected ParticleController controller;

    public void activateParticles(int n, int n2) {
    }

    public void killParticles(int n, int n2) {
    }

    public void update() {
    }

    public void init() {
    }

    public void start() {
    }

    public void end() {
    }

    @Override
    public void dispose() {
    }

    public abstract ParticleControllerComponent copy();

    public void allocateChannels() {
    }

    public void set(ParticleController particleController) {
        this.controller = particleController;
    }

    @Override
    public void save(hd0_2 hd0_22, ResourceData resourceData) {
    }

    @Override
    public void load(hd0_2 hd0_22, ResourceData resourceData) {
    }

    @Override
    public void write(gp_1 gp_12) {
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
    }
}

