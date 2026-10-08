package cn.pokemmo.rom.gba;

import f.O2;
import java.util.HashMap;
import java.util.Map;

/**
 * GBA 卡带类型注册条目
 * 原混淆类: f.O2
 */
public class GbaRomTable {
    public static final Map<String, O2> REGISTRY = new HashMap<>();
    public static final HashMap NI0 = (HashMap) REGISTRY;

    public final boolean isFireRed;
    public final boolean t90;

    static {
        String fireRedCode = "BPRE";
        O2 fr = new O2(fireRedCode, true);
        REGISTRY.put(fireRedCode + "-0", fr);

        String emeraldCode = "BPEE";
        O2 em = new O2(emeraldCode, false);
        REGISTRY.put(emeraldCode + "-0", em);
    }

    public GbaRomTable(String code, boolean isFireRed) {
        this.isFireRed = isFireRed;
        this.t90 = isFireRed;
    }

    public static O2 get(byte version, String gameCode) {
        return REGISTRY.get(gameCode + "-" + version);
    }

    public static O2 h0(byte version, String gameCode) {
        return get(version, gameCode);
    }
}
