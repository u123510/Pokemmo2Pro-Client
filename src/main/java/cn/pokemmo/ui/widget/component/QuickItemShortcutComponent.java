package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.Arrays;

public class QuickItemShortcutComponent extends BaseComponent implements fy0_0 {
    public final a10_0 qK;
    public final se_0[] ve;
    public final QI0[] Com8;
    public boolean cB;

    public QuickItemShortcutComponent(a10_0 a10_0) {
        this.cB = false;
        this.qK = a10_0;
        this.ve = Arrays.stream(a10_0.mn(a10_0.Ez0()).Ta(a10_0.zn0()))
                .map(tb0_1::zG)
                .toArray(QuickItemShortcutComponent::jW);
        this.Com8 = new QI0[this.ve.length];
        for (int i = 0; i < this.ve.length; i++) {
            this.Com8[i] = new QI0(a10_0, this.ve[i]);
        }
    }

    public static se_0[] jW(int i) {
        return new se_0[i];
    }

    @Override
    public final void K8() {
        if (this.Com8 == null) {
            return;
        }
        for (QI0 qi0 : this.Com8) {
            if (qi0.K20 == null) {
                F9(fU(), qi0);
            }
        }
        int i1;
        int i2;
        int i3;
        int i4;
        if (tw0_0.kz0() && this.qK.Sv != XA0.PRN) {
            i1 = tw0_0.LD0.ew0();
            i2 = 0;
            i3 = tw0_0.LD0.Hv0();
            i4 = 0;
        } else {
            i1 = fc0_2.YQ;
            i2 = (tw0_0.LD0.ew0() - i1) / 2;
            i3 = fc0_2.On0;
            i4 = 50;
        }
        int i5 = 0;
        int i6 = 0;
        for (QI0 qi0 : this.Com8) {
            int h = qi0.OB;
            i5 += qi0.Mx;
            if (h > i6) {
                i6 = h;
            }
        }
        if (i5 > i1 && !tw0_0.kz0()) {
            int startX = kq_0.lpT2(i1, (int) (i5 * 0.5D), 2, i2);
            int startY = (i3 - i6 * 2) / 2 + i4;
            int curX = startX;
            for (int i = 0; i < this.Com8.length; i++) {
                this.Com8[i].E40(curX, startY);
                if (i == 2) {
                    startY += i6;
                    curX = startX;
                } else {
                    curX += this.Com8[i].Mx;
                }
            }
        } else {
            int startX = kq_0.lpT2(i1, i5, 2, i2);
            int startY = kq_0.lpT2(i3, i6, 2, i4);
            int curX = startX;
            for (QI0 qi0 : this.Com8) {
                qi0.E40(curX, startY);
                curX += qi0.Mx;
            }
        }
    }

    @Override
    public final void dispose() {
        for (QI0 qi0 : this.Com8) {
            qi0.dispose();
        }
    }
}
