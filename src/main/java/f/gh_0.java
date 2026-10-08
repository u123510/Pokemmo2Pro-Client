package f;

import cn.pokemmo.constant.enums.LocationType;

public enum gh_0 {
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

    public static final gh_0 YR = UNKNOWN_0x00;
    public static final gh_0 LF = CITY;
    public static final gh_0 wZ = ROUTE;
    public static final gh_0 fs0 = UNDERGROUND;
    public static final gh_0 GM = UNDERWATER;
    public static final gh_0 tA = INSIDE;
    public static final gh_0 vm0 = SECRET_BASE;
    public static final bm0_1 YC;
    public static final gh_0[] pRn;
    public final byte FC0;
    public final boolean AK;

    gh_0(byte code, boolean flag) {
        this.FC0 = code;
        this.AK = flag;
    }

    public static void t1(byte value) {
        YC.BM(value);
    }

    static {
        pRn = values();
        YC = new bm0_1();
        for (gh_0 value : pRn) {
            YC.gE0(value.FC0, value);
        }
    }

    public LocationType asModern() {
        return LocationType.valueOf(name());
    }
}