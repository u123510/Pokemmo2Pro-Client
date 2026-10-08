package cn.pokemmo.constant.enums;

import f.*;

public enum InputSource {
    keyboard,
    scroll;

    public static final InputSource[] eK0 = values();

    public f.oo_0 toLegacy() {
        return f.oo_0.valueOf(name());
    }
}