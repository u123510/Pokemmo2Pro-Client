package cn.pokemmo.ui.skin;

import cn.pokemmo.graphics.gdx.shader.GdxBaseShader;
import f.W00;
import f.Wm0;
import f.wh_0;

public interface SkinElementPropertyHandler {
    boolean isGlobal(Wm0 var1, int var2);

    void set(Wm0 var1, int var2, W00 var3, wh_0 var4);

    default boolean isGlobal(GdxBaseShader var1, int var2) {
        if (var1 instanceof Wm0) {
            return isGlobal((Wm0) var1, var2);
        }
        return false;
    }

    default void set(GdxBaseShader var1, int var2, W00 var3, wh_0 var4) {
        if (var1 instanceof Wm0) {
            set((Wm0) var1, var2, var3, var4);
        }
    }
}
