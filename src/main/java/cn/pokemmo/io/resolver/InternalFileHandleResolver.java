package cn.pokemmo.io.resolver;

import f.Dn0;
import f.VE;
import f.gq_1;
import f.lg_0;
import f.zv_1;

public class InternalFileHandleResolver implements FileHandleResolver, gq_1 {
    @Override
    public Dn0 bC0(String path) {
        lg_0.I70.getClass();
        return new VE(path, zv_1.tt0);
    }
}
