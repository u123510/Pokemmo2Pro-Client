package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 黑猫登场质子粒子特效 (Black Cat Spawn Particle Effect)
 * 编排黑猫喵叫与脚步声效序列，并根据敌我状态加载 "spawn_black_cat_enemy" 或 "spawn_black_cat_friendly"。
 *
 * 原混淆类: f.db_0 (f.dB)
 */
public class BlackCatParticleEffect extends MU {

    public BlackCatParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_black_cat_enemy" : "spawn_black_cat_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1654, 1, 14, 100.0f, 0.6f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1568, 1, 14, 800.0f, 0.6f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 900.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 1400.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 1950.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 2600.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 10, (short) 1, 3, 14, 3000.0f, 0.7f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1654, 1, 14, 3800.0f, 0.6f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1663, 2, 14, 4400.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1568, 1, 14, 4900.0f, 0.6f, this.Vz0))
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
