package cn.pokemmo.rom.gba;

import java.util.HashMap;

/**
 * GBA 地图图块注册缓存中心
 */
public class GbaTileRegistryStore {
    public static final GbaTileRegistryStore INSTANCE = new GbaTileRegistryStore();
    public final HashMap X7 = new HashMap();
}
