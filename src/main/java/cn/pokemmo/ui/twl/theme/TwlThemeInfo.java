package cn.pokemmo.ui.twl.theme;

import f.Jn0;
import f.NX;
import f.QS;
import f.R40;
import f.T8;
import f.Y30;
import f.ch_2;
import f.dc0_0;
import f.ie_1;
import f.wl0_2;
import f.xd0_2;

/**
 * 主题信息上下文 (ThemeInfo)
 */
public class TwlThemeInfo extends NX implements QS {
    public static final Class[] ALLOWED_REPLACE_TYPES = new Class[]{wl0_2.class, Y30.class, dc0_0.class};
    public final ie_1 parameters;

    public TwlThemeInfo(R40 configuration, xd0_2 origin) {
        super(configuration, origin);
        this.parameters = new ie_1();
    }

    public Y30 findFont(String name) {
        Y30 value = (Y30) this.getParameter(name, true, Y30.class, null);
        return value != null ? value : this.Hy.TG0;
    }

    public final Y30 D8(String name) {
        return findFont(name);
    }

    public wl0_2 findImage(String name) {
        wl0_2 value = (wl0_2) this.getParameter(name, true, wl0_2.class, null);
        return value == ch_2.fG ? null : value;
    }

    public final wl0_2 uT(String name) {
        return findImage(name);
    }

    public dc0_0 findMouseCursor(String name) {
        return (dc0_0) this.getParameter(name, false, dc0_0.class, null);
    }

    public final dc0_0 oX(String name) {
        return findMouseCursor(name);
    }

    public QS findTheme(String name) {
        QS value = (QS) this.getParameter(name, true, QS.class, null);
        return value == null ? this.Hy.Vd : value;
    }

    public final QS C60(String name) {
        return findTheme(name);
    }

    public boolean getParameter(String name, boolean fallback) {
        Boolean value = (Boolean) this.getParameter(name, true, Boolean.class, null);
        return value != null ? value : fallback;
    }

    public final boolean SD(String name, boolean fallback) {
        return getParameter(name, fallback);
    }

    public int getParameter(int fallback, String name) {
        Integer value = (Integer) this.getParameter(name, true, Integer.class, null);
        return value != null ? value : fallback;
    }

    public final int H10(int fallback, String name) {
        return getParameter(fallback, name);
    }

    public Object getParameter(String name, boolean required, Class expectedType, Object fallback) {
        Object value = this.parameters.B20(name);
        if (value == null && required) {
            this.warnMissing(expectedType, name);
        }
        if (!expectedType.isInstance(value)) {
            if (value != null) {
                Class actualType = value.getClass();
                T8 context = (T8) T8.wD0.get();
                String location = this.gn0 != null ? ", defined in " + this.gn0.xp(0).toString() : "";
                context.getClass();
                T8.l10.warning("Parameter \"" + name + "\" is a " + actualType.getSimpleName() + " expected a " + expectedType.getSimpleName() + location);
            }
            return fallback;
        }
        return expectedType.cast(value);
    }

    public final Object N30(String name, boolean required, Class expectedType, Object fallback) {
        return getParameter(name, required, expectedType, fallback);
    }

    public void warnMissing(Class expectedType, String name) {
        T8 context = (T8) T8.wD0.get();
        String location = this.gn0 != null ? ", defined in " + this.gn0.xp(0).toString() : "";
        context.getClass();
        StringBuilder message = new StringBuilder("Parameter \"").append(name).append("\" ");
        if (expectedType != null) {
            message.append("of type ");
            if (expectedType.isEnum()) {
                message.append("enum ");
            }
            message.append('\"').append(expectedType.getSimpleName()).append('\"');
        }
        message.append(" not set");
        if (this instanceof Jn0) {
            message.append(" for \"").append(((xd0_2) (Jn0) this).xp(0).toString()).append('\"');
        } else {
            message.append(location);
        }
        T8.l10.warning(message.toString());
    }

    public final void MY(Class expectedType, String name) {
        warnMissing(expectedType, name);
    }

    public void setParameter(String name, Object value) {
        Object previous = this.parameters.t40(name, value);
        if (previous == null || value == null) {
            return;
        }
        Class previousType = previous.getClass();
        Class valueType = value.getClass();
        if (previousType == valueType) {
            return;
        }
        for (Class allowedType : ALLOWED_REPLACE_TYPES) {
            if (allowedType.isAssignableFrom(previousType) && allowedType.isAssignableFrom(valueType)) {
                return;
            }
        }
        T8 context = (T8) T8.wD0.get();
        String location = this.gn0 != null ? ", defined in " + this.gn0.xp(0).toString() : "";
        context.getClass();
        T8.l10.warning("Paramter \"" + name + "\" of type " + previousType + " is replaced with type " + valueType + location);
    }

    public final void LPT3(Object value, String name) {
        setParameter(name, value);
    }
}
