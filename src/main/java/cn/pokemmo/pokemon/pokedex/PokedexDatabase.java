package cn.pokemmo.pokemon.pokedex;

import f.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 全国宝可梦图鉴数据库单例 (Pokédex Database)
 * 管理全国各世代宝可梦种族数据（PokedexEntry）的缓存、编号检索与区域图鉴过滤。
 * 原混淆类: f.mp_1
 */
public class PokedexDatabase {
    public static mp_1 INSTANCE = new mp_1();
    public static mp_1 fZ = INSTANCE;

    public final HashMap entriesById;
    public final HashMap k2;
    public final HashMap regionalEntries;
    public final HashMap av;

    public PokedexDatabase() {
        this.entriesById = new HashMap();
        this.k2 = this.entriesById;
        this.regionalEntries = new HashMap();
        this.av = this.regionalEntries;
    }

    public static mp_1 getInstance() {
        if (fZ == null) {
            fZ = new mp_1();
            INSTANCE = fZ;
        }
        return fZ;
    }

    public static mp_1 vf0() {
        return getInstance();
    }

    public static int wa0(byte mode, cq_0 value) {
        return value.MN(mode);
    }

    public final mp_1 asBridge() {
        return ((Object) this) instanceof mp_1 ? (mp_1) (Object) this : null;
    }

    public final cq_0 getEntry(short id) {
        cq_0 entry = (cq_0) this.k2.get(Short.valueOf(id));
        if (entry == null) {
            entry = new cq_0(id);
            this.k2.put(Short.valueOf(id), entry);
        }
        return entry;
    }

    public final cq_0 W50(short id) {
        return getEntry(id);
    }

    public final ArrayList getEntriesByRegion(final byte mode) {
        ArrayList result = new ArrayList();
        for (Object value : this.av.values()) {
            cq_0 entry = (cq_0) value;
            if (entry.MN(mode) >= 1) {
                result.add(entry);
            }
        }
        Collections.sort(result, Comparator.comparingInt(value -> ((cq_0) value).MN(mode)));
        return result;
    }

    public final ArrayList GG(final byte mode) {
        return getEntriesByRegion(mode);
    }

    public final Collection getAllEntries() {
        return this.k2.values();
    }

    public final Collection xn() {
        return getAllEntries();
    }
}
