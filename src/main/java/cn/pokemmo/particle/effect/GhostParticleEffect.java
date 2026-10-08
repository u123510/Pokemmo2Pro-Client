package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 幽灵登场质子粒子特效 (Ghost Spawn Particle Effect)
 * 编排 1520/1521 音效并加载 "spawn_ghost" 幽灵鬼魂粒子特效。
 *
 * 原混淆类: f.L6
 */
public class GhostParticleEffect extends MU {

    public GhostParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1520, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1521, 1, 14, 750.0f, 1.0f, this.Vz0))
                .y80(this.wn0("spawn_ghost"))
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
