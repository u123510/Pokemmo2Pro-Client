package cn.pokemmo.constant.enums;

import f.*;

public enum VirtualKeyboardType {
    lv0,
    Ww,
    PhonePad,
    Email,
    If,
    URI;

    public f.xw_1 toLegacy() {
        return f.xw_1.valueOf(name());
    }
}