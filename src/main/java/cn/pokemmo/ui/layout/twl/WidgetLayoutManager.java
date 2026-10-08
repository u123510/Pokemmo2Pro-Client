package cn.pokemmo.ui.layout.twl;

import f.Fx0;
import f.le0_2;

public interface WidgetLayoutManager extends Fx0 {
    le0_2 getChild(le0_2 parent);

    void layoutChild(le0_2 parent, int x, int y, int width, int height);

    default le0_2 zS(le0_2 var1) {
        return getChild(var1);
    }

    default void NM(le0_2 var1, int var2, int var3, int var4, int var5) {
        layoutChild(var1, var2, var3, var4, var5);
    }
}
