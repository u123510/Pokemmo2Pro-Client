package f;

import cn.pokemmo.constant.enums.ParticleAnimationMode;

public enum GY {
    single,
    random,
    animated;

    public static final GY ok0 = single;
    public static final GY dp0 = random;
    public static final GY d = animated;
    public static final GY[] Z00 = values();

    public ParticleAnimationMode asModern() {
        return ParticleAnimationMode.valueOf(name());
    }
}