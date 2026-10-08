package cn.pokemmo.ui.twl.renderer;

/**
 * 字体参数键定义 (FontParameter.Parameter)
 */
public class TwlFontParameterKey<T> {
    public final String name;
    public final Class<T> type;
    public final T defaultValue;
    public final int ordinal;

    public TwlFontParameterKey(String name, Class<T> type, T defaultValue, int ordinal) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        this.ordinal = ordinal;
    }

    public String getName() {
        return this.name;
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

    @Override
    public String toString() {
        return this.ordinal + ":" + this.name + ":" + (this.type != null ? this.type.getSimpleName() : "null");
    }
}
