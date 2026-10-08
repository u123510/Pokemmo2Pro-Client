package f;

import cn.pokemmo.constant.enums.DisplayMode;

public enum YA0 {
    INLINE,
    BLOCK;

    public static final YA0 zH = INLINE;
    public static final YA0 ou0 = BLOCK;

    public static final YA0[] iv0 = values();

    public DisplayMode asModern() {
        return DisplayMode.valueOf(name());
    }
}