package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 雪花登场质子粒子特效 (Snowflake Spawn Particle Effect)
 * 编排 1540/1405 音效并加载 "spawn_snowflakes" 飘落雪花粒子特效。
 *
 * 原混淆类: f.ae0_2 (f.ae0)
 */
public class SnowflakeParticleEffect extends MU {

    public SnowflakeParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        pw_1 animation = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1540, 1, 14, 250.0f, 0.75f, this.Vz0))
                .y80(this.wn0("spawn_snowflakes"))
                .xi0(this.i6((byte) 2, (short) 1405, 1, 14, 2750.0f, 0.75f, this.Vz0))
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
