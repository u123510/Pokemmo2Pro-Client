package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 女巫阴霾登场质子粒子特效 (Witch's Haze Spawn Particle Effect)
 * 编排 1723/1763/1864/1405 音效并加载 "spawn_witchs_haze" 女巫紫雾质子特效。
 *
 * 原混淆类: f.F10
 */
public class WitchsHazeParticleEffect extends MU {

    public WitchsHazeParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1723, 2, 14, 250.0f, 0.75f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1763, 1, 14, 250.0f, 0.75f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1864, 2, 14, 4500.0f, 0.25f, this.Vz0))
                .y80(this.wn0("spawn_witchs_haze"))
                .xi0(this.i6((byte) 2, (short) 1405, 1, 14, 4500.0f, 0.75f, this.Vz0))
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
