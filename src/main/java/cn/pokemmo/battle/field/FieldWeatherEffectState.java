package cn.pokemmo.battle.field;

import f.*;

public class FieldWeatherEffectState {
    public static FieldWeatherEffectState TU;
    public static FieldWeatherEffectState jI;
    public static FieldWeatherEffectState It;
    public static bm0_1 jn0;
    public static FieldWeatherEffectState[] RL0;
    public static FieldWeatherEffectState[] FA0;
    public final byte J0;
    public final float q90;
    public final byte MI;

    public FieldWeatherEffectState(int id, float value, byte kind) {
        this.J0 = (byte) id;
        this.q90 = value;
        this.MI = kind;
    }

    static {
        if (f.gt0_0.TU == null) {
            try {
                Class.forName(f.gt0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final String GJ0(int argument) {
        if (this == It) {
            return sm0_0.wa0(this.J0 + 5780, Integer.toString(1));
        }
        if (this == jI) {
            return sm0_0.wa0(this.J0 + 5780, Integer.toString(argument));
        }
        return sm0_0.c0(this.J0 + 5780);
    }

    public final byte fF() {
        return this.MI;
    }
}
