package f;

import cn.pokemmo.particle.modifier.ParticleVectorPathModifier;
import com.badlogic.gdx.graphics.g3d.particles.DynamicsModifierExt;

/**
 * 粒子向量路径修饰器兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.particle.modifier.ParticleVectorPathModifier
 */
public final class E extends ParticleVectorPathModifier {
    public E(DynamicsModifierExt.VectorPathModifier source, C8 path) {
        super(source, path);
    }
}
