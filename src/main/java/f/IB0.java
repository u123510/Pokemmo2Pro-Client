package f;

import cn.pokemmo.constant.enums.TextureSamplingMode;

public enum IB0 {
    NearestNeighbour,
    BiLinear;

    public static final IB0[] j10 = {
        NearestNeighbour,
        BiLinear
    };

    public TextureSamplingMode asModern() {
        return TextureSamplingMode.valueOf(name());
    }
}