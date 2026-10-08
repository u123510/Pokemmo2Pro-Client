package f;

import cn.pokemmo.ui.twl.renderer.TwlImage;

/**
 * TWL 可绘制图像兼容垫片接口 - wl0_2 -> TwlImage
 */
public interface wl0_2 extends TwlImage {
    int Nx();

    int Af();

    void GO(VT var1, int var2, int var3);

    void uf(rb_1 var1, int var2, int var3, int var4, int var5);

    wl0_2 so(gn_0 var1);

    LPT6_ LT();

    @Override
    default int getWidth() {
        return Nx();
    }

    @Override
    default int getHeight() {
        return Af();
    }

    @Override
    default void draw(VT animState, int x, int y) {
        GO(animState, x, y);
    }

    @Override
    default void draw(rb_1 animState, int x, int y, int width, int height) {
        uf(animState, x, y, width, height);
    }

    @Override
    default TwlImage createTintedVersion(gn_0 tint) {
        return so(tint);
    }

    @Override
    default LPT6_ getTextureRegion() {
        return LT();
    }
}
