package cn.pokemmo.constant.enums;

import f.*;

public enum EquipmentSlotType {
    Gi0,
    tt0,
    JJ,
    uq0,
    kE;

    public f.zv_1 toLegacy() {
        return f.zv_1.valueOf(name());
    }
}