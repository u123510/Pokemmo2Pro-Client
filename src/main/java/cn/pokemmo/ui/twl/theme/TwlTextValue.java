package cn.pokemmo.ui.twl.theme;

/**
 * 文本值与单位封装 (textarea.Value)
 */
public class TwlTextValue {
    public static final TwlTextValue ZERO_PX = new TwlTextValue(0.0f, TwlTextUnit.PX);
    public static final TwlTextValue AUTO = new TwlTextValue(0.0f, TwlTextUnit.AUTO);

    public final float value;
    public final int unit;

    public TwlTextValue(float value, int unit) {
        if (unit == 0) {
            throw new NullPointerException("unit");
        }
        if (unit == TwlTextUnit.AUTO && value != 0.0f) {
            throw new IllegalArgumentException("value must be 0 for Unit.AUTO");
        }
        this.value = value;
        this.unit = unit;
    }

    public float getValue() {
        return this.value;
    }

    public int getUnit() {
        return this.unit;
    }

    public boolean isFontRelative() {
        return TwlTextUnit.isFontRelative(this.unit);
    }

    @Override
    public String toString() {
        if (this.unit == TwlTextUnit.AUTO) {
            return TwlTextUnit.getSuffix(this.unit);
        }
        return this.value + TwlTextUnit.getSuffix(this.unit);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof TwlTextValue) {
            TwlTextValue other = (TwlTextValue) object;
            return this.value == other.value && this.unit == other.unit;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = (Float.floatToIntBits(this.value) + 51) * 17;
        return (this.unit - 1) + n;
    }
}
