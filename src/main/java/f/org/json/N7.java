package f.org.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Renamed from f.N7 (org.json.JSONObject implementation)
 */
public class N7 extends JSONObject {
    public static final Pattern bG = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    public static final Object aD0 = JSONObject.NULL;

    private static final Field MAP_FIELD;
    static {
        Field f = null;
        try {
            f = JSONObject.class.getDeclaredField("map");
            f.setAccessible(true);
        } catch (Exception ignored) {}
        MAP_FIELD = f;
    }

    public final Map Pt0;

    private Map initMap() {
        if (MAP_FIELD != null) {
            try {
                return (Map) MAP_FIELD.get(this);
            } catch (Exception ignored) {}
        }
        return new HashMap();
    }

    public N7() {
        super();
        this.Pt0 = initMap();
    }

    public N7(A70 parser) {
        super(parser);
        this.Pt0 = initMap();
    }

    public N7(String source) {
        super(source);
        this.Pt0 = initMap();
    }

    public N7(Map map) {
        super(map);
        this.Pt0 = initMap();
    }

    public N7(Object bean) {
        super(bean);
        this.Pt0 = initMap();
    }

    public N7(Map values, int depth, Object limit) {
        super(values);
        this.Pt0 = initMap();
    }

    public static String dL(String value) {
        return quote(value);
    }

    public static Number Ax0(String value) {
        return stringToNumber(value);
    }

    public static void IH0(Object value) {
        testValidity(value);
    }

    public static Object lPt6(Object value, int depth, Object limit) {
        return wrap(value);
    }

    public static Object lpT6(Object value, Set stack, int depth, Object limit) {
        return wrap(value);
    }

    public static ic_1 zF(String key) {
        return new ic_1("JSONObject[" + quote(key) + "] not found.");
    }

    public static Writer hh0(String value, StringWriter out) throws IOException {
        return quote(value, out);
    }

    public static void Mc0(StringWriter out, Object value, int indent) {
        try {
            if (value instanceof JSONObject) {
                ((JSONObject) value).write(out, indent, 0);
            } else if (value instanceof JSONArray) {
                ((JSONArray) value).write(out, indent, 0);
            } else {
                out.write(valueToString(value));
            }
        } catch (Exception e) {
            throw new ic_1(e);
        }
    }

    public static ic_1 w3(String key, String type, Object value, Exception cause) {
        return new ic_1("JSONObject[" + quote(key) + "] is not a " + type + " (" + value + ").", cause);
    }

    public final Object Xf0(String key) {
        return this.get(key);
    }

    public final int pF(String key) {
        return this.getInt(key);
    }

    public yw_2 gz0(String key) {
        Object val = this.opt(key);
        if (val instanceof yw_2) {
            return (yw_2) val;
        }
        if (val instanceof JSONArray) {
            return new yw_2((JSONArray) val);
        }
        return null;
    }

    public final String By(String key) {
        return this.getString(key);
    }

    public final Object Dx0(String key) {
        return this.opt(key);
    }

    public final int MT(int fallback, String key) {
        return this.optInt(key, fallback);
    }

    public N7 D50(Object value, String key) {
        if (value != null) {
            this.put(key, value);
        } else {
            this.remove(key);
        }
        return this;
    }

    public final boolean vb() {
        return this.getBoolean("end_battle");
    }

    public final boolean RD() {
        return this.optBoolean("end_battle", false);
    }

    public final Writer EJ(StringWriter out, int indent) throws IOException {
        return this.write(out, indent, 0);
    }

    public N7 Hj(int value) {
        return this.D50(Integer.valueOf(value), "pid");
    }
}
