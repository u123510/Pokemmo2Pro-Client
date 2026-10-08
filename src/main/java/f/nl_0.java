package f;

import cn.pokemmo.rom.map.TownMapLocationRegistry;
import java.util.List;

/**
 * 兼容垫片: nl_0 -> TownMapLocationRegistry
 * @see cn.pokemmo.rom.map.TownMapLocationRegistry
 */
public abstract class nl_0 extends TownMapLocationRegistry {
    public static void iS(byte region) {
        TownMapLocationRegistry.iS(region);
    }

    public static vf_0 p80(int key) {
        return TownMapLocationRegistry.p80(key);
    }

    public static List hJ0(byte region) {
        return TownMapLocationRegistry.hJ0(region);
    }
}
