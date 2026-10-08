package f;

import cn.pokemmo.constant.enums.CursorMode;

public enum ed_2 {
    AM,
    k4;

    public static final ed_2[] Ol = values();

    public CursorMode asModern() {
        return CursorMode.valueOf(name());
    }
}