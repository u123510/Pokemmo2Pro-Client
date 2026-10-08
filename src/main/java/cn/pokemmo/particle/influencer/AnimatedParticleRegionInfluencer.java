package cn.pokemmo.particle.influencer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import cn.pokemmo.particle.effect.PhantomParticleEffect;
import f.LPT6_;
import f.es_1;
import f.fp0_0;

/**
 * 序列帧动画粒子贴图影响器 (Animated Particle Region Influencer)
 * 支持 41 帧连续战斗技能与环境特效序列帧平滑播放。
 *
 * 原混淆类: f.OG
 */
public class AnimatedParticleRegionInfluencer extends RegionInfluencerExt.AnimatedExt {
    public ParallelArray.FloatChannel LI0;
    public ParallelArray.FloatChannel yp0;
    public final Texture[] p3;
    public final LPT6_[] F2;
    public final BillboardParticleBatchExt ab0;
    public final PhantomParticleEffect o10;

    public AnimatedParticleRegionInfluencer(PhantomParticleEffect assets, BillboardParticleBatchExt batch) {
        super();
        this.o10 = assets;

        Texture[] loaded = this.AZ();
        Texture[] textures = new Texture[41];
        for (int i = 0; i < loaded.length; i++) {
            textures[i] = loaded[i];
        }
        this.p3 = textures;
        this.F2 = new LPT6_[41];
        this.regions = new es_1(false, 41, RegionInfluencer.AspectTextureRegion.class);
        this.regions.Bv(41);

        for (int i = 0; i < this.p3.length; i++) {
            this.F2[i] = new LPT6_(this.p3[i]);
            this.regions.Ue0(new RegionInfluencer.AspectTextureRegion(this.F2[i]));
        }
        this.ab0 = batch;
    }

    @Override
    public void update() {
        int regionIndex = 0;
        int lifeIndex = 2;
        int end = this.controller.particles.size * this.LI0.strideSize;
        while (regionIndex < end) {
            int textureIndex = Math.min(
                    this.p3.length - 1,
                    (int)(this.yp0.data[lifeIndex] * (float)this.p3.length)
            );
            RegionInfluencer.AspectTextureRegion region =
                    (RegionInfluencer.AspectTextureRegion)this.regions.get(textureIndex);
            this.ab0.setTexture(this.p3[textureIndex]);
            float[] data = this.LI0.data;
            data[regionIndex] = region.u;
            data[regionIndex + 1] = region.v;
            data[regionIndex + 2] = region.u2;
            data[regionIndex + 3] = region.v2;
            data[regionIndex + 4] = 0.5f;
            data[regionIndex + 5] = region.halfInvAspectRatio;
            regionIndex += this.LI0.strideSize;
            lifeIndex += this.yp0.strideSize;
        }
    }

    @Override
    public RegionInfluencerExt.AnimatedExt copy() {
        return new AnimatedParticleRegionInfluencer(this.o10, this.ab0);
    }

    @Override
    public void allocateChannels() {
        this.yp0 = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
        this.LI0 = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion);
    }

    @Override
    public void dispose() {
        for (int i = 0; i < 41; i++) {
            String path = fp0_0.uD(new StringBuilder(this.o10.kN), i + 1, ".png");
            if (this.o10.bL0.u70(path)) {
                this.o10.bL0.Mj(path);
            }
        }
    }

    public final Texture[] AZ() {
        if (this.o10.bL0 == null) {
            return new Texture[0];
        }
        Texture[] textures = new Texture[41];
        for (int i = 0; i < 41; i++) {
            String path = fp0_0.uD(new StringBuilder(this.o10.kN), i + 1, ".png");
            this.o10.bL0.DA(path);
            synchronized (this.o10.bL0) {
                textures[i] = (Texture)this.o10.bL0.Og0(Texture.class, path);
            }
        }
        return textures;
    }
}
