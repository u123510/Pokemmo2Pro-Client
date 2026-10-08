package cn.pokemmo.constant.enums;

import f.*;

public enum LocationType {
    UNKNOWN_0x00((byte) 0, false),
    VILLAGE((byte) 1, true),
    CITY((byte) 2, true),
    ROUTE((byte) 3, true),
    UNDERGROUND((byte) 4, false),
    UNDERWATER((byte) 5, false),
    UNKNOWN_0x06((byte) 6, true),
    UNKNOWN_0x07((byte) 7, false),
    INSIDE((byte) 8, false),
    SECRET_BASE((byte) 9, false);

    public static final LocationType YR = UNKNOWN_0x00;
    public static final LocationType LF = CITY;
    public static final LocationType wZ = ROUTE;
    public static final LocationType fs0 = UNDERGROUND;
    public static final LocationType GM = UNDERWATER;
    public static final LocationType tA = INSIDE;
    public static final LocationType vm0 = SECRET_BASE;
    public static final bm0_1 YC;
    public static final LocationType[] pRn;
    public final byte FC0;
    public final boolean AK;

    LocationType(byte code, boolean flag) {
        this.FC0 = code;
        this.AK = flag;
    }

    public static void t1(byte value) {
        YC.BM(value);
    }

    static {
        pRn = values();
        YC = new bm0_1();
        for (LocationType value : pRn) {
            YC.gE0(value.FC0, value);
        }
    }

    public f.gh_0 toLegacy() {
        return f.gh_0.valueOf(name());
    }
}