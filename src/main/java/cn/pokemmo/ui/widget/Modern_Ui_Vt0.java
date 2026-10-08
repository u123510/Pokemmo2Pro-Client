package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Vt0
 */
public class Modern_Ui_Vt0 extends EP {

    public final boolean A5;

    public Modern_Ui_Vt0() {
        this.A5 = true;
    }

    public Modern_Ui_Vt0(String value) {
        super(value);
        this.A5 = true;
    }

    public final le0_2 tU(TJ0 layout, int index, le0_2 child) {
        le0_2 result = super.tU(layout, index, child);
        if (this.A5) {
            lo0_0 wrapped = new lo0_0(result);
            wrapped.Qs0(2);
            wrapped.so();
            wrapped.lv = false;
            result = wrapped;
        }
        return result;
    }
}

