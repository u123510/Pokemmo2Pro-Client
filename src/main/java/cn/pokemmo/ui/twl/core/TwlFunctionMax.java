package cn.pokemmo.ui.twl.core;

import f.vp_1;

/**
 * TWL 动态数学解释器 Max 函数聚合器 (AbstractMathInterpreter.FunctionMax)
 * 原始混淆类: f.y6
 */
public class TwlFunctionMax extends vp_1 {

    @Override
    public Integer n10(int... nArray) {
        if (nArray == null || nArray.length == 0) {
            return 0;
        }
        int max = nArray[0];
        for (int i = 1; i < nArray.length; i++) {
            max = Math.max(max, nArray[i]);
        }
        return max;
    }

    @Override
    public Float I4(float... fArray) {
        if (fArray == null || fArray.length == 0) {
            return 0.0f;
        }
        float max = fArray[0];
        for (int i = 1; i < fArray.length; i++) {
            max = Math.max(max, fArray[i]);
        }
        return max;
    }
}
