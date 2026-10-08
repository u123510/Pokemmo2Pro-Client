package cn.pokemmo.constant.enums;

import f.*;

public enum CursorMode {
    AM,
    k4;

    public static final CursorMode[] Ol = values();

    public f.ed_2 toLegacy() {
        return f.ed_2.valueOf(name());
    }
}