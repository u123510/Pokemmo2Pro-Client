package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 十二生肖/黄道十二宫登场质子粒子特效 (Zodiac Spawn Particle Effect)
 * 编排生肖闪光音效，并根据敌我状态加载 "spawn_zodiac_enemy" 或 "spawn_zodiac_friendly"。
 *
 * 原混淆类: f.ja0_1 (f.jA0)
 */
public class ZodiacParticleEffect extends MU {

    public ZodiacParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_zodiac_enemy" : "spawn_zodiac_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1524, 1, 14, 150.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1926, 2, 14, 250.0f, 0.5f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1604, 3, 14, 1200.0f, 0.5f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 2032, 1, 14, 3100.0f, 0.5f, this.Vz0))
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
