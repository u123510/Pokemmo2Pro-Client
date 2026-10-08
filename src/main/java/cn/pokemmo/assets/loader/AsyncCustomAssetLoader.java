package cn.pokemmo.assets.loader;

import f.Dn0;
import f.gq_1;
import f.hd0_2;
import f.in_0;
import f.u6_0;

public abstract class AsyncCustomAssetLoader extends u6_0 {
    public AsyncCustomAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    public abstract void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter);

    public void unloadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter) {
    }

    public abstract Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter);
}
