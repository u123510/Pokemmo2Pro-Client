package cn.pokemmo.io.loader;

import f.Dn0;
import f.es_1;
import f.gq_1;
import f.in_0;

public abstract class BaseAssetLoader {
    public gq_1 resolver;

    public BaseAssetLoader(gq_1 resolver) {
        this.resolver = resolver;
    }

    public Dn0 resolve(String path) {
        return this.resolver.bC0(path);
    }

    public abstract es_1 getDependencies(String fileName, Dn0 file, in_0 parameter);
}
