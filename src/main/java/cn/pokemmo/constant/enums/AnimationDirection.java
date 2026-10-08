package cn.pokemmo.constant.enums;

import f.*;

public enum AnimationDirection {
    Vg0,
    EC,
    Lv0,
    aC,
    nj;

    public f.fd_1 toLegacy() {
        return f.fd_1.valueOf(name());
    }
}