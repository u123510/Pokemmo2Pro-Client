package cn.pokemmo.graphics.texture;

import f.LPT6_;

public interface TextureRegionResolver {
    LPT6_ findRegion(String name);

    default LPT6_ Qq0(String var1) {
        return findRegion(var1);
    }
}
