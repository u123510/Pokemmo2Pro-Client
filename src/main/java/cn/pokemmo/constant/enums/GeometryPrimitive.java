package cn.pokemmo.constant.enums;

import f.*;

public enum GeometryPrimitive {
    Point(0),
    w30(1),
    Q30(4);

    public final int GQ;

    GeometryPrimitive(int i3) {
        this.GQ = i3;
    }

    public f.ou_0 toLegacy() {
        return f.ou_0.valueOf(name());
    }
}