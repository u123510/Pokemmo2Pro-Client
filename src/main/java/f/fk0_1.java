package f;

import cn.pokemmo.ui.twl.theme.TwlTextUnit;

/**
 * 文本值度量单位兼容垫片
 * @see cn.pokemmo.ui.twl.theme.TwlTextUnit
 */
public abstract class fk0_1 extends TwlTextUnit {
    public static boolean Ni0(int n) {
        return isFontRelative(n);
    }

    public static String u8(int n) {
        return getSuffix(n);
    }
}
