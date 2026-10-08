package cn.pokemmo.ui.layout.twl;

import f.fp0_0;

public class Dimension {
    public static final Dimension ZERO = new Dimension(0, 0);
    public final int Com9;
    public final int Eg0;

    public Dimension(int width, int height) {
        this.Com9 = width;
        this.Eg0 = height;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Dimension other) {
            return this.Com9 == other.Com9 && this.Eg0 == other.Eg0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (213 + this.Com9) * 71 + this.Eg0;
    }

    @Override
    public String toString() {
        return fp0_0.uD(new StringBuilder("Dimension[x=").append(this.Com9).append(", y="), this.Eg0, "]");
    }
}
