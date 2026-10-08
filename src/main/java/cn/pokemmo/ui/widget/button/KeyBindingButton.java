package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class KeyBindingButton extends BaseButton {
    public boolean ca;
    public int xi;
    public long NN;
    public int lF0;
    public N1 JH0;
    public int ow;
    public int mV;

    public KeyBindingButton() {
        super();
        initialize();
    }

    public KeyBindingButton(String text) {
        super(text);
        initialize();
    }

    private void initialize() {
        this.ca = false;
        this.xi = 150;
        this.NN = 0L;
        this.ow = 0;
        this.mV = 0;
        this.uf("label");
        this.H3();
    }

    @Override
    public final void Xr0(Object value) {
        Object current = this.AR();
        if (current != null && current.equals(value)) {
            return;
        }
        this.yj0 = value;
        this.yB0();
    }

    @Override
    public final void Dw0(zk0_1 screen) {
        if (!this.ca) {
            super.Dw0(screen);
            return;
        }
        if (this.ow < this.mV) {
            super.Dw0(screen);
            this.z70 = null;
            return;
        }
        long elapsed = System.currentTimeMillis() - this.NN;
        int interval = this.xi;
        if (elapsed < interval) {
            this.lF0 = 0;
        } else if (elapsed < (long) interval * 2L) {
            this.lF0 = 1;
        } else if (elapsed > (long) interval * 2L) {
            this.NN = System.currentTimeMillis();
        }
        int phase = this.lF0;
        if (phase == 1) {
            if (this.z70 == null) {
                this.z70 = this.JH0;
                this.mV++;
            }
        } else if (phase == 0 && this.z70 != null) {
            this.z70 = null;
        }
    }
}
