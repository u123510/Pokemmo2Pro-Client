package f;

import cn.pokemmo.graphics.model.ModelSubmeshNodeArray;
import java.util.LinkedHashSet;

public final class hd_1 extends ModelSubmeshNodeArray {
    public static final hd_1 D0 = new hd_1(new TU[0]);

    public hd_1(TU[] v1) {
        super(v1);
    }

    public hd_1 kb0(LinkedHashSet v1) {
        return new hd_1(super.kb0(v1).Ts0);
    }
}
