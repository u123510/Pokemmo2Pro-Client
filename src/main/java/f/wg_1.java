package f;

import cn.pokemmo.io.resolver.ChainedSearchPathFileResolver;
import java.util.List;

public final class wg_1 extends ChainedSearchPathFileResolver implements gq_1 {
    public final List j90;

    public wg_1() {
        super();
        this.j90 = this.searchPaths;
    }

    public static Dn0 mb0(String str, Dn0 dn0) {
        return child(str, dn0);
    }

    public final void qZ() {
        reset();
    }

    public final vs_2 r1(String v1) {
        return resolveMulti(v1);
    }
}
