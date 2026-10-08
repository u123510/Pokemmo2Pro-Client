package f;

import cn.pokemmo.constant.enums.AlphaMode;

public enum gy0_0 {
    NONE,
    ALPHA;

    public AlphaMode asModern() {
        return AlphaMode.valueOf(name());
    }
}