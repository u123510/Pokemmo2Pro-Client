package cn.pokemmo.particle.effect;

import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import f.*;

/**
 * 战斗能力等级升降粒子特效 (Stat Change Particle Effect)
 * 播放状态上升/下降 (status/up 或 status/down) 3D 粒子动画并同步更新宝可梦数值 HUD。
 *
 * 原混淆类: f.WF0
 */
public class StatChangeParticleEffect extends MU {
    public final ML0 model;
    public final ML0 nul;

    public StatChangeParticleEffect(ML0 model, PF participant) {
        super(participant);
        this.model = model;
        this.nul = model;
    }

    @Override
    public MU sJ0(gc_2 stat, byte direction) {
        if (direction == 0) {
            this.Vc();
            return this;
        }

        boolean up = direction > 0;
        String suffix = up ? "up" : "down";
        ParticleEffectExt effect = this.Jv("status/".concat(suffix));
        pw_1 animation = pw_1.xC().p1(0.75f).Xf0();
        int action = up ? 1557 : 1558;
        animation.y80(MU.eK0((short) action, this.Xp.COm2()));
        animation.y80(ao_1.pc((effect2, d2) -> this.tI0(effect, stat, direction, effect2, d2)));
        this.E8 = animation.mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public boolean Bv0(boolean value) {
        return false;
    }

    public void tI0(ParticleEffectExt effect, gc_2 stat, byte direction, int ignored, D2 context) {
        this.Mr0(effect);
        if (effect != null) {
            lg_0.k.lPT5(() -> this.t3(stat, direction));
        }
    }

    public void t3(gc_2 stat, byte direction) {
        this.Xp.yK0(stat, direction);
        this.nul.Hi(this.Xp).XO();
    }
}
