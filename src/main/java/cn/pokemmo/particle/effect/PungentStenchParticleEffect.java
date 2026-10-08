package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 恶臭弥漫登场质子粒子特效 (Pungent Stench Spawn Particle Effect)
 * 编排 1875 音效并加载 "spawn_pungent_stench" 恶臭毒雾粒子特效。
 *
 * 原混淆类: f.PK0
 */
public class PungentStenchParticleEffect extends MU {

    public PungentStenchParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1875, 1, 14, 250.0f, 0.75f, this.Vz0))
                .y80(this.wn0("spawn_pungent_stench"))
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
