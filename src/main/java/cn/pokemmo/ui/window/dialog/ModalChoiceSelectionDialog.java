package cn.pokemmo.ui.window.dialog;

import f.*;

public class ModalChoiceSelectionDialog extends lpt6__5 {
    public final short i70;
    public final LT[] Ew;
    public final C8 JA0;
    public float xs0;
    public _package Or0;
    public String FS;

    public ModalChoiceSelectionDialog(XF0 map, short x, short y, byte layer, short id, short height) {
        super(map, null, x, y, layer);
        this.Ew = new LT[4];
        this.JA0 = new C8();
        this.FS = "";
        this.i70 = id;
        this.dH = height;
    }

    public final float S80() {
        return this.JA0.y;
    }

    public final float XC0() {
        return this.xs0;
    }

    public final short coM9() {
        return 0;
    }

    public final short HM() {
        return 0;
    }

    public final byte re() {
        return (byte) this.i70;
    }

    public final short eq0() {
        return this.i70;
    }

    public final short s0() {
        return this.dH;
    }

    public final LT JG0(byte index) {
        if (index < 0 || index > 3) {
            return null;
        }
        nt_1 type = this.u40();
        if (type.J10(index)) {
            return type.wh0(index, this);
        }
        return this.Ew[index];
    }

    public final void Nn0(byte index, Ll0 value) {
        if (value == null) {
            return;
        }
        XF0 map = this.zN;
        if (J4.p5(map.Bm0, map.case$) == 209
                && this.Sm == 22 && this.Tz() == 0 && this.HR() == 0
                && index == 1 && value.Sm == 23) {
            return;
        }
        if (this.Sm == 25 && this.Tz() == 1 && this.HR() == 0
                && index == 3 && value.Sm == 16) {
            return;
        }
        this.Ew[index] = value;
    }

    public final C8 Ki() {
        return this.JA0;
    }
}
