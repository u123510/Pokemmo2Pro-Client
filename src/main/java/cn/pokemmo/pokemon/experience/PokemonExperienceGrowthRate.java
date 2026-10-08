package cn.pokemmo.pokemon.experience;

import f.*;

public class PokemonExperienceGrowthRate {
    public static final q1_0 yA0;
    public static final bm0_1 kc;
    public final byte id0;
    public final int[] YC0;

    public PokemonExperienceGrowthRate(int value) {
        this.YC0 = new int[101];
        this.id0 = (byte) value;
        for (int i = 0; i < 101; i++) {
            this.YC0[i] = this.Iy0(i);
            if (this.YC0[i] < 0) {
                this.YC0[i] = 0;
            }
        }
    }

    static {
        q1_0 first = new q1_0(0);
        yA0 = new q1_0(1);
        q1_0 second = new q1_0(2);
        q1_0 third = new q1_0(3);
        q1_0 fourth = new q1_0(4);
        q1_0 fifth = new q1_0(5);
        q1_0[] values = new q1_0[]{first, yA0, second, third, fourth, fifth};
        kc = new bm0_1();
        for (q1_0 value : (q1_0[]) values.clone()) {
            kc.gE0(value.id0, value);
        }
    }

    public final int Mu0(int level) {
        if (level > 100) {
            return Integer.MAX_VALUE;
        }
        return this.YC0[level];
    }

    public final int Iy0(int level) {
        switch (this.id0) {
            case 0:
                return (int) Math.pow(level, 3.0D);
            case 1:
                if (level <= 50) {
                    return (int) (Math.pow(level, 3.0D) * (100.0D - level) / 50.0D);
                }
                if (level <= 68) {
                    return (int) (Math.pow(level, 3.0D) * (150.0D - level) / 100.0D);
                }
                if (level <= 98) {
                    double cube = Math.pow(level, 3.0D);
                    double factor = 1911.0D - (double) (level * 10);
                    factor /= 3.0D;
                    factor *= cube;
                    factor /= 500.0D;
                    return (int) factor;
                }
                return (int) (Math.pow(level, 3.0D) * (160.0D - level) / 100.0D);
            case 2:
                double cube = Math.pow(level, 3.0D);
                if (level <= 15) {
                    double factor = ((double) (level + 1) / 3.0D) + 24.0D;
                    factor /= 50.0D;
                    factor *= cube;
                    return (int) factor;
                }
                if (level <= 36) {
                    double factor = ((double) (level + 14) / 50.0D);
                    factor *= cube;
                    return (int) factor;
                }
                double factor = ((double) level / 2.0D) + 32.0D;
                factor /= 50.0D;
                factor *= cube;
                return (int) factor;
            case 3:
                return (int) (Math.pow(level, 3.0D) * 1.2D
                        - (double) (level * 15 * level) + (double) (level * 100) - 140.0D);
            case 4:
                return (int) (Math.pow(level, 3.0D) * 4.0D / 5.0D);
            case 5:
                return (int) (Math.pow(level, 3.0D) * 5.0D / 4.0D);
            default:
                return 0;
        }
    }

    public cn.pokemmo.pokemon.ExperienceGrowthRate toDomain() {
        return cn.pokemmo.pokemon.ExperienceGrowthRate.fromBridge((q1_0) this);
    }

    public static q1_0 fromDomain(cn.pokemmo.pokemon.ExperienceGrowthRate domain) {
        return domain != null ? domain.toBridge() : null;
    }
}
