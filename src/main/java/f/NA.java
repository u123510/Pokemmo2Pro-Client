package f;

import cn.pokemmo.ui.layout.twl.WidgetLayoutManager;
import f.le0_2;

public interface NA extends WidgetLayoutManager {
    @Override
    le0_2 zS(le0_2 var1);

    @Override
    void NM(le0_2 var1, int var2, int var3, int var4, int var5);

    @Override
    default le0_2 getChild(le0_2 parent) {
        return zS(parent);
    }

    @Override
    default void layoutChild(le0_2 parent, int x, int y, int width, int height) {
        NM(parent, x, y, width, height);
    }
}
