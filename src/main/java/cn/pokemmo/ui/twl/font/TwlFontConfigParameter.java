package cn.pokemmo.ui.twl.font;

import f.*;

import cn.pokemmo.ui.twl.renderer.TwlFontParameter;
import java.util.HashMap;

/**
 * 字体参数集合兼容垫片
 * @see cn.pokemmo.ui.twl.renderer.TwlFontParameter
 */
public class TwlFontConfigParameter extends TwlFontParameter {
    public static final HashMap<String, qs_0> Db0;
    public static final qs_0 Xu0;
    public static final qs_0 Sw0;
    public static final qs_0 uI;
    public static final qs_0 nj0;
    public static final qs_0 NV;
    public static final qs_0 Sf;
    public static final qs_0 Bz;
    public static final qs_0 mJ;
    public static final qs_0 Pi0;
    public static final qs_0 z70;
    public static final qs_0 db;
    public static final qs_0 lJ0;
    public static final qs_0 y40;
    public static final qs_0 a10;
    public static final qs_0 hP;
    public static final qs_0 XN;
    public static final qs_0 Dq0;
    public static final qs_0 v9;
    public static final qs_0 k50;
    public static final qs_0 wG;
    public static final qs_0 LS;
    public static final qs_0 ca;
    public static final qs_0 Y0;
    public static final qs_0 Sx0;
    public static final qs_0 Vg;
    public static final qs_0 y80;
    public static final qs_0 id0;
    public static final qs_0 EC0;

    public TwlFontConfigParameter() {
        super();
    }

    public TwlFontConfigParameter(TwlFontConfigParameter p1) {
        super(p1);
    }

    public static qs_0 mY(Object p0, String p1) {
        if (p0 == null) {
            throw new NullPointerException("defaultValue");
        }
        Class<?> type = p0.getClass();
        synchronized (Db0) {
            qs_0 existing = Db0.get(p1);
            if (existing != null) {
                if (existing.xy0 == type
                        && (existing.Tx0 == p0
                        || (existing.Tx0 != null && existing.Tx0.equals(p0)))) {
                    return existing;
                }
                throw new IllegalStateException(
                        "type '" + p1 + "' already registered but different");
            }
            qs_0 created = new qs_0(p1, type, p0, Db0.size());
            Db0.put(p1, created);
            return created;
        }
    }

    static {
        Db0 = new HashMap<>();
        Xu0 = mY(Integer.valueOf(11), "size");
        Sw0 = mY(Integer.valueOf(-1), "size_cjk");
        uI = mY(Boolean.FALSE, "mono");
        nj0 = mY(JE0.n0, "hinting");
        NV = mY(JE0.Ut, "hinting_cjk");
        Sf = mY(Float.valueOf(1.7999999523F), "gamma");
        Bz = mY(Integer.valueOf(2), "render_count");
        mJ = mY(Float.valueOf(0.0F), "border_width");
        Pi0 = mY(gn_0.BLACK, "border_color");
        z70 = mY(Boolean.FALSE, "border_straight");
        db = mY(Float.valueOf(1.7999999523F), "border_gamma");
        lJ0 = mY(Integer.valueOf(0), "shadow_offset_x");
        y40 = mY(Integer.valueOf(0), "shadow_offset_y");
        a10 = mY(new gn_0((byte) 0, (byte) 0, (byte) 0, (byte) -65), "shadow_color");
        hP = mY(Integer.valueOf(0), "space_x");
        XN = mY(Integer.valueOf(0), "space_y");
        Dq0 = mY(Boolean.TRUE, "kerning");
        v9 = mY(eb0_1.Y30, "min_filter");
        k50 = mY(eb0_1.Y30, "mag_filter");
        wG = mY(gn_0.WHITE, "color");
        LS = mY(gn_0.WHITE, "font_color");
        ca = mY(Boolean.FALSE, "underline");
        Y0 = mY(Boolean.FALSE, "linethrough");
        Sx0 = mY("\u0000ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\"!\u0060?\\'.,;:()[]{}<>|/@\\^$€-%+=#_&~*\u007F\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\u009F\u00A0¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ", "characters");
        Vg = mY(Boolean.TRUE, "incremental");
        y80 = mY("", "faces");
        id0 = mY(Boolean.FALSE, "unique_atlas");
        EC0 = mY(Boolean.FALSE, "markup");
    }
}
