package f;

import cn.pokemmo.util.math.FastTrigLookupTable;

public final class nf_0 extends FastTrigLookupTable {
    public static nf_0 zU;

    public nf_0() {
        super();
    }

    public static nf_0 zo0() {
        if (zU == null) {
            zU = new nf_0();
            FastTrigLookupTable.zU = zU;
        }
        return zU;
    }
}
