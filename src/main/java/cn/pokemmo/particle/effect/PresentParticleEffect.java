package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 礼盒登场质子粒子特效 (Present Spawn Particle Effect)
 * 加载 "spawn_present" 礼盒与彩带飞扬质子特效。
 *
 * 原混淆类: f.lpt7__1 (f.Lpt7)
 */
public class PresentParticleEffect extends MU {

    public PresentParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .y80(this.wn0("spawn_present"))
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
