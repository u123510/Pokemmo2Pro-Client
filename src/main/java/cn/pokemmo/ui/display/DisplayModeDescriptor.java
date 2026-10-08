package cn.pokemmo.ui.display;

public class DisplayModeDescriptor {
    public final int Vo;
    public final int c50;
    public final int ax;
    public final int tg0;

    public DisplayModeDescriptor(int n, int n2, int n3, int n4) {
        this.Vo = n;
        this.c50 = n2;
        this.ax = n3;
        this.tg0 = n4;
    }

    @Override
    public String toString() {
        return this.Vo + "x" + this.c50 + ", bpp: " + this.tg0 + ", hz: " + this.ax;
    }
}
