package cn.pokemmo.constant.enums;

import f.*;

public enum ParticleShape {
    point,
    line,
    square,
    ellipse;

    public static final ParticleShape Af = line;
    public static final ParticleShape M5 = square;
    public static final ParticleShape Rb0 = ellipse;
    public static final ParticleShape[] lpt3 = {point, line, square, ellipse};

    public f.FY toLegacy() {
        return f.FY.valueOf(name());
    }
}