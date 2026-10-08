package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 圣诞彩灯电线登场粒子特效 (Xmas Wires Spawn Particle Effect)
 * 播放 "spawn_xmas_wires" 节日粒子特效并同步播放 1925 音效。
 *
 * 原混淆类: f.i50_0 (f.i50)
 */
public class XmasWiresParticleEffect extends MU {

    public XmasWiresParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1925, 0, 14, 0.0f, 1.0f, this.Vz0))
                .y80(this.wn0("spawn_xmas_wires"))
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
