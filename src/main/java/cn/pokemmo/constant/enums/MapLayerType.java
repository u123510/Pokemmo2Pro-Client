package cn.pokemmo.constant.enums;

import f.*;

public enum MapLayerType {
    NR,
    cL,
    ND0,
    I50,
    X20,
    hG,
    E80;

    public f.lpt3__3 toLegacy() {
        return f.lpt3__3.valueOf(name());
    }
}