package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 鬼火/人魂登场质子粒子特效 (Hitodama Spawn Particle Effect)
 * 编排 2000 音效并加载 "spawn_hitodama" 幽蓝人魂鬼火粒子。
 *
 * 原混淆类: f.lpt5__0
 */
public class HitodamaParticleEffect extends MU {

    public HitodamaParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 2000, 1, 14, 700.0f, 0.859375f, this.Vz0))
                .y80(this.wn0("spawn_hitodama"))
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
