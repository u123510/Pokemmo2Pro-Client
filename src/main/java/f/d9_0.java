package f;

import cn.pokemmo.ui.render.TextRendererCallback;
import f.rb_1;

public interface d9_0 extends TextRendererCallback {
    @Override
    void lpt4(rb_1 var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @Override
    default void renderText(rb_1 target, int x, int y, int width, int height, int align, int flags) {
        lpt4(target, x, y, width, height, align, flags);
    }
}
