package cn.pokemmo.io.resolver;

import f.Dn0;

public interface FileHandleResolver {
    Dn0 bC0(String path);

    default Dn0 resolve(String path) {
        return bC0(path);
    }
}
