package f;

import cn.pokemmo.io.loader.BitmapFontAssetLoader;

public final class Gw0 extends md_0 {
    public final BitmapFontAssetLoader delegate;

    public Gw0() {
        this(new lpt1__2());
    }

    public Gw0(gq_1 v1) {
        super(v1);
        this.delegate = new BitmapFontAssetLoader(v1);
    }

    @Override
    public final Object mm(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        return this.delegate.mm(v1, v2, v3, v4);
    }

    @Override
    public final es_1 getDependencies(String v1, Dn0 v2, in_0 v3) {
        return this.delegate.getDependencies(v1, v2, v3);
    }
}
