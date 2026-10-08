package f;

import cn.pokemmo.constant.enums.AnchorAlignment;

public enum F70 {
    Ap,
    TK;

    public static final F70[] kJ = {Ap, TK};

    public AnchorAlignment asModern() {
        return AnchorAlignment.valueOf(name());
    }
}