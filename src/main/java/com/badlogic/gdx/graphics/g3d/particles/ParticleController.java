/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer;
import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.I2;
import f.VD0;
import f.es_1;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.lg_0;
import f.ly0_0;
import f.me0_2;
import f.oe_0;

public class ParticleController
implements VD0,
ResourceData.Configurable {
    protected static final float DEFAULT_TIME_STEP = 0.016666668f;
    public String name;
    public Emitter emitter;
    public es_1 influencers;
    public ParticleControllerRenderer renderer;
    public ParallelArray particles;
    public ParticleChannels particleChannels;
    public Matrix4 transform;
    public C8 scale;
    protected ly0_0 boundingBox;
    public float deltaTime;
    public float deltaTimeSqr;

    public ParticleController() {
        this.transform = new Matrix4();
        this.scale = new C8(1.0f, 1.0f, 1.0f);
        this.influencers = new es_1(true, 3, Influencer.class);
        this.setTimeStep(0.016666668f);
    }

    public ParticleController(String string, Emitter emitter, ParticleControllerRenderer particleControllerRenderer, Influencer ... influencerArray) {
        this();
        this.name = string;
        this.emitter = emitter;
        this.renderer = particleControllerRenderer;
        this.particleChannels = new ParticleChannels();
        this.influencers = new es_1(influencerArray);
    }

    private void setTimeStep(float f) {
        float f2 = this.deltaTime = f;
        this.deltaTimeSqr = f2 * f2;
    }

    private int findIndex(Class clazz) {
        int n = 0;
        while (true) {
            es_1 es_12 = this.influencers;
            if (n >= es_12.KB) break;
            if (clazz.isAssignableFrom(((Influencer)es_12.get(n)).getClass())) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public void setTransform(Matrix4 matrix4) {
        ParticleController particleController = this;
        Matrix4 matrix42 = particleController.transform;
        matrix42.getClass();
        matrix42.Dd0(matrix4.EW);
        matrix4.qs0(particleController.scale);
    }

    public void setTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        ParticleController particleController = this;
        float f9 = f8;
        particleController.transform.oC(f, f2, f3, f4, f5, f6, f7, f9, f9, f9);
        C8 c8 = particleController.scale;
        c8.x = f8;
        c8.y = f8;
        particleController.scale.z = f8;
    }

    public void rotate(me0_2 me0_22) {
        this.transform.qt(me0_22);
    }

    public void rotate(C8 c8, float f) {
        this.transform.tO(c8, f);
    }

    public void translate(C8 c8) {
        Matrix4 matrix4 = this.transform;
        C8 c82 = c8;
        matrix4.getClass();
        float f = c82.x;
        float f2 = c82.y;
        float f3 = c82.z;
        matrix4.el0(f, f2, f3);
    }

    public void setTranslation(C8 c8) {
        this.transform.Y1(c8);
    }

    public void scale(float f, float f2, float f3) {
        ParticleController particleController = this;
        particleController.transform.w2(f, f2, f3);
        particleController.transform.qs0(this.scale);
    }

    public void scale(C8 c8) {
        C8 c82 = c8;
        float f = c82.x;
        float f2 = c82.y;
        float f3 = c82.z;
        this.scale(f, f2, f3);
    }

    public void mul(Matrix4 matrix4) {
        ParticleController particleController = this;
        Matrix4.md0(particleController.transform.EW, matrix4.EW);
        particleController.transform.qs0(this.scale);
    }

    public void getTransform(Matrix4 matrix4) {
        Matrix4 matrix42 = matrix4;
        Matrix4 matrix43 = this.transform;
        matrix42.getClass();
        matrix42.Dd0(matrix43.EW);
    }

    public boolean isComplete() {
        return this.emitter.isComplete();
    }

    public void init() {
        ParticleController particleController = this;
        particleController.bind();
        if (particleController.particles != null) {
            ParticleController particleController2 = this;
            particleController2.end();
            particleController2.particleChannels.resetIds();
        }
        ParticleController particleController3 = this;
        particleController3.allocateChannels(particleController3.emitter.maxParticleCount);
        particleController3.emitter.init();
        I2 i2 = particleController3.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).init();
        }
        this.renderer.init();
    }

    public void allocateChannels(int n) {
        ParticleController particleController = this;
        particleController.particles = new ParallelArray(n);
        particleController.emitter.allocateChannels();
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).allocateChannels();
        }
        this.renderer.allocateChannels();
    }

    public void bind() {
        ParticleController particleController = this;
        particleController.emitter.set(this);
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).set(this);
        }
        this.renderer.set(this);
    }

    public void start() {
        ParticleController particleController = this;
        particleController.emitter.start();
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).start();
        }
    }

    public void reset() {
        ParticleController particleController = this;
        particleController.end();
        particleController.start();
    }

    public void end() {
        I2 i2 = this.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).end();
        }
        this.emitter.end();
    }

    public void activateParticles(int n, int n2) {
        ParticleController particleController = this;
        particleController.emitter.activateParticles(n, n2);
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).activateParticles(n, n2);
        }
    }

    public void killParticles(int n, int n2) {
        ParticleController particleController = this;
        particleController.emitter.killParticles(n, n2);
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).killParticles(n, n2);
        }
    }

    public void update() {
        this.update(lg_0.S4.uL);
    }

    public void update(float f) {
        ParticleController particleController = this;
        particleController.setTimeStep(f);
        particleController.emitter.update();
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).update();
        }
    }

    public void draw() {
        if (this.particles.size > 0) {
            this.renderer.update();
        }
    }

    public ParticleController copy() {
        ParticleController particleController = this;
        Emitter emitter = (Emitter)particleController.emitter.copy();
        es_1 es_12 = particleController.influencers;
        Influencer[] influencerArray = new Influencer[es_12.KB];
        int n = 0;
        I2 i2 = es_12.ZD();
        while (i2.hasNext()) {
            influencerArray[n++] = (Influencer)((Influencer)i2.next()).copy();
        }
        return new ParticleController(new String(this.name), emitter, (ParticleControllerRenderer)this.renderer.copy(), influencerArray);
    }

    public void dispose() {
        ParticleController particleController = this;
        particleController.emitter.dispose();
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).dispose();
        }
    }

    public ly0_0 getBoundingBox() {
        if (this.boundingBox == null) {
            this.boundingBox = new ly0_0();
        }
        ParticleController particleController = this;
        particleController.calculateBoundingBox();
        return particleController.boundingBox;
    }

    public void calculateBoundingBox() {
        ParticleController particleController = this;
        particleController.boundingBox.zq();
        ParallelArray.FloatChannel floatChannel = (ParallelArray.FloatChannel)particleController.particles.getChannel(ParticleChannels.Position);
        int n = floatChannel.strideSize * this.particles.size;
        for (int j = 0; j < n; j += floatChannel.strideSize) {
            float[] fArray = floatChannel.data;
            float f = fArray[j];
            float f2 = fArray[j + 1];
            float f3 = floatChannel.data[j + 2];
            this.boundingBox.CoM9(f, f2, f3);
        }
    }

    public Influencer findInfluencer(Class clazz) {
        int n = this.findIndex(clazz);
        return n > -1 ? (Influencer)this.influencers.get(n) : null;
    }

    public void removeInfluencer(Class clazz) {
        int n = this.findIndex(clazz);
        if (n > -1) {
            this.influencers.Tx0(n);
        }
    }

    public boolean replaceInfluencer(Class clazz, Influencer influencer) {
        int n = this.findIndex(clazz);
        if (n > -1) {
            ParticleController particleController = this;
            particleController.influencers.P6(n, influencer);
            particleController.influencers.Tx0(n + 1);
            return true;
        }
        return false;
    }

    @Override
    public void write(gp_1 gp_12) {
        gp_12.v80(this.name, "name");
        gp_12.sg(Emitter.class, this.emitter, "emitter");
        gp_12.A2("influencers", this.influencers, es_1.class, Influencer.class);
        gp_12.sg(ParticleControllerRenderer.class, this.renderer, "renderer");
    }

    @Override
    public void read(gp_1 gp_12, oe_0 oe_02) {
        this.name = (String)h4_0.Lpt6(gp_12, oe_02, "name", String.class, null);
        this.emitter = (Emitter)gp_12.b20(Emitter.class, null, oe_02.Is("emitter"));
        es_1 readInfluencers = (es_1)gp_12.b20(es_1.class, Influencer.class, oe_02.Is("influencers"));
        this.influencers.G6(readInfluencers.rZ, 0, readInfluencers.KB);
        this.renderer = (ParticleControllerRenderer)gp_12.b20(ParticleControllerRenderer.class, null, oe_02.Is("renderer"));
    }

    @Override
    public void save(hd0_2 hd0_22, ResourceData resourceData) {
        ParticleController particleController = this;
        particleController.emitter.save(hd0_22, resourceData);
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).save(hd0_22, resourceData);
        }
        this.renderer.save(hd0_22, resourceData);
    }

    @Override
    public void load(hd0_2 hd0_22, ResourceData resourceData) {
        ParticleController particleController = this;
        particleController.emitter.load(hd0_22, resourceData);
        I2 i2 = particleController.influencers.ZD();
        while (i2.hasNext()) {
            ((Influencer)i2.next()).load(hd0_22, resourceData);
        }
        this.renderer.load(hd0_22, resourceData);
    }
}
