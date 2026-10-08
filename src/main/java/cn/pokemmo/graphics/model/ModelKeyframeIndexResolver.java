package cn.pokemmo.graphics.model;

import f.*;

public class ModelKeyframeIndexResolver {
    public final float I1;
    public final float Yz0;
    public final float ul;
    public final float XU;

    public ModelKeyframeIndexResolver(float first, float second, float third, float fourth) {
        this.I1 = first;
        this.Yz0 = second;
        this.ul = third;
        this.XU = fourth;
    }

    public static ModelKeyframeIndexResolver[] Rv(int count, float[] first, float[] second,
                           float[] third, float[] fourth) {
        return f.XR.Rv(count, first, second, third, fourth);
    }

    public static ModelKeyframeIndexResolver[] c00(int count, lm0_0 source) {
        return f.XR.c00(count, source);
    }
}
