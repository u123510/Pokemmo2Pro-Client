package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.cm_0
 */
public class Modern_Battle_Cm0 {

    public Modern_Battle_Cm0() {
        super();
    }

    public static E9 Zp0(Dn0 dn0, boolean bl) {
        return cm_0.Py(dn0, null, bl);
    }

    public static E9 Py(Dn0 dn0, ix0_0 ix0_02, boolean bl) {
        if (dn0 == null) {
            return null;
        }
        if (dn0.o30().endsWith(".cim")) {
            return new mc_0(dn0, F40.RK0(dn0), ix0_02, bl);
        }
        if (dn0.o30().endsWith(".etc1")) {
            return new ed_0(dn0, bl);
        }
        if (!dn0.o30().endsWith(".ktx") && !dn0.o30().endsWith(".zktx")) {
            i4_0 i4_02 = new i4_0(dn0);
            return new mc_0(dn0, i4_02, ix0_02, bl);
        }
        return new R10(dn0, bl);
    }
}


