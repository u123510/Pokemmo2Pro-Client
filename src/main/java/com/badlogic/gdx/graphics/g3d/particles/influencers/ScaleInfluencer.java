/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.influencers.SimpleInfluencer;
import f.hk0_0;

public class ScaleInfluencer
extends SimpleInfluencer {
    public ScaleInfluencer() {
        this.valueChannelDescriptor = ParticleChannels.Scale;
    }

    public ScaleInfluencer(ScaleInfluencer scaleInfluencer) {
        super(scaleInfluencer);
    }

    @Override
    public void activateParticles(int n, int n2) {
        if (this.value.isRelative()) {
            int n3 = n2;
            int n4 = n;
            n = this.valueChannel.strideSize;
            n2 = n4 * n;
            int n5 = n4 * this.interpolationChannel.strideSize;
            n = n3 * n + n2;
            while (n2 < n) {
                float f = this.value.newLowValue() * this.controller.scale.x;
                float f2 = this.value.newHighValue() * this.controller.scale.x;
                this.interpolationChannel.data[n5] = f;
                this.interpolationChannel.data[n5 + 1] = f2;
                this.valueChannel.data[n2] = hk0_0.gb0(this.value, 0.0f, f2, f);
                n2 += this.valueChannel.strideSize;
                n5 += this.interpolationChannel.strideSize;
            }
        } else {
            int n6 = n2;
            int n7 = n;
            n = this.valueChannel.strideSize;
            n2 = n7 * n;
            int n8 = n7 * this.interpolationChannel.strideSize;
            n = n6 * n + n2;
            while (n2 < n) {
                float f = this.value.newLowValue() * this.controller.scale.x;
                float f3 = this.value.newHighValue() * this.controller.scale.x - f;
                this.interpolationChannel.data[n8] = f;
                this.interpolationChannel.data[n8 + 1] = f3;
                this.valueChannel.data[n2] = hk0_0.gb0(this.value, 0.0f, f3, f);
                n2 += this.valueChannel.strideSize;
                n8 += this.interpolationChannel.strideSize;
            }
        }
    }

    @Override
    public ParticleControllerComponent copy() {
        return new ScaleInfluencer(this);
    }
}

