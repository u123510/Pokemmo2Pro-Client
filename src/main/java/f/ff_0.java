package f;

import cn.pokemmo.particle.ParticleManager;

/**
 * 粒子系统管理器兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.particle.ParticleManager
 */
public final class ff_0 extends ParticleManager {
    public ff_0(BJ0 camera) {
        super(camera);
    }

    public ff_0(BJ0 camera, int ignored) {
        super(camera, ignored);
    }
}
