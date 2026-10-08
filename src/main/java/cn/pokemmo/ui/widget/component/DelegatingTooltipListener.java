package cn.pokemmo.ui.widget.component;

import f.*;

public class DelegatingTooltipListener extends mh_1 {
    public DelegatingTooltipListener() {
        super();
    }

    public final boolean qT(int i1, boolean i2) {
        KU ku = this.HV;
        Object[] arr = ku.pa();
        try {
            int len = ku.KB;
            for (int i = 0; i < len; i++) {
                Object obj = arr[i];
                if (obj instanceof nk0_0 && ((nk0_0) obj).qT(i1, i2)) {
                    ku.Gj0();
                    return true;
                }
            }
            ku.Gj0();
            return false;
        } finally {
            ku.Gj0();
        }
    }

    public final boolean Xl(int i1, boolean i2) {
        KU ku = this.HV;
        Object[] arr = ku.pa();
        try {
            int len = ku.KB;
            for (int i = 0; i < len; i++) {
                Object obj = arr[i];
                if (obj instanceof nk0_0 && ((nk0_0) obj).Xl(i1, i2)) {
                    ku.Gj0();
                    return true;
                }
            }
            ku.Gj0();
            return false;
        } finally {
            ku.Gj0();
        }
    }
}
