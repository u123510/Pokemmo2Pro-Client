package f;

import cn.pokemmo.battle.pokemon.PokemonStatModifierTracker;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.fc0_0
 * 核心实现已迁移至 {@link cn.pokemmo.battle.pokemon.PokemonStatModifierTracker}
 */
public final class fc0_0 extends PokemonStatModifierTracker {
    public static final fc0_0 i4;
    public static final fc0_0 Ju0;
    public static final fc0_0 dL0;
    public static final fc0_0 xv;
    public static final fc0_0 sn;
    public static final fc0_0 KE;
    public static final fc0_0 KJ0;
    public static final fc0_0 Jr;
    public static final fc0_0[] p60;
    public static final fc0_0[] bi0;

    public fc0_0(byte kind, int value, int id) {
        super(kind, value, id);
    }

    static {

        fc0_0 v0 = new fc0_0((byte) 0, 0, 6800);
        i4 = v0;
        fc0_0 v1 = new fc0_0((byte) 1, 1, 6801);
        fc0_0 v2 = new fc0_0((byte) 2, 2, 6802);
        fc0_0 v3 = new fc0_0((byte) 3, 3, 6803);
        Ju0 = v3;
        fc0_0 v4 = new fc0_0((byte) 4, 4, 6804);
        fc0_0 v5 = new fc0_0((byte) 5, 5, 6805);
        dL0 = v5;
        fc0_0 v6 = new fc0_0((byte) 6, 6, 6806);
        xv = v6;
        fc0_0 v7 = new fc0_0((byte) 7, 7, 6807);
        sn = v7;
        fc0_0 v8 = new fc0_0((byte) 8, 8, 6808);
        fc0_0 v9 = new fc0_0((byte) 9, 11, 6811);
        KE = v9;
        fc0_0 v10 = new fc0_0((byte) 12, 10, nf0_0.lPT6);
        KJ0 = v10;
        fc0_0 v11 = new fc0_0((byte) 13, 11, nf0_0.l1);
        Jr = v11;
        fc0_0 v12 = new fc0_0((byte) 14, 12, nf0_0.sS);
        bi0 = new fc0_0[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12};
        p60 = bi0.clone();
        PokemonStatModifierTracker.i4 = i4;
        PokemonStatModifierTracker.Ju0 = Ju0;
        PokemonStatModifierTracker.dL0 = dL0;
        PokemonStatModifierTracker.xv = xv;
        PokemonStatModifierTracker.sn = sn;
        PokemonStatModifierTracker.KE = KE;
        PokemonStatModifierTracker.KJ0 = KJ0;
        PokemonStatModifierTracker.Jr = Jr;
        PokemonStatModifierTracker.p60 = p60;
        PokemonStatModifierTracker.bi0 = bi0;
    }
}
