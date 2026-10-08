package f;

import cn.pokemmo.constant.enums.Orientation;

public enum ab_2 {
    WD0,
    VERTICAL;

    public static final ab_2[] b90 = values();

    public Orientation asModern() {
        return Orientation.valueOf(name());
    }
}