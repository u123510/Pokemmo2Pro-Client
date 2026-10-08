package cn.pokemmo.world.map;

import f.*;

import cn.pokemmo.world.map.MapBlockLightmapData;

public class MapBlockLightmapTable extends MapBlockLightmapData {
    public static final ez0_0 kp0;
    public static final ez0_0 Xn;
    public static final ez0_0 CoM3;
    public static final ez0_0 JC0;
    public static final ez0_0 kO;

    public static final bm0_1 St0;
    public static final ez0_0[] HR;
    public MapBlockLightmapTable(int index, int key, int id) {
        super(index, key, id);
    }

    static {

        ez0_0 e0 = new ez0_0(0, 0, 5800);
        kp0 = e0;
        ez0_0 e1 = new ez0_0(1, 1, 5801);
        ez0_0 e2 = new ez0_0(2, 2, 5802);
        ez0_0 e3 = new ez0_0(3, 3, 5803);
        Xn = e3;
        ez0_0 e4 = new ez0_0(4, 4, 5804);
        CoM3 = e4;
        ez0_0 e5 = new ez0_0(5, 5, 5805);
        JC0 = e5;
        ez0_0 e6 = new ez0_0(6, 6, 5806);
        kO = e6;
        ez0_0 e7 = new ez0_0(7, 7, 5807);
        ez0_0 e8 = new ez0_0(8, 8, 5808);
        ez0_0 e9 = new ez0_0(9, 9, 5809);
        ez0_0 e10 = new ez0_0(10, 10, 5810);
        ez0_0 e11 = new ez0_0(11, 11, 5811);
        ez0_0 e12 = new ez0_0(12, 12, 5812);
        ez0_0 e13 = new ez0_0(13, 13, 5813);
        ez0_0 e14 = new ez0_0(14, 14, 5814);
        ez0_0 e15 = new ez0_0(15, 15, 5815);
        ez0_0 e16 = new ez0_0(16, 16, 1521);
        ez0_0 e17 = new ez0_0(17, 17, 6002);
        ez0_0 e18 = new ez0_0(18, 18, 5818);
        ez0_0 e19 = new ez0_0(19, 19, 5819);
        ez0_0 e20 = new ez0_0(20, 20, 1973);
        ez0_0 e21 = new ez0_0(21, 21, 5849);
        ez0_0 e22 = new ez0_0(22, 44, 5873);
        HR = new ez0_0[]{e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11,
                e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22};
        St0 = new bm0_1();
        for (ez0_0 entry : HR) {
            St0.gE0(entry.kY, entry);
        }
        MapBlockLightmapData.kp0 = kp0;
        MapBlockLightmapData.Xn = Xn;
        MapBlockLightmapData.CoM3 = CoM3;
        MapBlockLightmapData.JC0 = JC0;
        MapBlockLightmapData.kO = kO;
        MapBlockLightmapData.St0 = St0;
        MapBlockLightmapData.HR = HR;
    }
}
