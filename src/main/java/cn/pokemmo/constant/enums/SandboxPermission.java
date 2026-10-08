package cn.pokemmo.constant.enums;

import f.*;

public enum SandboxPermission {
    tt,
    F0;

    public static final SandboxPermission[] gy = values();

    public f.l6_0 toLegacy() {
        return f.l6_0.valueOf(name());
    }
}