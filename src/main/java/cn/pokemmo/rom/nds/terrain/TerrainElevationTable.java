/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.terrain;

import f.*;

public abstract class TerrainElevationTable {
    public static final byte[][] oM;

    public static short lPt3(byte by, byte by2, byte by3) {
        if (by == 0 && by2 == 0 && by3 == 0) {
            return 300;
        }
        if (by == 1 && by2 == 1 && by3 == 1) {
            return 100;
        }
        if (by == 2 && by2 == 2 && by3 == 2) {
            return 15;
        }
        if (by == 3 && by2 == 3 && by3 == 3) {
            return 15;
        }
        if (by == 5 && by2 == 5 && by3 == 5) {
            return 8;
        }
        if (by == 6 && by2 == 6 && by3 == 6) {
            return 8;
        }
        if (by == 4) {
            if (by2 == 4) {
                return 6;
            }
            return 2;
        }
        return 0;
    }

    static {
        byte[][] byArrayArray = new byte[3][];
        byte[] byArray = new byte[21];
        byte[] byArray2 = byArray;
        byArray[0] = 1;
        byArray2[1] = 3;
        byArray2[2] = 6;
        byArray2[3] = 0;
        byArray2[4] = 5;
        byArray2[5] = 2;
        byArray2[6] = 6;
        byArray2[7] = 2;
        byArray2[8] = 1;
        byArray2[9] = 4;
        byArray2[10] = 3;
        byArray2[11] = 0;
        byArray2[12] = 2;
        byArray2[13] = 6;
        byArray2[14] = 1;
        byArray2[15] = 2;
        byArray2[16] = 5;
        byArray2[17] = 0;
        byArray2[18] = 6;
        byArray2[19] = 2;
        byArray2[20] = 4;
        byArrayArray[0] = byArray2;
        byte[] byArray3 = new byte[21];
        byArray2 = byArray3;
        byArray3[0] = 6;
        byArray2[1] = 3;
        byArray2[2] = 1;
        byArray2[3] = 4;
        byArray2[4] = 5;
        byArray2[5] = 0;
        byArray2[6] = 3;
        byArray2[7] = 4;
        byArray2[8] = 5;
        byArray2[9] = 2;
        byArray2[10] = 3;
        byArray2[11] = 4;
        byArray2[12] = 5;
        byArray2[13] = 1;
        byArray2[14] = 3;
        byArray2[15] = 4;
        byArray2[16] = 5;
        byArray2[17] = 0;
        byArray2[18] = 4;
        byArray2[19] = 3;
        byArray2[20] = 5;
        byArrayArray[1] = byArray2;
        byte[] byArray4 = new byte[21];
        byArray2 = byArray4;
        byArray4[0] = 5;
        byArray2[1] = 3;
        byArray2[2] = 2;
        byArray2[3] = 6;
        byArray2[4] = 5;
        byArray2[5] = 3;
        byArray2[6] = 2;
        byArray2[7] = 5;
        byArray2[8] = 6;
        byArray2[9] = 3;
        byArray2[10] = 2;
        byArray2[11] = 5;
        byArray2[12] = 6;
        byArray2[13] = 3;
        byArray2[14] = 0;
        byArray2[15] = 1;
        byArray2[16] = 6;
        byArray2[17] = 5;
        byArray2[18] = 3;
        byArray2[19] = 2;
        byArray2[20] = 6;
        byArrayArray[2] = byArray2;
        oM = byArrayArray;
    }
}

