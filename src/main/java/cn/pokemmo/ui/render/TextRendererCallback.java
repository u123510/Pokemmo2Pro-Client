package cn.pokemmo.ui.render;

import f.rb_1;

public interface TextRendererCallback {
    void renderText(rb_1 target, int x, int y, int width, int height, int align, int flags);

    default void lpt4(rb_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        renderText(var1, var2, var3, var4, var5, var6, var7);
    }
}
