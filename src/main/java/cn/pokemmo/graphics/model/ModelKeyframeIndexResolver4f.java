package cn.pokemmo.graphics.model;

import f.*;

import cn.pokemmo.graphics.model.ModelKeyframeIndexResolver;

public class ModelKeyframeIndexResolver4f extends ModelKeyframeIndexResolver {
    public ModelKeyframeIndexResolver4f(float first, float second, float third, float fourth) {
        super(first, second, third, fourth);
    }

    public static XR[] Rv(int count, float[] first, float[] second,
                           float[] third, float[] fourth) {
        XR[] result = new XR[count];
        for (int index = 0; index < count; index++) {
            float value1 = 0.0f;
            float value2 = 0.0f;
            float value3 = 1.0f;
            float value4 = 1.0f;
            if (first.length > index) {
                value1 = first[index];
            }
            if (second != null && second.length > index) {
                value2 = second[index];
            }
            if (third != null && third.length > index) {
                value3 = third[index];
            }
            if (fourth != null && fourth.length > index) {
                value4 = fourth[index];
            }
            result[index] = new XR(value1, value2, value3, value4);
        }
        return result;
    }

    public static XR[] c00(int count, lm0_0 source) {
        XR[] result = new XR[count];
        for (int index = 0; index < count; index++) {
            float value1 = px_1.Ei0(source.Qb0);
            float value2 = px_1.Ei0(source.v2);
            float value3 = px_1.Ei0(source.ek);
            float value4 = px_1.Ei0(source.CL0);
            if (source.R90 != null && source.R90.length > index) {
                value1 = source.R90[index];
            }
            if (source.wj != null && source.wj.length > index) {
                value2 = source.wj[index];
            }
            if (source.Ij != null && source.Ij.length > index) {
                value3 = source.Ij[index];
            }
            if (source.Tl0 != null && source.Tl0.length > index) {
                value4 = source.Tl0[index];
            }
            result[index] = new XR(value1, value2, value3, value4);
        }
        return result;
    }
}
