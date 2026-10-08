package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 幼南瓜款待登场质子粒子特效 (Pumpkid's Treat Spawn Particle Effect)
 * 编排 1920 音效并加载 "spawn_pumpkids_treat" 南瓜糖果散落粒子特效。
 *
 * 原混淆类: f.if_0 (f.iF)
 */
public class PumpkidsTreatParticleEffect extends MU {

    public PumpkidsTreatParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1920, 1, 14, 0.0f, 0.25f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1920, 2, 14, 750.0f, 0.25f, this.Vz0))
                .y80(this.wn0("spawn_pumpkids_treat"))
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
