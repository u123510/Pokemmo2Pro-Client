package cn.pokemmo.io.resolver;

import f.Dn0;
import f.VE;
import f.ea0_1;
import f.gq_1;
import f.lg_0;
import f.s1_0;
import f.vs_2;
import f.zv_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChainedSearchPathFileResolver implements FileHandleResolver, gq_1 {
    public final List searchPaths;

    public ChainedSearchPathFileResolver() {
        super();
        this.searchPaths = Collections.synchronizedList(new ArrayList());
    }

    public static Dn0 child(String str, Dn0 dn0) {
        return dn0.wp(str);
    }

    public final void reset() {
        this.searchPaths.clear();
        lg_0.I70.getClass();
        VE v2 = new VE("", zv_1.tt0);
        this.searchPaths.add(0, v2);
        s1_0 v1 = ea0_1.NV;
        if (v1 == s1_0.qf || v1 == s1_0.ua) {
            lg_0.I70.getClass();
            VE v1_ve = new VE("", zv_1.kE);
            this.searchPaths.add(0, v1_ve);
        }
    }

    public final vs_2 resolveMulti(String path) {
        if (!this.searchPaths.isEmpty()) {
            List<Dn0> list = (List<Dn0>) this.searchPaths.stream()
                .map(dn0 -> ((Dn0) dn0).wp(path))
                .collect(Collectors.toList());
            return new vs_2(path, list);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Dn0 bC0(String path) {
        return resolveMulti(path);
    }
}
