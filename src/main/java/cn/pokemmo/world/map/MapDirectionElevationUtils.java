/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map;

import f.*;

import f.C8;
import f.LW;

/*
 * Renamed from f.t70
 */
public abstract class MapDirectionElevationUtils {
    public static final C8 NY = new C8();
    public static final byte[] jv0 = new byte[]{1, 3, 0, 2};
    public static final int GP = 80;
    public static final int NA = 135;
    public static final int li = 275;
    public static final int Nj = 390;
    public static final int Pr = 525;
    public static final int Kr = 550;
    public static final int PZ = 200;

    public static byte PZ(byte by) {
        if (by != 0) {
            if (by != 1) {
                return by;
            }
            return 0;
        }
        return 1;
    }

    public static byte Kc0(byte by) {
        switch (by) {
            default: {
                return by;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 0;
            }
            case 0: 
        }
        return 1;
    }

    public static C8 Ts(byte by) {
        switch (by) {
            default: {
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                NY.x = f;
                NY.y = f2;
                NY.z = f3;
                return NY;
            }
            case 3: {
                float f = 1.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                NY.x = f;
                NY.y = f4;
                NY.z = f5;
                return NY;
            }
            case 2: {
                float f = -1.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                NY.x = f;
                NY.y = f6;
                NY.z = f7;
                return NY;
            }
            case 1: {
                float f = 0.0f;
                float f8 = 0.0f;
                float f9 = -1.0f;
                NY.x = f;
                NY.y = f8;
                NY.z = f9;
                return NY;
            }
            case 0: 
        }
        float f = 0.0f;
        float f10 = 0.0f;
        float f11 = 1.0f;
        NY.x = f;
        NY.y = f10;
        NY.z = f11;
        return NY;
    }

    public static String HF0(byte by) {
        if (by != 1) {
            if (by != 2) {
                if (by != 3) {
                    return "SOUTH";
                }
                return "EAST";
            }
            return "WEST";
        }
        return "NORTH";
    }

    public static byte xw0(byte by, float f) {
        block20: {
            block21: {
                block19: {
                    if (!LW.LH0(f, 270.0f)) break block19;
                    switch (by) {
                        default: {
                            break block20;
                        }
                        case 3: {
                            return 1;
                        }
                        case 2: {
                            return 0;
                        }
                        case 1: {
                            return 2;
                        }
                        case 0: {
                            return 3;
                        }
                    }
                }
                if (!LW.LH0(f, 90.0f)) break block21;
                switch (by) {
                    default: {
                        break block20;
                    }
                    case 3: {
                        return 0;
                    }
                    case 2: {
                        return 1;
                    }
                    case 1: {
                        return 3;
                    }
                    case 0: {
                        return 2;
                    }
                }
            }
            if (LW.LH0(f, 180.0f)) {
                switch (by) {
                    default: {
                        break;
                    }
                    case 3: {
                        return 2;
                    }
                    case 2: {
                        return 3;
                    }
                    case 1: {
                        return 0;
                    }
                    case 0: {
                        return 1;
                    }
                }
            }
        }
        return by;
    }
}

