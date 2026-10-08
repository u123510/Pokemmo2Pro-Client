package f.org.json;

import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/**
 * Renamed from f.yw (org.json.JSONArray implementation)
 */
public class yw_2 extends JSONArray {
    private static final Field ARRAY_LIST_FIELD;
    static {
        Field f = null;
        try {
            f = JSONArray.class.getDeclaredField("myArrayList");
            f.setAccessible(true);
        } catch (Exception ignored) {}
        ARRAY_LIST_FIELD = f;
    }

    public final ArrayList or;

    private ArrayList initList() {
        if (ARRAY_LIST_FIELD != null) {
            try {
                return (ArrayList) ARRAY_LIST_FIELD.get(this);
            } catch (Exception ignored) {}
        }
        return new ArrayList();
    }

    public yw_2() {
        super();
        this.or = initList();
    }

    public yw_2(A70 tokener) {
        super(tokener);
        this.or = initList();
    }

    public yw_2(Collection collection) {
        super(collection);
        this.or = initList();
    }

    public yw_2(Collection collection, int depth, Object limit) {
        super(collection);
        this.or = initList();
    }

    public yw_2(Object array) {
        super(array);
        this.or = initList();
    }

    public yw_2(String source) {
        super(source);
        this.or = initList();
    }

    public yw_2(JSONArray other) {
        super();
        this.or = initList();
        if (other != null) {
            for (int i = 0; i < other.length(); i++) {
                this.put(other.opt(i));
            }
        }
    }

    public N7 OA0(int i) {
        Object val = this.opt(i);
        if (val instanceof N7) {
            return (N7) val;
        }
        if (val instanceof org.json.JSONObject) {
            return new N7(((org.json.JSONObject) val).toMap());
        }
        throw new ic_1("JSONArray[" + i + "] is not a JSONObject.");
    }

    public final int DD() {
        return this.length();
    }

    public yw_2 lC(Object obj) {
        this.put(obj);
        return this;
    }

    public final void G20(Collection collection, int i, Object limit) {
        if (collection != null) {
            for (Object item : collection) {
                this.put(item);
            }
        }
    }

    public final void cOM3(Object obj, boolean z) {
        if (obj == null) return;
        if (obj instanceof Collection) {
            for (Object item : (Collection) obj) {
                this.put(item);
            }
        } else if (obj.getClass().isArray()) {
            int len = Array.getLength(obj);
            for (int i = 0; i < len; i++) {
                this.put(Array.get(obj, i));
            }
        } else {
            this.put(obj);
        }
    }

    public final Writer Qq0(StringWriter stringWriter, int indent) {
        return this.write(stringWriter, indent, 0);
    }
}
