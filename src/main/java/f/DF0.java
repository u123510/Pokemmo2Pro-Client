package f;

import cn.pokemmo.constant.enums.BinaryToggle;

public enum DF0 {
    Ha0,
    Is;

    public BinaryToggle asModern() {
        return BinaryToggle.valueOf(name());
    }
}
