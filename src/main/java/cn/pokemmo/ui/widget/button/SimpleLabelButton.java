package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class SimpleLabelButton extends BaseButton {
    public int OD0;
    public int ZH0;

    public SimpleLabelButton() {
        super();
        uf("label");
    }

    public SimpleLabelButton(String value) {
        super(value);
        uf("label");
    }

    @Override
    public final void Ll(boolean show) {
        if (show) {
            N1 label = this.z70;
            if ((label != null && label.LpT8) || !this.eE) {
                gn_0 color = gn_0.WHITE;
                if (label == null) {
                    label = new N1(new xe0_0(this.M, R90.gC), color);
                    this.z70 = label;
                    if (!this.eE) {
                        label.iG0(0);
                    }
                }
                label.bT(color, this.OD0);
                if (!this.eE && (color.FY & 0xFF) != 0) {
                    super.Ll(true);
                }
            }
        } else if (this.eE) {
            int duration = this.ZH0;
            N1 label = this.z70;
            if (label == null) {
                label = new N1(new xe0_0(this.M, R90.gC), gn_0.WHITE);
                this.z70 = label;
                if (!this.eE) {
                    label.iG0(0);
                }
            }
            label.iG0(duration);
            if (duration <= 0) {
                super.Ll(false);
            }
        }
    }

    @Override
    public final void Ib(Jn0 source) {
        super.Ib(source);
        LC0 config = (LC0) source;
        this.OD0 = config.H10(0, "fadeDurationShow");
        this.ZH0 = config.H10(0, "fadeDurationHide");
    }
}
