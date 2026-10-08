package cn.pokemmo.math;

public abstract class AbstractFloatFunction {
    public abstract float compute(float var1);

    public boolean isValueOf(String string) {
        return string.equals(this.toString());
    }
}
