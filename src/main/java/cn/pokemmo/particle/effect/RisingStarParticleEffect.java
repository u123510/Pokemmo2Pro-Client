package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 冉冉升起之星登场质子粒子特效 (Rising Star Spawn Particle Effect)
 * 编排 1604/1594 音效并加载 "spawn_rising_star" 升腾群星质子粒子。
 *
 * 原混淆类: f.AF
 */
public class RisingStarParticleEffect extends MU {

    public RisingStarParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1604, 1, 14, 250.0f, 0.75f, this.Vz0))
                .y80(this.wn0("spawn_rising_star"))
                .xi0(this.i6((byte) 2, (short) 1594, 1, 14, 1350.0f, 0.75f, this.Vz0))
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
