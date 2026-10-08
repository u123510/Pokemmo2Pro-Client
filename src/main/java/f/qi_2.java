package f;

import cn.pokemmo.constant.enums.VerticalAlignment;

public enum qi_2 {
    TOP,
    MIDDLE,
    N6,
    FILL;

    public static final qi_2[] d50 = values();

    public VerticalAlignment asModern() {
        return VerticalAlignment.valueOf(name());
    }
}