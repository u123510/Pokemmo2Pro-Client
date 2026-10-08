package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 镰刀登场质子粒子特效 (Scythe Spawn Particle Effect)
 * 编排挥镰声效，并根据敌我状态加载 "spawn_scythe_enemy" 或 "spawn_scythe_friendly"。
 *
 * 原混淆类: f.oj0_2 (f.oj0)
 */
public class ScytheParticleEffect extends MU {

    public ScytheParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_scythe_enemy" : "spawn_scythe_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1665, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1877, 1, 14, 500.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1491, 1, 14, 1000.0f, 1.0f, this.Vz0))
                .y80(this.wn0(effectName))
                .mz0();

        this.E8 = animation;
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean bl) {
        return false;
    }
}
