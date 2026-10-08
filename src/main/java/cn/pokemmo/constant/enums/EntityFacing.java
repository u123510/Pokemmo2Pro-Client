package cn.pokemmo.constant.enums;

import f.*;

public enum EntityFacing {
    zN,
    WV,
    dq;

    public static final EntityFacing[] lr0 = values();

    public f.jh_0 toLegacy() {
        return f.jh_0.valueOf(name());
    }
}