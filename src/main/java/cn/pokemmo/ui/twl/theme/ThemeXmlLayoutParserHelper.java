package cn.pokemmo.ui.twl.theme;

import f.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

public abstract class ThemeXmlLayoutParserHelper {
    public static final /* synthetic */ boolean XG0 = !dj0_0.class.desiredAssertionStatus();

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }

    public static void fX(Ps0 ps0, String str) {
        if (str == null) {
            throw sneakyThrow(new XmlPullParserException("missing 'name' on '" + ps0.Ja0.getName() + "'", ps0.Ja0, null));
        } else if (str.length() == 0) {
            throw sneakyThrow(new XmlPullParserException("empty name not allowed", ps0.Ja0, null));
        } else if ("none".equals(str)) {
            throw sneakyThrow(new XmlPullParserException("can't use reserved name \"none\"", ps0.Ja0, null));
        } else if (str.indexOf(42) >= 0) {
            throw sneakyThrow(new XmlPullParserException("'*' is not allowed in names", ps0.Ja0, null));
        } else if (str.indexOf(47) >= 0) {
            throw sneakyThrow(new XmlPullParserException("'/' is not allowed in names", ps0.Ja0, null));
        }
    }

    public static ux0_0 Pw0(Ps0 ps0, String str) {
        String Yd0 = ps0.Yd0(str);
        if (Yd0 == null) {
            return null;
        }
        try {
            int[] t30 = RF.t30(Yd0);
            int length = t30.length;
            if (length == 1) {
                return new ux0_0(t30[0]);
            }
            if (length == 2) {
                return new ux0_0(t30[0], t30[1]);
            }
            if (length == 4) {
                return new ux0_0(t30[0], t30[1], t30[2], t30[3]);
            }
            throw sneakyThrow(new XmlPullParserException("Unsupported border format", ps0.Ja0, null));
        } catch (NumberFormatException e) {
            throw sneakyThrow(ps0.yF("Unable to parse border size", e));
        }
    }

    public static gn_0 n20(Ps0 ps0, String str, LC0 lc0) {
        try {
            gn_0 ox0 = gn_0.ox0(str);
            if (ox0 == null && lc0 != null) {
                ox0 = (gn_0) lc0.N30(str, false, gn_0.class, null);
            }
            if (ox0 != null) {
                return ox0;
            }
            throw sneakyThrow(new XmlPullParserException("Unknown color name: ".concat(str), ps0.Ja0, null));
        } catch (NumberFormatException e) {
            throw sneakyThrow(ps0.yF("unable to parse color code", e));
        }
    }

    public static Map LD0(TreeMap treeMap, String str, String str2, f6_0 f6_0Var) {
        if (str2.length() > 0 && str2.charAt(str2.length() - 1) != '.') {
            str2 = str2.concat(".");
        }
        int length = str.length() - 1;
        String substring = str.substring(0, length);
        SortedMap subMap = treeMap.subMap(substring, substring.concat("\uFFFF"));
        if (subMap.isEmpty()) {
            return subMap;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : subMap.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String str3 = (String) entry.getKey();
            if (!XG0 && !str3.startsWith(substring)) {
                throw new AssertionError();
            }
            Object value = entry.getValue();
            if (value == f6_0Var) {
                value = null;
            }
            hashMap.put(str2.concat(str3.substring(length)), value);
        }
        return hashMap;
    }

    public static Oq Uu0(Ps0 ps0) {
        boolean z;
        String Yd0 = ps0.Yd0("if");
        if (Yd0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (Yd0 == null) {
            Yd0 = ps0.Yd0("unless");
        }
        if (Yd0 == null) {
            return null;
        }
        try {
            Eq0 eq0 = new Eq0(Yd0);
            Oq zX = Oq.zX(eq0);
            if (eq0.Prn < Yd0.length()) {
                String str;
                StringBuilder sb = new StringBuilder("Unexpected ");
                if (eq0.Prn >= Yd0.length()) {
                    str = "end of expression";
                } else {
                    str = sb.append(new StringBuilder("'").append(Yd0.charAt(eq0.Prn)).append("' at ").append(eq0.Prn + 1).toString()).toString();
                }
                throw new ParseException(str, eq0.Prn);
            }
            zX.Wi0 ^= z;
            return zX;
        } catch (ParseException e) {
            throw sneakyThrow(ps0.yF("Unable to parse condition", e));
        }
    }
}
