package cn.pokemmo.ui.widget.dropdown;

import f.X6;
import f.M30;
import f.pg0_2;

public abstract class BaseDropdownWidget extends X6 {
    public BaseDropdownWidget() {
        super();
    }

    public BaseDropdownWidget(M30 model) {
        super(model);
    }

    public BaseDropdownWidget(pg0_2 model) {
        super();
        this.r30(model);
    }
}
