package f;

import cn.pokemmo.ui.twl.renderer.TwlStateKey;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * TWL 状态键兼容垫片 - MD0 -> TwlStateKey
 */
public final class MD0 extends TwlStateKey {
    public static final HashMap qf0 = new HashMap();
    public static final ArrayList Fw0 = new ArrayList();
    public final String kl0;
    public final int d1;

    public MD0(String name, int id) {
        super(name, id);
        this.kl0 = name;
        this.d1 = id;
    }

    public static synchronized MD0 cB(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("name");
        }
        MD0 type = (MD0) qf0.get(name);
        if (type == null) {
            type = new MD0(name, qf0.size());
            qf0.put(name, type);
            Fw0.add(type);
            TwlStateKey.KEY_CACHE.put(name, type);
            TwlStateKey.KEY_LIST.add(type);
        }
        return type;
    }

    public final String su() {
        return this.kl0;
    }

    @Override
    public final boolean equals(Object other) {
        return other instanceof TwlStateKey && this.d1 == ((TwlStateKey) other).id;
    }

    @Override
    public final int hashCode() {
        return this.d1;
    }
}
