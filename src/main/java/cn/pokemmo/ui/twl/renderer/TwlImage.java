package cn.pokemmo.ui.twl.renderer;

import f.LPT6_;
import f.VT;
import f.gn_0;
import f.rb_1;

/**
 * TWL 渲染器可绘制图像接口 (de.matthiasmann.twl.renderer.Image)
 * 原始混淆接口: f.wl0_2
 */
public interface TwlImage {

    int getWidth();

    int getHeight();

    void draw(VT animState, int x, int y);

    void draw(rb_1 animState, int x, int y, int width, int height);

    TwlImage createTintedVersion(gn_0 tint);

    LPT6_ getTextureRegion();

    // 混淆签名别名兼容
    default int Nx() {
        return getWidth();
    }

    default int Af() {
        return getHeight();
    }

    default void GO(VT var1, int var2, int var3) {
        draw(var1, var2, var3);
    }

    default void uf(rb_1 var1, int var2, int var3, int var4, int var5) {
        draw(var1, var2, var3, var4, var5);
    }

    default LPT6_ LT() {
        return getTextureRegion();
    }
}
