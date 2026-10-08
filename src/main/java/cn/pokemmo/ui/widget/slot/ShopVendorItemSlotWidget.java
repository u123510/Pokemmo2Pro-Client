/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

import f.CH0;
import f.Jn0;
import f.K5;
import f.lpt4__1;
import f.tw0_0;

public class ShopVendorItemSlotWidget extends BaseItemSlotWidget {
    public ShopVendorItemSlotWidget(K5 k5) {
        super(k5.pm(), k5.QT(), (short)(byte)k5.I7(), (short)0, false);
        if (tw0_0.kz0()) {
            this.ge = 25;
            this.ej0 = 25;
            this.ka0();
        } else {
            ShopVendorItemSlotWidget vM = this;
            vM.ge = 10;
            vM.ej0 = 5;
        }
        ShopVendorItemSlotWidget vM = this;
        vM.uf("item-slot");
        vM.PF();
    }

    @Override
    public final void a80(Jn0 jn0) {
        this.K8();
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            ShopVendorItemSlotWidget vM = this;
            vM.RY(100, 100);
            vM.g2(100, 100);
            vM.oY(100, 100);
        } else {
            ShopVendorItemSlotWidget vM = this;
            vM.RY(48, 48);
            vM.g2(48, 48);
            vM.oY(48, 48);
        }
    }
}
