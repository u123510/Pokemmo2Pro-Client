/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.audio.vorbis;

import f.*;

public class VorbisResidue0Decoder
extends TA {
    @Override
    public final int rJ(w90_0 w90_0_, Object object, float[][] fArray, int[] nArray, int n) {
        int i = 0;
        while (i < n && nArray[i] == 0) {
            ++i;
        }
        if (i == n) {
            return 0;
        }
        synchronized (TA.class) {
            ia_1 ia_1_ = (ia_1)object;
            SL0 sl0 = ia_1_.sw0;
            int n6 = sl0.fs;
            int n7 = ia_1_.Cq0.yJ0;
            int n8 = (sl0.vr0 - sl0.lpT3) / n6;
            int n9 = (n8 + n7 - 1) / n7;
            if (TA.aS == null || TA.aS.length < n9) {
                TA.aS = new int[n9][];
            }
            for (n9 = 0; n9 < ia_1_.Oq; ++n9) {
                int n10 = 0;
                int n11 = 0;
                while (n10 < n8) {
                    if (n9 == 0) {
                        int n12 = ia_1_.Cq0.FP(w90_0_.bj0);
                        if (n12 == -1) {
                            return 0;
                        }
                        TA.aS[n11] = ia_1_.kh[n12];
                        if (TA.aS[n11] == null) {
                            return 0;
                        }
                    }
                    for (int n12 = 0; n12 < n7 && n10 < n8; ++n12, ++n10) {
                        int n13 = sl0.lpT3 + n10 * n6;
                        int n14 = TA.aS[n11][n12];
                        if ((sl0.rG[n14] & (1 << n9)) == 0) continue;
                        DP dp = ia_1_.Zc0[ia_1_.QA0[n14][n9]];
                        if (dp == null) continue;
                        int n16 = 0;
                        int n17 = n13 / n;
                        while (n17 < (n13 + n6) / n) {
                            int n18 = dp.FP(w90_0_.bj0);
                            if (n18 == -1) {
                                return 0;
                            }
                            n18 *= dp.yJ0;
                            for (int n19 = 0; n19 < dp.yJ0; ++n19) {
                                fArray[n16][n17] = fArray[n16][n17] + dp.cd[n18 + n19];
                                ++n16;
                                if (n16 == n) {
                                    n16 = 0;
                                    ++n17;
                                }
                            }
                        }
                    }
                    ++n11;
                }
            }
            return 0;
        }
    }
}
