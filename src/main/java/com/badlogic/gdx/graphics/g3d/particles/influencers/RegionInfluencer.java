package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.D30;
import f.I2;
import f.LPT6_;
import f.LW;
import f.cr_2;
import f.es_1;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;
import f.yo_2;

public abstract class RegionInfluencer extends Influencer {
    private static final String ASSET_DATA = "atlasAssetData";
    public es_1 regions;
    ParallelArray.FloatChannel regionChannel;
    public String atlasName;

    public RegionInfluencer(int capacity) {
        this.regions = new es_1(false, capacity, AspectTextureRegion.class);
    }

    public RegionInfluencer() {
        this(1);
        AspectTextureRegion region = new AspectTextureRegion();
        region.u = 0.0f;
        region.v = 0.0f;
        region.u2 = 1.0f;
        region.v2 = 1.0f;
        region.halfInvAspectRatio = 0.5f;
        this.regions.Ue0(region);
    }

    public RegionInfluencer(LPT6_... regions) {
        this.regions = new es_1(false, regions.length, AspectTextureRegion.class);
        setAtlasName(null);
        add(regions);
    }

    public RegionInfluencer(Texture texture) {
        this(new LPT6_(texture));
    }

    public RegionInfluencer(RegionInfluencer source) {
        this(source.regions.KB);
        this.regions.Bv(source.regions.KB);
        for (int i = 0; i < source.regions.KB; ++i) {
            this.regions.Ue0(new AspectTextureRegion((AspectTextureRegion)source.regions.get(i)));
        }
    }

    public void setAtlasName(String atlasName) {
        this.atlasName = atlasName;
    }

    public void add(LPT6_... regions) {
        this.regions.Bv(regions.length);
        for (LPT6_ region : regions) this.regions.Ue0(new AspectTextureRegion(region));
    }

    public void clear() {
        this.atlasName = null;
        this.regions.clear();
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        super.load(manager, resources);
        ResourceData.SaveData saveData = resources.getSaveData(ASSET_DATA);
        if (saveData == null) return;
        cr_2 descriptor = saveData.loadAsset();
        D30 atlas;
        synchronized (manager) {
            atlas = (D30)manager.Og0(descriptor.wj, descriptor.RH0);
        }
        I2 iterator = this.regions.ZD();
        while (iterator.hasNext()) ((AspectTextureRegion)iterator.next()).updateUV(atlas);
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        super.save(manager, resources);
        if (this.atlasName != null) {
            ResourceData.SaveData saveData = resources.getSaveData(ASSET_DATA);
            if (saveData == null) saveData = resources.createSaveData(ASSET_DATA);
            saveData.saveAsset(this.atlasName, D30.class);
        }
    }

    @Override
    public void allocateChannels() {
        this.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion);
    }

    @Override
    public void write(gp_1 json) {
        json.A2("regions", this.regions, es_1.class, AspectTextureRegion.class);
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.regions.clear();
        es_1 loaded = (es_1)h4_0.Lpt6(json, jsonData, "regions", es_1.class, AspectTextureRegion.class);
        this.regions.G6(loaded.rZ, 0, loaded.KB);
    }

    public static class AspectTextureRegion {
        public float u;
        public float v;
        public float u2;
        public float v2;
        public float halfInvAspectRatio;
        public String imageName;

        public AspectTextureRegion() {
        }

        public AspectTextureRegion(AspectTextureRegion source) {
            set(source);
        }

        public AspectTextureRegion(LPT6_ region) {
            set(region);
        }

        public void set(LPT6_ region) {
            this.u = region.yQ;
            this.v = region.Y60;
            this.u2 = region.Yo;
            this.v2 = region.Ll0;
            this.halfInvAspectRatio = (float)region.xZ / (float)region.bz * 0.5f;
            if (region instanceof yo_2) this.imageName = ((yo_2)region).oL;
        }

        public void set(AspectTextureRegion source) {
            this.u = source.u;
            this.v = source.v;
            this.u2 = source.u2;
            this.v2 = source.v2;
            this.halfInvAspectRatio = source.halfInvAspectRatio;
            this.imageName = source.imageName;
        }

        public void updateUV(D30 atlas) {
            if (this.imageName == null) return;
            LPT6_ region = null;
            for (int i = 0; i < atlas.kE.KB; ++i) {
                yo_2 candidate = (yo_2)atlas.kE.get(i);
                if (candidate.oL.equals(this.imageName)) {
                    region = candidate;
                    break;
                }
            }
            if (region == null) return;
            this.u = region.yQ;
            this.v = region.Y60;
            this.u2 = region.Yo;
            this.v2 = region.Ll0;
            this.halfInvAspectRatio = (float)region.xZ / (float)region.bz * 0.5f;
        }
    }

    public static class Animated extends RegionInfluencer {
        ParallelArray.FloatChannel lifeChannel;

        public Animated() { }
        public Animated(Animated source) { super(source); }
        public Animated(LPT6_ region) { super(region); }
        public Animated(Texture texture) { super(texture); }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
        }

        @Override
        public void update() {
            int regionIndex = 0;
            int lifeIndex = ParticleChannels.LifePercentOffset;
            int end = this.controller.particles.size * this.regionChannel.strideSize;
            while (regionIndex < end) {
                AspectTextureRegion region = (AspectTextureRegion)this.regions.get((int)(this.lifeChannel.data[lifeIndex] * (float)(this.regions.KB - 1)));
                writeRegion(regionIndex, region);
                regionIndex += this.regionChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public Animated copy() { return new Animated(this); }
    }

    public static class Random extends RegionInfluencer {
        public Random() { }
        public Random(Random source) { super(source); }
        public Random(LPT6_ region) { super(region); }
        public Random(Texture texture) { super(texture); }

        @Override
        public void activateParticles(int startIndex, int count) {
            int regionIndex = startIndex * this.regionChannel.strideSize;
            int end = count * this.regionChannel.strideSize + regionIndex;
            while (regionIndex < end) {
                int size = this.regions.KB;
                AspectTextureRegion region = (AspectTextureRegion)(size == 0 ? null : this.regions.rZ[(int)LW.Yu.nextLong(size)]);
                writeRegion(regionIndex, region);
                regionIndex += this.regionChannel.strideSize;
            }
        }

        @Override
        public Random copy() { return new Random(this); }
    }

    public static class Single extends RegionInfluencer {
        public Single() { }
        public Single(Single source) { super(source); }
        public Single(LPT6_ region) { super(region); }
        public Single(Texture texture) { super(texture); }

        @Override
        public void init() {
            AspectTextureRegion region = (AspectTextureRegion)this.regions.rZ[0];
            int i = 0;
            int end = this.controller.emitter.maxParticleCount * this.regionChannel.strideSize;
            while (i < end) {
                writeRegion(i, region);
                i += this.regionChannel.strideSize;
            }
        }

        @Override
        public Single copy() { return new Single(this); }
    }

    protected void writeRegion(int offset, AspectTextureRegion region) {
        this.regionChannel.data[offset] = region.u;
        this.regionChannel.data[offset + 1] = region.v;
        this.regionChannel.data[offset + 2] = region.u2;
        this.regionChannel.data[offset + 3] = region.v2;
        this.regionChannel.data[offset + 4] = 0.5f;
        this.regionChannel.data[offset + 5] = region.halfInvAspectRatio;
    }
}
