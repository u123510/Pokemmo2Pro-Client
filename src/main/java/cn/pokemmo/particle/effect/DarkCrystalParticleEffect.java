package cn.pokemmo.particle.effect;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 暗黑水晶登场粒子特效 (Dark Crystal Spawn Particle Effect)
 * 根据闪光/敌我状态加载 "spawn_dark_crystal_*" 粒子特效，并同步编排 1637/1664/1694 三段音效。
 *
 * 原混淆类: f.UC
 */
public class DarkCrystalParticleEffect extends MU {
    public final boolean isShiny;
    public final boolean Jy0;

    public DarkCrystalParticleEffect(PF participant, boolean isShiny) {
        super(participant);
        this.isShiny = isShiny;
        this.Jy0 = isShiny;
    }

    @Override
    public MU us() {
        String effectName;
        pw_1 chain = pw_1.xC().Xf0()
                .xi0(this.i6((byte) 2, (short) 1637, 1, 14, 0.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1664, 2, 14, 600.0f, 1.0f, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1694, 2, 14, 1500.0f, 1.0f, this.Vz0));

        if (this.nn0()) {
            effectName = this.isShiny ? "spawn_dark_crystal_shiny_enemy" : "spawn_dark_crystal_enemy";
        } else {
            effectName = this.isShiny ? "spawn_dark_crystal_shiny_friendly" : "spawn_dark_crystal_friendly";
        }

        this.E8 = chain.y80(this.wn0(effectName)).mz0();
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
