package f;

import cn.pokemmo.constant.enums.MapLayerType;

public enum lpt3__3 {
    NR,
    cL,
    ND0,
    I50,
    X20,
    hG,
    E80;

    public MapLayerType asModern() {
        return MapLayerType.valueOf(name());
    }
}