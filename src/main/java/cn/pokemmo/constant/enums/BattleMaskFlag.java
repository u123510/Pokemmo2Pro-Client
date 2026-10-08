package cn.pokemmo.constant.enums;

import f.*;

import f.ineter.qb0_1;

public enum BattleMaskFlag {
    MASK_000, MASK_001, MASK_002, MASK_003, MASK_004, MASK_005, MASK_006, MASK_007,
    MASK_008, MASK_009, MASK_010, MASK_011, MASK_012, MASK_013, MASK_014, MASK_015,
    MASK_016, MASK_017, MASK_018, MASK_019, MASK_020, MASK_021, MASK_022, MASK_023,
    MASK_024, MASK_025, MASK_026, MASK_027, MASK_028, MASK_029, MASK_030, MASK_031,
    MASK_032, MASK_033, MASK_034, MASK_035, MASK_036, MASK_037, MASK_038, MASK_039,
    MASK_040, MASK_041, MASK_042, MASK_043, MASK_044, MASK_045, MASK_046, MASK_047,
    MASK_048, MASK_049, MASK_050, MASK_051, MASK_052, MASK_053, MASK_054, MASK_055,
    MASK_056, MASK_057, MASK_058, MASK_059, MASK_060, MASK_061, MASK_062, MASK_063,
    MASK_064, MASK_065, MASK_066, MASK_067, MASK_068, MASK_069, MASK_070, MASK_071,
    MASK_072, MASK_073, MASK_074, MASK_075, MASK_076, MASK_077, MASK_078, MASK_079,
    MASK_080, MASK_081, MASK_082, MASK_083, MASK_084, MASK_085, MASK_086, MASK_087,
    MASK_088, MASK_089, MASK_090, MASK_091, MASK_092, MASK_093, MASK_094, MASK_095,
    MASK_096, MASK_097, MASK_098, MASK_099, MASK_100, MASK_101, MASK_102, MASK_103,
    MASK_104, MASK_105, MASK_106, MASK_107, MASK_108, MASK_109, MASK_110, MASK_111,
    MASK_112, MASK_113, MASK_114, MASK_115, MASK_116, MASK_117, MASK_118, MASK_119,
    MASK_120, MASK_121, MASK_122, MASK_123, MASK_124, MASK_125, MASK_126, MASK_127,
    MASK_128;

    public static final BattleMaskFlag[] t40;
    public final long Wf0;
    public final long Cj0;
    public final int eG0;

    static {
        t40 = values();
    }

    private BattleMaskFlag() {
        int i1 = ordinal();
        this.eG0 = i1;
        int i2 = Math.min(64, i1);
        i1 -= i2;
        if (i2 != 0) {
            this.Wf0 = Long.MIN_VALUE >> (i2 - 1);
        } else {
            this.Wf0 = 0L;
        }
        if (i1 != 0) {
            this.Cj0 = Long.MIN_VALUE >> (i1 - 1);
        } else {
            this.Cj0 = 0L;
        }
    }

    public final int kF() {
        return this.eG0;
    }

    public final qb0_1 L1(qb0_1 qb0_12) {
        return new qb0_1(qb0_12.fE0 & this.Wf0, qb0_12.Ek & this.Cj0);
    }

    public final qb0_1 R60(qb0_1 qb0_12) {
        return new qb0_1(qb0_12.fE0 | (this.Wf0 ^ -1L), qb0_12.Ek | (this.Cj0 ^ -1L));
    }

    public f.rm_2 toLegacy() {
        return f.rm_2.valueOf(name());
    }
}