package f;

import cn.pokemmo.constant.enums.VirtualKeyboardType;

public enum xw_1 {
    lv0,
    Ww,
    PhonePad,
    Email,
    If,
    URI;

    public VirtualKeyboardType asModern() {
        return VirtualKeyboardType.valueOf(name());
    }
}