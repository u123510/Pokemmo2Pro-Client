package cn.pokemmo.constant;

import f.dn_1;
import f.s4_0;

public abstract class EntityFacingSwitchTable {
    public static final int[] LpT9;
    public static final int[] sP;

    static {
        sP = new int[s4_0.values().length];
        try { sP[s4_0.sQ.ordinal()] = 1; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.SB.ordinal()] = 2; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.Nh.ordinal()] = 3; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.SA0.ordinal()] = 4; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.Ci.ordinal()] = 5; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.n2.ordinal()] = 6; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.Oj0.ordinal()] = 7; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.mi0.ordinal()] = 8; } catch (NoSuchFieldError ignored) { }
        try { sP[s4_0.jZ.ordinal()] = 9; } catch (NoSuchFieldError ignored) { }

        LpT9 = new int[7];
        try { LpT9[dn_1.AR.LP] = 1; } catch (NoSuchFieldError ignored) { }
        try { LpT9[dn_1.sn.LP] = 2; } catch (NoSuchFieldError ignored) { }
        try { LpT9[dn_1.vI.LP] = 3; } catch (NoSuchFieldError ignored) { }
        try { LpT9[dn_1.o2.LP] = 4; } catch (NoSuchFieldError ignored) { }
    }
}
