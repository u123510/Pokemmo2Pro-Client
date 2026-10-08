package cn.pokemmo.ui.twl.theme;

import f.*;

import cn.pokemmo.ui.widget.model.ThemeStateFlagConstants;

public class ThemeStateFlagRule extends ThemeStateFlagConstants {
    public static final _volatile Bf0;
    public static final _volatile BV;
    public static final _volatile Ch;
    public static final _volatile JR;
    public static final _volatile kA0;
    public static final _volatile Ic;
    public static final _volatile CG0;
    public static final _volatile Kb;
    public static final _volatile cN;
    public static final _volatile Nk0;
    public static final _volatile[] pG0;
    public static final _volatile[] VA;
    public static final _volatile[] COm9;
    public static final bm0_1 zs0;
    public static final _volatile[] e4;

    public ThemeStateFlagRule(int h, byte group, int frequency, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
        super(h, group, frequency, flag1, flag2, flag3, flag4);
    }

    static {

        if (b.JW != null) {
            // Force initialization of the registry before constructing entries.
        }
        _volatile v0 = new _volatile(0, (byte) 0, 660, true, false, false, true);
        Bf0 = v0;
        _volatile v1 = new _volatile(1, (byte) 1, 6, true, false, true, false);
        BV = v1;
        _volatile v2 = new _volatile(2, (byte) 2, 6, false, false, false, false);
        Ch = v2;
        _volatile v3 = new _volatile(3, (byte) 3, 26, false, false, false, false);
        JR = v3;
        _volatile v4 = new _volatile(4, (byte) 4, 6, false, true, true, false);
        kA0 = v4;
        _volatile v5 = new _volatile(5, (byte) 5, 0, false, false, false, false);
        _volatile v6 = new _volatile(6, (byte) 6, 0, false, false, false, false);
        _volatile v7 = new _volatile(7, (byte) 7, 0, false, false, false, false);
        Ic = v7;
        _volatile v8 = new _volatile(8, (byte) 8, 0, false, false, false, false);
        _volatile v9 = new _volatile(9, (byte) 9, 6, true, true, true, false);
        CG0 = v9;
        _volatile v10 = new _volatile(10, (byte) 10, 60, true, false, false, true);
        Kb = v10;
        _volatile v11 = new _volatile(11, (byte) 11, 60, true, false, false, false);
        cN = v11;
        _volatile v12 = new _volatile(12, (byte) 12, 6, false, true, true, false);
        Nk0 = v12;
        e4 = new _volatile[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12};
        VA = new _volatile[]{v12, v4, v9, v1};
        COm9 = new _volatile[]{v1, v0, v10};
        pG0 = e4.clone();
        zs0 = new bm0_1();
        for (_volatile value : pG0) {
            zs0.gE0(value.Go0, value);
        }
    
        ThemeStateFlagConstants.Bf0 = Bf0;
        ThemeStateFlagConstants.BV = BV;
        ThemeStateFlagConstants.Ch = Ch;
        ThemeStateFlagConstants.JR = JR;
        ThemeStateFlagConstants.kA0 = kA0;
        ThemeStateFlagConstants.Ic = Ic;
        ThemeStateFlagConstants.CG0 = CG0;
        ThemeStateFlagConstants.Kb = Kb;
        ThemeStateFlagConstants.cN = cN;
        ThemeStateFlagConstants.Nk0 = Nk0;
        ThemeStateFlagConstants.pG0 = pG0;
        ThemeStateFlagConstants.VA = VA;
        ThemeStateFlagConstants.COm9 = COm9;
        ThemeStateFlagConstants.zs0 = zs0;
        ThemeStateFlagConstants.e4 = e4;
    }
}
