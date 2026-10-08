package cn.pokemmo.io.resolver;

import f.Dn0;
import f.VG;

public class PrefixFileHandleResolver extends InternalFileHandleResolver {
    public final String prefix;

    public PrefixFileHandleResolver(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public Dn0 bC0(String path) {
        if (path.startsWith(this.prefix)) {
            return super.bC0(path);
        }
        return super.bC0(VG.Mq(new StringBuilder(), this.prefix, path));
    }
}
