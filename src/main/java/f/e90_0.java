package f;

import cn.pokemmo.constant.enums.StateToggle;

public enum e90_0 {
    VG,
    kz0;

    public static final e90_0[] CY = values();

    public StateToggle asModern() {
        return StateToggle.valueOf(name());
    }
}