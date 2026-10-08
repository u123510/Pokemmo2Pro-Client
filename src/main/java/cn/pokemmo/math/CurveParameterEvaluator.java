package cn.pokemmo.math;

public abstract class CurveParameterEvaluator {
    public final String[] oj;

    public CurveParameterEvaluator(String ... stringArray) {
        this.oj = stringArray;
    }

    public abstract int a80(float[] var1);

    public abstract float o6(int var1);
}
