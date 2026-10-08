package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 蝙蝠登场质子粒子特效 (Bat Spawn Particle Effect)
 * 编排 1702/1680/1650 音效并加载 "spawn_bats" 蝙蝠群飞舞粒子。
 *
 * 原混淆类: f.sw_0
 */
public class BatParticleEffect extends MU {

    public BatParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1702, 2, 14, 0.0f, 0.75f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1680, 1, 14, 0.0f, 2.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1650, 1, 14, 1500.0f, 0.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1650, 2, 14, 1500.0f, 0.0f, this.Vz0))
                .y80(this.wn0("spawn_bats"))
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
