package f;

import cn.pokemmo.constant.enums.InputSource;

public enum oo_0 {
    keyboard,
    scroll;

    public static final oo_0[] eK0 = values();

    public InputSource asModern() {
        return InputSource.valueOf(name());
    }
}