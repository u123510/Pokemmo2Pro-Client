package f;

import cn.pokemmo.constant.enums.TileElevation;

public enum rx0 {
    j2,
    ra0,
    zL;

    public static final rx0[] Dv = values();

    public TileElevation asModern() {
        return TileElevation.valueOf(name());
    }
}