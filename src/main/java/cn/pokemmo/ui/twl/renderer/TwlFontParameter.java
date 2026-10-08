package cn.pokemmo.ui.twl.renderer;

import f.qs_0;

/**
 * 字体参数集合 (renderer.FontParameter)
 */
public class TwlFontParameter {
    public Object[] values;

    public TwlFontParameter() {
        this.values = new Object[8];
    }

    public TwlFontParameter(TwlFontParameter src) {
        this.values = src.values.clone();
    }

    public void put(qs_0 key, Object val) {
        if (key == null) {
            throw new NullPointerException("type");
        }
        if (val != null && !key.xy0.isInstance(val)) {
            throw new ClassCastException("value");
        }
        int index = key.JC0;
        int length = this.values.length;
        if (index >= length) {
            Object[] expanded = new Object[Math.max(index + 1, length * 2)];
            System.arraycopy(this.values, 0, expanded, 0, length);
            this.values = expanded;
        }
        this.values[index] = val;
    }

    public Object get(qs_0 key) {
        int index = key.JC0;
        if (index < this.values.length) {
            Object val = this.values[index];
            if (val != null) {
                return key.xy0.cast(val);
            }
        }
        return key.Tx0;
    }

    public final void Jv(qs_0 key, Object val) {
        put(key, val);
    }

    public final Object gE0(qs_0 key) {
        return get(key);
    }
}
