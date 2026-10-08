package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class ChatTabActionButton extends BaseButton {
    public boolean L1;
    public final X6 On;

    public ChatTabActionButton(X6 owner, KG0 style) {
        super(style);
        this.On = owner;
        this.H3();
        this.m00();
        this.uf("display");
    }

    @Override
    public final String Ck() {
        return "comboboxlabel";
    }

    @Override
    public final int pi0() {
        this.On.getClass();
        return super.pi0();
    }

    @Override
    public final int zs0() {
        int result = super.zs0();
        if (this.x70 != null) {
            result = Math.max(result, ((zb0_2) this.x70).getLineHeight());
        }
        return result;
    }

    @Override
    public final boolean nd0(i70_0 event) {
        int value = event.zu;
        if (!E00.C10(value)) {
            return false;
        }
        value = value == 7 ? 0 : 1;
        if (value != (this.L1 ? 1 : 0)) {
            this.L1 = value != 0;
            KG0 style = this.On.M;
            MD0 error = dz_2.H7;
            boolean enabled;
            if (this.On.Il.L1) {
                enabled = true;
            } else {
                enabled = (this.On.Wt.ER.mu0 & 1) != 0;
            }
            style.j70(error, enabled);
        }
        if (event.zu == 5) {
            this.On.if0();
        }
        if (event.zu == 3 && event.nA0 == 1) {
            this.On.getClass();
        }
        return event.zu != 8;
    }
}
