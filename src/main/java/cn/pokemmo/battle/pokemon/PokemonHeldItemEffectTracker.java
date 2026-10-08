package cn.pokemmo.battle.pokemon;

import f.*;

public class PokemonHeldItemEffectTracker {
    public static PokemonHeldItemEffectTracker ue;
    public static PokemonHeldItemEffectTracker IL0;
    public static PokemonHeldItemEffectTracker Q5;
    public static PokemonHeldItemEffectTracker nC;
    public static PokemonHeldItemEffectTracker An;
    public static PokemonHeldItemEffectTracker Bq;
    public static PokemonHeldItemEffectTracker Zk0;
    public static PokemonHeldItemEffectTracker eM;
    public static PokemonHeldItemEffectTracker nz0;
    public static PokemonHeldItemEffectTracker Nk0;
    public static PokemonHeldItemEffectTracker UR;
    public static bm0_1 ww;
    public static PokemonHeldItemEffectTracker[] s3;
    public final byte Dg0;
    public final int iy;

    public PokemonHeldItemEffectTracker(byte key, int value) {
        this.iy = value;
        this.Dg0 = key;
    }

    public static kt_2 uF(byte value) {
        return (kt_2) t_0.BI0(ww.BM(value), kt_2.class, value);
    }

    static {
        if (f.kt_2.ue == null) {
            try {
                Class.forName(f.kt_2.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
