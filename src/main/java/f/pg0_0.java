package f;

import cn.pokemmo.graphics.particle.ParticleEmitterEmissionKeyframe;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.pg0_0
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.particle.ParticleEmitterEmissionKeyframe}
 */
public final class pg0_0 extends ParticleEmitterEmissionKeyframe {
    public static final pg0_0 MI0;
    public static final pg0_0 s60;
    public static final pg0_0 Zr0;
    public static final pg0_0 DK;
    public static final pg0_0 Ix0;
    public static final pg0_0 ze0;
    public static final pg0_0[] we;
    public static final pg0_0[] C2;

    public pg0_0(byte index, int selector, int textId) {
        super(index, selector, textId);
    }

    public static pg0_0 vh0(byte index) {
        if (index >= 0 && index < we.length) {
            return we[index];
        }
        return s60;
    }

    static {

        MI0 = new pg0_0((byte) 0, 0, 2628);
        s60 = new pg0_0((byte) 1, 1, 2625);
        Zr0 = new pg0_0((byte) 2, 2, 2626);
        DK = new pg0_0((byte) 3, 3, 2629);
        Ix0 = new pg0_0((byte) 4, 4, 2630);
        ze0 = new pg0_0((byte) 5, 5, 2627);
        C2 = new pg0_0[]{MI0, s60, Zr0, DK, Ix0, ze0};
        we = C2.clone();
    
        ParticleEmitterEmissionKeyframe.MI0 = MI0;
        ParticleEmitterEmissionKeyframe.s60 = s60;
        ParticleEmitterEmissionKeyframe.Zr0 = Zr0;
        ParticleEmitterEmissionKeyframe.DK = DK;
        ParticleEmitterEmissionKeyframe.Ix0 = Ix0;
        ParticleEmitterEmissionKeyframe.ze0 = ze0;
        ParticleEmitterEmissionKeyframe.we = we;
        ParticleEmitterEmissionKeyframe.C2 = C2;
    }
}
