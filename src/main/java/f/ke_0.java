package f;

import cn.pokemmo.constant.enums.ScrollDirection;

public enum ke_0 {
    both,
    mJ,
    jm;

    public static final ke_0[] L0 = values();

    public ScrollDirection asModern() {
        return ScrollDirection.valueOf(name());
    }
}