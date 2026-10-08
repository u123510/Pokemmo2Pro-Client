package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 节庆灯笼登场质子粒子特效 (Lantern Spawn Particle Effect)
 * 编排 1925 音效并加载 "spawn_lanterns" 灯笼升空粒子特效。
 *
 * 原混淆类: f.zh_0 (f.zh)
 */
public class LanternParticleEffect extends MU {

    public LanternParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1925, 1, 14, 0.2f, 0.8f, this.Vz0))
                .y80(this.wn0("spawn_lanterns"))
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
