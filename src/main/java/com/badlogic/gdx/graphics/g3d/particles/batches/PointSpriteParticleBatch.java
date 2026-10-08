package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.PointSpriteControllerRenderData;
import f.BM;
import f.C8;
import f.I2;
import f.U30;
import f.W00;
import f.ap0_0;
import f.cr_2;
import f.es_1;
import f.hd0_2;
import f.hf_1;
import f.ju_0;
import f.kz_0;
import f.lg_0;
import f.ma_1;
import f.mz_2;
import f.sa_0;
import f.sh_0;

public class PointSpriteParticleBatch extends BufferedParticleBatch {
    private static boolean pointSpritesEnabled = false;
    protected static final C8 TMP_V1 = new C8();
    protected static final int sizeAndRotationUsage = 512;
    protected static final sa_0 CPU_ATTRIBUTES = new sa_0(
            new kz_0(1, 3, "a_position"),
            new kz_0(2, 4, "a_color"),
            new kz_0(16, 4, "a_region"),
            new kz_0(512, 3, "a_sizeAndRotation"));
    protected static final int CPU_VERTEX_SIZE = (short)(CPU_ATTRIBUTES.u5 / 4);
    protected static final int CPU_POSITION_OFFSET = (short)(CPU_ATTRIBUTES.r70(1).Kk0 / 4);
    protected static final int CPU_COLOR_OFFSET = (short)(CPU_ATTRIBUTES.r70(2).Kk0 / 4);
    protected static final int CPU_REGION_OFFSET = (short)(CPU_ATTRIBUTES.r70(16).Kk0 / 4);
    protected static final int CPU_SIZE_AND_ROTATION_OFFSET = (short)(CPU_ATTRIBUTES.r70(512).Kk0 / 4);

    private float[] vertices;
    W00 renderable;
    protected sh_0 blendingAttribute;
    protected ma_1 depthTestAttribute;

    private static void enablePointSprites() {
        lg_0.OH0.glEnable(34370);
        lg_0.k.getClass();
        lg_0.OH0.glEnable(34913);
        pointSpritesEnabled = true;
    }

    public PointSpriteParticleBatch() {
        this(1000);
    }

    public PointSpriteParticleBatch(int capacity) {
        this(capacity, new ParticleShader.Config(ParticleShader.ParticleType.Point));
    }

    public PointSpriteParticleBatch(int capacity, ParticleShader.Config config) {
        this(capacity, config, null, null);
    }

    public PointSpriteParticleBatch(int capacity, ParticleShader.Config config, sh_0 blendingAttribute, ma_1 depthTestAttribute) {
        super(PointSpriteControllerRenderData.class);
        if (!pointSpritesEnabled) enablePointSprites();
        this.blendingAttribute = blendingAttribute;
        this.depthTestAttribute = depthTestAttribute;
        if (this.blendingAttribute == null) this.blendingAttribute = new sh_0(1, 771, 1.0f);
        if (this.depthTestAttribute == null) this.depthTestAttribute = new ma_1(515, false);
        allocRenderable();
        ensureCapacity(capacity);
        this.renderable.st = new ParticleShader(this.renderable, config);
        this.renderable.st.init();
    }

    @Override
    public void allocParticlesData(int capacity) {
        this.vertices = new float[capacity * CPU_VERTEX_SIZE];
        ap0_0 mesh = this.renderable.VE0.m8;
        if (mesh != null) mesh.dispose();
        this.renderable.VE0.m8 = new ap0_0(false, capacity, 0, CPU_ATTRIBUTES);
    }

    public void allocRenderable() {
        this.renderable = new W00();
        U30 meshPart = this.renderable.VE0;
        meshPart.bJ0 = 0;
        meshPart.d30 = 0;
        this.renderable.ly = new BM(new hf_1[]{
                this.blendingAttribute,
                this.depthTestAttribute,
                new mz_2(mz_2.g7, (Texture)null)
        });
    }

    public void setTexture(Texture texture) {
        ((mz_2)this.renderable.ly.sg(mz_2.g7)).I3.uj = texture;
    }

    public Texture getTexture() {
        return (Texture)((mz_2)this.renderable.ly.sg(mz_2.g7)).I3.uj;
    }

    public sh_0 getBlendingAttribute() {
        return this.blendingAttribute;
    }

    @Override
    public void flush(int[] offsets) {
        int tp = 0;
        I2 iterator = this.renderData.ZD();
        while (iterator.hasNext()) {
            PointSpriteControllerRenderData data = (PointSpriteControllerRenderData)iterator.next();
            ParallelArray.FloatChannel scaleChannel = data.scaleChannel;
            ParallelArray.FloatChannel regionChannel = data.regionChannel;
            ParallelArray.FloatChannel positionChannel = data.positionChannel;
            ParallelArray.FloatChannel colorChannel = data.colorChannel;
            ParallelArray.FloatChannel rotationChannel = data.rotationChannel;
            int p = 0;
            while (p < data.controller.particles.size) {
                int offset = offsets[tp] * CPU_VERTEX_SIZE;
                int regionOffset = p * regionChannel.strideSize;
                int positionOffset = p * positionChannel.strideSize;
                int colorOffset = p * colorChannel.strideSize;
                int rotationOffset = p * rotationChannel.strideSize;

                this.vertices[offset + CPU_POSITION_OFFSET] = positionChannel.data[positionOffset];
                this.vertices[offset + CPU_POSITION_OFFSET + 1] = positionChannel.data[positionOffset + 1];
                this.vertices[offset + CPU_POSITION_OFFSET + 2] = positionChannel.data[positionOffset + 2];
                this.vertices[offset + CPU_COLOR_OFFSET] = colorChannel.data[colorOffset];
                this.vertices[offset + CPU_COLOR_OFFSET + 1] = colorChannel.data[colorOffset + 1];
                this.vertices[offset + CPU_COLOR_OFFSET + 2] = colorChannel.data[colorOffset + 2];
                this.vertices[offset + CPU_COLOR_OFFSET + 3] = colorChannel.data[colorOffset + 3];
                this.vertices[offset + CPU_SIZE_AND_ROTATION_OFFSET] = scaleChannel.data[p * scaleChannel.strideSize];
                this.vertices[offset + CPU_SIZE_AND_ROTATION_OFFSET + 1] = rotationChannel.data[rotationOffset];
                this.vertices[offset + CPU_SIZE_AND_ROTATION_OFFSET + 2] = rotationChannel.data[rotationOffset + 1];
                this.vertices[offset + CPU_REGION_OFFSET] = regionChannel.data[regionOffset];
                this.vertices[offset + CPU_REGION_OFFSET + 1] = regionChannel.data[regionOffset + 1];
                this.vertices[offset + CPU_REGION_OFFSET + 2] = regionChannel.data[regionOffset + 2];
                this.vertices[offset + CPU_REGION_OFFSET + 3] = regionChannel.data[regionOffset + 3];
                ++p;
                ++tp;
            }
        }
        U30 meshPart = this.renderable.VE0;
        meshPart.I8 = this.bufferedParticlesCount;
        meshPart.m8.COM6.ce0(0, this.bufferedParticlesCount * CPU_VERTEX_SIZE, this.vertices);
        this.renderable.VE0.TI0();
    }

    @Override
    public void getRenderables(es_1 renderables, ju_0 pool) {
        if (this.bufferedParticlesCount > 0) {
            renderables.Ue0(((W00)pool.obtain()).Pe(this.renderable));
        }
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        resources.createSaveData("pointSpriteBatch").saveAsset(manager.RV(this.getTexture()), Texture.class);
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData data = resources.getSaveData("pointSpriteBatch");
        if (data == null) return;
        cr_2 descriptor = data.loadAsset();
        synchronized (manager) {
            this.setTexture((Texture)manager.Og0(descriptor.wj, descriptor.RH0));
        }
    }
}
