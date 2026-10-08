package f;

import cn.pokemmo.graphics.render.RenderContextProvider;
import f.ux0_0;

public interface ix_1 extends RenderContextProvider {
    @Override
    ux0_0 MY();

    @Override
    default ux0_0 getContext() {
        return MY();
    }
}
