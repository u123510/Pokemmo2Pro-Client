package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShader;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData;
import f.BM;
import f.C8;
import f.I2;
import f.TD;
import f.U30;
import f.W00;
import f.ap0_0;
import f.cr_2;
import f.es_1;
import f.hd0_2;
import f.hf_1;
import f.i00_0;
import f.ju_0;
import f.kz_0;
import f.ma_1;
import f.mz_2;
import f.o9_0;
import f.sa_0;
import f.sh_0;

public class BillboardParticleBatch extends BufferedParticleBatch {
    protected static final C8 TMP_V1 = new C8();
    protected static final C8 TMP_V2 = new C8();
    protected static final C8 TMP_V3 = new C8();
    protected static final C8 TMP_V4 = new C8();
    protected static final C8 TMP_V5 = new C8();
    protected static final C8 TMP_V6 = new C8();
    protected static final i00_0 TMP_M3 = new i00_0();
    protected static final int sizeAndRotationUsage = 512;
    protected static final int directionUsage = 1024;

    private static final sa_0 GPU_ATTRIBUTES = new sa_0(
            new kz_0(1, 3, "a_position"),
            new kz_0(16, 2, "a_texCoord0"),
            new kz_0(2, 4, "a_color"),
            new kz_0(512, 4, "a_sizeAndRotation"));
    private static final sa_0 CPU_ATTRIBUTES = new sa_0(
            new kz_0(1, 3, "a_position"),
            new kz_0(16, 2, "a_texCoord0"),
            new kz_0(2, 4, "a_color"));

    private static final int GPU_POSITION_OFFSET = (short)(GPU_ATTRIBUTES.r70(1).Kk0 / 4);
    private static final int GPU_UV_OFFSET = (short)(GPU_ATTRIBUTES.r70(16).Kk0 / 4);
    private static final int GPU_SIZE_ROTATION_OFFSET = (short)(GPU_ATTRIBUTES.r70(512).Kk0 / 4);
    private static final int GPU_COLOR_OFFSET = (short)(GPU_ATTRIBUTES.r70(2).Kk0 / 4);
    private static final int GPU_VERTEX_SIZE = GPU_ATTRIBUTES.u5 / 4;
    private static final int CPU_POSITION_OFFSET = (short)(CPU_ATTRIBUTES.r70(1).Kk0 / 4);
    private static final int CPU_UV_OFFSET = (short)(CPU_ATTRIBUTES.r70(16).Kk0 / 4);
    private static final int CPU_COLOR_OFFSET = (short)(CPU_ATTRIBUTES.r70(2).Kk0 / 4);
    private static final int CPU_VERTEX_SIZE = CPU_ATTRIBUTES.u5 / 4;
    private static final int MAX_PARTICLES_PER_MESH = 8191;
    private static final int MAX_VERTICES_PER_MESH = 32764;

    private RenderablePool renderablePool;
    private es_1 renderables;
    private float[] vertices;
    private short[] indices;
    private int currentVertexSize = 0;
    private sa_0 currentAttributes;
    protected boolean useGPU = false;
    protected ParticleShader.AlignMode mode = ParticleShader.AlignMode.Screen;
    protected Texture texture;
    protected sh_0 blendingAttribute;
    protected ma_1 depthTestAttribute;
    o9_0 shader;

    public BillboardParticleBatch(ParticleShader.AlignMode mode, boolean useGPU, int capacity, sh_0 blendingAttribute, ma_1 depthTestAttribute) {
        super(BillboardControllerRenderData.class);
        this.renderables = new es_1();
        this.renderablePool = new RenderablePool();
        this.blendingAttribute = blendingAttribute;
        this.depthTestAttribute = depthTestAttribute;
        if (this.blendingAttribute == null) this.blendingAttribute = new sh_0(770, 771, 1.0f);
        if (this.depthTestAttribute == null) this.depthTestAttribute = new ma_1(515, false);
        allocIndices();
        initRenderData();
        ensureCapacity(capacity);
        setUseGpu(useGPU);
        setAlignMode(mode);
    }

    public BillboardParticleBatch(ParticleShader.AlignMode mode, boolean useGPU, int capacity) {
        this(mode, useGPU, capacity, null, null);
    }

    public BillboardParticleBatch() {
        this(ParticleShader.AlignMode.Screen, false, 100);
    }

    public BillboardParticleBatch(int capacity) {
        this(ParticleShader.AlignMode.Screen, false, capacity);
    }

    private void allocIndices() {
        int indicesCount = MAX_PARTICLES_PER_MESH * 6;
        this.indices = new short[indicesCount];
        for (int i = 0, vertex = 0; i < indicesCount; i += 6, vertex += 4) {
            this.indices[i] = (short)vertex;
            this.indices[i + 1] = (short)(vertex + 1);
            this.indices[i + 2] = (short)(vertex + 2);
            this.indices[i + 3] = (short)(vertex + 2);
            this.indices[i + 4] = (short)(vertex + 3);
            this.indices[i + 5] = (short)vertex;
        }
    }

    private void allocRenderables(int capacity) {
        int required = (int)Math.ceil((double)capacity / (double)MAX_PARTICLES_PER_MESH);
        int free = this.renderablePool.getFree();
        if (free < required) {
            int missing = required - free;
            for (int i = 0; i < missing; ++i) this.renderablePool.free(this.renderablePool.newObject());
        }
    }

    private void allocShader() {
        W00 renderable = allocRenderable();
        this.shader = renderable.st = getShader(renderable);
        this.renderablePool.free(renderable);
    }

    private void clearRenderablesPool() {
        this.renderablePool.freeAll(this.renderables);
        int free = this.renderablePool.getFree();
        for (int i = 0; i < free; ++i) {
            ((W00)this.renderablePool.obtain()).VE0.m8.dispose();
        }
        this.renderables.clear();
    }

    private void initRenderData() {
        setVertexData();
        clearRenderablesPool();
        allocShader();
        resetCapacity();
    }

    private static void putVertex(float[] vertices, int offset, float x, float y, float z, float u, float v,
                                  float scaleX, float scaleY, float cosRotation, float sinRotation,
                                  float r, float g, float b, float a) {
        vertices[offset + GPU_POSITION_OFFSET] = x;
        vertices[offset + GPU_POSITION_OFFSET + 1] = y;
        vertices[offset + GPU_POSITION_OFFSET + 2] = z;
        vertices[offset + GPU_UV_OFFSET] = u;
        vertices[offset + GPU_UV_OFFSET + 1] = v;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET] = scaleX;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 1] = scaleY;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 2] = cosRotation;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 3] = sinRotation;
        vertices[offset + GPU_COLOR_OFFSET] = r;
        vertices[offset + GPU_COLOR_OFFSET + 1] = g;
        vertices[offset + GPU_COLOR_OFFSET + 2] = b;
        vertices[offset + GPU_COLOR_OFFSET + 3] = a;
    }

    private static void putVertex(float[] vertices, int offset, C8 position, float u, float v, float r, float g, float b, float a) {
        vertices[offset + CPU_POSITION_OFFSET] = position.x;
        vertices[offset + CPU_POSITION_OFFSET + 1] = position.y;
        vertices[offset + CPU_POSITION_OFFSET + 2] = position.z;
        vertices[offset + CPU_UV_OFFSET] = u;
        vertices[offset + CPU_UV_OFFSET + 1] = v;
        vertices[offset + CPU_COLOR_OFFSET] = r;
        vertices[offset + CPU_COLOR_OFFSET + 1] = g;
        vertices[offset + CPU_COLOR_OFFSET + 2] = b;
        vertices[offset + CPU_COLOR_OFFSET + 3] = a;
    }

    private void fillVerticesGPU(int[] offsets) {
        int tp = 0;
        I2 iterator = this.renderData.ZD();
        while (iterator.hasNext()) {
            BillboardControllerRenderData data = (BillboardControllerRenderData)iterator.next();
            ParallelArray.FloatChannel scaleChannel = data.scaleChannel;
            ParallelArray.FloatChannel regionChannel = data.regionChannel;
            ParallelArray.FloatChannel positionChannel = data.positionChannel;
            ParallelArray.FloatChannel colorChannel = data.colorChannel;
            ParallelArray.FloatChannel rotationChannel = data.rotationChannel;
            for (int p = 0, count = data.controller.particles.size; p < count; ++p, ++tp) {
                int baseOffset = offsets[tp] * this.currentVertexSize * 4;
                float scale = scaleChannel.data[p * scaleChannel.strideSize];
                int regionOffset = p * regionChannel.strideSize;
                int positionOffset = p * positionChannel.strideSize;
                int colorOffset = p * colorChannel.strideSize;
                int rotationOffset = p * rotationChannel.strideSize;
                float px = positionChannel.data[positionOffset];
                float py = positionChannel.data[positionOffset + 1];
                float pz = positionChannel.data[positionOffset + 2];
                float u = regionChannel.data[regionOffset];
                float v = regionChannel.data[regionOffset + 1];
                float u2 = regionChannel.data[regionOffset + 2];
                float v2 = regionChannel.data[regionOffset + 3];
                float sx = regionChannel.data[regionOffset + 4] * scale;
                float sy = regionChannel.data[regionOffset + 5] * scale;
                float r = colorChannel.data[colorOffset];
                float g = colorChannel.data[colorOffset + 1];
                float b = colorChannel.data[colorOffset + 2];
                float a = colorChannel.data[colorOffset + 3];
                float cos = rotationChannel.data[rotationOffset];
                float sin = rotationChannel.data[rotationOffset + 1];
                putVertex(this.vertices, baseOffset, px, py, pz, u, v2, -sx, -sy, cos, sin, r, g, b, a);
                baseOffset += this.currentVertexSize;
                putVertex(this.vertices, baseOffset, px, py, pz, u2, v2, sx, -sy, cos, sin, r, g, b, a);
                baseOffset += this.currentVertexSize;
                putVertex(this.vertices, baseOffset, px, py, pz, u2, v, sx, sy, cos, sin, r, g, b, a);
                baseOffset += this.currentVertexSize;
                putVertex(this.vertices, baseOffset, px, py, pz, u, v, -sx, sy, cos, sin, r, g, b, a);
            }
        }
    }

    private void fillVerticesToViewPointCPU(int[] offsets) {
        int tp = 0;
        I2 iterator = this.renderData.ZD();
        while (iterator.hasNext()) {
            BillboardControllerRenderData data = (BillboardControllerRenderData)iterator.next();
            ParallelArray.FloatChannel scaleChannel = data.scaleChannel;
            ParallelArray.FloatChannel regionChannel = data.regionChannel;
            ParallelArray.FloatChannel positionChannel = data.positionChannel;
            ParallelArray.FloatChannel colorChannel = data.colorChannel;
            ParallelArray.FloatChannel rotationChannel = data.rotationChannel;
            for (int p = 0, count = data.controller.particles.size; p < count; ++p, ++tp) {
                int baseOffset = offsets[tp] * this.currentVertexSize * 4;
                float scale = scaleChannel.data[p * scaleChannel.strideSize];
                int regionOffset = p * regionChannel.strideSize;
                int positionOffset = p * positionChannel.strideSize;
                int colorOffset = p * colorChannel.strideSize;
                int rotationOffset = p * rotationChannel.strideSize;
                float px = positionChannel.data[positionOffset];
                float py = positionChannel.data[positionOffset + 1];
                float pz = positionChannel.data[positionOffset + 2];
                float u = regionChannel.data[regionOffset];
                float v = regionChannel.data[regionOffset + 1];
                float u2 = regionChannel.data[regionOffset + 2];
                float v2 = regionChannel.data[regionOffset + 3];
                float sx = regionChannel.data[regionOffset + 4] * scale;
                float sy = regionChannel.data[regionOffset + 5] * scale;
                float r = colorChannel.data[colorOffset];
                float g = colorChannel.data[colorOffset + 1];
                float b = colorChannel.data[colorOffset + 2];
                float a = colorChannel.data[colorOffset + 3];
                float cos = rotationChannel.data[rotationOffset];
                float sin = rotationChannel.data[rotationOffset + 1];

                C8 look = TMP_V3.np(this.camera.v40).Vy(px, py, pz).KM();
                C8 right = TMP_V1.np(this.camera.St0).Xv0(look).KM();
                C8 up = TMP_V2.np(look).Xv0(right);
                right.Fg0(sx);
                up.Fg0(sy);

                if (cos != 1.0f) {
                    TMP_M3.Qt(look, cos, sin);
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x - up.x, -right.y - up.y, -right.z - up.z).Lf0(TMP_M3).na(px, py, pz), u, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x - up.x, right.y - up.y, right.z - up.z).Lf0(TMP_M3).na(px, py, pz), u2, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x + up.x, right.y + up.y, right.z + up.z).Lf0(TMP_M3).na(px, py, pz), u2, v, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x + up.x, -right.y + up.y, -right.z + up.z).Lf0(TMP_M3).na(px, py, pz), u, v, r, g, b, a);
                } else {
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x - up.x + px, -right.y - up.y + py, -right.z - up.z + pz), u, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x - up.x + px, right.y - up.y + py, right.z - up.z + pz), u2, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x + up.x + px, right.y + up.y + py, right.z + up.z + pz), u2, v, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x + up.x + px, -right.y + up.y + py, -right.z + up.z + pz), u, v, r, g, b, a);
                }
            }
        }
    }

    private void fillVerticesToScreenCPU(int[] offsets) {
        C8 look = TMP_V3.np(this.camera.jd0).Fg0(-1.0f);
        C8 rightBase = TMP_V4.np(this.camera.St0).Xv0(look).KM();
        C8 upBase = this.camera.St0;
        int tp = 0;
        I2 iterator = this.renderData.ZD();
        while (iterator.hasNext()) {
            BillboardControllerRenderData data = (BillboardControllerRenderData)iterator.next();
            ParallelArray.FloatChannel scaleChannel = data.scaleChannel;
            ParallelArray.FloatChannel regionChannel = data.regionChannel;
            ParallelArray.FloatChannel positionChannel = data.positionChannel;
            ParallelArray.FloatChannel colorChannel = data.colorChannel;
            ParallelArray.FloatChannel rotationChannel = data.rotationChannel;
            for (int p = 0, count = data.controller.particles.size; p < count; ++p, ++tp) {
                int baseOffset = offsets[tp] * this.currentVertexSize * 4;
                float scale = scaleChannel.data[p * scaleChannel.strideSize];
                int regionOffset = p * regionChannel.strideSize;
                int positionOffset = p * positionChannel.strideSize;
                int colorOffset = p * colorChannel.strideSize;
                int rotationOffset = p * rotationChannel.strideSize;
                float px = positionChannel.data[positionOffset];
                float py = positionChannel.data[positionOffset + 1];
                float pz = positionChannel.data[positionOffset + 2];
                float u = regionChannel.data[regionOffset];
                float v = regionChannel.data[regionOffset + 1];
                float u2 = regionChannel.data[regionOffset + 2];
                float v2 = regionChannel.data[regionOffset + 3];
                float sx = regionChannel.data[regionOffset + 4] * scale;
                float sy = regionChannel.data[regionOffset + 5] * scale;
                float r = colorChannel.data[colorOffset];
                float g = colorChannel.data[colorOffset + 1];
                float b = colorChannel.data[colorOffset + 2];
                float a = colorChannel.data[colorOffset + 3];
                float cos = rotationChannel.data[rotationOffset];
                float sin = rotationChannel.data[rotationOffset + 1];
                C8 right = TMP_V1.np(rightBase).Fg0(sx);
                C8 up = TMP_V2.np(upBase).Fg0(sy);

                if (cos != 1.0f) {
                    TMP_M3.Qt(look, cos, sin);
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x - up.x, -right.y - up.y, -right.z - up.z).Lf0(TMP_M3).na(px, py, pz), u, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x - up.x, right.y - up.y, right.z - up.z).Lf0(TMP_M3).na(px, py, pz), u2, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x + up.x, right.y + up.y, right.z + up.z).Lf0(TMP_M3).na(px, py, pz), u2, v, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x + up.x, -right.y + up.y, -right.z + up.z).Lf0(TMP_M3).na(px, py, pz), u, v, r, g, b, a);
                } else {
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x - up.x + px, -right.y - up.y + py, -right.z - up.z + pz), u, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x - up.x + px, right.y - up.y + py, right.z - up.z + pz), u2, v2, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(right.x + up.x + px, right.y + up.y + py, right.z + up.z + pz), u2, v, r, g, b, a);
                    baseOffset += this.currentVertexSize;
                    putVertex(this.vertices, baseOffset, TMP_V6.mf0(-right.x + up.x + px, -right.y + up.y + py, -right.z + up.z + pz), u, v, r, g, b, a);
                }
            }
        }
    }

    @Override
    public void allocParticlesData(int capacity) {
        this.vertices = new float[this.currentVertexSize * 4 * capacity];
        allocRenderables(capacity);
    }

    public W00 allocRenderable() {
        W00 renderable = new W00();
        U30 meshPart = renderable.VE0;
        meshPart.bJ0 = 4;
        meshPart.d30 = 0;
        renderable.ly = new BM(new hf_1[]{
                this.blendingAttribute,
                this.depthTestAttribute,
                new mz_2(mz_2.g7, this.texture)
        });
        renderable.VE0.m8 = new ap0_0(false, MAX_VERTICES_PER_MESH, MAX_PARTICLES_PER_MESH * 6, this.currentAttributes);
        renderable.VE0.m8.Sw0.Gy0(this.indices.length, this.indices);
        renderable.st = this.shader;
        return renderable;
    }

    public o9_0 getShader(W00 renderable) {
        o9_0 shader;
        if (this.useGPU) shader = new ParticleShader(renderable, new ParticleShader.Config(this.mode));
        else shader = new TD(renderable);
        shader.init();
        return shader;
    }

    public void setVertexData() {
        if (this.useGPU) {
            this.currentAttributes = GPU_ATTRIBUTES;
            this.currentVertexSize = GPU_VERTEX_SIZE;
        } else {
            this.currentAttributes = CPU_ATTRIBUTES;
            this.currentVertexSize = CPU_VERTEX_SIZE;
        }
    }

    public void setAlignMode(ParticleShader.AlignMode mode) {
        if (mode != this.mode) {
            this.mode = mode;
            if (this.useGPU) {
                initRenderData();
                allocRenderables(this.bufferedParticlesCount);
            }
        }
    }

    public ParticleShader.AlignMode getAlignMode() { return this.mode; }

    public void setUseGpu(boolean useGPU) {
        if (this.useGPU != useGPU) {
            this.useGPU = useGPU;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    public boolean isUseGPU() { return this.useGPU; }

    public void setTexture(Texture texture) {
        this.renderablePool.freeAll(this.renderables);
        this.renderables.clear();
        int free = this.renderablePool.getFree();
        for (int i = 0; i < free; ++i) {
            ((mz_2)((W00)this.renderablePool.obtain()).ly.sg(mz_2.g7)).I3.uj = texture;
        }
        this.texture = texture;
    }

    public Texture getTexture() { return this.texture; }
    public sh_0 getBlendingAttribute() { return this.blendingAttribute; }

    @Override
    public void begin() {
        super.begin();
        this.renderablePool.freeAll(this.renderables);
        this.renderables.clear();
    }

    @Override
    public void flush(int[] offsets) {
        if (this.useGPU) {
            fillVerticesGPU(offsets);
        } else if (this.mode == ParticleShader.AlignMode.Screen) {
            fillVerticesToScreenCPU(offsets);
        } else if (this.mode == ParticleShader.AlignMode.ViewPoint) {
            fillVerticesToViewPointCPU(offsets);
        }

        int verticesCount = this.bufferedParticlesCount * 4;
        int vertex = 0;
        while (vertex < verticesCount) {
            int startVertex = vertex;
            int batchVertexCount = Math.min(verticesCount - vertex, MAX_VERTICES_PER_MESH);
            W00 renderable = (W00)this.renderablePool.obtain();
            renderable.VE0.I8 = batchVertexCount / 4 * 6;
            int sourceOffset = this.currentVertexSize * vertex;
            int sourceCount = this.currentVertexSize * batchVertexCount;
            renderable.VE0.m8.COM6.ce0(sourceOffset, sourceCount, this.vertices);
            renderable.VE0.TI0();
            this.renderables.Ue0(renderable);
            vertex = startVertex + batchVertexCount;
        }
    }

    @Override
    public void getRenderables(es_1 renderables, ju_0 pool) {
        I2 iterator = this.renderables.ZD();
        while (iterator.hasNext()) {
            W00 renderable = (W00)iterator.next();
            renderables.Ue0(((W00)pool.obtain()).Pe(renderable));
        }
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData data = resources.createSaveData("billboardBatch");
        data.save("cfg", new Config(this.useGPU, this.mode));
        data.saveAsset(manager.RV(this.texture), Texture.class);
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData data = resources.getSaveData("billboardBatch");
        if (data == null) return;
        cr_2 descriptor = data.loadAsset();
        synchronized (manager) {
            setTexture((Texture)manager.Og0(descriptor.wj, descriptor.RH0));
            Config cfg = (Config)data.load("cfg");
            setUseGpu(cfg.useGPU);
            setAlignMode(cfg.mode);
        }
    }

    public static class Config {
        boolean useGPU;
        ParticleShader.AlignMode mode;

        public Config() {
        }

        public Config(boolean useGPU, ParticleShader.AlignMode mode) {
            this.useGPU = useGPU;
            this.mode = mode;
        }
    }

    public class RenderablePool extends ju_0 {
        @Override
        public W00 newObject() {
            return BillboardParticleBatch.this.allocRenderable();
        }
    }
}

