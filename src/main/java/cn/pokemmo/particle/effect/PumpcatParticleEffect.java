package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 南瓜猫登场质子粒子特效 (Pumpcat Spawn Particle Effect)
 * 编排南瓜猫音效序列，并根据敌我状态加载 "spawn_pumpcat_enemy" 或 "spawn_pumpcat_friendly"。
 *
 * 原混淆类: f.lg0_0 (f.Lg0)
 */
public class PumpcatParticleEffect extends MU {

    public PumpcatParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_pumpcat_enemy" : "spawn_pumpcat_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1441, 2, 14, 100.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1399, 2, 14, 650.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1804, 1, 14, 1200.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1731, 3, 14, 1800.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 1950.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 2600.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 3100.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 10, (short) 3, 3, 14, 3900.0f, 0.7f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 4400.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1731, 2, 14, 5200.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1731, 3, 14, 5350.0f, 0.1f, this.Vz0))
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
