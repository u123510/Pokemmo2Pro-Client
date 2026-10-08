package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 王权陨落登场质子粒子特效 (Fall of the King Spawn Particle Effect)
 * 编排沉重王冠与王权陨落声效，并根据敌我状态加载 "spawn_fall_of_the_king_enemy" 或 "spawn_fall_of_the_king_friendly"。
 *
 * 原混淆类: f.Vf
 */
public class FallOfTheKingParticleEffect extends MU {

    public FallOfTheKingParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        boolean isEnemy = this.nn0();
        String effectName = isEnemy ? "spawn_fall_of_the_king_enemy" : "spawn_fall_of_the_king_friendly";

        pw_1 builder = pw_1.xC().Xf0()
                .y80(this.wn0(effectName))
                .xi0(this.i6((byte) 2, (short) 1731, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1525, 1, 14, 1600.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1687, 2, 14, 1650.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1703, 3, 14, 1700.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1705, 4, 14, 1750.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1800, 5, 14, 1800.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1525, 6, 14, 1850.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1687, 7, 14, 1900.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1525, 1, 14, 1950.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1687, 2, 14, 2000.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1703, 3, 14, 2050.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1687, 4, 14, 2100.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1525, 5, 14, 2150.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1687, 6, 14, 2200.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1980, 1, 14, 3350.0f, 1.0f, this.Vz0));

        if (!isEnemy) {
            builder = builder
                    .xi0(this.i6((byte) 2, (short) 1496, 8, 14, 700.0f, 0.1f, this.Vz0))
                    .xi0(this.i6((byte) 2, (short) 1496, 8, 14, 1400.0f, 0.1f, this.Vz0))
                    .xi0(this.i6((byte) 2, (short) 1496, 8, 14, 2100.0f, 0.1f, this.Vz0))
                    .xi0(this.i6((byte) 2, (short) 1496, 8, 14, 2800.0f, 0.1f, this.Vz0))
                    .xi0(this.i6((byte) 2, (short) 1496, 8, 14, 3500.0f, 0.1f, this.Vz0));
        }

        this.E8 = builder.mz0();
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
