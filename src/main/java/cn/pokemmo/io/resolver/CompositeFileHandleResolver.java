package cn.pokemmo.io.resolver;

import f.Dn0;
import f.gq_1;

public class CompositeFileHandleResolver implements FileHandleResolver, gq_1 {
    public final FileHandleResolver[] resolvers;

    public CompositeFileHandleResolver(FileHandleResolver... resolvers) {
        this.resolvers = resolvers;
    }

    @Override
    public Dn0 bC0(String path) {
        Dn0 dn0 = null;
        for (FileHandleResolver resolver : this.resolvers) {
            dn0 = resolver.bC0(path);
            if (dn0 != null && dn0.os0()) {
                return dn0;
            }
        }
        return dn0;
    }
}
