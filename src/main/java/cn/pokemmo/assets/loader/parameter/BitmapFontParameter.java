package cn.pokemmo.assets.loader.parameter;

import f.nb_2;

public class BitmapFontParameter extends BaseAssetLoaderParameters {
    public final String fD;
    public final nb_2 F4;

    public BitmapFontParameter() {
        this(null, null);
    }

    public BitmapFontParameter(nb_2 nb_22) {
        this(null, nb_22);
    }

    public BitmapFontParameter(String string) {
        this(string, null);
    }

    public BitmapFontParameter(String string, nb_2 nb_22) {
        super();
        this.fD = string;
        this.F4 = nb_22;
    }

    public String getAtlasName() {
        return this.fD;
    }

    public nb_2 getFontData() {
        return this.F4;
    }
}
