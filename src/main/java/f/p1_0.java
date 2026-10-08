package f;

import cn.pokemmo.particle.action.ParticleControllerStarterAction;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;

/**
 * 粒子控制器启动回调兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.particle.action.ParticleControllerStarterAction
 */
public final class p1_0 extends ParticleControllerStarterAction {
    public p1_0(ParticleControllerExt v1, ParticleControllerExt v2) {
        super(v1, v2);
    }
}

