package cn.pokemmo.battle.pokemon;

import f.*;

public class PokemonStatModifierTracker {
    public static PokemonStatModifierTracker i4;
    public static PokemonStatModifierTracker Ju0;
    public static PokemonStatModifierTracker dL0;
    public static PokemonStatModifierTracker xv;
    public static PokemonStatModifierTracker sn;
    public static PokemonStatModifierTracker KE;
    public static PokemonStatModifierTracker KJ0;
    public static PokemonStatModifierTracker Jr;
    public static PokemonStatModifierTracker[] p60;
    public static PokemonStatModifierTracker[] bi0;
    public final byte wf0;
    public final int tk;
    public final int JS;

    public PokemonStatModifierTracker(byte kind, int value, int id) {
        this.JS = value;
        this.wf0 = kind;
        this.tk = id;
    }

        static {
        if (f.fc0_0.i4 == null) {
            try {
                Class.forName(f.fc0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final int pM() {
        return this.tk;
    }
}
