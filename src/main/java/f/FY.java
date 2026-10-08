package f;

import cn.pokemmo.constant.enums.ParticleShape;

public enum FY {
    point,
    line,
    square,
    ellipse;

    public static final FY Af = line;
    public static final FY M5 = square;
    public static final FY Rb0 = ellipse;
    public static final FY[] lpt3 = {point, line, square, ellipse};

    public ParticleShape asModern() {
        return ParticleShape.valueOf(name());
    }
}