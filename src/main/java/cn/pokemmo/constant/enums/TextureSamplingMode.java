package cn.pokemmo.constant.enums;

import f.*;

public enum TextureSamplingMode {
    NearestNeighbour,
    BiLinear;

    public static final TextureSamplingMode[] j10 = {
        NearestNeighbour,
        BiLinear
    };

    public f.IB0 toLegacy() {
        return f.IB0.valueOf(name());
    }
}