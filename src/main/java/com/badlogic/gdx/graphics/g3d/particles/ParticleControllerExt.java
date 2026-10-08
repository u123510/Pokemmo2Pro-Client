/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.APSType;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter;
import com.badlogic.gdx.graphics.g3d.particles.emitters.TrailEmitter;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.TrailInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardRendererExt;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer;
import com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue;
import f.I2;
import f.es_1;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class ParticleControllerExt
extends ParticleController {
    public RangedNumericValue aps_texture_range = new RangedNumericValue();
    public APSType type = APSType.DEFAULT;
    public int aps_id = 5;
    public boolean repeat_x = false;
    public boolean repeat_y = false;
    public boolean flip_x = false;
    public boolean flip_y = false;
    public boolean mix = false;
    public boolean avg = false;
    public int trailController = -1;
    private boolean isChild = false;
    private ParticleControllerExt child;

    public ParticleControllerExt() {
    }

    public ParticleControllerExt(String string, Emitter emitter, ParticleControllerRenderer particleControllerRenderer, Influencer ... influencerArray) {
        super(string, emitter, particleControllerRenderer, influencerArray);
    }

    private void setTimeStep(float f) {
        float f2 = this.deltaTime = f;
        this.deltaTimeSqr = f2 * f2;
    }

    @Override
    public void update(float f) {
        ParticleControllerExt particleControllerExt = this;
        particleControllerExt.setTimeStep(f);
        particleControllerExt.emitter.update();
        I2 i2 = particleControllerExt.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).update();
        }
    }

    public void updateTrailController(ParticleControllerExt particleControllerExt) {
        this.child = particleControllerExt;
    }

    @Override
    public void start() {
        ParticleControllerExt particleControllerExt = this;
        super.start();
        if (particleControllerExt.child != null) {
            I2 i2 = particleControllerExt.influencers.ZD();
            while (i2.hasNext()) {
                Emitter emitter;
                Influencer influencer = (Influencer)i2.next();
                if (!(influencer instanceof TrailInfluencer) || !((emitter = particleControllerExt.child.emitter) instanceof TrailEmitter)) continue;
                ((TrailInfluencer)influencer).emitter = (TrailEmitter)emitter;
            }
        } else {
            I2 i2 = particleControllerExt.influencers.ZD();
            while (i2.hasNext()) {
                Influencer influencer = (Influencer)i2.next();
                if (!(influencer instanceof TrailInfluencer)) continue;
                ((TrailInfluencer)influencer).emitter = null;
            }
        }
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        if (oe_02.UJ0("type")) {
            this.type = (APSType)((Object)h4_0.Lpt6(gp_12, oe_02, "type", APSType.class, null));
        }
        this.aps_id = (Integer)h4_0.Lpt6(gp_12, oe_02, "aps", Integer.class, null);
        Class clazz = RangedNumericValue.class;
        oe_0 oe_03 = oe_02.Is("aps_texture_range");
        this.aps_texture_range = (RangedNumericValue)gp_12.b20(clazz, null, oe_03);
        if (oe_02.UJ0("repeat_x")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("repeat_x");
            this.repeat_x = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("repeat_y")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("repeat_y");
            this.repeat_y = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("flip_x")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("flip_x");
            this.flip_x = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("flip_y")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("flip_y");
            this.flip_y = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("mix")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("mix");
            this.mix = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("avg")) {
            clazz = Boolean.class;
            oe_03 = oe_02.Is("avg");
            this.avg = (Boolean)gp_12.b20(clazz, null, oe_03);
        }
        if (oe_02.UJ0("trailController")) {
            clazz = Integer.class;
            oe_03 = oe_02.Is("trailController");
            this.trailController = (Integer)gp_12.b20(clazz, null, oe_03);
        }
        super.read(gp_12, oe_02);
    }

    @Override
    public void write(gp_1 gp_12) {
        gp_1 gp_13 = gp_12;
        gp_12.v80((Object)this.type, "type");
        gp_12.v80(this.aps_id, "aps");
        gp_12.v80(this.aps_texture_range, "aps_texture_range");
        gp_12.v80(this.repeat_x, "repeat_x");
        gp_12.v80(this.repeat_y, "repeat_y");
        gp_12.v80(this.flip_x, "flip_x");
        gp_12.v80(this.flip_y, "flip_y");
        gp_12.v80(this.mix, "mix");
        gp_12.v80(this.avg, "avg");
        gp_13.v80(this.trailController, "trailController");
        super.write(gp_13);
    }

    @Override
    public ParticleControllerExt copy() {
        ParticleControllerExt particleControllerExt;
        ParticleControllerExt particleControllerExt2 = this;
        Emitter emitter = (Emitter)particleControllerExt2.emitter.copy();
        es_1 es_12 = particleControllerExt2.influencers;
        Influencer[] influencerArray = new Influencer[es_12.KB];
        int n = 0;
        I2 i2 = es_12.ZD();
        while (i2.hasNext()) {
            influencerArray[n++] = (Influencer)((Influencer)i2.next()).copy();
        }
        ParticleControllerExt particleControllerExt3 = particleControllerExt = new ParticleControllerExt(this.name, emitter, (ParticleControllerRenderer)this.renderer.copy(), influencerArray);
        particleControllerExt3.type = this.type;
        particleControllerExt3.aps_id = this.aps_id;
        particleControllerExt3.aps_texture_range.setLow(this.aps_texture_range.getLowMin(), this.aps_texture_range.getLowMax());
        particleControllerExt3.repeat_x = this.repeat_x;
        particleControllerExt3.repeat_y = this.repeat_y;
        particleControllerExt3.flip_x = this.flip_x;
        particleControllerExt3.flip_y = this.flip_y;
        particleControllerExt3.mix = this.mix;
        particleControllerExt3.avg = this.avg;
        particleControllerExt.trailController = this.trailController;
        return particleControllerExt;
    }

    @Override
    public void dispose() {
        ParticleControllerExt particleControllerExt = this;
        particleControllerExt.renderer.dispose();
        particleControllerExt.emitter.dispose();
        I2 i2 = particleControllerExt.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).dispose();
        }
    }

    public String toString() {
        return this.name;
    }

    public void setRenderer(ParticleControllerRenderer particleControllerRenderer) {
        this.renderer = particleControllerRenderer;
    }

    public BillboardRendererExt getRenderer() {
        return (BillboardRendererExt)this.renderer;
    }
}
