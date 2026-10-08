package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class ScrollbarThumbWidget extends BaseControl implements bo0_0 {
    public static final MD0 vN = MD0.cB("selected");
    public static final MD0 il = MD0.cB("empty");
    public boolean F10;
    public zs_1[] Sv0;

    public ScrollbarThumbWidget() {
        super();
        this.m00();
        this.uf("display");
    }

    @Override
    public String Ck() {
        return "listboxlabel";
    }

    private static int Qj(int n) {
        if (n != 0) {
            return n - 1;
        }
        throw null;
    }

    public boolean Oc0(i70_0 input) {
        int mode = Qj(input.zu);
        if (mode != 2 && mode != 4) {
            return false;
        }
        if (mode == 4) {
            if (this.F10 && input.kA == 2) {
                a7_0.COM8(this.Sv0, jr_0.n3);
            }
        } else if (!this.F10) {
            a7_0.COM8(this.Sv0, jr_0.r9);
        }
        return true;
    }

    @Override
    public final boolean nd0(i70_0 input) {
        this.k50(input);
        if (!input.VP && this.Oc0(input)) {
            return true;
        }
        if (super.nd0(input)) {
            return true;
        }
        return input.Li();
    }
}
