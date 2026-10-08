package f;

import cn.pokemmo.particle.effect.PhantomParticleEffect;
import cn.pokemmo.particle.influencer.AnimatedParticleRegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;

/**
 * 序列帧动画粒子贴图影响器兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.particle.influencer.AnimatedParticleRegionInfluencer
 */
public final class OG extends AnimatedParticleRegionInfluencer {
    public OG(PhantomParticleEffect assets, BillboardParticleBatchExt batch) {
        super(assets, batch);
    }
}
