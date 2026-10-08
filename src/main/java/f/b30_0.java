package f;

import cn.pokemmo.battle.Modern_Battle_B300;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.b30_0
 * 核心实现已迁移至 {@link Modern_Battle_B300}
 */
public final class b30_0 extends Modern_Battle_B300 {
    public static final b30_0[][] Lt = new b30_0[15][6];
    public static final b30_0 lJ0 = new b30_0((byte)-1, (byte)-1);

    public b30_0(byte by, byte by2) {
        super(by, by2);
    }

    public static b30_0 U5(byte by, byte by2) {
        if (by >= 0) {
            b30_0[] row;
            if (by < Lt.length && by2 >= 0 && by2 < (row = Lt[by]).length) {
                return row[by2];
            }
        }
        if (by == -1 && by2 == -1) {
            return lJ0;
        }
        throw new IllegalStateException(ac0_0.YH0("Out of range: ", by, " ", by2));
    }

    public static b30_0 f5(byte by) {
        byte by2 = (byte)(by & 0xF);
        by = (byte)(by >> 4 & 0xF);
        if (by2 == 15) {
            by2 = -1;
        }
        if (by == 15) {
            by = (byte)-1;
        }
        return b30_0.U5(by2, by);
    }

    static {
        for (byte by = 0; by < Lt.length; by = (byte)((byte)(by + 1))) {
            b30_0[] row = Lt[by];
            for (byte by2 = 0; by2 < row.length; by2 = (byte)(by2 + 1)) {
                row[by2] = new b30_0(by, by2);
            }
        }
    }
}
