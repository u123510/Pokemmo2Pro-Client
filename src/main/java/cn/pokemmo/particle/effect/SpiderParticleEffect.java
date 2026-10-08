package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 幽暗蜘蛛登场质子粒子特效 (Spider Spawn Particle Effect)
 * 编排 1804/1714/1836/1405 音效序列并加载 "spawn_spiders" 攀爬蜘蛛粒子特效。
 *
 * 原混淆类: f.Hx0
 */
public class SpiderParticleEffect extends MU {

    public SpiderParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1804, 1, 14, 900.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1804, 1, 14, 1050.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1804, 1, 14, 1200.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1714, 2, 14, 1200.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1836, 3, 14, 1500.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1405, 2, 14, 3500.0f, 0.75f, this.Vz0))
                .y80(this.wn0("spawn_spiders"))
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
