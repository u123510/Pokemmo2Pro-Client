package f;

import cn.pokemmo.constant.enums.MonsterFormType;

public enum s1_0 {
    Lu,
    Lq0,
    z8,
    qf,
    ua;

    public MonsterFormType asModern() {
        return MonsterFormType.valueOf(name());
    }
}