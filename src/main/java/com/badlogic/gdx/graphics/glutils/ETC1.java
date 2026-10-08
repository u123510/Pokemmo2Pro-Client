/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.glutils;

import f.ay_2;
import f.i4_0;
import f.ix0_0;
import f.nf_1;
import java.nio.ByteBuffer;

public class ETC1 {
    public static i4_0 xL0(ay_2 ay_22, ix0_0 ix0_02) {
        block7: {
            i4_0 i4_02;
            int n;
            int n2;
            int n3;
            int n4;
            block6: {
                block5: {
                    if (ay_22.jY == 16) {
                        ay_2 ay_23 = ay_22;
                        n4 = 16;
                        n3 = ETC1.getWidthPKM(ay_23.f, 0);
                        n2 = ETC1.getHeightPKM(ay_23.f, 0);
                    } else {
                        ay_2 ay_24 = ay_22;
                        n4 = 0;
                        n3 = ay_24.o5;
                        n2 = ay_24.tx;
                    }
                    if (ix0_02 != ix0_0.Tr) break block5;
                    n = 2;
                    break block6;
                }
                if (ix0_02 != ix0_0.n2) break block7;
                n = 3;
            }
            i4_0 i4_03 = new i4_0(n3, n2, ix0_02);
            ETC1.decodeImage(ay_22.f, n4, i4_03.Rh0(), 0, n3, n2, n);
            return i4_03;
        }
        throw new nf_1("Can only handle RGB565 or RGB888 images");
    }

    public static native int getWidthPKM(ByteBuffer var0, int var1);

    public static native int getHeightPKM(ByteBuffer var0, int var1);

    public static native boolean isValidPKM(ByteBuffer var0, int var1);

    private static native void decodeImage(ByteBuffer var0, int var1, ByteBuffer var2, int var3, int var4, int var5, int var6);
}
