package cn.pokemmo.constant.enums;

import f.*;

public enum AudioChannelType {
    PJ0,
    C00,
    AZ,
    COM5;

    public f.vy_1 toLegacy() {
        return f.vy_1.valueOf(name());
    }
}