package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleEmitterEmissionKeyframe {
    public static ParticleEmitterEmissionKeyframe MI0;
    public static ParticleEmitterEmissionKeyframe s60;
    public static ParticleEmitterEmissionKeyframe Zr0;
    public static ParticleEmitterEmissionKeyframe DK;
    public static ParticleEmitterEmissionKeyframe Ix0;
    public static ParticleEmitterEmissionKeyframe ze0;
    public static ParticleEmitterEmissionKeyframe[] we;
    public static ParticleEmitterEmissionKeyframe[] C2;
    public final byte b8;
    public final int r20;
    public final int Com4;

    public ParticleEmitterEmissionKeyframe(byte index, int selector, int textId) {
        this.Com4 = selector;
        this.b8 = index;
        this.r20 = textId;
        if (index != this.KK()) {
            throw new RuntimeException();
        }
    }

    public static pg0_0 vh0(byte index) {
        return f.pg0_0.vh0(index);
    }

    static {
        if (f.pg0_0.MI0 == null) {
            try {
                Class.forName(f.pg0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final int KK() {
        return this.Com4;
    }
}
