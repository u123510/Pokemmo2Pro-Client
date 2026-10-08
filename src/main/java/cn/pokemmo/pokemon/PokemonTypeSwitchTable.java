package cn.pokemmo.pokemon;

import f.Q40;

/**
 * 宝可梦类型匹配 Switch 跳转合成映射表
 */
public abstract class PokemonTypeSwitchTable {
    public static final int[] sC;

    static {
        int var1 = Math.max(Q40.fL.bg0, Math.max(Q40.ry0.bg0, Q40.mY.bg0)) + 1;
        sC = new int[var1];

        try {
            sC[Q40.fL.bg0] = 1;
        } catch (NoSuchFieldError ignored) {
        }

        try {
            sC[Q40.ry0.bg0] = 2;
        } catch (NoSuchFieldError ignored) {
        }

        try {
            sC[Q40.mY.bg0] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
