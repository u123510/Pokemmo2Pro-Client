package cn.pokemmo.ui.twl.theme;

/**
 * 样式属性定义 (textarea.StyleAttribute)
 */
public class TwlStyleAttribute<T> {
    public final boolean inherited;
    public final Class<T> type;
    public final T defaultValue;
    public final int ordinal;

    public TwlStyleAttribute(Class<T> type, T defaultValue, boolean inherited, int ordinal) {
        this.type = type;
        this.defaultValue = defaultValue;
        this.inherited = inherited;
        this.ordinal = ordinal;
    }

    public boolean isInherited() {
        return this.inherited;
    }

    public Class<T> getType() {
        return this.type;
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public int getOrdinal() {
        return this.ordinal;
    }
}
