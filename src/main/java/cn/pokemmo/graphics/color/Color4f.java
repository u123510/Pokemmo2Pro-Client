package cn.pokemmo.graphics.color;

public class Color4f {
    public byte cv;
    public byte x8;
    public byte sh;
    public byte FY;

    public Color4f() {}

    public Color4f(byte b, byte b2, byte b3, byte b4) {
        this.cv = b;
        this.x8 = b2;
        this.sh = b3;
        this.FY = b4;
    }

    public Color4f(int i) {
        this.FY = (byte) (i >> 24);
        this.cv = (byte) (i >> 16);
        this.x8 = (byte) (i >> 8);
        this.sh = (byte) i;
    }

    public final int ls() {
        return ((this.FY & 255) << 24) | ((this.cv & 255) << 16) | ((this.x8 & 255) << 8) | (this.sh & 255);
    }

    public final float HH() {
        return (float) (this.cv & 255) * 0.0039215689f;
    }

    public final float W1() {
        return (float) (this.x8 & 255) * 0.0039215689f;
    }

    public final float eD0() {
        return (float) (this.sh & 255) * 0.0039215689f;
    }

    public final float bh() {
        return (float) (this.FY & 255) * 0.0039215689f;
    }

    @Override
    public String toString() {
        if (this.FY != -1) {
            return String.format("#%08X", ls());
        }
        return String.format("#%06X", ls() & 16777215);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Color4f) {
            return ls() == ((Color4f) obj).ls();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ls();
    }
}
