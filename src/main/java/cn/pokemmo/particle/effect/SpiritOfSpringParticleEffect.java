package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 春之精灵登场质子粒子特效 (Spirit of Spring Spawn Particle Effect)
 * 编排 1859/1934/1723 音效序列并加载 "spawn_spirit_of_spring_friendly" 迎春繁花粒子特效。
 *
 * 原混淆类: f.IB
 */
public class SpiritOfSpringParticleEffect extends MU {

    public SpiritOfSpringParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1859, 0, 14, 200.0f, 0.6f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1934, 1, 14, 200.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1723, 0, 14, 3800.0f, 0.6f, this.Vz0))
                .y80(this.wn0("spawn_spirit_of_spring_friendly"))
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
