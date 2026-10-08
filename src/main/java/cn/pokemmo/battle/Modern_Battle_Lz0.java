package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Lz0
 */
public class Modern_Battle_Lz0 {

    public i30_0 sg;
    public int H0;
    public float[][] Us0;
    public int Na;
    public int Fu0;
    public int db0;
    public int ux;
    public int X5;
    public int M00;
    public long dz0;
    public long Vg0;
    public final float[][][][][] EF0;
    public final Object[][] dH = new Object[2][];
    public DP[] xY;
    public Object[] TS;

    public Modern_Battle_Lz0() {
        this.EF0 = new float[2][2][2][2][];
    }

    public static float[] xE0(int size, int startFadeLength, int endFadeLength) {
        float[] values = new float[size];
        int start = size / 4 - startFadeLength / 2;
        int end = size - size / 4 - endFadeLength / 2;

        for (int index = 0; index < startFadeLength; index++) {
            float input = (float) Math.sin((float) (((double) index + 0.5D)
                    / (double) startFadeLength * 3.1415927410125732D / 2.0D));
            values[index + start] = (float) Math.sin((double) (input * input)
                    * 1.5707963705062866D);
        }
        for (int index = start + startFadeLength; index < end; index++) {
            values[index] = 1.0F;
        }
        for (int index = 0; index < endFadeLength; index++) {
            float input = (float) Math.sin((float) (((double) (endFadeLength - index) - 0.5D)
                    / (double) endFadeLength * 3.1415927410125732D / 2.0D));
            values[index + end] = (float) Math.sin((double) (input * input)
                    * 1.5707963705062866D);
        }
        return values;
    }
}

