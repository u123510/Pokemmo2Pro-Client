package cn.pokemmo.constant.enums;

import f.*;

public enum TileElevation {
    j2,
    ra0,
    zL;

    public static final TileElevation[] Dv = values();

    public f.rx0 toLegacy() {
        return f.rx0.valueOf(name());
    }
}