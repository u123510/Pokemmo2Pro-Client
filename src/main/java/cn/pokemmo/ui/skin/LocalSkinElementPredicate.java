package cn.pokemmo.ui.skin;

import f.Wm0;
import f.xr_2;

public abstract class LocalSkinElementPredicate implements xr_2 {
    @Override
    public final boolean isGlobal(Wm0 wm0, int n) {
        return false;
    }

    @Override
    public final boolean isGlobal(cn.pokemmo.graphics.gdx.shader.GdxBaseShader wm0, int n) {
        return false;
    }
}
