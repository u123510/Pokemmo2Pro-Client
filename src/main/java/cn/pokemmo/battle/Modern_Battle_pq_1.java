package cn.pokemmo.battle;

import f.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 现代化重构类 - 原始混淆类: f.pq_1
 */
public class Modern_Battle_pq_1
implements Sm0 {

    public final JI xg;

    public Modern_Battle_pq_1() {
        new ThreadLocal();
        this.xg = new JI();
    }

    @Override
    public final void put(String string, String string2) {
        Map map = (Map)this.xg.get();
        if (map == null) {
            map = new HashMap();
            this.xg.set(map);
        }
        map.put(string, string2);
    }

    @Override
    public final String get(String string) {
        Map map = (Map)this.xg.get();
        if (map != null && string != null) {
            return (String)map.get(string);
        }
        return null;
    }

    @Override
    public final void remove(String string) {
        Map map = (Map)this.xg.get();
        if (map != null) {
            map.remove(string);
        }
    }

    @Override
    public final Map getCopyOfContextMap() {
        Map map = (Map)this.xg.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }
}

