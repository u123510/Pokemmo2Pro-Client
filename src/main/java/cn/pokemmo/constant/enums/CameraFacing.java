package cn.pokemmo.constant.enums;

import f.*;

public enum CameraFacing {
    DC,
    PRN,
    MW,
    vC0,
    Mf0,
    RI;

    public f.OI0 toLegacy() {
        return f.OI0.valueOf(name());
    }
}