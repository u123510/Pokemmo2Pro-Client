package cn.pokemmo.ui.i18n;

import f.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalizedUiLayoutManager extends D90 {
    public static final HashMap fm0;
    public static final HashMap m6;
    public static final HashMap Hh0;
    public static final HashMap x9;
    public static final HashMap Mi0;
    public static final HashMap M30;
    public static final HashMap TF0;

    static {
        HashMap hashMap = new HashMap();
        fm0 = hashMap;
        HashMap hashMap2 = new HashMap();
        m6 = hashMap2;
        HashMap hashMap3 = new HashMap();
        Hh0 = hashMap3;
        HashMap hashMap4 = new HashMap();
        x9 = hashMap4;
        HashMap hashMap5 = new HashMap();
        Mi0 = hashMap5;
        HashMap hashMap6 = new HashMap();
        M30 = hashMap6;
        HashMap hashMap7 = new HashMap();
        TF0 = hashMap7;

        hashMap.put("pre", Boolean.TRUE);
        hashMap.put("normal", Boolean.FALSE);

        hashMap2.put("normal", Boolean.FALSE);
        hashMap2.put("break-word", Boolean.TRUE);

        f.sw0 sw0Var = new f.sw0("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        f.sw0 sw0Var2 = new f.sw0("abcdefghijklmnopqrstuvwxyz");
        hashMap3.put("decimal", f.sw0.j);
        hashMap3.put("upper-alpha", sw0Var);
        hashMap3.put("lower-alpha", sw0Var2);
        hashMap3.put("upper-latin", sw0Var);
        hashMap3.put("lower-latin", sw0Var2);
        hashMap3.put("upper-roman", new ex_0(false));
        hashMap3.put("lower-roman", new ex_0(true));
        hashMap3.put("lower-greek", new f.sw0("αβγδεζηθικλμνξοπρστυφχψω"));
        hashMap3.put("upper-norwegian", new f.sw0("ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ"));
        hashMap3.put("lower-norwegian", new f.sw0("abcdefghijklmnopqrstuvwxyzæøå"));
        hashMap3.put("upper-russian-short", new f.sw0("АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯ"));
        hashMap3.put("lower-russian-short", new f.sw0("абвгдежзиклмнопрстуфхцчшщэюя"));

        hashMap4.put("normal", Boolean.FALSE);
        hashMap4.put("italic", Boolean.TRUE);
        hashMap4.put("oblique", Boolean.TRUE);

        hashMap5.put("normal", Integer.valueOf(400));
        hashMap5.put("bold", Integer.valueOf(700));

        hashMap6.put("none", rx0.j2);
        hashMap6.put("underline", rx0.ra0);
        hashMap6.put("line-through", rx0.zL);

        hashMap7.put("inherit", Boolean.TRUE);
        hashMap7.put("normal", Boolean.FALSE);
    }

    public LocalizedUiLayoutManager(D90 d90, li_0 li_0Var, String str) {
        super(d90, li_0Var);
        lE(str);
    }

    public static r50_0 qo0(int i, String str) {
        int com2 = RF.Com2(str, i, str.length());
        if (com2 >= str.length()) {
            return null;
        }
        char charAt = str.charAt(com2);
        String hf;
        int i2;
        if (charAt != '\"' && charAt != '\'') {
            i2 = str.indexOf(',', com2);
            if (i2 < 0) {
                i2 = str.length();
            }
            hf = RF.HF(str, com2, i2);
        } else {
            int i3 = com2 + 1;
            i2 = str.indexOf(charAt, i3);
            if (i2 < 0) {
                i2 = str.length();
            }
            String substring = str.substring(i3, i2);
            i2 = RF.Com2(str, i2 + 1, str.length());
            if (i2 < str.length() && str.charAt(i2) != ',') {
                throw new IllegalArgumentException(yr_1.pG("\',\' expected at ", i3));
            }
            hf = substring;
        }
        return new r50_0(hf, qo0(i2 + 1, str));
    }

    public static g20_0 Kg0(String str) {
        int i = 2;
        int i2;
        if (str.endsWith("px")) {
            i2 = 1;
        } else if (str.endsWith("pt")) {
            i2 = 2;
        } else if (str.endsWith("em")) {
            i2 = 3;
        } else if (str.endsWith("ex")) {
            i2 = 4;
        } else if (str.endsWith("%")) {
            i = 1;
            i2 = 5;
        } else if ("0".equals(str)) {
            return g20_0.Jp0;
        } else if ("auto".equals(str)) {
            return g20_0.NO;
        } else {
            throw new IllegalArgumentException("Unknown numeric suffix: ".concat(str));
        }
        return new g20_0(Float.parseFloat(RF.HF(str, 0, str.length() - i)), i2);
    }

    public static byte[] E2(int i, String str) {
        String[] split = str.split(",");
        if (split.length != i) {
            throw new IllegalArgumentException("3 values required for rgb()");
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            String trim = split[i2].trim();
            int i3;
            if (i2 == 3) {
                i3 = Math.round(Float.parseFloat(trim) * 255.0f);
            } else {
                boolean endsWith = trim.endsWith("%");
                if (endsWith) {
                    trim = RF.HF(str, 0, str.length() - 1);
                }
                i3 = Integer.parseInt(trim);
                if (endsWith) {
                    i3 = (i3 * 255) / 100;
                }
            }
            bArr[i2] = (byte) Math.max(0, Math.min(255, i3));
        }
        return bArr;
    }

    public final void oL0(String str, String str2) {
        if (str.startsWith("margin")) {
            eH0(str.substring(6), str2, I0.MARGIN);
            return;
        }
        if (str.startsWith("padding")) {
            eH0(str.substring(7), str2, I0.PADDING);
            return;
        }
        if (str.startsWith("font")) {
            if ("font-family".equals(str)) {
                cR(I0.FONT_FAMILIES, qo0(0, str2));
            } else if ("font-weight".equals(str)) {
                Integer num = (Integer) Mi0.get(str2);
                if (num == null) {
                    num = Integer.valueOf(str2);
                }
                cR(I0.FONT_WEIGHT, num);
            } else if ("font-size".equals(str)) {
                cR(I0.FONT_SIZE, Kg0(str2));
            } else if ("font-style".equals(str)) {
                M90(I0.FONT_ITALIC, x9, str2);
            } else if ("font".equals(str)) {
                int indexOf = str2.indexOf(' ', 0);
                if (indexOf < 0) {
                    indexOf = str2.length();
                }
                Object obj = Mi0.get(str2.substring(0, indexOf));
                if (obj != null) {
                    str2 = str2.substring(RF.Com2(str2, indexOf, str2.length()));
                }
                cR(I0.FONT_WEIGHT, obj);

                int indexOf2 = str2.indexOf(' ', 0);
                if (indexOf2 < 0) {
                    indexOf2 = str2.length();
                }
                Object obj2 = x9.get(str2.substring(0, indexOf2));
                if (obj2 != null) {
                    str2 = str2.substring(RF.Com2(str2, indexOf2, str2.length()));
                }
                cR(I0.FONT_ITALIC, obj2);

                if (str2.length() > 0 && Character.isDigit(str2.charAt(0))) {
                    int indexOf3 = str2.indexOf(' ', 0);
                    if (indexOf3 < 0) {
                        indexOf3 = str2.length();
                    }
                    cR(I0.FONT_SIZE, Kg0(str2.substring(0, indexOf3)));
                    str2 = str2.substring(RF.Com2(str2, indexOf3, str2.length()));
                }
                cR(I0.FONT_FAMILIES, qo0(0, str2));
            }
            return;
        }

        if ("text-indent".equals(str)) {
            cR(I0.TEXT_INDENT, Kg0(str2));
        } else if ("-twl-font".equals(str)) {
            cR(I0.FONT_FAMILIES, new r50_0(str2, null));
        } else if ("-twl-hover".equals(str)) {
            M90(I0.INHERIT_HOVER, TF0, str2);
        } else if ("text-align".equals(str)) {
            cR(I0.HORIZONTAL_ALIGNMENT, Enum.valueOf(I0.HORIZONTAL_ALIGNMENT.MH, str2.toUpperCase(Locale.ENGLISH)));
        } else if ("text-decoration".equals(str)) {
            M90(I0.TEXT_DECORATION, M30, str2);
        } else if ("vertical-align".equals(str)) {
            cR(I0.VERTICAL_ALIGNMENT, Enum.valueOf(I0.VERTICAL_ALIGNMENT.MH, str2.toUpperCase(Locale.ENGLISH)));
        } else if ("white-space".equals(str)) {
            M90(I0.PREFORMATTED, fm0, str2);
        } else if ("word-wrap".equals(str)) {
            M90(I0.BREAKWORD, m6, str2);
        } else if ("list-style-image".equals(str)) {
            Ve0(I0.LIST_STYLE_IMAGE, str2);
        } else if ("list-style-type".equals(str)) {
            M90(I0.LIST_STYLE_TYPE, Hh0, str2);
        } else if ("clear".equals(str)) {
            cR(I0.CLEAR, Enum.valueOf(I0.CLEAR.MH, str2.toUpperCase(Locale.ENGLISH)));
        } else if ("float".equals(str)) {
            cR(I0.FLOAT_POSITION, Enum.valueOf(I0.FLOAT_POSITION.MH, str2.toUpperCase(Locale.ENGLISH)));
        } else if ("display".equals(str)) {
            cR(I0.DISPLAY, Enum.valueOf(I0.DISPLAY.MH, str2.toUpperCase(Locale.ENGLISH)));
        } else if ("width".equals(str)) {
            cR(I0.WIDTH, Kg0(str2));
        } else if ("height".equals(str)) {
            cR(I0.HEIGHT, Kg0(str2));
        } else if ("background-image".equals(str)) {
            Ve0(I0.BACKGROUND_IMAGE, str2);
        } else if ("background-color".equals(str) || "-twl-background-color".equals(str)) {
            dx0(I0.BACKGROUND_COLOR, str2);
        } else if ("color".equals(str)) {
            dx0(I0.COLOR, str2);
        } else if ("tab-size".equals(str) || "-moz-tab-size".equals(str)) {
            if ("inherit".equals(str2)) {
                cR(I0.TAB_SIZE, null);
            } else {
                cR(I0.TAB_SIZE, Integer.valueOf(Integer.parseInt(str2)));
            }
        } else {
            throw new IllegalArgumentException("Unsupported key: ".concat(str));
        }
    }

    public final void lE(String str) {
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf(';', i);
            if (indexOf < 0) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(':', i);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            if (indexOf2 < indexOf) {
                String hf = RF.HF(str, i, indexOf2);
                String hf2 = RF.HF(str, indexOf2 + 1, indexOf);
                int i2 = indexOf + 1;
                try {
                    if (hf == null || hf2 == null) {
                        throw new IllegalStateException("no key-value pair available");
                    }
                    oL0(hf, hf2);
                    i = i2;
                } catch (IllegalArgumentException e) {
                    Logger.getLogger(LocalizedUiLayoutManager.class.getName()).log(Level.SEVERE, "Unable to parse CSS attribute: " + hf + "=" + hf2, e);
                    i = i2;
                }
            } else {
                i = indexOf + 1;
            }
        }
    }

    public final void eH0(String str, String str2, _import _importVar) {
        if ("-top".equals(str)) {
            cR(_importVar.ID, Kg0(str2));
        } else if ("-left".equals(str)) {
            cR(_importVar.m10, Kg0(str2));
        } else if ("-right".equals(str)) {
            cR(_importVar.OX, Kg0(str2));
        } else if ("-bottom".equals(str)) {
            cR(_importVar.cM0, Kg0(str2));
        } else if ("".equals(str)) {
            String[] split = str2.split("\\s+");
            int length = split.length;
            g20_0[] g20_0Arr = new g20_0[length];
            for (int i = 0; i < length; i++) {
                g20_0Arr[i] = Kg0(split[i]);
            }
            switch (length) {
                case 1:
                    cR(_importVar.ID, g20_0Arr[0]);
                    cR(_importVar.m10, g20_0Arr[0]);
                    cR(_importVar.OX, g20_0Arr[0]);
                    cR(_importVar.cM0, g20_0Arr[0]);
                    break;
                case 2:
                    cR(_importVar.ID, g20_0Arr[0]);
                    cR(_importVar.m10, g20_0Arr[1]);
                    cR(_importVar.OX, g20_0Arr[1]);
                    cR(_importVar.cM0, g20_0Arr[0]);
                    break;
                case 3:
                    cR(_importVar.ID, g20_0Arr[0]);
                    cR(_importVar.m10, g20_0Arr[1]);
                    cR(_importVar.OX, g20_0Arr[1]);
                    cR(_importVar.cM0, g20_0Arr[2]);
                    break;
                case 4:
                    cR(_importVar.ID, g20_0Arr[0]);
                    cR(_importVar.m10, g20_0Arr[3]);
                    cR(_importVar.OX, g20_0Arr[1]);
                    cR(_importVar.cM0, g20_0Arr[2]);
                    break;
                default:
                    throw new IllegalArgumentException(yr_1.pG("Invalid number of margin values: ", length));
            }
        }
    }

    public final void M90(I0 i0, HashMap hashMap, String str) {
        Object obj = hashMap.get(str);
        if (obj != null) {
            cR(i0, obj);
            return;
        }
        throw new IllegalArgumentException("Unknown value: ".concat(str));
    }

    public final void Ve0(I0 i0, String str) {
        if (str.startsWith("url(") && str.endsWith(")")) {
            str = RF.HF(str, 4, str.length() - 1);
            if ((str.startsWith("\"") && str.endsWith("\"")) || (str.startsWith("\'") && str.endsWith("\'"))) {
                str = str.substring(1, str.length() - 1);
            }
        }
        cR(i0, str);
    }

    public final void dx0(I0 i0, String str) {
        gn_0 gn_0Var;
        if (str.startsWith("rgb(") && str.endsWith(")")) {
            byte[] e2 = E2(3, RF.HF(str, 4, str.length() - 1));
            gn_0Var = new gn_0(e2[0], e2[1], e2[2], (byte) -1);
        } else if (str.startsWith("rgba(") && str.endsWith(")")) {
            byte[] e22 = E2(4, RF.HF(str, 5, str.length() - 1));
            gn_0Var = new gn_0(e22[0], e22[1], e22[2], e22[3]);
        } else {
            gn_0Var = gn_0.ox0(str);
            if (gn_0Var == null) {
                throw new IllegalArgumentException("unknown color name: ".concat(str));
            }
        }
        cR(i0, gn_0Var);
    }
}
