package f;

import cn.pokemmo.constant.enums.CharacterHandSide;

public enum O10 {
    NONE,
    LEFT,
    RIGHT;

    public static final O10 Jx0 = NONE;
    public static final O10 E9 = LEFT;
    public static final O10 E30 = RIGHT;

    public CharacterHandSide asModern() {
        return CharacterHandSide.valueOf(name());
    }
}