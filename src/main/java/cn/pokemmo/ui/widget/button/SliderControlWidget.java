package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class SliderControlWidget extends BaseControl {
    public int zN;
    public int kk0;
    public final cg_0 vg0;

    public SliderControlWidget(cg_0 owner, KG0 state) {
        super(state);
        this.vg0 = owner;
    }

    @Override
    public final String Ck() {
        return "textrenderer";
    }

    @Override
    public final void FW(zk0_1 window) {
        cg_0 owner = this.vg0;
        if (owner.oi0) {
            owner.te0(owner.tp);
        }
        this.kk0 = owner.Of() || owner.sO ? owner.Lpt9 : 0;
        this.zN = this.Pk(true);
        owner.getClass();
        if (owner.Td() && (owner.Of() || owner.sO)) {
            wn0_0 text = (wn0_0) owner.dI0;
            int length = text.YA.length();
            int x = this.hC();
            if (owner.gu) {
                int lineWidth = owner.Bn0();
                for (int start = 0; start < length; ++start) {
                    int end = owner.Td0(start);
                    this.yf0(start, end, x);
                    x += lineWidth;
                    start = end;
                }
            } else {
                this.yf0(0, length, x);
            }
        }
        this.QD(this.M);
    }

    public final void yf0(int start, int end, int y) {
        cg_0 owner = this.vg0;
        int selectionStart = owner.Z1;
        int selectionEnd = owner.V50;
        wl0_2 selection = owner.Jm0;
        if (selection == null || selectionEnd <= start || selectionStart > end) {
            return;
        }

        int left = this.zN;
        if (this.x70 != null && selectionStart > start) {
            left += ((zb0_2) this.x70).computeTextWidth(this.j50, start, selectionStart);
        }

        int right;
        if (end < selectionEnd) {
            right = this.cz();
        } else {
            int clippedEnd = Math.min(selectionEnd, end);
            right = this.zN;
            if (this.x70 != null && clippedEnd > start) {
                right += ((zb0_2) this.x70).computeTextWidth(this.j50, start, clippedEnd);
            }
        }

        zb0_2 font = (zb0_2) this.x70;
        int baseline = font.getBaseLine() / 2 + y - 1;
        selection.uf(this.M, left, baseline, right - left, font.getLineHeight());
    }

    @Override
    public final void Ej0() {
        cg_0 owner = this.vg0;
        if (owner.IG) {
            owner.te0(true);
        }
    }

    @Override
    public final int Pk(boolean align) {
        int value = this.A20 + this.e80;
        if (align) {
            int factor = this.Tb.CB0;
            if (factor > 0) {
                value += Math.max(0, this.a3() - this.hr0()) * factor / 2;
            }
        }
        return value - this.kk0;
    }

    @Override
    public final void t5() {
        super.t5();
    }
}
