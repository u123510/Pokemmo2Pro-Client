package cn.pokemmo.io.file;

import f.Dn0;

public interface FileFilterPredicate {
    boolean accept(Dn0 file);

    default boolean qE0(Dn0 var1) {
        return accept(var1);
    }
}
