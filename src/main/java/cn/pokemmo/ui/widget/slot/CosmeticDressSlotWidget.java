package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class CosmeticDressSlotWidget extends BaseItemSlotWidget {
    public final Mm YA0;
    public final le0_2 v10;
    public final le0_2 MB0;
    public final xe_1[] vr0;
    public CH0 XB0;

    public CosmeticDressSlotWidget(Mm owner, xe_1[] slots) {
        super((short) 0, CH0.j1, (short) 0, (short) 0, true);
        this.XB0 = CH0.j1;
        this.YA0 = owner;
        this.v10 = null;
        this.MB0 = null;
        this.vr0 = slots;
        this.ge = 8;
        this.ej0 = 6;
        this.uf("item-slot");
        this.of(new c0_0(this));
    }

    @Override
    public final void Uj0(byte itemType, short itemId, short amount) {
        this.XB0 = CH0.j1;
        le0_2 linkedSlot = this.v10;
        if (linkedSlot != null) {
            linkedSlot.Ll(true);
        }
        Qy0.yI0.zm0();
        super.Uj0(itemType, itemId, amount);
    }

    @Override
    public final void UR(K5 item) {
        if (item == null) {
            this.Uj0((byte) 0, (short) 0, (short) 0);
            this.XB0 = CH0.j1;
            return;
        }

        mc0_1 itemData = item.cL;
        if (itemData == null) {
            return;
        }

        X90 equipment = itemData.Iq;
        if (equipment == null || !equipment.yt()) {
            tw0_0.rl.qK(sm0_0.c0(8503));
            return;
        }

        le0_2 previousSlot = this.MB0;
        if (previousSlot != null) {
            previousSlot.Ll(false);
            this.Ll(false);
        }

        hl0_0 itemValue = item.nn;
        this.Uj0(itemValue.N50, itemValue.wQ, (short) 1);
        this.XB0 = itemValue.Br;

        X90 currentEquipment = item.cL.Iq;
        short appearanceId = currentEquipment.ax;
        byte currentItemType = itemValue.N50;
        this.YA0.qd(currentItemType, currentEquipment.SG, appearanceId);

        xe_1[] availableSlots = this.vr0;
        if (availableSlots == null || availableSlots.length <= 0) {
            return;
        }

        for (int attempt = 0; attempt < 20000; ++attempt) {
            xe_1 slot = this.vr0[rg0_2.r4(this.vr0.length)];
            if (slot.OI) {
                a7_0.bH(slot.ER.Fc0);
                return;
            }
        }
    }

    @Override
    public final void a80(Jn0 context) {
        super.a80(context);
        int width = Math.max(42, this.R1());
        int height = Math.max(42, this.Se());
        this.RY(width, height);
    }
}
