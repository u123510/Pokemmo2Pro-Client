package f;

import cn.pokemmo.ui.twl.renderer.TwlFontParameterKey;

/**
 * 字体参数键兼容垫片
 * @see cn.pokemmo.ui.twl.renderer.TwlFontParameterKey
 */
public final class qs_0 extends TwlFontParameterKey {
    public final String fz0;
    public final Class xy0;
    public final Object Tx0;
    public final int JC0;

    public qs_0(String name, Class clazz, Object defaultValue, int ordinal) {
        super(name, clazz, defaultValue, ordinal);
        this.fz0 = name;
        this.xy0 = clazz;
        this.Tx0 = defaultValue;
        this.JC0 = ordinal;
    }
}
