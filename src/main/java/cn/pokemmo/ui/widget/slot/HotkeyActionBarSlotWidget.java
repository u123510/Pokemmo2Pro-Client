package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class HotkeyActionBarSlotWidget extends BaseItemSlotWidget {
    public CH0 q0;

    public HotkeyActionBarSlotWidget() {
        super((short) 0, CH0.j1, (short) 0, (short) 0, true);
        this.q0 = CH0.j1;
        this.ge = 17;
        this.ej0 = 6;
        this.uf("item-slot");
        this.K8();
    }

    public final void pV(byte type, CH0 slot, short item, short amount) {
        this.q0 = slot;
        super.Uj0(type, item, amount);
        this.q0 = slot;
    }

    @Override
    public final void Uj0(byte type, short item, short amount) {
        this.q0 = CH0.j1;
        super.Uj0(type, item, amount);
    }

    @Override
    public final void UR(K5 value) {
        if (!this.OI) {
            this.q0 = CH0.j1;
            super.Uj0((byte) 0, (short) 0, (short) 0);
            return;
        }
        if (value == null) {
            this.q0 = CH0.j1;
            super.Uj0((byte) 0, (short) 0, (short) 0);
            return;
        }

        mc0_1 item = value.cL;
        if (item == null) {
            return;
        }
        hl0_0 data = value.nn;
        short amount = data.PA0;
        if (amount > 1) {
            uf0_0 existing = (uf0_0) jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (existing != null) {
                lpt6__0.v90(existing);
                return;
            }
            String title = sm0_0.wa0(5842, sm0_0.c0(item.Nl));
            uf0_0 dialog = new uf0_0(title, amount, new of0_1(this, value), null);
            Qy0.yI0.F9(Qy0.yI0.fU(), dialog);
            return;
        }
        this.q0 = data.Br;
        super.Uj0(data.N50, data.wQ, amount);
        this.q0 = data.Br;
    }

    @Override
    public final void Ib(Jn0 style) {
        super.Ib(style);
        this.RY(58, 48);
        this.g2(58, 48);
        this.oY(58, 48);
    }

    @Override
    public final void K8() {
        this.oY(58, 48);
    }
}
