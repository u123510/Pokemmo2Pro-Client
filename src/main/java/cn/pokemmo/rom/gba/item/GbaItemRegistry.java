package cn.pokemmo.rom.gba.item;

import java.util.TreeMap;

/**
 * GBA 道具与树果注册表
 */
public class GbaItemRegistry {
    public static final GbaItemRegistry t2 = new GbaItemRegistry();
    public final TreeMap sH0;
    public final TreeMap Fv;
    public final TreeMap wM;

    public GbaItemRegistry() {
        this.sH0 = new TreeMap();
        this.Fv = new TreeMap();
        this.wM = new TreeMap();
    }

    public static GbaItemRegistry Hg() {
        return t2;
    }

    public static GbaItemRegistry getInstance() {
        return t2;
    }

    public final TreeMap ui() {
        return this.sH0;
    }

    public TreeMap getItemMap() {
        return this.sH0;
    }
}
