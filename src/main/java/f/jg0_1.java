package f;

import cn.pokemmo.constant.enums.ComponentAnchor;

public enum jg0_1 {
    TOP(true),
    LEFT(false),
    RIGHT(false),
    BOTTOM(true),
    ABSOLUTE(false);

    public static final jg0_1 wk = TOP;

    public final boolean Tk;

    jg0_1(boolean i3) {
        this.Tk = i3;
    }

    public ComponentAnchor asModern() {
        return ComponentAnchor.valueOf(name());
    }
}