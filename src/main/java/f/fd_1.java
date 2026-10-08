package f;

import cn.pokemmo.constant.enums.AnimationDirection;

public enum fd_1 {
    Vg0,
    EC,
    Lv0,
    aC,
    nj;

    public AnimationDirection asModern() {
        return AnimationDirection.valueOf(name());
    }
}