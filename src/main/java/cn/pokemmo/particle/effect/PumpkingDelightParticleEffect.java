package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 南瓜王的欢愉登场质子粒子特效 (Pumpking's Delight Spawn Particle Effect)
 * 编排 1562 音效并加载 "spawn_pumpkings_delight" 万圣节南瓜王欢愉粒子特效。
 *
 * 原混淆类: f.bm_0 (f.Bm)
 */
public class PumpkingDelightParticleEffect extends MU {

    public PumpkingDelightParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1562, 1, 14, 250.0f, 1.0f, this.Vz0))
                .y80(this.wn0("spawn_pumpkings_delight"))
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
