package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 黑洞吞噬登场质子粒子特效 (Black Hole Spawn Particle Effect)
 * 编排 2044/1885 音效并加载 "spawn_black_hole" 奇点黑洞引力坍缩粒子特效。
 *
 * 原混淆类: f.qv_1 (f.qV)
 */
public class BlackHoleParticleEffect extends MU {

    public BlackHoleParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 2044, 1, 14, 0.0f, 0.75f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1885, 1, 14, 4250.0f, 0.75f, this.Vz0))
                .y80(this.wn0("spawn_black_hole"))
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
