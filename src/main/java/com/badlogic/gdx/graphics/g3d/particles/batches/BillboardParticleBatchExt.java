package com.badlogic.gdx.graphics.g3d.particles.batches;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleShaderExt;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardControllerRenderData;
import f.BM;
import f.C8;
import f.I2;
import f.Tv0;
import f.U30;
import f.VG;
import f.W00;
import f.Ww0;
import f.ap0_0;
import f.es_1;
import f.fy0_0;
import f.hd0_2;
import f.hf_1;
import f.ju_0;
import f.kz_0;
import f.ma_1;
import f.mz_2;
import f.o9_0;
import f.sa_0;
import f.sh_0;
import f.xd_2;

public class BillboardParticleBatchExt extends BufferedParticleBatch implements fy0_0 {
    protected static final C8 TMP_V1 = new C8();
    protected static final int sizeAndRotationUsage = 512;
    protected static final int directionUsage = 1024;
    private static final sa_0 GPU_ATTRIBUTES = new sa_0(new kz_0[]{
            new kz_0(1, 3, "a_position"),
            new kz_0(16, 2, "a_texCoord0"),
            new kz_0(2, 4, "a_color"),
            new kz_0(512, 4, "a_sizeAndRotation")
    });
    private static final int GPU_POSITION_OFFSET = (short)(GPU_ATTRIBUTES.r70(1).Kk0 / 4);
    private static final int GPU_UV_OFFSET = (short)(GPU_ATTRIBUTES.r70(16).Kk0 / 4);
    private static final int GPU_SIZE_ROTATION_OFFSET = (short)(GPU_ATTRIBUTES.r70(512).Kk0 / 4);
    private static final int GPU_COLOR_OFFSET = (short)(GPU_ATTRIBUTES.r70(2).Kk0 / 4);
    private static final int GPU_VERTEX_SIZE = GPU_ATTRIBUTES.u5 / 4;
    private static final int MAX_PARTICLES_PER_MESH = 250;
    private static final int MAX_VERTICES_PER_MESH = 1000;

    private final RenderablePool renderablePool;
    private final es_1 renderables;
    private float[] vertices;
    private short[] indices;
    private int currentVertexSize = 0;
    private sa_0 currentAttributes;
    protected ParticleShaderExt.AlignMode mode = ParticleShaderExt.AlignMode.Screen;
    protected ParticleShaderExt.OriginPosition origin = ParticleShaderExt.OriginPosition.Middle;
    protected Texture texture;
    protected sh_0 blendingAttribute;
    protected ma_1 depthTestAttribute;
    private final Ww0 shaderProvider;
    o9_0 shader;
    private BM material;

    public BillboardParticleBatchExt(Ww0 shaderProvider, ParticleShaderExt.AlignMode alignMode, int capacity, sh_0 blendingAttribute, ma_1 depthTestAttribute) {
        super(BillboardControllerRenderData.class);
        this.shaderProvider = shaderProvider;
        this.renderables = new es_1();
        this.renderablePool = new RenderablePool();
        this.blendingAttribute = blendingAttribute;
        this.depthTestAttribute = depthTestAttribute;
        if (this.blendingAttribute == null) this.blendingAttribute = new sh_0(770, 771, 1.0f);
        if (this.depthTestAttribute == null) this.depthTestAttribute = new ma_1(515, false);
        this.material = new BM(new hf_1[]{this.blendingAttribute, this.depthTestAttribute});
        this.material.mi = VG.Mq(new StringBuilder(), this.material.mi, "_vfx");
        this.material.LPT8(new xd_2(xd_2.DK0, 6));
        this.currentAttributes = GPU_ATTRIBUTES;
        this.currentVertexSize = GPU_VERTEX_SIZE;
        this.mode = alignMode;
        allocIndices();
        ensureCapacity(capacity);
    }

    public BillboardParticleBatchExt(Ww0 shaderProvider, ParticleShaderExt.AlignMode alignMode, int capacity) {
        this(shaderProvider, alignMode, capacity, null, null);
    }

    public BillboardParticleBatchExt(Ww0 shaderProvider) {
        this(shaderProvider, true);
    }

    public BillboardParticleBatchExt(Ww0 shaderProvider, boolean initRenderData) {
        this(shaderProvider, ParticleShaderExt.AlignMode.Screen, 100);
        if (initRenderData) initRenderData();
    }

    private void allocIndices() {
        this.indices = new short[1500];
        int i = 0;
        int vertex = 0;
        while (i < this.indices.length) {
            short v0 = (short)vertex;
            short v2 = (short)(vertex + 2);
            this.indices[i] = v0;
            this.indices[i + 1] = (short)(vertex + 1);
            this.indices[i + 2] = v2;
            this.indices[i + 3] = v2;
            this.indices[i + 4] = (short)(vertex + 3);
            this.indices[i + 5] = v0;
            i += 6;
            vertex += 4;
        }
    }

    private void allocRenderables(int particlesCount) {
        int required = (int)Math.ceil((float)particlesCount / (float)MAX_PARTICLES_PER_MESH);
        int free = this.renderablePool.getFree();
        if (free < required) {
            int missing = required - free;
            for (int i = 0; i < missing; ++i) {
                this.renderablePool.free(this.renderablePool.newObject());
            }
        }
    }

    private o9_0 getShader(W00 renderable) {
        ParticleShaderExt shader = (ParticleShaderExt)renderable.st;
        if (shader != null && shader.canRender(renderable, this.mode, this.origin)) return shader;

        I2 iterator = this.shaderProvider.j60.ZD();
        while (iterator.hasNext()) {
            ParticleShaderExt candidate = (ParticleShaderExt)iterator.next();
            if (candidate.canRender(renderable, this.mode, this.origin)) return candidate;
        }

        ParticleShaderExt.Config config = new ParticleShaderExt.Config(this.mode, this.origin);
        ParticleShaderExt created = new ParticleShaderExt(renderable, config);
        created.init();
        this.shaderProvider.j60.Ue0(created);
        Ww0.rr.getClass();
        return created;
    }

    private void allocShader() {
        W00 renderable = allocRenderable();
        o9_0 shader = getShader(renderable);
        renderable.st = shader;
        this.shader = shader;
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

    private static void putVertex(float[] vertices, int offset, float x, float y, float z, float u, float v,
                                  float sizeX, float sizeY, float rotationCos, float rotationSin,
                                  float r, float g, float b, float a) {
        vertices[offset + GPU_POSITION_OFFSET] = x;
        vertices[offset + GPU_POSITION_OFFSET + 1] = y;
        vertices[offset + GPU_POSITION_OFFSET + 2] = z;
        vertices[offset + GPU_UV_OFFSET] = u;
        vertices[offset + GPU_UV_OFFSET + 1] = v;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET] = sizeX;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 1] = sizeY;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 2] = rotationCos;
        vertices[offset + GPU_SIZE_ROTATION_OFFSET + 3] = rotationSin;
        vertices[offset + GPU_COLOR_OFFSET] = r;
        vertices[offset + GPU_COLOR_OFFSET + 1] = g;
        vertices[offset + GPU_COLOR_OFFSET + 2] = b;
        vertices[offset + GPU_COLOR_OFFSET + 3] = a;
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
            int p = 0;
            int count = data.controller.particles.size;
            while (p < count) {
                int vertexOffset = offsets[tp] * this.currentVertexSize * 4;
                float halfWidth = regionChannel.data[p * regionChannel.strideSize + 4] * scaleChannel.data[p * scaleChannel.strideSize];
                float halfHeight = regionChannel.data[p * regionChannel.strideSize + 5] * scaleChannel.data[p * scaleChannel.strideSize + 1];
                int regionOffset = p * regionChannel.strideSize;
                int positionOffset = p * positionChannel.strideSize;
                int colorOffset = p * colorChannel.strideSize;
                int rotationOffset = p * rotationChannel.strideSize;
                float x = positionChannel.data[positionOffset];
                float y = positionChannel.data[positionOffset + 1];
                float z = positionChannel.data[positionOffset + 2];
                float u = regionChannel.data[regionOffset];
                float v = regionChannel.data[regionOffset + 1];
                float u2 = regionChannel.data[regionOffset + 2];
                float v2 = regionChannel.data[regionOffset + 3];
                float r = colorChannel.data[colorOffset];
                float g = colorChannel.data[colorOffset + 1];
                float b = colorChannel.data[colorOffset + 2];
                float a = colorChannel.data[colorOffset + 3];
                float cos = rotationChannel.data[rotationOffset];
                float sin = rotationChannel.data[rotationOffset + 1];

                putVertex(this.vertices, vertexOffset, x, y, z, u, v2, -halfWidth, -halfHeight, cos, sin, r, g, b, a);
                vertexOffset += this.currentVertexSize;
                putVertex(this.vertices, vertexOffset, x, y, z, u2, v2, halfWidth, -halfHeight, cos, sin, r, g, b, a);
                vertexOffset += this.currentVertexSize;
                putVertex(this.vertices, vertexOffset, x, y, z, u2, v, halfWidth, halfHeight, cos, sin, r, g, b, a);
                vertexOffset += this.currentVertexSize;
                putVertex(this.vertices, vertexOffset, x, y, z, u, v, -halfWidth, halfHeight, cos, sin, r, g, b, a);
                ++p;
                ++tp;
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
        long diffuse = mz_2.g7;
        if (!this.material.tM(diffuse)) this.material.LPT8(new mz_2(diffuse, this.texture));
        renderable.ly = this.material;
        renderable.VE0.m8 = new ap0_0(false, MAX_VERTICES_PER_MESH, this.indices.length, this.currentAttributes);
        renderable.VE0.m8.Sw0.Gy0(this.indices.length, this.indices);
        renderable.st = this.shader;
        return renderable;
    }

    public void initRenderData() {
        clearRenderablesPool();
        allocShader();
        resetCapacity();
    }

    public void setOriginPosition(ParticleShaderExt.OriginPosition originPosition) {
        if (originPosition != this.origin) {
            this.origin = originPosition;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    public ParticleShaderExt.OriginPosition getOriginPosition() {
        return this.origin;
    }

    public void setAlignMode(ParticleShaderExt.AlignMode alignMode) {
        if (alignMode != this.mode) {
            this.mode = alignMode;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    public ParticleShaderExt.AlignMode getAlignMode() {
        return this.mode;
    }

    public void setTexture(Texture texture) {
        long diffuse = mz_2.g7;
        if (this.material.tM(diffuse)) {
            ((mz_2)this.material.sg(diffuse)).I3.uj = texture;
        } else {
            this.material.LPT8(new mz_2(diffuse, texture));
        }
        this.texture = texture;
    }

    public Texture getTexture() {
        return this.texture;
    }

    @Override
    public void begin() {
        super.begin();
        this.renderablePool.freeAll(this.renderables);
        this.renderables.clear();
    }

    @Override
    public void flush(int[] offsets) {
        fillVerticesGPU(offsets);
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

    public void save(ResourceData.SaveData saveData, hd0_2 manager) {
        Config cfg = new Config(this.mode, this.origin);
        saveData.save("cfg", cfg);
    }

    public void load(ResourceData.SaveData saveData) {
        if (saveData != null) {
            Config cfg = (Config)saveData.load("cfg");
            this.mode = cfg.mode;
            this.origin = cfg.origin;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    @Override
    public void save(hd0_2 manager, ResourceData resourceData) {
    }

    @Override
    public void load(hd0_2 manager, ResourceData resourceData) {
        ResourceData.SaveData saveData = resourceData.getSaveData("billboardBatchExt");
        if (saveData != null) {
            Config cfg = (Config)saveData.load("cfg");
            this.mode = cfg.mode;
            this.origin = cfg.origin;
            initRenderData();
            allocRenderables(this.bufferedParticlesCount);
        }
    }

    @Override
    public void dispose() {
        clearRenderablesPool();
    }

    public Tv0 getCamera() {
        return this.camera;
    }

    public static class Config {
        ParticleShaderExt.AlignMode mode;
        ParticleShaderExt.OriginPosition origin;
        boolean useGPU;

        public Config() {
        }

        public Config(ParticleShaderExt.AlignMode mode, ParticleShaderExt.OriginPosition origin) {
            this.mode = mode;
            this.origin = origin;
        }
    }

    public class RenderablePool extends ju_0 {
        @Override
        public W00 newObject() {
            return BillboardParticleBatchExt.this.allocRenderable();
        }
    }
}
