package cn.pokemmo.constant.enums;

import f.*;

public enum ParticleAnimationMode {
    single,
    random,
    animated;

    public static final ParticleAnimationMode ok0 = single;
    public static final ParticleAnimationMode dp0 = random;
    public static final ParticleAnimationMode d = animated;
    public static final ParticleAnimationMode[] Z00 = values();

    public f.GY toLegacy() {
        return f.GY.valueOf(name());
    }
}