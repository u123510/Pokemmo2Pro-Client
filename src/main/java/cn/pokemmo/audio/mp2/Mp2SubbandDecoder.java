package cn.pokemmo.audio.mp2;

import f.AE0;
import f.B7;
import f.Tn;
import f.c50_0;
import f.id0_1;
import f.kk_1;

/**
 * MPEG-1/2 Audio Layer II 子带解码器 (MPEG Layer II Subband Decoder)
 * <p>
 * 原始混淆类: {@code f._switch}
 */
public class Mp2SubbandDecoder extends Tn {
    public static final int[] V0;
    public static final float[][] H3;
    public static final float[] y7;
    public static final float[] Mw;
    public static final float[] CQ;
    public static final float[][] lR;
    public static final int[] LL;
    public static final float[] TZ;
    public static final float[] Ae;
    public static final float[] Os0;
    public static final int[] E9;
    public static final float[] aH;
    public static final float[] US;
    public static final float[] XF0;
    public static final int[] MT;
    public static final float[] v;
    public static final float[] Vv0;
    public static final float[] Wn0;
    public static final int[] hZ;
    public static final float[][] pD;
    public static final float[] K80;
    public static final float[] Db;
    public static final float[] SI0;
    public final int in0;
    public int l7;
    public int Iu0;
    public float aC0;
    public float o40;
    public float bi0;
    public final int[] By;
    public final float[][] LPT6;
    public final float[] Jm0;
    public int ue0;
    public int CS;
    public final float[] oS;
    public final float[] vu0;
    public final float[] iu0;

    static {
        float[] three = grid(new float[] { -0.6666666865F, 0.0F, 0.6666666865F });
        float[] five = grid(new float[] { -0.8000000119F, -0.400000006F, 0.0F, 0.400000006F, 0.8000000119F });
        float[] nine = grid(new float[] { -0.8888888955F, -0.6666666865F, -0.4444444478F, -0.2222222239F,
                0.0F, 0.2222222239F, 0.4444444478F, 0.6666666865F, 0.8888888955F });
        V0 = new int[] { 0, 5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        H3 = new float[][] { null, three, null, null, null, null, null, null, null, null, null, null, null, null, null, null };
        y7 = new float[] { 0, 0.5F, 0.25F, 0.125F, 0.0625F, 0.03125F, 0.015625F, 0.0078125F,
                0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0001220703F, 0.0000610352F, 0.0000305176F };
        Mw = new float[] { 0, 1.3333333731F, 1.1428571939F, 1.0666667223F, 1.0322580338F, 1.0158730745F,
                1.007874012F, 1.003921628F, 1.0019569397F, 1.0009775162F, 1.0004885197F, 1.0002442598F,
                1.0001220703F, 1.0000610352F, 1.0000305176F, 1.0000152588F };
        CQ = new float[] { 0, 0.5F, 0.25F, 0.125F, 0.0625F, 0.03125F, 0.015625F, 0.0078125F,
                0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0001220703F, 0.0000610352F, 0.0000305176F };
        lR = new float[][] { null, three, five, null, nine, null, null, null, null, null, null, null, null, null, null, null };
        LL = new int[] { 0, 5, 7, 3, 10, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16 };
        TZ = new float[] { 0, 0.5F, 0.25F, 0.25F, 0.125F, 0.125F, 0.0625F, 0.03125F,
                0.015625F, 0.0078125F, 0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0000305176F };
        Ae = new float[] { 0, 1.3333333731F, 1.6000000238F, 1.1428571939F, 1.777777791F, 1.0666667223F,
                1.0322580338F, 1.0158730745F, 1.007874012F, 1.003921628F, 1.0019569397F, 1.0009775162F,
                1.0004885197F, 1.0002442598F, 1.0001220703F, 1.0000152588F };
        Os0 = new float[] { 0, 0.5F, 0.5F, 0.25F, 0.5F, 0.125F, 0.0625F, 0.03125F,
                0.015625F, 0.0078125F, 0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0000305176F };
        E9 = new int[] { 0, 5, 7, 3, 10, 4, 5, 16 };
        aH = new float[] { 0, 0.5F, 0.25F, 0.25F, 0.125F, 0.125F, 0.0625F, 0.0000305176F };
        US = new float[] { 0, 1.3333333731F, 1.6000000238F, 1.1428571939F, 1.777777791F, 1.0666667223F, 1.0322580338F, 1.0000152588F };
        XF0 = new float[] { 0, 0.5F, 0.5F, 0.25F, 0.5F, 0.125F, 0.0625F, 0.0000305176F };
        MT = new int[] { 0, 5, 7, 16 };
        v = new float[] { 0, 0.5F, 0.25F, 0.0000305176F };
        Vv0 = new float[] { 0, 1.3333333731F, 1.6000000238F, 1.0000152588F };
        Wn0 = new float[] { 0, 0.5F, 0.5F, 0.0000305176F };
        hZ = new int[] { 0, 5, 7, 10, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        pD = new float[][] { null, three, five, nine, null, null, null, null, null, null, null, null, null, null, null, null };
        K80 = new float[] { 0, 0.5F, 0.25F, 0.125F, 0.125F, 0.0625F, 0.03125F, 0.015625F,
                0.0078125F, 0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0001220703F, 0.0000610352F };
        Db = new float[] { 0, 1.3333333731F, 1.6000000238F, 1.777777791F, 1.0666667223F, 1.0322580338F,
                1.0158730745F, 1.007874012F, 1.003921628F, 1.0019569397F, 1.0009775162F, 1.0004885197F,
                1.0002442598F, 1.0001220703F, 1.0000610352F, 1.0000305176F };
        SI0 = new float[] { 0, 0.5F, 0.5F, 0.5F, 0.125F, 0.0625F, 0.03125F, 0.015625F,
                0.0078125F, 0.00390625F, 0.001953125F, 0.0009765625F, 0.0004882812F, 0.0002441406F, 0.0001220703F, 0.0000610352F };
    }

    private static float[] grid(float[] levels) {
        float[] result = new float[levels.length * levels.length * levels.length * 3];
        int index = 0;
        for (float z : levels) {
            for (float y : levels) {
                for (float x : levels) {
                    result[index++] = x;
                    result[index++] = y;
                    result[index++] = z;
                }
            }
        }
        return result;
    }

    public Mp2SubbandDecoder(int subband) {
        By = new int[] { 0 };
        LPT6 = new float[2][];
        Jm0 = new float[] { 0.0F };
        oS = new float[3];
        vu0 = new float[] { 0.0F };
        iu0 = new float[] { 0.0F };
        in0 = subband;
        CS = 0;
        ue0 = 0;
    }

    public final int I1(c50_0 header) {
        if (header.wn == 1) {
            int bitrate = header.xc;
            if (header.fJ != 3) bitrate = bitrate == 4 ? 1 : bitrate - 4;
            if (bitrate == 1 || bitrate == 2) return in0 <= 1 ? 4 : 3;
            if (in0 <= 10) return 4;
            return in0 <= 22 ? 3 : 2;
        }
        if (in0 <= 3) return 4;
        return in0 <= 10 ? 3 : 2;
    }

    public final void C40(c50_0 header, int allocation, int channel, float[] factor,
            int[] bits, float[] scale, float[] offset) {
        int bitrate = header.xc;
        if (header.fJ != 3) bitrate = bitrate == 4 ? 1 : bitrate - 4;
        if (bitrate == 1 || bitrate == 2) {
            LPT6[channel] = pD[allocation];
            factor[0] = K80[allocation];
            bits[0] = hZ[allocation];
            scale[0] = Db[allocation];
            offset[0] = SI0[allocation];
        } else if (in0 <= 2) {
            LPT6[channel] = H3[allocation];
            factor[0] = y7[allocation];
            bits[0] = V0[allocation];
            scale[0] = Mw[allocation];
            offset[0] = CQ[allocation];
        } else {
            LPT6[channel] = lR[allocation];
            if (in0 <= 10) {
                factor[0] = TZ[allocation];
                bits[0] = LL[allocation];
                scale[0] = Ae[allocation];
                offset[0] = Os0[allocation];
            } else if (in0 <= 22) {
                factor[0] = aH[allocation];
                bits[0] = E9[allocation];
                scale[0] = US[allocation];
                offset[0] = XF0[allocation];
            } else {
                factor[0] = v[allocation];
                bits[0] = MT[allocation];
                scale[0] = Vv0[allocation];
                offset[0] = Wn0[allocation];
            }
        }
    }

    @Override
    public void uf0(kk_1 bits, c50_0 header, AE0 crc) {
        int width = I1(header);
        int allocation = bits.DA(width);
        l7 = allocation;
        if (crc != null) crc.pI(allocation, width);
    }

    public void switch$(kk_1 bits, AE0 crc) {
        if (l7 != 0) {
            int selection = bits.DA(2);
            Iu0 = selection;
            if (crc != null) crc.pI(selection, 2);
        }
    }

    @Override
    public void zC0(kk_1 bits, c50_0 header) {
        if (l7 == 0) return;
        switch (Iu0) {
            case 0:
                aC0 = id0_1.YL0[bits.DA(6)];
                o40 = id0_1.YL0[bits.DA(6)];
                bi0 = id0_1.YL0[bits.DA(6)];
                break;
            case 1:
                o40 = id0_1.YL0[bits.DA(6)];
                aC0 = o40;
                bi0 = id0_1.YL0[bits.DA(6)];
                break;
            case 2:
                bi0 = id0_1.YL0[bits.DA(6)];
                o40 = bi0;
                aC0 = bi0;
                break;
            case 3:
                aC0 = id0_1.YL0[bits.DA(6)];
                bi0 = id0_1.YL0[bits.DA(6)];
                o40 = bi0;
                break;
            default: break;
        }
        C40(header, l7, 0, Jm0, By, vu0, iu0);
    }

    @Override
    public boolean Rb(kk_1 bits) {
        if (l7 != 0) {
            if (LPT6[0] != null) {
                int code = bits.DA(By[0]);
                int index = code + (code << 1);
                float[] table = LPT6[0];
                if (index > table.length - 3) index = table.length - 3;
                oS[0] = table[index];
                oS[1] = table[index + 1];
                oS[2] = table[index + 2];
            } else {
                oS[0] = (float) ((double) ((float) bits.DA(By[0]) * Jm0[0]) - 1.0);
                oS[1] = (float) ((double) ((float) bits.DA(By[0]) * Jm0[0]) - 1.0);
                oS[2] = (float) ((double) ((float) bits.DA(By[0]) * Jm0[0]) - 1.0);
            }
        }
        CS = 0;
        return ++ue0 == 12;
    }

    @Override
    public boolean po0(int channel, B7 first, B7 second) {
        if (l7 != 0 && channel != 2) {
            float value = oS[CS];
            if (LPT6[0] == null) value = (value + iu0[0]) * vu0[0];
            if (ue0 <= 4) value *= aC0;
            else if (ue0 <= 8) value *= o40;
            else value *= bi0;
            first.RE[in0] = value;
        }
        return ++CS == 3;
    }
}
