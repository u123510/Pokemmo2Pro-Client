package cn.pokemmo.ui.widget.factory;

import f.*;
import java.lang.reflect.Array;

public abstract class WidgetLayoutAnchorConstants {
    public final Object qm;
    public final int Yj0;
    public a9_0 Qk;

    public WidgetLayoutAnchorConstants(Object key) {
        this.qm = key;
        this.Yj0 = key.hashCode();
    }

    public static WidgetLayoutAnchorConstants i40(WidgetLayoutAnchorConstants[] table, Object key) {
        if (table == null) {
            return null;
        }
        int hash = key.hashCode();
        WidgetLayoutAnchorConstants value = table[hash & (table.length - 1)];
        while (value != null) {
            if (value.Yj0 == hash && (value.qm == key || key.equals(value.qm))) {
                break;
            }
            value = value.Qk;
        }
        return value;
    }

    public static void Fz(WidgetLayoutAnchorConstants[] table, a9_0 value) {
        int index = value.Yj0 & (table.length - 1);
        WidgetLayoutAnchorConstants current = table[index];
        if (current == value) {
            table[index] = current.Qk;
            return;
        }
        WidgetLayoutAnchorConstants next = current.Qk;
        while (next != value) {
            current = next;
            next = current.Qk;
        }
        current.Qk = next.Qk;
    }

    public static WidgetLayoutAnchorConstants[] bj(WidgetLayoutAnchorConstants[] table, int requested) {
        if (requested * 4 <= table.length * 3) {
            return table;
        }
        int newSize = table.length * 2;
        if (newSize < 4 || (newSize & (newSize - 1)) != 0) {
            throw new IllegalArgumentException("newSize");
        }
        WidgetLayoutAnchorConstants[] resized = (WidgetLayoutAnchorConstants[]) Array.newInstance(table.getClass().getComponentType(), newSize);
        for (int i = 0; i < table.length; i++) {
            WidgetLayoutAnchorConstants value = table[i];
            while (value != null) {
                WidgetLayoutAnchorConstants next = value.Qk;
                int index = value.Yj0 & (newSize - 1);
                value.Qk = (a9_0) resized[index];
                resized[index] = value;
                value = next;
            }
        }
        return resized;
    }
}
