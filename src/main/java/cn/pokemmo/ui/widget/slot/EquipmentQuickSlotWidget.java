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
import f.hl0_0;
import f.lpt4__1;
import f.tw0_0;

/*
 * Renamed from f.f10
 */
public class EquipmentQuickSlotWidget extends BaseItemSlotWidget {
    public EquipmentQuickSlotWidget() {
        super((short)0, CH0.j1, (short)0, (short)0, true);
        if (tw0_0.kz0()) {
            this.ge = 25;
            this.ej0 = 25;
            this.Gx().dA(2.0f);
        } else {
            EquipmentQuickSlotWidget f10_02 = this;
            f10_02.ge = 12;
            f10_02.ej0 = 6;
        }
        this.uf("item-slot");
    }

    @Override
    public final void UR(K5 k5) {
        hl0_0 hl0_02 = k5.nn;
        short s = hl0_02.wQ;
        short s2 = hl0_02.PA0;
        this.Uj0(hl0_02.N50, s, s2);
        CH0 cfr_ignored_0 = k5.nn.Br;
    }

    @Override
    public final void a80(Jn0 jn0) {
        this.K8();
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            EquipmentQuickSlotWidget f10_02 = this;
            f10_02.RY(100, 100);
            f10_02.g2(100, 100);
            f10_02.oY(100, 100);
        } else {
            EquipmentQuickSlotWidget f10_03 = this;
            f10_03.RY(48, 48);
            f10_03.g2(48, 48);
            f10_03.oY(48, 48);
        }
    }
}

