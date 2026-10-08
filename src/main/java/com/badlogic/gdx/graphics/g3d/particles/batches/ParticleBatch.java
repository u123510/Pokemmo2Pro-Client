/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.es_1;
import f.hd0_2;
import f.ju_0;
import f.uh_1;

public interface ParticleBatch
extends uh_1,
ResourceData.Configurable {
    public void begin();

    public void draw(ParticleControllerRenderData var1);

    public void end();

    @Override
    public void save(hd0_2 var1, ResourceData var2);

    @Override
    public void load(hd0_2 var1, ResourceData var2);

    @Override
    public /* synthetic */ void getRenderables(es_1 var1, ju_0 var2);
}

