package cn.pokemmo.ui.layout.twl;

public class SizeRange {
    public final int COM1;
    public final int vJ0;
    public final int Fv0;

    public SizeRange(int value) {
        this(value, value, value);
    }

    public SizeRange(int min, int preferred, int max) {
        if (min < 0) {
            throw new IllegalArgumentException("min");
        }
        if (preferred < min) {
            throw new IllegalArgumentException("preferred");
        }
        if (max < 0 || (max > 0 && max < preferred)) {
            throw new IllegalArgumentException("max");
        }
        this.COM1 = min;
        this.vJ0 = preferred;
        this.Fv0 = max;
    }
}
