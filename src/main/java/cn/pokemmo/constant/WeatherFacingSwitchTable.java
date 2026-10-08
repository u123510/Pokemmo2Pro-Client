package cn.pokemmo.constant;

import f.Pv0;
import f.s4_0;

public abstract class WeatherFacingSwitchTable {
    public static final int[] bd0;
    public static final int[] VR;

    static {
        VR = new int[Pv0.nb.clone().length];
        VR[0] = 1;
        VR[1] = 2;
        VR[2] = 3;
        VR[3] = 4;
        VR[4] = 5;
        bd0 = new int[s4_0.values().length];
        try { bd0[s4_0.CD0.ordinal()] = 1; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.XG.ordinal()] = 2; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.fd0.ordinal()] = 3; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Vw0.ordinal()] = 4; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.tA0.ordinal()] = 5; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.m00.ordinal()] = 6; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.EB.ordinal()] = 7; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Gk0.ordinal()] = 8; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Wp.ordinal()] = 9; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Od.ordinal()] = 10; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Rs0.ordinal()] = 11; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.Wh.ordinal()] = 12; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.jZ.ordinal()] = 13; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.mi0.ordinal()] = 14; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.OK0.ordinal()] = 15; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.VB.ordinal()] = 16; } catch (NoSuchFieldError ignored) { }
        try { bd0[s4_0.B1.ordinal()] = 17; } catch (NoSuchFieldError ignored) { }
    }
}
