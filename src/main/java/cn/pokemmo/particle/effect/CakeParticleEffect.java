package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 周年庆蛋糕登场粒子特效 (Cake Spawn Particle Effect)
 * 播放 "spawn_cake_enemy" 或 "spawn_cake_friendly" 蛋糕特效并编排 1665/1821/1817 音效序列。
 *
 * 原混淆类: f.dc_2 (f.dc)
 */
public class CakeParticleEffect extends MU {

    public CakeParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_cake_enemy" : "spawn_cake_friendly";
        pw_1 chain = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1665, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1821, 1, 14, 300.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1821, 1, 14, 550.0f, 0.3f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1821, 1, 14, 800.0f, 0.1f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1817, 2, 14, 2000.0f, 0.3f, this.Vz0))
                .y80(this.wn0(effectName))
                .mz0();

        this.E8 = chain;
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
