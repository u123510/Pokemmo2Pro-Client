package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 墓地登场质子粒子特效 (Graveyard Spawn Particle Effect)
 * 编排墓地雷声与脚步声效，并根据敌我状态加载 "spawn_graveyard_enemy" 或 "spawn_graveyard_friendly"。
 *
 * 原混淆类: f.q60_0 (f.q60)
 */
public class GraveyardParticleEffect extends MU {

    public GraveyardParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_graveyard_enemy" : "spawn_graveyard_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .y80(this.wn0(effectName))
                .xi0(this.i6((byte) 2, (short) 1416, 1, 14, 500.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1850, 4, 14, 0.0f, 0.5f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 2, 14, 750.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 3, 14, 850.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 2, 14, 950.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 3, 14, 1050.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 2, 14, 1150.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 3, 14, 1250.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1402, 2, 14, 1350.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1376, 1, 14, 1800.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1376, 4, 14, 4000.0f, 1.0f, this.Vz0))
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
