package cn.pokemmo.particle.influencer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencerExt;
import cn.pokemmo.particle.effect.DragonParticleEffect;
import f.LPT6_;
import f.es_1;
import f.fp0_0;

/**
 * 龙之波动/龙系技能帧动画粒子影响器 (Dragon Animated Region Influencer)
 * 控制粒子在生命周期内按进度切换 35 帧连续龙形特效贴图。
 *
 * 原混淆类: f.Dk0
 */
public class DragonAnimatedRegionInfluencer extends RegionInfluencerExt.AnimatedExt {
    public ParallelArray.FloatChannel qC0;
    public ParallelArray.FloatChannel b30;
    public final Texture[] eh0;
    public final LPT6_[] jQ;
    public final BillboardParticleBatchExt JL0;
    public final DragonParticleEffect xi0;

    public DragonAnimatedRegionInfluencer(DragonParticleEffect owner, BillboardParticleBatchExt batch) {
        super();
        this.xi0 = owner;
        Texture[] loaded = this.COm1();
        Texture[] frames = new Texture[35];
        if (loaded.length >= 24) {
            for (int i = 0; i < 24; i++) {
                frames[i] = loaded[i];
            }
            for (int i = 24; i < 28; i++) {
                frames[i] = loaded[46 - i];
            }
            for (int i = 28; i < frames.length; i++) {
                frames[i] = loaded[18];
            }
        }
        this.eh0 = frames;
        this.jQ = new LPT6_[35];
        this.regions = new es_1(true, 35, RegionInfluencer.AspectTextureRegion.class);
        this.regions.Bv(35);
        for (int i = 0; i < this.eh0.length; i++) {
            this.jQ[i] = new LPT6_(this.eh0[i]);
            this.regions.Ue0(new RegionInfluencer.AspectTextureRegion(this.jQ[i]));
        }
        this.JL0 = batch;
    }

    @Override
    public void update() {
        int regionIndex = 0;
        int lifeIndex = 2;
        int end = this.controller.particles.size * this.qC0.strideSize;
        while (regionIndex < end) {
            lifeIndex = Math.min(
                this.eh0.length - 1,
                (int)(this.b30.data[lifeIndex] * (float)this.eh0.length)
            );
            RegionInfluencer.AspectTextureRegion region =
                (RegionInfluencer.AspectTextureRegion)this.regions.get(lifeIndex);
            this.JL0.setTexture(this.eh0[lifeIndex]);
            float[] data = this.qC0.data;
            data[regionIndex] = region.u;
            data[regionIndex + 1] = region.v;
            data[regionIndex + 2] = region.u2;
            data[regionIndex + 3] = region.v2;
            data[regionIndex + 4] = 0.5f;
            data[regionIndex + 5] = region.halfInvAspectRatio;
            regionIndex += this.qC0.strideSize;
            lifeIndex += this.b30.strideSize;
        }
    }

    @Override
    public RegionInfluencerExt.AnimatedExt copy() {
        return new DragonAnimatedRegionInfluencer(this.xi0, this.JL0);
    }

    @Override
    public void allocateChannels() {
        this.b30 = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
        this.qC0 = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion);
    }

    @Override
    public void dispose() {
        if (this.xi0.NG0 == null) {
            return;
        }
        for (int i = 0; i < 24; i++) {
            String path = fp0_0.uD(new StringBuilder("sprites/way_of_the_dragon/"), i + 1, ".png");
            if (this.xi0.NG0.u70(path)) {
                this.xi0.NG0.Mj(path);
            }
        }
    }

    public final Texture[] COm1() {
        if (this.xi0.NG0 == null) {
            return new Texture[0];
        }
        int count = 24;
        Texture[] textures = new Texture[count];
        for (int index = 0; index < count; index++) {
            String path = fp0_0.uD(new StringBuilder("sprites/way_of_the_dragon/"), index + 1, ".png");
            this.xi0.NG0.DA(path);
            synchronized (this.xi0.NG0) {
                textures[index] = (Texture)this.xi0.NG0.Og0(Texture.class, path);
            }
        }
        return textures;
    }
}
