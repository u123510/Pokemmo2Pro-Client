package f;

import cn.pokemmo.ui.widget.menu.PopupMenuManager;

public final class UA extends PopupMenuManager {
    public UA(le0_2 var1) {
        super(var1);
    }

    public static UA zd(Vt0 var0, le0_2 var1) {
        UA var2 = new UA(var1);
        le0_2 var3;
        if ((var3 = var2.M10(0, var0, var1, true)) != null) {
            OE0(var3);
        }
        var2.Uz(1, false);
        return var2;
    }
}
