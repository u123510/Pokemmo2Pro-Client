package cn.pokemmo.graphics.render;

import f.ux0_0;

public interface RenderContextProvider {
    ux0_0 getContext();

    default ux0_0 MY() {
        return getContext();
    }
}
