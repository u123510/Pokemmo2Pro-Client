package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class StorageBoxSlotWidget extends BaseItemSlotWidget {
    public CH0 ks;
    public final VL hB;

    public StorageBoxSlotWidget(VL var1) {
        super((short) 0, CH0.j1, (short) 0, (short) 0, tw0_0.H30());
        this.hB = var1;
        this.ks = CH0.j1;
        if (tw0_0.kz0()) {
            this.ge = 25;
            this.ej0 = 25;
            this.ka0();
        } else {
            this.ge = 12;
            this.ej0 = 6;
        }
        this.uf("item-slot");
    }

    @Override
    public final void Uj0(byte var1, short var2, short var3) {
        this.ks = CH0.j1;
        super.Uj0(var1, var2, var3);
        VL owner = this.hB;
        if (this != owner.J3) {
            short itemId = owner.qq.wE0;
            if (itemId < 1) {
                owner.Yd((short) 0);
                return;
            }
            mc0_1 item = gu0.l2.lPT6(itemId);
            if (item.X80() && item.Z8 != 1446) {
                owner.Yd(owner.qq.ax);
            } else {
                owner.Yd((short) 0);
            }
        }
    }

    @Override
    public final void UR(K5 var1) {
        if (this == this.hB.J3) {
            return;
        }
        if (var1 == null) {
            this.Uj0((byte) 0, (short) 0, (short) 0);
            this.ks = CH0.j1;
            return;
        }

        mc0_1 item = var1.cL;
        if (item == null) {
            return;
        }
        if (!item.X80()) {
            tw0_0.rl.qK(sm0_0.c0(8572));
            return;
        }

        hl0_0 value = var1.nn;
        short amount = value.PA0;
        if (amount > 1) {
            uf0_0 dialog = (uf0_0) jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (dialog != null) {
                lpt6__0.v90(dialog);
                return;
            }
            String title = sm0_0.wa0(8575, sm0_0.c0(item.Nl));
            Qy0.yI0.F9(Qy0.yI0.fU(), new uf0_0(title, amount, new Dy0(this, var1), this));
            return;
        }

        this.Uj0(value.N50, value.wQ, amount);
        this.ks = value.Br;
    }

    @Override public final void a80(Jn0 var1) { this.K8(); }
    @Override public final void K8() {
        int size = tw0_0.kz0() ? 100 : 48;
        this.RY(size, size);
        this.g2(size, size);
        this.oY(size, size);
    }
}
