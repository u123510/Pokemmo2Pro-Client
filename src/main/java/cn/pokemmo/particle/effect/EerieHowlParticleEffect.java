package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 阴森嚎叫登场质子粒子特效 (Eerie Howl Spawn Particle Effect)
 * 根据敌我状态加载 "spawn_eerie_howl_enemy" 或 "spawn_eerie_howl_friendly" 怨狼嚎叫粒子特效。
 *
 * 原混淆类: f.ac_0 (f.Ac)
 */
public class EerieHowlParticleEffect extends MU {

    public EerieHowlParticleEffect(PF participant) {
        super(participant);
    }

    @Override
    public MU us() {
        String effectName = this.nn0() ? "spawn_eerie_howl_enemy" : "spawn_eerie_howl_friendly";
        pw_1 animation = pw_1.xC().Xf0()
                .y80(this.wn0(effectName))
                .xi0(this.i6((byte) 10, (short) 4, 1, 14, 2000.0f, 0.7f, this.Vz0))
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
