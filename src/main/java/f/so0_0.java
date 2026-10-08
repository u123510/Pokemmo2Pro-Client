package f;

import cn.pokemmo.io.file.FileFilterPredicate;
import f.Dn0;

public interface so0_0 extends FileFilterPredicate {
    @Override
    boolean qE0(Dn0 var1);

    @Override
    default boolean accept(Dn0 file) {
        return qE0(file);
    }
}
