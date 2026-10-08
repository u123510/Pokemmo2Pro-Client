package cn.pokemmo.battle.pokemon;

import f.*;

import cn.pokemmo.battle.pokemon.PokemonHeldItemEffectTracker;

public class PokemonHeldItemEffectCategory extends PokemonHeldItemEffectTracker {
    public static final kt_2 ue;
    public static final kt_2 IL0;
    public static final kt_2 Q5;
    public static final kt_2 nC;
    public static final kt_2 An;
    public static final kt_2 Bq;
    public static final kt_2 Zk0;
    public static final kt_2 eM;
    public static final kt_2 nz0;
    public static final kt_2 Nk0;
    public static final kt_2 UR;
    public static final bm0_1 ww;
    public static final kt_2[] s3;

    public PokemonHeldItemEffectCategory(byte key, int value) {
        super(key, value);
    }

    public static kt_2 uF(byte value) {
        return (kt_2) t_0.BI0(ww.BM(value), kt_2.class, value);
    }

    static {

        kt_2 v0 = new kt_2((byte) 0, 0);
        ue = v0;
        kt_2 v1 = new kt_2((byte) 1, 1);
        IL0 = v1;
        kt_2 v2 = new kt_2((byte) 2, 2);
        Q5 = v2;
        kt_2 v3 = new kt_2((byte) 3, 3);
        nC = v3;
        kt_2 v4 = new kt_2((byte) 4, 4);
        kt_2 v5 = new kt_2((byte) 5, 5);
        An = v5;
        kt_2 v6 = new kt_2((byte) 6, 6);
        Bq = v6;
        kt_2 v7 = new kt_2((byte) 7, 7);
        Zk0 = v7;
        kt_2 v8 = new kt_2((byte) 8, 8);
        kt_2 v9 = new kt_2((byte) 9, 9);
        kt_2 v10 = new kt_2((byte) 10, 10);
        kt_2 v11 = new kt_2((byte) 11, 11);
        eM = v11;
        kt_2 v12 = new kt_2((byte) 12, 12);
        kt_2 v13 = new kt_2((byte) 13, 13);
        nz0 = v13;
        kt_2 v14 = new kt_2((byte) 14, 14);
        kt_2 v15 = new kt_2((byte) 15, 15);
        Nk0 = v15;
        kt_2 v16 = new kt_2((byte) 16, 16);
        kt_2 v17 = new kt_2((byte) 17, 17);
        kt_2 v18 = new kt_2((byte) 127, 18);
        UR = v18;
        s3 = new kt_2[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9,
                v10, v11, v12, v13, v14, v15, v16, v17, v18};
        ww = new bm0_1();
        for (kt_2 value : s3.clone()) {
            ww.gE0(value.Dg0, value);
        }
    
        PokemonHeldItemEffectTracker.ue = ue;
        PokemonHeldItemEffectTracker.IL0 = IL0;
        PokemonHeldItemEffectTracker.Q5 = Q5;
        PokemonHeldItemEffectTracker.nC = nC;
        PokemonHeldItemEffectTracker.An = An;
        PokemonHeldItemEffectTracker.Bq = Bq;
        PokemonHeldItemEffectTracker.Zk0 = Zk0;
        PokemonHeldItemEffectTracker.eM = eM;
        PokemonHeldItemEffectTracker.nz0 = nz0;
        PokemonHeldItemEffectTracker.Nk0 = Nk0;
        PokemonHeldItemEffectTracker.UR = UR;
        PokemonHeldItemEffectTracker.ww = ww;
        PokemonHeldItemEffectTracker.s3 = s3;
    }
}
