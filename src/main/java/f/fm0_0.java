package f;

import cn.pokemmo.graphics.texture.TextureRegionResolver;
import f.LPT6_;

public interface fm0_0 extends TextureRegionResolver {
    @Override
    LPT6_ Qq0(String var1);

    @Override
    default LPT6_ findRegion(String name) {
        return Qq0(name);
    }
}
