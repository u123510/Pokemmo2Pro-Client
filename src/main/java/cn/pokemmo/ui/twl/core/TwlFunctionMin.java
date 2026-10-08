package cn.pokemmo.ui.twl.core;

import f.vp_1;

/**
 * TWL 动态数学解释器 Min 函数聚合器 (AbstractMathInterpreter.FunctionMin)
 * 原始混淆类: f.nw_1
 */
public class TwlFunctionMin extends vp_1 {

    @Override
    public Integer n10(int... nArray) {
        if (nArray == null || nArray.length == 0) {
            return 0;
        }
        int min = nArray[0];
        for (int i = 1; i < nArray.length; i++) {
            min = Math.min(min, nArray[i]);
        }
        return min;
    }

    @Override
    public Float I4(float... fArray) {
        if (fArray == null || fArray.length == 0) {
            return 0.0f;
        }
        float min = fArray[0];
        for (int i = 1; i < fArray.length; i++) {
            min = Math.min(min, fArray[i]);
        }
        return min;
    }
}
