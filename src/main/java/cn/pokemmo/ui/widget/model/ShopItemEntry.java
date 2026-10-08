package cn.pokemmo.ui.widget.model;

import f.CH0;
import f.K5;
import f.cr_0;
import f.lpt2__5;

public class ShopItemEntry extends lpt2__5 {
    public final K5 implements$;
    private final int quotedSellPrice;

    public ShopItemEntry(K5 v1, cr_0 v2, int i3) {
        this(v1, v2, i3, 0);
    }

    public ShopItemEntry(K5 v1, cr_0 v2, int i3, int quotedSellPrice) {
        super(v1.LW(), v2, -1, v1.I7(), i3, v1.I7());
        this.implements$ = v1;
        this.quotedSellPrice = quotedSellPrice;
    }

    public int oF0() {
        return this.quotedSellPrice > 0 ? this.quotedSellPrice : this.XH0.gQ();
    }

    public short Sv0() {
        return this.implements$.nn.PA0;
    }

    public CH0 uq() {
        return this.implements$.nn.Br;
    }
}
