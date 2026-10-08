/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.render;

import f.*;

public class ViewportBoundingBox {
    public static final I4 ri;
    public static final I4 Ya;
    public static final I4 T6;
    public static final I4 Aj0;
    public static final I4 Bt;
    public static final I4 op;
    public static final I4 J10;
    public static final I4 n20;
    public static final I4 vb;
    public static final I4 WD0;
    public static final I4 eA;
    public static final I4 S1;
    public static final I4 Qo;
    public static final I4[] br;
    public final int Bw0;
    public final int Da0;
    public final int BR;
    public final int M20;
    public final boolean Em;

    public ViewportBoundingBox(int n, int n2, int n3, int n4, boolean bl) {
        this.Bw0 = n;
        this.Da0 = n2;
        this.BR = n3;
        this.M20 = n4;
        this.Em = bl;
    }

    static {
        I4 i422 = new I4(1, 0, 34, 35, false);
        ri = i422;
        I4 i423 = new I4(2, 1, 36, 40, true);
        I4 i424 = new I4(3, 5, 44, 45, false);
        I4 i425 = new I4(4, 1, 46, 50, true);
        Ya = i425;
        I4 i426 = new I4(5, 6, 54, 55, false);
        T6 = i426;
        I4 i427 = new I4(6, 7, 56, 57, false);
        Aj0 = i427;
        I4 i428 = new I4(7, 8, 58, 59, false);
        Bt = i428;
        I4 i429 = new I4(8, 13, 60, 61, false);
        op = i429;
        I4 i430 = new I4(9, 14, 62, 63, false);
        J10 = i430;
        I4 i431 = new I4(10, 4, 64, 65, false);
        n20 = i431;
        I4 i432 = new I4(11, 17, 66, 67, false);
        vb = i432;
        I4 i433 = new I4(12, 21, 70, 71, false);
        I4 i434 = new I4(13, 22, 72, 73, false);
        WD0 = i434;
        I4 i435 = new I4(14, 23, 74, 75, false);
        I4 i436 = new I4(15, 24, 76, 77, false);
        I4 i437 = new I4(16, 25, 78, 79, false);
        I4 i438 = new I4(17, 27, 82, 83, false);
        I4 i439 = new I4(18, 27, 78, 79, false);
        I4 i440 = new I4(100, 23, 82, 35, false);
        eA = i440;
        I4 i441 = new I4(101, 33, 76, 77, false);
        S1 = i441;
        I4 i442 = new I4(102, 31, 60, 35, false);
        Qo = i442;
        I4[] i4Array = new I4[21];
        I4[] i4Array2 = i4Array;
        i4Array[0] = i422;
        i4Array2[1] = i423;
        i4Array2[2] = i424;
        i4Array2[3] = i425;
        i4Array2[4] = i426;
        i4Array2[5] = i427;
        i4Array2[6] = i428;
        i4Array2[7] = i429;
        i4Array2[8] = i430;
        i4Array2[9] = i431;
        i4Array2[10] = i432;
        i4Array2[11] = i433;
        i4Array2[12] = i434;
        i4Array2[13] = i435;
        i4Array2[14] = i436;
        i4Array2[15] = i437;
        i4Array2[16] = i438;
        i4Array2[17] = i439;
        i4Array2[18] = i440;
        i4Array2[19] = i441;
        i4Array2[20] = i442;
        br = (I4[])i4Array2.clone();
    }

}

