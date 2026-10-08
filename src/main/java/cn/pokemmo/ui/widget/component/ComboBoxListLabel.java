package cn.pokemmo.ui.widget.component;

import f.a7_0;
import f.i70_0;
import f.jr_0;
import f.qe0_1;

public class ComboBoxListLabel extends qe0_1 {
    public ComboBoxListLabel() {
        super();
    }

    public String Ck() {
        return "comboboxlistboxlabel";
    }

    public boolean Oc0(i70_0 event) {
        if (event.zu != 5) {
            return false;
        }
        a7_0.COM8(this.Sv0, jr_0.r9);
        return true;
    }
}
