package cn.pokemmo.particle.effect;

import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import f.*;

/**
 * 宝可梦战斗升级粒子特效 (Level Up Particle Effect)
 * 加载 "special/levelup" 特效并配合 1766 音效/补间，同时触发战斗参战者的升级动作。
 *
 * 原混淆类: f.xo_0
 */
public class LevelUpParticleEffect extends MU {

    public LevelUpParticleEffect(PF source) {
        super(source);
    }

    @Override
    public MU us() {
        ParticleEffectExt effect = this.Jv("special/levelup");
        pw_1 animation = pw_1.xC().Xf0()
                .y80(this.kO((short) 1766))
                .y80(ao_1.pc((index, context) -> this.nH(effect, index, context)))
                .mz0();
        this.E8 = animation;
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean ignored) {
        return false;
    }

    public void nH(ParticleEffectExt effect, int index, D2 context) {
        this.Mr0(effect);
        if (this.Vz0 != null) {
            this.Vz0.r10.Wb();
        }
    }
}
