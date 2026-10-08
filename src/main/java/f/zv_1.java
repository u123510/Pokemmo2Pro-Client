package f;

import cn.pokemmo.constant.enums.EquipmentSlotType;

public enum zv_1 {
    Gi0,
    tt0,
    JJ,
    uq0,
    kE;

    public EquipmentSlotType asModern() {
        return EquipmentSlotType.valueOf(name());
    }
}