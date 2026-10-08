package f;

import cn.pokemmo.particle.effect.DragonParticleEffect;
import cn.pokemmo.particle.influencer.DragonAnimatedRegionInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;

/**
 * 龙系帧动画粒子贴图影响器兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.particle.influencer.DragonAnimatedRegionInfluencer
 */
public final class Dk0 extends DragonAnimatedRegionInfluencer {
    public Dk0(DragonParticleEffect owner, BillboardParticleBatchExt batch) {
        super(owner, batch);
    }
}
