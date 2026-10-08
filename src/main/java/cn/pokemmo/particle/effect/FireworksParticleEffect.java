package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 烟花盛宴登场质子粒子特效 (Fireworks Spawn Particle Effect)
 * 编排 1816/1475/1825 音效序列并加载 "spawn_fireworks" 璀璨烟花爆炸粒子。
 *
 * 原混淆类: f.lx_0 (f.Lx)
 */
public class FireworksParticleEffect extends MU {

    public FireworksParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1816, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1475, 1, 14, 500.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1825, 1, 14, 800.0f, 0.25f, this.Vz0))
                .y80(this.wn0("spawn_fireworks"))
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
