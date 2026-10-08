package cn.pokemmo.ui.widget.component;

import f.TJ0;
import f.Vt0;
import f.Wr;
import f.le0_2;
import f.tw0_0;

public abstract class SpriteMenuItem extends Vt0 {
    public final Wr Tv;
    public final int oz0;
    public final int QL;
    public final int cOm6;

    public SpriteMenuItem(String v1, Wr v2) {
        super(v1);
        int i4 = tw0_0.kz0() ? 2 : 1;
        this.cOm6 = i4;
        this.Tv = v2;
        this.oz0 = 3;
        this.QL = 3;
    }

    public abstract le0_2 pl0(TJ0 v1, int i2);
}
