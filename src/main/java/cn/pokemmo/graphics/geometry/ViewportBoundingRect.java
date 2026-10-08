package cn.pokemmo.graphics.geometry;

import f.ql_0;

public class ViewportBoundingRect extends ql_0 {
    public int[] F70;
    public int[] tf0;
    public final int Gl;
    public final int OF;
    public final int RB;
    public final int pI0;

    public ViewportBoundingRect(int i, int j, int k, int l) {
        super((float) i, (float) j, (float) k, (float) l);
        this.Gl = 0;
        this.OF = 0;
        this.RB = k;
        this.pI0 = l;
    }

    public ViewportBoundingRect(int i, int j, int k, int l, int i5, int i6, int i7, int i8) {
        super((float) i, (float) j, (float) k, (float) l);
        this.Gl = i5;
        this.OF = i6;
        this.RB = i7;
        this.pI0 = i8;
    }
}
