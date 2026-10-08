package cn.pokemmo.rom.gba.tileset;

import java.util.HashMap;

public class GbaAnimatedTileDescriptor {
    public final byte Ax0;
    public final int lb0;
    public int n0;
    public final int t3;
    public final int Zh;
    public final int Pm;
    public final int LG0;
    public int rw;
    public final int D1;
    public final HashMap Vy;

    public GbaAnimatedTileDescriptor(byte i1, int i2, int i3, int i4, int i5, int i6) {
        super();
        this.rw = 0;
        this.Vy = new HashMap();
        this.Ax0 = i1;
        this.lb0 = i2;
        this.n0 = 0;
        this.t3 = i3;
        this.Zh = i4;
        this.Pm = i4 + i5;
        this.LG0 = i5;
        this.D1 = i6;
    }

    public GbaAnimatedTileDescriptor DP(int i1) {
        this.rw = i1;
        return this;
    }
}
