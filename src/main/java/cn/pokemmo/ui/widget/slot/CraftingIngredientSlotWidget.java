package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class CraftingIngredientSlotWidget extends BaseItemSlotWidget {
    public final ef_0 zL0;

    public CraftingIngredientSlotWidget(ef_0 ef_0Var) {
        super((short) 0, CH0.j1, (short) 0, (short) 0, true);
        this.zL0 = ef_0Var;
        this.ge = 12;
        this.ej0 = 6;
        uf("item-slot");
    }

    @Override
    public final void Uj0(byte b, short s, short s2) {
        super.Uj0(b, s, s2);
        ef_0 ef_0Var = this.zL0;
        if (this == ef_0Var.K7) {
            return;
        }
        int i = 0;
        int i2 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        short[] sArr = new short[10];
        int i6 = 0;
        for (int i7 = 0; i7 < ef_0Var.coM7.length; i7++) {
            short s3 = ef_0Var.coM7[i7].wE0;
            if (s3 >= 1) {
                i++;
                int i9 = i6 + 1;
                if (i9 > sArr.length) {
                    short[] sArr2 = new short[Math.max(sArr.length << 1, i9)];
                    System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
                    sArr = sArr2;
                }
                sArr[i6] = s3;
                i6 = i9;
            }
        }
        short[] v9 = new short[i6];
        if (i6 > 0) {
            System.arraycopy(sArr, 0, v9, 0, i6);
        }
        int i7 = 0;
        for (int i5 = 0; i5 < i6; i5++) {
            short gA0 = X4.gA0(v9[i5]);
            mc0_1 lPT6 = gu0.l2.lPT6(gA0);
            if (lPT6.X80()) {
                if (gA0 == 5208 || gA0 == 1175) {
                    i7 = 1;
                }
                for (int i8 = 0; i8 < i2; i8++) {
                    int bonus = lPT6.mK[i8];
                    iArr[i8] += bonus;
                    i4 += bonus;
                }
            }
        }
        short resItem;
        if (i7 != 0) {
            resItem = 1118;
        } else {
            int maxVal = 0;
            int maxIdx = 0;
            for (int k = 0; k < i2; k++) {
                int val = iArr[k];
                if (val > maxVal) {
                    maxVal = val;
                    maxIdx = k;
                }
            }
            if (maxVal < 30) {
                if (i4 >= 80) {
                    resItem = 1117;
                } else {
                    resItem = 1111;
                }
            } else if (maxVal < 60) {
                resItem = (short) (maxIdx + 1106);
            } else {
                resItem = (short) (maxIdx + 1112);
            }
        }
        if (i < 2) {
            resItem = 0;
        }
        if (resItem < 1) {
            ef_0Var.K7.Ll(false);
            ef_0Var.u0.Ll(false);
        } else {
            mc0_1 resInfo = gu0.l2.lPT6(resItem);
            ef_0Var.K7.Uj0((byte) 0, resItem, (short) -1);
            ef_0Var.u0.Sk(resInfo.Com4((byte) -1, 38));
            ef_0Var.K7.Ll(true);
            ef_0Var.u0.Ll(true);
        }
    }

    @Override
    public final void UR(K5 v1) {
        if (this == this.zL0.K7) {
            return;
        }
        if (v1 == null) {
            Uj0((byte) 0, (short) 0, (short) 0);
            return;
        }
        mc0_1 cL = v1.cL;
        if (cL == null) {
            return;
        }
        if (!cL.X80()) {
            tw0_0.rl.qK(sm0_0.c0(8562));
            return;
        }
        ef_0 ef_0Var = this.zL0;
        short itemID = v1.nn.wQ;
        ef_0Var.getClass();
        TE te = new TE();
        for (int i = 0; i < ef_0Var.coM7.length; i++) {
            short slotItemID = ef_0Var.coM7[i].wE0;
            if (slotItemID >= 1) {
                int idx = te.O50(slotItemID);
                boolean inserted;
                if (idx < 0) {
                    idx = -idx - 1;
                    te.YG0[idx] = (short) (te.YG0[idx] + 1);
                    inserted = false;
                } else {
                    te.YG0[idx] = 1;
                    inserted = true;
                }
                if (inserted) {
                    te.OC0(te.L0);
                }
            }
        }
        short count = (short) (te.f5(itemID) + 1);
        if (!tw0_0.rl.NC[1].Dj0((byte) -1, itemID, count)) {
            tw0_0.rl.qK(sm0_0.wa0(6074, v1.Ua()));
            return;
        }
        hl0_0 nn = v1.nn;
        short qty = nn.PA0;
        if (qty < 1) {
            qty = 1;
        } else if (qty > 9999) {
            qty = 9999;
        }
        Uj0(nn.N50, nn.wQ, qty);
        CH0 unused = v1.nn.Br;
    }

    @Override
    public final void a80(Jn0 v1) {
        K8();
    }

    @Override
    public final void K8() {
        RY(48, 48);
        g2(48, 48);
        oY(48, 48);
    }
}
