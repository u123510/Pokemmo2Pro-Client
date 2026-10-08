package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.TA
 */
public class Modern_Battle_TA
extends Jd0 {

    public Modern_Battle_TA() {
        super();
    }

    public static int[][][] AW = new int[2][][];
    public static int[][] aS;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static synchronized int l00(w90_0 w90_02, Object object, float[][] fArray, int n, int n2) {
        int n3;
        object = (ia_1)object;
        SL0 sL0 = ((ia_1)object).sw0;
        int n4 = sL0.fs;
        int n5 = ((ia_1)object).Cq0.yJ0;
        int n6 = (sL0.vr0 - sL0.lpT3) / n4;
        int n7 = (n6 + n5 - 1) / n5;
        if (AW.length < n) {
            AW = new int[n][][];
        }
        for (n3 = 0; n3 < n; ++n3) {
            int[][][] nArray = AW;
            int[][] nArray2 = AW[n3];
            if (nArray2 != null && nArray2.length >= n7) continue;
            nArray[n3] = new int[n7][];
        }
        for (n7 = 0; n7 < ((ia_1)object).Oq; ++n7) {
            n3 = 0;
            int n8 = 0;
            while (n3 < n6) {
                int n9;
                int n10;
                if (n7 == 0) {
                    for (n10 = 0; n10 < n; ++n10) {
                        n9 = ((ia_1)object).Cq0.FP(w90_02.bj0);
                        if (n9 == -1) {
                            return 0;
                        }
                        AW[n10][n8] = ((ia_1)object).kh[n9];
                        if (AW[n10][n8] != null) continue;
                        return 0;
                    }
                }
                for (n10 = 0; n10 < n5 && n3 < n6; ++n10, ++n3) {
                    for (n9 = 0; n9 < n; ++n9) {
                        int n11;
                        int n12;
                        int n13;
                        int n14;
                        DP dP;
                        int n15 = sL0.lpT3;
                        n15 = n3 * n4 + n15;
                        int n16 = AW[n9][n8][n10];
                        if ((sL0.rG[n16] & 1 << n7) == 0 || (dP = ((ia_1)object).Zc0[((ia_1)object).QA0[n16][n7]]) == null) continue;
                        if (n2 == 0) {
                            float[] fArray2 = fArray[n9];
                            IH0 iH0 = w90_02.bj0;
                            if (dP.S50(fArray2, n15, iH0, n4) != -1) continue;
                            return 0;
                        }
                        if (n2 != 1) continue;
                        float[] fArray3 = fArray[n9];
                        IH0 iH0 = w90_02.bj0;
                        if (dP.yJ0 > 8) {
                            n14 = 0;
                            while (n14 < n4) {
                                n13 = dP.FP(iH0);
                                if (n13 == -1) return 0;
                                n13 *= dP.yJ0;
                                n12 = 0;
                                while (n12 < dP.yJ0) {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                            }
                            continue;
                        }
                        n14 = 0;
                        block18: while (n14 < n4) {
                            n13 = dP.FP(iH0);
                            if (n13 == -1) {
                                return 0;
                            }
                            int n17 = dP.yJ0;
                            n13 *= n17;
                            n12 = 0;
                            switch (n17) {
                                default: {
                                    continue block18;
                                }
                                case 8: {
                                    n12 = n15 + n14++;
                                    n11 = 1;
                                    fArray3[n12] = fArray3[n12] + dP.cd[n13];
                                    n12 = n11;
                                }
                                case 7: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 6: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 5: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 4: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 3: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 2: {
                                    n11 = n15 + n14++;
                                    fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12++];
                                }
                                case 1: 
                            }
                            n11 = n15 + n14++;
                            fArray3[n11] = fArray3[n11] + dP.cd[n13 + n12];
                        }
                    }
                }
                ++n8;
            }
        }
        return 0;
    }

    public int rJ(w90_0 w90_02, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) continue;
            int n3 = n2 + 1;
            fArray[n2] = fArray[i];
            n2 = n3;
        }
        if (n2 != 0) {
            return TA.l00(w90_02, object, fArray, n2, 0);
        }
        return 0;
    }
}

