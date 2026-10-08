package cn.pokemmo.pokemon;

import f.q1_0;

/**
 * 宝可梦经验值增长曲线枚举 (Experience Growth Rate)
 * 定义官方六种经验曲线的升级所需经验计算公式（等级 1-100）。
 *
 * 原混淆类: f.q1_0
 */
public enum ExperienceGrowthRate {
    MEDIUM_FAST(0, "中快 (Medium Fast)"),
    ERRATIC(1, "浮躁 (Erratic)"),
    FLUCTUATING(2, "波动 (Fluctuating)"),
    MEDIUM_SLOW(3, "中慢 (Medium Slow)"),
    FAST(4, "较快 (Fast)"),
    SLOW(5, "较慢 (Slow)");

    private final byte id;
    private final String description;
    private final int[] experienceTable;

    ExperienceGrowthRate(int id, String description) {
        this.id = (byte) id;
        this.description = description;
        this.experienceTable = new int[101];
        for (int level = 0; level <= 100; level++) {
            int exp = calculateExperienceForLevel(level);
            if (exp < 0) {
                exp = 0;
            }
            this.experienceTable[level] = exp;
        }
    }

    public byte getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 获取升至指定等级所需的累计经验值
     */
    public int getExperienceForLevel(int level) {
        if (level > 100) {
            return Integer.MAX_VALUE;
        }
        if (level < 0) {
            return 0;
        }
        return this.experienceTable[level];
    }

    public int calculateExperienceForLevel(int level) {
        switch (this.id) {
            case 0: // Medium Fast: n^3
                return (int) Math.pow(level, 3.0D);
            case 1: // Erratic
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
            case 2: // Fluctuating
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
            case 3: // Medium Slow: 1.2 n^3 - 15 n^2 + 100 n - 140
                return (int) (Math.pow(level, 3.0D) * 1.2D
                        - (double) (level * 15 * level) + (double) (level * 100) - 140.0D);
            case 4: // Fast: 4/5 n^3
                return (int) (Math.pow(level, 3.0D) * 4.0D / 5.0D);
            case 5: // Slow: 5/4 n^3
                return (int) (Math.pow(level, 3.0D) * 5.0D / 4.0D);
            default:
                return 0;
        }
    }

    public static ExperienceGrowthRate fromId(int id) {
        if (id >= 0 && id < values().length) {
            return values()[id];
        }
        return MEDIUM_FAST;
    }

    public q1_0 toBridge() {
        return (q1_0) q1_0.kc.BM(this.id);
    }

    public static ExperienceGrowthRate fromBridge(q1_0 legacy) {
        if (legacy == null) return null;
        return fromId(legacy.id0);
    }
}
