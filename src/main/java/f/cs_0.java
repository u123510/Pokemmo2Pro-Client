package f;

import cn.pokemmo.constant.enums.BlendFactor;

public enum cs_0 {
    FU,
    Mh,
    KR;

    public static final cs_0[] Gc = values();

    public BlendFactor asModern() {
        return BlendFactor.valueOf(name());
    }
}