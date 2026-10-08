package cn.pokemmo.constant.enums;

import f.*;

import f.ineter.pm_1;

public enum FieldMaskFlag {
    MASK_00,
    MASK_01,
    MASK_02,
    MASK_03,
    MASK_04,
    MASK_05,
    MASK_06,
    MASK_07,
    MASK_08,
    MASK_09,
    MASK_10,
    MASK_11,
    MASK_12,
    MASK_13,
    MASK_14,
    MASK_15,
    MASK_16,
    MASK_17,
    MASK_18,
    MASK_19,
    MASK_20,
    MASK_21,
    MASK_22,
    MASK_23,
    MASK_24,
    MASK_25,
    MASK_26,
    MASK_27,
    MASK_28,
    MASK_29,
    MASK_30,
    MASK_31,
    MASK_32;

    public static final FieldMaskFlag[] y4 = values();
    public final int M9;
    public final int De;

    FieldMaskFlag() {
        this.De = ordinal();
        this.M9 = this.De == 0 ? 0 : -1 << (32 - this.De);
    }

    public final int ld0() {
        return this.De;
    }

    public final pm_1 Gt0(pm_1 value) {
        return new pm_1(this.M9 & value.js0);
    }

    public final pm_1 MS(pm_1 value) {
        return new pm_1((this.M9 ^ -1) | value.js0);
    }

    public f.vi0_0 toLegacy() {
        return f.vi0_0.valueOf(name());
    }
}