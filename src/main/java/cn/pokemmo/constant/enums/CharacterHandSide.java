package cn.pokemmo.constant.enums;

import f.*;

public enum CharacterHandSide {
    NONE,
    LEFT,
    RIGHT;

    public static final CharacterHandSide Jx0 = NONE;
    public static final CharacterHandSide E9 = LEFT;
    public static final CharacterHandSide E30 = RIGHT;

    public f.O10 toLegacy() {
        return f.O10.valueOf(name());
    }
}