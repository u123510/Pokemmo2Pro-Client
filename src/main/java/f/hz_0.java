package f;

import cn.pokemmo.io.loader.AtlasModelAssetLoader;

public final class hz_0 extends md_0 {
    public final AtlasModelAssetLoader delegate;

    public hz_0(gq_1 resolver) {
        super(resolver);
        this.delegate = new AtlasModelAssetLoader(resolver);
    }

    @Override
    public final Object mm(hd0_2 loader, String name, Dn0 file, in_0 context) {
        return this.delegate.mm(loader, name, file, context);
    }

    @Override
    public final es_1 getDependencies(String name, Dn0 file, in_0 context) {
        return this.delegate.getDependencies(name, file, context);
    }
}
