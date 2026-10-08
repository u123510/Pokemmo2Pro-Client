package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class BreedingDaycareSlotWidget extends BaseItemSlotWidget {
    public CH0 Gu0;
    public final n4_0 R8;
    public BreedingDaycareSlotWidget(n4_0 owner) {
        super((short)0, CH0.j1, (short)0, (short)0, true); this.R8 = owner; this.Gu0 = CH0.j1;
        if (tw0_0.kz0()) { this.ge = 25; this.ej0 = 25; this.ka0(); } else { this.ge = 12; this.ej0 = 6; }
        this.uf("item-slot");
    }
    @Override public final void Uj0(byte b1, short s2, short s3) { this.Gu0 = CH0.j1; super.Uj0(b1, s2, s3); }
    @Override public final void UR(K5 item) {
        if (item == null) { this.Gu0 = CH0.j1; super.Uj0((byte)0, (short)0, (short)0); }
        else {
            mc0_1 data = item.cL; if (data == null) return;
            if (!data.X80() || item.nn.wQ == 1446) { tw0_0.rl.qK(sm0_0.c0(8555)); if (this.R8.fJ != null) this.R8.fJ.Md0(); return; }
            short amount = item.nn.PA0; hl0_0 selected = this.R8.av0.nn;
            if (selected.wQ == 1028 && amount > selected.PA0) amount = selected.PA0; else if (selected.wQ == 1029) amount = (short)Math.min(amount, 9999);
            if (amount > 9999) amount = 9999;
            if (amount > 1) {
                uf0_0 existing = (uf0_0)jq0_0.tK0(Qy0.yI0, uf0_0.class);
                if (existing != null) { lpt6__0.v90(existing); if (this.R8.fJ != null) this.R8.fJ.Md0(); return; }
                uf0_0 popup = new uf0_0(sm0_0.wa0(8554, sm0_0.c0(data.Nl)), amount, new GK0(this, item), this);
                Qy0.yI0.F9(Qy0.yI0.fU(), popup);
            } else { this.Gu0 = CH0.j1; super.Uj0(item.nn.N50, item.nn.wQ, amount); this.Gu0 = item.nn.Br; }
        }
        if (this.R8.fJ != null) this.R8.fJ.Md0();
    }
    @Override public final void a80(Jn0 value) { this.K8(); }
    @Override public final void K8() { int size = tw0_0.kz0() ? 100 : 48; this.RY(size, size); this.g2(size, size); this.oY(size, size); }
}
