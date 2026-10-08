package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 僵尸之手登场质子粒子特效 (Zombie Hands Spawn Particle Effect)
 * 编排破土抓取声效，并根据敌我状态加载 "spawn_zombie_hands_enemy" 或 "spawn_zombie_hands_friendly"。
 *
 * 原混淆类: f.D1
 */
public class ZombieHandsParticleEffect extends MU {

    public ZombieHandsParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_zombie_hands_enemy" : "spawn_zombie_hands_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1460, 1, 14, 400.0f, 0.5f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1416, 2, 14, 700.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1405, 2, 14, 3800.0f, 0.75f, this.Vz0))
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
