package cn.pokemmo.constant.enums;

import f.*;

public enum MonsterFormType {
    Lu,
    Lq0,
    z8,
    qf,
    ua;

    public f.s1_0 toLegacy() {
        return f.s1_0.valueOf(name());
    }
}