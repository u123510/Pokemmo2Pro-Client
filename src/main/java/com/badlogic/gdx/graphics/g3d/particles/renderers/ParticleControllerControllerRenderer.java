/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer;
import f.nf_1;

public class ParticleControllerControllerRenderer
extends ParticleControllerRenderer {
    ParallelArray.ObjectChannel controllerChannel;

    @Override
    public void init() {
        this.controllerChannel = (ParallelArray.ObjectChannel)this.controller.particles.getChannel(ParticleChannels.ParticleController);
        if (this.controllerChannel != null) {
            return;
        }
        throw new nf_1("ParticleController channel not found, specify an influencer which will allocate it please.");
    }

    @Override
    public void update() {
        int n = this.controller.particles.size;
        for (int j = 0; j < n; ++j) {
            ((ParticleController[])this.controllerChannel.data)[j].draw();
        }
    }

    @Override
    public ParticleControllerComponent copy() {
        return new ParticleControllerControllerRenderer();
    }

    @Override
    public boolean isCompatible(ParticleBatch particleBatch) {
        return false;
    }
}

