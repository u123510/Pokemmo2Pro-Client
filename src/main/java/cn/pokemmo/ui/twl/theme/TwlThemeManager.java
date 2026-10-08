package cn.pokemmo.ui.twl.theme;

import f.*;

import com.badlogic.gdx.graphics.Color;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;

/**
 * TWL 主题管理器 (ThemeManager)
 */
public class TwlThemeManager {
    public static final HashMap wC;
    public static final Object ZA0;
    public static final boolean JE0;
    public final LC0 AK;
    public final pc0_1 yg;
    public final cu0_0 zU;
    public final ch_2 Ds0;
    public final HashMap D4;
    public LJ0 Wz;
    public final HashMap hu0;
    public final HashMap wQ;
    public final Hp0 HR;
    public Y30 TG0;
    public final LC0 Vd;

    private static <T extends Throwable> T raise(Throwable throwable) throws T {
        throw (T)throwable;
    }

    private static RuntimeException error(Throwable throwable) {
        return TwlThemeManager.<RuntimeException>raise(throwable);
    }

    static {
        JE0 = !TwlThemeManager.class.desiredAssertionStatus();
        wC = new HashMap();
        yf(pa0_0.class, "alignment");
        yf(xm_1.class, "direction");
        yf(jg0_1.class, "tabposition");
        ZA0 = new Object();
    }

    public TwlThemeManager(pc0_1 renderer, cu0_0 data) {
        R40 self = (this instanceof R40) ? (R40) this : null;
        this.Wz = null;
        this.AK = new LC0(self, null);
        this.yg = renderer;
        this.zU = data;
        this.Ds0 = new ch_2(this.AK, renderer);
        this.D4 = new HashMap();
        this.hu0 = new HashMap();
        this.wQ = new HashMap();
        this.Vd = new LC0(self, null);
        new ArrayList();
        this.HR = new Hp0(self);
    }

    public static void yf(Class type, String name) {
        if (!type.isEnum()) {
            throw new IllegalArgumentException("not an enum class");
        }
        Class previous = (Class)wC.get(name);
        if (previous != null && previous != type) {
            throw new IllegalArgumentException(
                    "Enum type name \"" + name + "\" is already in use by " + previous);
        }
        wC.put(name, type);
    }

    public static r50_0 BB0(int offset, String value) {
        offset = RF.Com2(value, offset, value.length());
        if (offset >= value.length()) {
            return null;
        }
        int end = value.indexOf(',', offset);
        if (end < 0) {
            end = value.length();
        }
        return new r50_0(RF.HF(value, offset, end), BB0(end + 1, value));
    }

    public static void cl0(Ps0 parser, xd0_2 theme) {
        String reference = parser.Yd0("ref");
        if (reference == null) {
            throw error(new XmlPullParserException(
                    "Reference required for wildcard theme", parser.Ja0, null));
        }
        if (!reference.endsWith("*")) {
            throw error(new XmlPullParserException(
                    "Wildcard reference must end with '*'", parser.Ja0, null));
        }
        reference = reference.substring(0, reference.length() - 1);
        if (!reference.isEmpty() && !reference.endsWith(".")) {
            throw error(new XmlPullParserException(
                    "Wildcard must end with \".*\" or be \"*\"", parser.Ja0, null));
        }
        theme.BL0 = reference;
        parser.aM();
    }

    public static TwlThemeManager EQ(URL url, pc0_1 renderer, cu0_0 data, HashMap constants) {
        if (renderer == null) {
            throw new IllegalArgumentException("renderer is null");
        }
        try {
            ((qq_0)renderer).RM(data);
            R40 result = new R40(renderer, data);
            result.AK.LPT3(Integer.valueOf(-1), "SINGLE_COLUMN");
            result.AK.LPT3(Short.valueOf((short)32767), "MAX");
            if (!constants.isEmpty()) {
                for (Object entryObject : constants.entrySet()) {
                    Map.Entry entry = (Map.Entry)entryObject;
                    result.AK.LPT3(entry.getValue(), (String)entry.getKey());
                }
            }
            result.MB0(url);
            return result;
        } catch (Throwable throwable) {
            if (throwable instanceof XmlPullParserException) {
                IOException wrapped = new IOException();
                wrapped.initCause(throwable);
                throw error(wrapped);
            }
            throw error(throwable);
        }
    }

    public final Jn0 VB(String name, boolean warn, boolean allowFallback) {
        int end = name.indexOf('.', 0);
        if (end < 0) {
            end = name.length();
        }
        Jn0 result = (Jn0)this.hu0.get(name.substring(0, end));
        if (result == null) {
            result = (Jn0)this.hu0.get("*");
            if (result != null) {
                if (!allowFallback) {
                    return null;
                }
                ((T8)T8.wD0.get()).getClass();
                T8.l10.warning("Selected fallback theme for missing theme \"" + name + "\"");
            }
        }
        while (result != null && end + 1 < name.length()) {
            int start = end + 1;
            end = name.indexOf('.', start);
            if (end < 0) {
                end = name.length();
            }
            result = ((xd0_2)result).vn(name.substring(start, end), true);
        }
        if (result == null && warn) {
            ((T8)T8.wD0.get()).getClass();
            T8.l10.warning("Could not find theme: " + name);
        }
        return result;
    }

    public final void MB0(URL url) {
        try (Ps0 parser = new Ps0(url)) {
            parser.qr0 = TwlThemeManager.class.getName();
            parser.Ja0.require(0, null, null);
            parser.aM();
            this.d70(parser, url);
        } catch (Throwable throwable) {
            if (throwable instanceof LE0) {
                throw error(throwable);
            }
            if (throwable instanceof XmlPullParserException) {
                XmlPullParserException parserException = (XmlPullParserException)throwable;
                throw error(new LE0(
                        parserException.getMessage(),
                        url,
                        parserException.getLineNumber(),
                        parserException.getColumnNumber(),
                        parserException));
            }
            if (throwable instanceof Exception) {
                IOException wrapped = new IOException("while parsing Theme XML: " + url);
                wrapped.initCause(throwable);
                throw error(wrapped);
            }
            throw error(throwable);
        }
    }

    public final void d70(Ps0 parser, URL url) throws XmlPullParserException, IOException {
        parser.Ja0.require(2, null, "themes");
        parser.aM();
        while (!parser.hE0()) {
            parser.Ja0.require(2, null, null);
            String tag = parser.Ja0.getName();
            if ("images".equals(tag) || "textures".equals(tag)) {
                parser.Ja0.require(2, null, null);
                xu_1 loaded = null;
                String file = parser.Yd0("file");
                if (file != null) {
                    String replacement = (String)this.Ds0.Tu.N30(file, false, String.class, null);
                    if (replacement != null) file = replacement;
                    parser.Yd0("format");
                    String filter = parser.Yd0("filter");
                    parser.Yd0("comment");
                    try {
                        loaded = ((qq_0)this.Ds0.Dq).kC0(new URL(url, file), filter);
                        if (loaded == null) throw new NullPointerException("loadTexture returned null");
                    } catch (IOException exception) {
                        throw error(parser.yF("Unable to load image file: " + file, exception));
                    }
                }
                this.Ds0.lpt8 = loaded;
                try {
                    parser.aM();
                    while (!parser.hE0()) {
                        String name = parser.Zs("name");
                        dj0_0.fX(parser, name);
                        String childType = parser.Ja0.getName();
                        if ("cursor".equals(childType)) {
                            this.Ds0.b2(parser, name);
                        } else {
                            wl0_2 image = this.Ds0.COM7(parser, childType);
                            this.Ds0.DA0.put(name, image);
                        }
                        parser.Ja0.require(3, null, childType);
                        parser.aM();
                    }
                } finally {
                    this.Ds0.lpt8 = null;
                }
            } else if ("include".equals(tag)) {
                String file = parser.Zs("filename");
                try {
                    this.MB0(new URL(url, file));
                } catch (Throwable throwable) {
                    if (throwable instanceof LE0) {
                        LE0 included = (LE0)throwable;
                        H00 location = included.MJ;
                        while (location.Wr0 != null) location = location.Wr0;
                        location.Wr0 = new H00(url, parser.Ja0.getLineNumber(), parser.Ja0.getColumnNumber());
                    }
                    throw error(throwable);
                }
                parser.aM();
            } else if ("fontGen".equals(tag)) {
                long started = System.currentTimeMillis();
                Logger.getLogger(TwlThemeManager.class.getName()).info("Generating Fonts...");
                for (Object font : this.D4.values()) ((zb0_2)(Y30)font).init((R40) this);
                Logger.getLogger(TwlThemeManager.class.getName()).info("Default font to '"
                        + (this.TG0 == null ? "null" : ((zb0_2)this.TG0).getName()) + "'");
                if (this.TG0 != null) ((zb0_2)this.TG0).init((R40) this);
                Logger.getLogger(TwlThemeManager.class.getName()).info(
                        "Generated fonts in " + (System.currentTimeMillis() - started) + " ms.");
                parser.aM();
            } else {
                String name = parser.Zs("name");
                if ("theme".equals(tag)) {
                    xd0_2 theme = this.hu0.containsKey(name) && !parser.y9("overwrite", false)
                            ? this.vW((xd0_2)this.hu0.get(name), parser, name, null, url)
                            : this.TD(null, parser, name, url);
                    this.hu0.put(name, theme);
                } else if ("inputMapDef".equals(tag)) {
                    if (this.wQ.containsKey(name)) {
                        throw error(new XmlPullParserException(
                                "inputMap \"" + name + "\" already defined", parser.Ja0, null));
                    }
                    this.wQ.put(name, this.is(parser, name, null));
                } else if ("fontDef".equals(tag)) {
                    boolean isDefault = parser.y9("default", false);
                    String reference = parser.Yd0("ref");
                    Y30 font;
                    if (reference != null) {
                        if (!this.D4.containsKey(reference)) {
                            throw error(new XmlPullParserException(
                                    "Can't find referenced font " + reference, parser.Ja0, null));
                        }
                        Dr0 base = new Dr0();
                        this.i60(parser, base);
                        ArrayList<Dr0> parameters = new ArrayList<>();
                        ArrayList<Oq> conditions = new ArrayList<>();
                        parser.aM();
                        while (!parser.hE0()) {
                            parser.Ja0.require(2, null, "fontParam");
                            Oq condition = dj0_0.Uu0(parser);
                            if (condition == null) {
                                throw error(new XmlPullParserException(
                                        "Condition required", parser.Ja0, null));
                            }
                            conditions.add(condition);
                            Dr0 parameter = new Dr0(base);
                            this.i60(parser, parameter);
                            parameters.add(parameter);
                            parser.aM();
                            parser.Ja0.require(3, null, "fontParam");
                            parser.aM();
                        }
                        parameters.add(base);
                        font = ((zb0_2)(Y30)this.D4.get(reference)).clone(
                                name,
                                new ww_2(conditions.toArray(new Oq[0])),
                                parameters.toArray(new Dr0[0]));
                    } else {
                        font = this.d9(parser, url);
                    }
                    if (font == null) {
                        throw error(new XmlPullParserException(
                                "unable to load font \"" + name + "\"", parser.Ja0, null));
                    }
                    this.D4.put(name, font);
                    if (isDefault || this.TG0 == null) this.TG0 = font;
                } else if ("constantDef".equals(tag)) {
                    this.Gg0(parser, url, "constantDef", null, this.AK);
                } else {
                    throw error(parser.Su0());
                }
            }
            parser.Ja0.require(3, null, tag);
            parser.aM();
        }
        parser.Ja0.require(3, null, "themes");
    }

    public final hd_1 is(Ps0 parser, String name, xd0_2 owner) throws XmlPullParserException, IOException {
        hd_1 base = hd_1.D0;
        if (parser.y9("merge", false)) {
            if (owner == null) {
                throw error(new XmlPullParserException("Can't merge on top level", parser.Ja0, null));
            }
            Object existing = owner.wa0.B20(name);
            if (existing instanceof hd_1) base = (hd_1)existing;
            else if (existing != null) {
                throw error(new XmlPullParserException(
                        "Can only merge with inputMap - found a "
                                + existing.getClass().getSimpleName(), parser.Ja0, null));
            }
        }
        String reference = parser.Yd0("ref");
        if (reference != null) {
            hd_1 referenced = (hd_1)this.wQ.get(reference);
            if (referenced == null) {
                throw error(new XmlPullParserException(
                        "Undefined input map: " + reference, parser.Ja0, null));
            }
            if (referenced != base && referenced.Ts0.length != 0) {
                if (base.Ts0.length == 0) base = referenced;
                else base = base.kb0(new LinkedHashSet(Arrays.asList(referenced.Ts0)));
            }
        }
        parser.aM();
        LinkedHashSet actions = new LinkedHashSet();
        while (!parser.hE0()) {
            parser.Ja0.require(2, null, "action");
            String actionName = parser.Zs("name");
            parser.jC0();
            try {
                TU action = TU.R3(parser.Ja0.nextText(), actionName);
                if (!actions.add(action)) {
                    Logger.getLogger(hd_1.class.getName()).log(
                            Level.WARNING, "Duplicate key stroke: {0}", action.cH0());
                }
            } catch (IllegalArgumentException exception) {
                throw error(parser.yF("can't parse Keystroke", exception));
            }
            parser.Ja0.require(3, null, "action");
            parser.aM();
        }
        return base.kb0(actions);
    }

    public final void i60(Ps0 parser, Dr0 parameters) {
        int count = parser.Ja0.getAttributeCount();
        for (int index = 0; index < count; ++index) {
            if (!parser.v70.get(index)) continue;
            String attributeName = parser.Ja0.getAttributeName(index);
            qs_0 type;
            synchronized (Dr0.Db0) { type = (qs_0)Dr0.Db0.get(attributeName); }
            if (type == null) continue;
            parser.v70.clear(index);
            String value = parser.Ja0.getAttributeValue(index);
            Class dataClass = type.xy0;
            if (dataClass == gn_0.class) {
                parameters.Jv(type, dj0_0.n20(parser, value, this.AK));
            } else if (dataClass == Integer.class) {
                parameters.Jv(type, Integer.valueOf(this.e5(parser, value).intValue()));
            } else if (dataClass == Boolean.class) {
                if ("true".equals(value)) parameters.Jv(type, Boolean.TRUE);
                else if ("false".equals(value)) parameters.Jv(type, Boolean.FALSE);
                else throw error(new XmlPullParserException(
                        "boolean value must be 'true' or 'false'", parser.Ja0, null));
            } else if (dataClass == String.class) {
                parameters.Jv(type, value);
            } else if (dataClass == Float.class) {
                parameters.Jv(type, Float.valueOf(Float.parseFloat(value)));
            } else if (dataClass.isEnum()) {
                parameters.Jv(type, Enum.valueOf(dataClass, value));
            } else {
                throw error(new XmlPullParserException(
                        "dataClass not yet implemented: " + dataClass, parser.Ja0, null));
            }
        }
    }

    public final xd0_2 vW(xd0_2 previous, Ps0 parser, String name, xd0_2 parent, URL url) throws XmlPullParserException, IOException {
        if (!"*".equals(name) || parent != null) {
            dj0_0.fX(parser, name);
            if (name.indexOf('.') >= 0) {
                throw error(new XmlPullParserException(
                        "'.' is not allowed in names", parser.Ja0, null));
            }
        }
        xd0_2 theme = new xd0_2((R40) this, name, parent);
        xd0_2 oldContext = this.HR.qA0;
        this.HR.qA0 = theme;
        try {
            if (parser.y9("merge", false)) {
                if (parent == null) {
                    throw error(new XmlPullParserException("Can't merge on top level", parser.Ja0, null));
                }
                xd0_2 merged = (xd0_2)parent.W70.B20(name);
                if (merged != null) {
                    theme.wa0.zR(merged.wa0);
                    theme.W70.zR(merged.W70);
                    theme.BL0 = merged.BL0;
                }
            }
            if (parser.Yd0("ref") != null) {
                theme.wa0.zR(previous.wa0);
                theme.W70.zR(previous.W70);
                theme.BL0 = previous.BL0;
            }
            theme.pl0 = parser.y9("allowWildcard", true);
            parser.aM();
            while (!parser.hE0()) {
                parser.Ja0.require(2, null, null);
                String childType = parser.Ja0.getName();
                String childName = parser.Zs("name");
                if ("param".equals(childType)) {
                    this.Gg0(parser, url, "param", theme, theme);
                } else if ("theme".equals(childType)) {
                    if (childName.isEmpty()) cl0(parser, theme);
                    else {
                        xd0_2 child;
                        xd0_2 existing = (xd0_2)theme.W70.B20(childName);
                        if (existing != null && !parser.y9("overwrite", false)) {
                            child = this.vW(existing, parser, childName, theme, url);
                        } else {
                            child = this.TD(theme, parser, childName, url);
                        }
                        theme.W70.t40(childName, child);
                    }
                } else {
                    throw error(parser.Su0());
                }
                parser.Ja0.require(3, null, childType);
                parser.aM();
            }
            return theme;
        } finally {
            this.HR.qA0 = oldContext;
        }
    }

    public final void Gg0(Ps0 parser, URL url, String type, xd0_2 owner, LC0 target) throws XmlPullParserException, IOException {
        try {
            parser.Ja0.require(2, null, type);
            String name = parser.Zs("name");
            parser.aM();
            String valueType = parser.Ja0.getName();
            Object value = this.Zz(parser, valueType, name, url, owner);
            parser.Ja0.require(3, null, valueType);
            parser.aM();
            parser.Ja0.require(3, null, type);
            if (value instanceof Map) {
                Map values = (Map)value;
                if (owner == null && values.size() != 1) {
                    throw error(new XmlPullParserException(
                            "constant definitions must define exactly 1 value", parser.Ja0, null));
                }
                target.getClass();
                for (Object entryObject : values.entrySet()) {
                    Map.Entry entry = (Map.Entry)entryObject;
                    target.LPT3(entry.getValue(), (String)entry.getKey());
                }
            } else {
                dj0_0.fX(parser, name);
                target.LPT3(value, name);
            }
        } catch (NumberFormatException exception) {
            throw error(parser.yF("unable to parse value", exception));
        }
    }

    public final Object Zz(Ps0 parser, String type, String name, URL url, xd0_2 owner) throws XmlPullParserException, IOException {
        try {
            if ("list".equals(type)) {
                cb0_0 list = new cb0_0((R40) this, owner);
                parser.aM();
                while (parser.Ja0.getEventType() == 2) {
                    String childType = parser.Ja0.getName();
                    Object value = this.Zz(parser, childType, null, url, owner);
                    parser.Ja0.require(3, null, childType);
                    list.B5.add(value);
                    parser.aM();
                }
                return list;
            }
            if ("map".equals(type)) return this.jS(owner, parser, name, url);
            if ("inputMapDef".equals(type)) return this.is(parser, name, owner);
            if ("fontDef".equals(type)) return this.d9(parser, url);
            if ("enum".equals(type)) {
                String enumType = parser.Zs("type");
                Class enumClass = (Class)wC.get(enumType);
                if (enumClass == null) {
                    throw error(new XmlPullParserException(
                            "enum type \"" + enumType + "\" not registered", parser.Ja0, null));
                }
                parser.jC0();
                return parser.he(enumClass, parser.Ja0.nextText());
            }
            if ("bool".equals(type)) {
                parser.jC0();
                String value = parser.Ja0.nextText();
                if ("true".equals(value)) return Boolean.TRUE;
                if ("false".equals(value)) return Boolean.FALSE;
                throw error(new XmlPullParserException(
                        "boolean value must be 'true' or 'false'", parser.Ja0, null));
            }
            parser.jC0();
            String value = parser.Ja0.nextText();
            if ("color".equals(type)) return dj0_0.n20(parser, value, this.AK);
            if ("float".equals(type)) return Float.valueOf(this.e5(parser, value).floatValue());
            if ("int".equals(type)) return Integer.valueOf(this.e5(parser, value).intValue());
            if ("string".equals(type)) return value;
            if ("font".equals(type)) {
                Y30 font = (Y30)this.D4.get(value);
                if (font == null) {
                    throw error(new XmlPullParserException(
                            "Font \"" + value + "\" not found", parser.Ja0, null));
                }
                return font;
            }
            if ("border".equals(type)) return this.JC(parser, value, ux0_0.class);
            if ("dimension".equals(type)) return this.JC(parser, value, L50.class);
            if ("gap".equals(type) || "size".equals(type)) return this.JC(parser, value, Uu.class);
            if ("constant".equals(type)) {
                Object constant = this.AK.wa0.B20(value);
                if (constant != null) return constant == ZA0 ? null : constant;
                throw error(new XmlPullParserException(
                        "Unknown constant: " + value, parser.Ja0, null));
            }
            if ("image".equals(type)) {
                if (value.endsWith(".*")) {
                    if (name == null) throw new IllegalArgumentException("Wildcard's not allowed");
                    return dj0_0.LD0(this.Ds0.DA0, value, name, null);
                }
                return this.Ds0.or(parser, value);
            }
            if ("cursor".equals(type)) {
                if (value.endsWith(".*")) {
                    if (name == null) throw new IllegalArgumentException("Wildcard's not allowed");
                    return dj0_0.LD0(this.Ds0.KR, value, name, ch_2.Be0);
                }
                return this.Ds0.GW(parser, value);
            }
            if ("inputMap".equals(type)) {
                hd_1 inputMap = (hd_1)this.wQ.get(value);
                if (inputMap == null) {
                    throw error(new XmlPullParserException(
                            "Undefined input map: " + value, parser.Ja0, null));
                }
                return inputMap;
            }
            throw error(new XmlPullParserException(
                    "Unknown type \"" + type + "\" specified", parser.Ja0, null));
        } catch (NumberFormatException exception) {
            throw error(parser.yF("unable to parse value", exception));
        }
    }

    public final Number e5(Ps0 parser, String expression) {
        try {
            this.HR.B.clear();
            new COM5_(expression, this.HR).n50(false);
            if (this.HR.B.size() != 1) {
                throw new IllegalStateException("Expected one return value on the stack");
            }
            return this.HR.A10();
        } catch (Throwable throwable) {
            if (!(throwable instanceof ParseException)) throw error(throwable);
            Throwable cause = throwable.getCause();
            throw error(parser.yF("unable to evaluate", cause == null ? throwable : cause));
        }
    }

    public final Object JC(Ps0 parser, String expression, Class type) {
        try {
            return this.HR.sa(type, expression);
        } catch (Throwable throwable) {
            if (!(throwable instanceof ParseException)) throw error(throwable);
            Throwable cause = throwable.getCause();
            throw error(parser.yF("unable to evaluate", cause == null ? throwable : cause));
        }
    }

    public final void CoM6() {
        try {
            for (Object font : this.D4.values()) ((zb0_2)(Y30)font).destroy();
            if (this.TG0 != null) {
                ((zb0_2)this.TG0).destroy();
                this.TG0 = null;
            }
            this.D4.clear();
            if (this.Wz != null) {
                I2 pages = this.Wz.b6.ZD();
                while (pages.hasNext()) ((ZO)pages.next()).q5.dispose();
                this.Wz.dispose();
                this.Wz = null;
            }
            for (Object regionObject : this.zU.z10) {
                xu_1 region = (xu_1)regionObject;
                region.Sd.dispose();
                if (region.xA != null) {
                    for (Object entryObject : region.xA) {
                        wk_1 entry = (wk_1)entryObject;
                        if (entry.um0 != null) {
                            entry.um0.dispose();
                            entry.um0 = null;
                            entry.NM.dispose();
                            entry.NM = null;
                        }
                    }
                    region.xA.clear();
                }
            }
            for (Object value : this.zU.NI.values()) {
                value.getClass();
                throw new ClassCastException();
            }
        } catch (Throwable throwable) {
            this.zU.mq.clear();
            this.zU.NI.clear();
            this.zU.z10.clear();
            this.zU.Ox = false;
            throw throwable;
        }
        this.zU.mq.clear();
        this.zU.NI.clear();
        this.zU.z10.clear();
        this.zU.Ox = false;
    }

    public final xd0_2 TD(xd0_2 parent, Ps0 parser, String name, URL url) throws XmlPullParserException, IOException {
        if (!"*".equals(name) || parent != null) {
            dj0_0.fX(parser, name);
            if (name.indexOf('.') >= 0) {
                throw error(new XmlPullParserException(
                        "'.' is not allowed in names", parser.Ja0, null));
            }
        }
        xd0_2 theme = new xd0_2((R40) this, name, parent);
        xd0_2 oldContext = this.HR.qA0;
        this.HR.qA0 = theme;
        try {
            if (parser.y9("merge", false)) {
                if (parent == null) {
                    throw error(new XmlPullParserException("Can't merge on top level", parser.Ja0, null));
                }
                xd0_2 merged = (xd0_2)parent.W70.B20(name);
                if (merged != null) {
                    theme.wa0.zR(merged.wa0);
                    theme.W70.zR(merged.W70);
                    theme.BL0 = merged.BL0;
                }
            }
            parser.Yd0("overwrite");
            String reference = parser.Yd0("ref");
            if (reference != null) {
                xd0_2 referenced = parent == null ? null : (xd0_2)parent.W70.B20(reference);
                if (referenced == null) referenced = (xd0_2)this.VB(reference, true, true);
                if (referenced == null) {
                    throw error(new XmlPullParserException(
                            "referenced theme info not found: " + reference, parser.Ja0, null));
                }
                theme.wa0.zR(referenced.wa0);
                theme.W70.zR(referenced.W70);
                theme.BL0 = referenced.BL0;
            }
            theme.pl0 = parser.y9("allowWildcard", true);
            parser.aM();
            while (!parser.hE0()) {
                parser.Ja0.require(2, null, null);
                String childType = parser.Ja0.getName();
                String childName = parser.Zs("name");
                if ("param".equals(childType)) {
                    this.Gg0(parser, url, "param", theme, theme);
                } else if ("theme".equals(childType)) {
                    if (childName.isEmpty()) cl0(parser, theme);
                    else {
                        xd0_2 child = this.TD(theme, parser, childName, url);
                        theme.W70.t40(childName, child);
                    }
                } else {
                    throw error(parser.Su0());
                }
                parser.Ja0.require(3, null, childType);
                parser.aM();
            }
            return theme;
        } finally {
            this.HR.qA0 = oldContext;
        }
    }

    public final LC0 jS(xd0_2 parent, Ps0 parser, String name, URL url) throws XmlPullParserException, IOException {
        LC0 result = new LC0((R40) this, parent);
        if (parser.y9("merge", false)) {
            if (parent == null) {
                throw error(new XmlPullParserException("Can't merge on top level", parser.Ja0, null));
            }
            Object existing = parent.wa0.B20(name);
            if (existing instanceof LC0) result.wa0.zR(((LC0)existing).wa0);
            else if (existing != null) {
                throw error(new XmlPullParserException(
                        "Can only merge with map - found a "
                                + existing.getClass().getSimpleName(), parser.Ja0, null));
            }
        }
        String reference = parser.Yd0("ref");
        if (reference != null) {
            Object referenced = parent == null ? null : parent.wa0.B20(reference);
            if (referenced == null) referenced = this.AK.wa0.B20(reference);
            if (referenced == null) throw error(new IOException("Referenced map not found: " + reference));
            if (!(referenced instanceof LC0)) {
                throw error(new IOException(
                        "Expected a map got a " + referenced.getClass().getSimpleName()));
            }
            result.wa0.zR(((LC0)referenced).wa0);
        }
        parser.aM();
        while (parser.Ja0.getEventType() == 2) {
            String childType = parser.Ja0.getName();
            this.Gg0(parser, url, "param", parent, result);
            parser.Ja0.require(3, null, childType);
            parser.aM();
        }
        return result;
    }

    public final zb0_2 d9(Ps0 parser, URL url) throws XmlPullParserException, IOException {
        String name = parser.Zs("name");
        String filename = parser.Yd0("filename");
        if (filename != null) {
            try {
                url = new URL(url, filename);
            } catch (IOException exception) {
                throw error(exception);
            }
        }
        String familyText = parser.Yd0("families");
        r50_0 families = familyText == null ? null : BB0(0, familyText);
        if (families != null) {
            this.e5(parser, parser.Zs("size")).intValue();
            String styleText = parser.Yd0("style");
            r50_0 styles = styleText == null ? null : BB0(0, styleText);
            while (styles != null) {
                if (!"bold".equalsIgnoreCase(styles.Wo0)) "italic".equalsIgnoreCase(styles.Wo0);
                styles = styles.g9;
            }
        }
        Dr0 base = new Dr0();
        this.i60(parser, base);
        ArrayList<Dr0> parameterList = new ArrayList<>();
        ArrayList<Oq> conditions = new ArrayList<>();
        parser.aM();
        while (!parser.hE0()) {
            parser.Ja0.require(2, null, "fontParam");
            Oq condition = dj0_0.Uu0(parser);
            if (condition == null) {
                throw error(new XmlPullParserException("Condition required", parser.Ja0, null));
            }
            conditions.add(condition);
            Dr0 parameter = new Dr0(base);
            this.i60(parser, parameter);
            parameterList.add(parameter);
            parser.aM();
            parser.Ja0.require(3, null, "fontParam");
            parser.aM();
        }
        parameterList.add(base);
        Oq[] conditionArray = conditions.toArray(new Oq[0]);
        ww_2 select = new ww_2(conditionArray);
        Dr0[] parameters = parameterList.toArray(new Dr0[0]);
        if (families != null) this.yg.getClass();
        qq_0 renderer = (qq_0)this.yg;
        renderer.getClass();
        if (conditionArray.length + 1 != parameters.length) {
            throw new IllegalArgumentException(
                    "select.getNumExpressions() + 1 != parameterList.length");
        }
        pm_0 fontParameters = new pm_0();
        fontParameters.CY = true;
        fontParameters.is0 = f.JE0.E7;
        String[] faces = new String[0];
        boolean uniqueAtlas = false;
        boolean markup = false;
        for (Dr0 parameter : parameters) {
            fontParameters.fp = (Boolean)parameter.gE0(Dr0.Vg);
            fontParameters.ru = (Integer)parameter.gE0(Dr0.Xu0);
            int cjkSize = (Integer)parameter.gE0(Dr0.Sw0);
            fontParameters.i00 = (Boolean)parameter.gE0(Dr0.uI);
            fontParameters.is0 = (f.JE0)parameter.gE0(Dr0.nj0);
            f.JE0 cjkHinting = (f.JE0)parameter.gE0(Dr0.NV);
            fontParameters.E50 = ((Float)parameter.gE0(Dr0.Sf)).floatValue();
            fontParameters.a9 = (Integer)parameter.gE0(Dr0.Bz);
            fontParameters.oF = ((Float)parameter.gE0(Dr0.mJ)).floatValue();
            gn_0 borderColor = (gn_0)parameter.gE0(Dr0.Pi0);
            Color convertedBorder = new Color();
            convertedBorder.a = borderColor.bh();
            convertedBorder.r = borderColor.HH();
            convertedBorder.g = borderColor.W1();
            convertedBorder.b = borderColor.eD0();
            fontParameters.t5 = convertedBorder;
            fontParameters.lPt3 = (Boolean)parameter.gE0(Dr0.z70);
            fontParameters.Y2 = ((Float)parameter.gE0(Dr0.db)).floatValue();
            fontParameters.nb = (Integer)parameter.gE0(Dr0.lJ0);
            fontParameters.hA = (Integer)parameter.gE0(Dr0.y40);
            gn_0 shadowColor = (gn_0)parameter.gE0(Dr0.a10);
            Color convertedShadow = new Color();
            convertedShadow.a = shadowColor.bh();
            convertedShadow.r = shadowColor.HH();
            convertedShadow.g = shadowColor.W1();
            convertedShadow.b = shadowColor.eD0();
            fontParameters.cf = convertedShadow;
            fontParameters.ka = (Integer)parameter.gE0(Dr0.hP);
            fontParameters.gh0 = (Integer)parameter.gE0(Dr0.XN);
            fontParameters.ot = (Boolean)parameter.gE0(Dr0.Dq0);
            fontParameters.OY = (eb0_1)parameter.gE0(Dr0.v9);
            fontParameters.LN = (eb0_1)parameter.gE0(Dr0.k50);
            gn_0 fontColor = (gn_0)parameter.gE0(Dr0.LS);
            Color convertedFont = new Color();
            convertedFont.a = fontColor.bh();
            convertedFont.r = fontColor.HH();
            convertedFont.g = fontColor.W1();
            convertedFont.b = fontColor.eD0();
            fontParameters.Fi0 = convertedFont;
            fontParameters.t80 = (String)parameter.gE0(Dr0.Sx0);
            faces = ((String)parameter.gE0(Dr0.y80)).split(",");
            uniqueAtlas = (Boolean)parameter.gE0(Dr0.id0);
            markup = (Boolean)parameter.gE0(Dr0.EC0);
            if (zb0_2.bigCJKFontSizes()) {
                if (cjkSize > 0) fontParameters.ru = cjkSize;
                if (cjkHinting != f.JE0.Ut) fontParameters.is0 = cjkHinting;
            }
        }
        Dn0 file = null;
        try {
            file = (Dn0)url.getContent();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        if (file == null || !file.os0()) {
            Logger.getLogger(qq_0.class.getName()).log(
                    Level.WARNING,
                    "Couldn't locate font file: " + url.getPath() + " fh = " + file);
            return null;
        }
        return new zb0_2(
                name, renderer, file, fontParameters, select, faces,
                uniqueAtlas, markup, renderer.u7, parameters);
    }

    public Jn0 findTheme(String name) {
        return VB(name, true, false);
    }

    public Jn0 findTheme(String name, boolean warn) {
        return VB(name, warn, false);
    }

    public void destroy() {
        CoM6();
    }
}
