package f;

import cn.pokemmo.constant.enums.GeometryPrimitive;

public enum ou_0 {
    Point(0),
    w30(1),
    Q30(4);

    public final int GQ;

    ou_0(int i3) {
        this.GQ = i3;
    }

    public GeometryPrimitive asModern() {
        return GeometryPrimitive.valueOf(name());
    }
}