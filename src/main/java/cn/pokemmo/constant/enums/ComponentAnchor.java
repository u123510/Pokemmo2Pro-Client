package cn.pokemmo.constant.enums;

import f.*;

public enum ComponentAnchor {
    TOP(true),
    LEFT(false),
    RIGHT(false),
    BOTTOM(true),
    ABSOLUTE(false);

    public static final ComponentAnchor wk = TOP;

    public final boolean Tk;

    ComponentAnchor(boolean i3) {
        this.Tk = i3;
    }

    public f.jg0_1 toLegacy() {
        return f.jg0_1.valueOf(name());
    }
}