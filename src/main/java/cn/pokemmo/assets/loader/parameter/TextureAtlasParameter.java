package cn.pokemmo.assets.loader.parameter;

import f.Em0;
import f.a00_0;
import f.eb0_1;

public class TextureAtlasParameter extends BaseAssetLoaderParameters {
    public final Em0 jz0;

    public TextureAtlasParameter() {
        super();
        this.jz0 = new Em0();
        this.jz0.YI = eb0_1.jc0;
        this.jz0.A30 = eb0_1.jc0;
        this.jz0.wd0 = a00_0.xm0;
        this.jz0.nf0 = a00_0.xm0;
    }

    public Em0 getTextureParameter() {
        return this.jz0;
    }
}
