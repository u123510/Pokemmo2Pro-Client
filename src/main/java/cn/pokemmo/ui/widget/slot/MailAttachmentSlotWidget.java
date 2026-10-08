package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class MailAttachmentSlotWidget extends BaseItemSlotWidget {
    public CH0 XX;
    public final kt_1 kF;

    public MailAttachmentSlotWidget(kt_1 kt_1) {
        super((short) 0, CH0.j1, (short) 0, (short) 0, tw0_0.H30());
        this.kF = kt_1;
        this.XX = CH0.j1;
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
    public final void Uj0(byte b, short s, short s2) {
        this.XX = CH0.j1;
        super.Uj0(b, s, s2);
        kt_1 kt1 = this.kF;
        MailAttachmentSlotWidget c60 = kt1.C60;
        if (this != c60) {
            MailAttachmentSlotWidget bz0 = kt1.Bz0;
            if (bz0 != null && c60 != null) {
                short wE0 = bz0.wE0;
                if (wE0 < 1) {
                    kt1.wB((short) 0);
                } else {
                    short item = X4.gA0(wE0);
                    short[] d80 = kt_1.d80;
                    for (int i = 0; i < 17; i++) {
                        if (d80[i] == item) {
                            kt1.wB(kt_1.Cu[i]);
                            return;
                        }
                    }
                    kt1.wB((short) 0);
                }
            }
        }
    }

    public final void UR(K5 k5) {
        if (this == this.kF.C60) {
            return;
        }
        if (k5 == null) {
            this.Uj0((byte) 0, (short) 0, (short) 0);
            this.XX = CH0.j1;
            return;
        }
        mc0_1 mc01 = k5.cL;
        if (mc01 == null) {
            return;
        }
        short[] arr = new short[17];
        System.arraycopy(kt_1.d80, 0, arr, 0, 17);
        short targetItem = X4.gA0(k5.nn.wQ);
        boolean found = false;
        for (int i = 17; i-- > 0; ) {
            if (arr[i] == targetItem) {
                found = true;
                break;
            }
        }
        if (!found) {
            tw0_0.rl.qK(sm0_0.c0(6032));
            return;
        }

        hl0_0 hl00 = k5.nn;
        short count = hl00.PA0;
        if (count > 9999) {
            count = 9999;
        }
        if (count > 1) {
            uf0_0 existing = (uf0_0) jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (existing != null) {
                lpt6__0.v90(existing);
                return;
            }
            String title = sm0_0.wa0(8554, sm0_0.c0(mc01.Nl));
            short maxAllowed = this.kF.Wc0.ax;
            int maxCount = (count <= maxAllowed) ? count : maxAllowed;
            uf0_0 popup = new uf0_0(title, maxCount, new K(this, k5), this);
            Qy0.yI0.F9(Qy0.yI0.fU(), popup);
        } else {
            this.Uj0(hl00.N50, hl00.wQ, count);
            this.XX = k5.nn.Br;
        }
    }

    @Override
    public final void a80(Jn0 jn0) {
        this.K8();
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            this.RY(100, 100);
            this.g2(100, 100);
            this.oY(100, 100);
        } else {
            this.RY(48, 48);
            this.g2(48, 48);
            this.oY(48, 48);
        }
    }
}
