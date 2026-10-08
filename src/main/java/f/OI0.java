package f;

import cn.pokemmo.constant.enums.CameraFacing;

public enum OI0 {
    DC,
    PRN,
    MW,
    vC0,
    Mf0,
    RI;

    public CameraFacing asModern() {
        return CameraFacing.valueOf(name());
    }
}