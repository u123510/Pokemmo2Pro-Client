package cn.pokemmo.particle.modifier;

import com.badlogic.gdx.graphics.g3d.particles.DynamicsModifierExt;
import f.C8;
import f.co_1;
import f.ri_0;

/**
 * 粒子向量路径动力学修饰器 (Particle Vector Path Modifier)
 * 控制粒子沿三维贝塞尔/向量路径运动。
 *
 * 原混淆类: f.E
 */
public class ParticleVectorPathModifier extends DynamicsModifierExt.VectorPathModifier {
    public final C8 E90;

    public ParticleVectorPathModifier(DynamicsModifierExt.VectorPathModifier source, C8 path) {
        super(source);
        this.E90 = path;
    }

    public C8 getPath() {
        return this.E90;
    }

    @Override
    public void initPath(int index) {
        C8 savedC = new C8(co_1.cOm6);
        C8 savedK = new C8(co_1.Kl0);
        ri_0 savedX = co_1.Xh;
        co_1.cOm6.np(this.E90);
        co_1.Kl0.np(this.E90);
        co_1.Xh = ri_0.xQ;
        super.initPath(index);
        co_1.cOm6.np(savedC);
        co_1.Kl0.np(savedK);
        co_1.Xh = savedX;
    }
}
