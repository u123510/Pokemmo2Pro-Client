package cn.pokemmo.world.map;

import f.*;

public class MapBlockLightmapData {
    public static MapBlockLightmapData kp0;
    public static MapBlockLightmapData Xn;
    public static MapBlockLightmapData CoM3;
    public static MapBlockLightmapData JC0;
    public static MapBlockLightmapData kO;
    public static bm0_1 St0;
    public static ez0_0[] HR;
    public final byte kY;
    public final int B3;
    public final int fE0;

    public MapBlockLightmapData(int index, int key, int id) {
        this.fE0 = id;
        this.kY = (byte) key;
        this.B3 = index;
    }

    static {
        if (f.ez0_0.kp0 == null) {
            try {
                Class.forName(f.ez0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
