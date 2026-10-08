package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class PaginationArrowButton extends BaseButton {
    public final U60 yl0;

    public PaginationArrowButton(U60 u60, String str) {
        super(str);
        this.yl0 = u60;
        uf("label");
    }

    @Override
    public final boolean nd0(i70_0 i70_0) {
        super.nd0(i70_0);
        return this.yl0.nd0(i70_0);
    }
}
