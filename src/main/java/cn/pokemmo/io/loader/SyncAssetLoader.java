package cn.pokemmo.io.loader;

import f.Dn0;
import f.gq_1;
import f.hd0_2;
import f.in_0;

public abstract class SyncAssetLoader extends BaseAssetLoader {
    public SyncAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    public abstract Object mm(hd0_2 manager, String fileName, Dn0 file, in_0 parameter);
}
