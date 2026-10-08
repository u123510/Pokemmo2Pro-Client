package cn.pokemmo.constant.enums;

import f.*;

public enum BattleEffectPhase {
    lPt9("BYTE_A", 0, 0),
    eV("BYTE_B", 1, 1),
    nv0("BYTE_C", 2, 2),
    EA("BYTE_D", 3, 3),
    u00("BYTE_E", 4, 4),
    pJ("BYTE_F", 5, 5),
    Xw0("BYTE_G", 6, 6),
    jF("BYTE_H", 7, 7);

    public final long V6;
    public final int kG0;

    BattleEffectPhase(String name, int ordinal, int byteIndex) {
        int shift = byteIndex << 3;
        this.kG0 = 56 - shift;
        this.V6 = 0xFF00000000000000L >>> shift;
    }

    public static long mC(byte[] values, int offset) {
        return lPt9.r2(values[offset])
                | eV.r2(values[offset + 1])
                | nv0.r2(values[offset + 2])
                | EA.r2(values[offset + 3])
                | u00.r2(values[offset + 4])
                | pJ.r2(values[offset + 5])
                | Xw0.r2(values[offset + 6])
                | jF.r2(values[offset + 7]);
    }

    public final byte bH(long value) {
        return (byte) ((value & this.V6) >>> this.kG0);
    }

    public final long r2(byte value) {
        return ((long) value & 255L) << this.kG0;
    }

    public f.xe0_1 toLegacy() {
        return f.xe0_1.valueOf(name());
    }
}