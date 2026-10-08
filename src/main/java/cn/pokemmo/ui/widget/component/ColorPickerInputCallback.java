package cn.pokemmo.ui.widget.component;

import f.V7;
import f.dp0;
import f.e60_0;
import f.gn_0;
import f.gt_0;
import f.w10_0;
import f.wn0_0;

public class ColorPickerInputCallback implements gt_0 {
    public final V7 Lj;

    public ColorPickerInputCallback(w10_0 value) {
        this.Lj = value;
    }

    @Override
    public void ks0(int code) {
        if (code == 111) {
            e60_0 field = this.Lj.Lpt7;
            if (field != null) {
                field.Gv(String.format("%08X", this.Lj.u20));
            }
            return;
        }
        gn_0 parsed = null;
        try {
            parsed = gn_0.ox0("#" + ((wn0_0) this.Lj.Lpt7.dI0).YA.toString());
        } catch (Exception ignored) {
        }
        try {
            this.Lj.Lpt7.bj(null);
        } catch (Exception ignored) {
            this.Lj.Lpt7.bj("Invalid color format");
        }
        if (dp0.r9(code) == 66 && parsed != null) {
            this.Lj.getClass();
            this.Lj.cS(parsed.ls());
        }
    }
}
