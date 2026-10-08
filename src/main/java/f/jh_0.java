package f;

import cn.pokemmo.constant.enums.EntityFacing;

public enum jh_0 {
    zN,
    WV,
    dq;

    public static final jh_0[] lr0 = values();

    public EntityFacing asModern() {
        return EntityFacing.valueOf(name());
    }
}