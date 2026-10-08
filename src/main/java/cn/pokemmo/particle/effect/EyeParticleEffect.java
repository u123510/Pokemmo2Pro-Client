package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 魔眼登场质子粒子特效 (Eye Spawn Particle Effect)
 * 编排 1509 音效并加载 "spawn_eye" 凝视魔眼粒子特效。
 *
 * 原混淆类: f.Sh
 */
public class EyeParticleEffect extends MU {

    public EyeParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1509, 1, 14, 250.0f, 1.0f, this.Vz0))
                .y80(this.wn0("spawn_eye"))
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
