package f;

import cn.pokemmo.world.weather.MapWeatherType;

/**
 * 兼容垫片 (Enum Bridge) - MapWeatherType
 * 原混淆类: f.s4_0
 * 现代实现: cn.pokemmo.world.weather.MapWeatherType
 * @see cn.pokemmo.world.weather.MapWeatherType
 */
public enum s4_0 {
    // 现代语义常量别名

    rP("IN_HOUSE_WEATHER", 0, -1, d70_0.Do),
    SUNNY_WEATHER_WITH_CLOUDS_IN_WATER("SUNNY_WEATHER_WITH_CLOUDS_IN_WATER", 1, -1, null),
    REGULAR_WEATHER("REGULAR_WEATHER", 2, -1, null),
    SB("RAINY_WEATHER", 3, -1, d70_0.Mt0),
    THREE_SNOW_FLAKES("THREE_SNOW_FLAKES", 4, -1, d70_0.tA),
    Nh("RAIN_WITH_THUNDER", 5, -1, d70_0.Mt0),
    Oj0("STEADY_MIST", 6, -1, d70_0.Do),
    mi0("STEADY_SNOW", 7, -1, d70_0.Do),
    n2("SAND_STORM", 8, -1, d70_0.gh),
    MIST_FROM_TOP_RIGHT("MIST_FROM_TOP_RIGHT", 9, -1, d70_0.Do),
    DENSE_BRIGHT_MIST("DENSE_BRIGHT_MIST", 10, -1, d70_0.Do),
    sQ("CLOUDY", 11, -1, null),
    UNDERGROUND_FLASHES("UNDERGROUND_FLASHES", 12, -1, d70_0.Do),
    SA0("HEAVY_RAIN_WITH_THUNDER", 13, -1, d70_0.Mt0),
    UNDERWATER_MIST("UNDERWATER_MIST", 14, -1, d70_0.Do),
    Ci("UNKNOWN_THUNDER", 15, -1, d70_0.Mt0),
    DAY_DEPENDANT("DAY_DEPENDANT", 19, -1, d70_0.Do),
    jZ("CUSTOM_SNOW", 32, -1, d70_0.Do),
    OV("GEN4_NONE", 40, 0, null),
    GEN4_UNK0("GEN4_UNK0", 41, 1, d70_0.Do),
    CD0("GEN4_RAIN", 42, 2, d70_0.Mt0),
    fd0("GEN4_HEAVY_RAIN", 43, 3, d70_0.Mt0),
    Vw0("GEN4_HEAVY_RAIN_WITH_THUNDER", 44, 4, d70_0.Mt0),
    Rs0("GEN4_SNOW", 45, 5, d70_0.Do),
    Gk0("GEN4_HEAVY_SNOW", 46, 6, d70_0.Do),
    m00("GEN4_HAIL", 47, 7, d70_0.tA),
    GEN4_CLEAR("GEN4_CLEAR", 48, 8, d70_0.Do),
    tA0("GEN4_ASHDUST", 49, 9, d70_0.Do),
    EB("GEN4_SANDSTORM", 50, 10, d70_0.gh),
    GEN4_SPECIAL_ICY("GEN4_SPECIAL_ICY", 51, 11, d70_0.Do),
    GEN4_SPECIAL_ROCKS("GEN4_SPECIAL_ROCKS", 52, 12, d70_0.Do),
    GEN4_UNK("GEN4_UNK", 53, 13, d70_0.Do),
    OK0("GEN4_HEAVY_FOG", 54, 14, d70_0.HD),
    GEN4_HEAVY_FOG_WITH_DARKNESS("GEN4_HEAVY_FOG_WITH_DARKNESS", 55, 15, d70_0.Do),
    COm8("GEN4_CAVE_FLASH", 56, 16, d70_0.Do),
    VB("GEN4_FOREST_TREE_SHADOWS", 57, 23, d70_0.Do),
    GEN4_DARKNESS("GEN4_DARKNESS", 58, 26, d70_0.Do),
    B1("GEN4_GREEN_HAZE", 59, 27, d70_0.Do),
    GEN4_RED_HAZE("GEN4_RED_HAZE", 60, 28, d70_0.Do),
    GEN4_BLUE_HAZE("GEN4_BLUE_HAZE", 61, 29, d70_0.Do),
    GEN4_BLACK_HAZE("GEN4_BLACK_HAZE", 62, 30, d70_0.Do),
    XG("GEN4_RAIN2", 63, 32, d70_0.Mt0),
    GEN4_UNK2("GEN4_UNK2", 64, 33, d70_0.Do),
    Wp("GEN4_HEAVY_SNOW2", 65, 34, d70_0.Do),
    Od("GEN4_HEAVY_SNOW3", 66, 35, d70_0.Do),
    Wh("GEN4_SNOW2", 67, 36, d70_0.Do);

    public static final s4_0[] CH0;
    public static final bm0_1 Ai;
    public static final bm0_1 Tb0;
    public final byte b20;
    public final byte ua;

    s4_0(String s, int i, int i2, d70_0 d70_0) {
        this.b20 = (byte) i;
        this.ua = (byte) i2;
        if (d70_0 == null) {
            d70_0 unused = d70_0.Do;
        }
    }

        public MapWeatherType asModern() {
        return MapWeatherType.valueOf(name());
    }

    public static void Sb0(byte b) {
        s4_0 unused = (s4_0) Ai.BM(b);
    }

    static {
        CH0 = values();
        Ai = new bm0_1();
        for (s4_0 s4_0 : CH0) {
            Ai.gE0(s4_0.b20, s4_0);
        }
        int max = 0;
        for (s4_0 s4_02 : CH0) {
            byte b = s4_02.b20;
            if (b > max) {
                max = b;
            }
        }
        Tb0 = new bm0_1();
        for (s4_0 s4_03 : CH0) {
            byte b2 = s4_03.ua;
            if (b2 >= 0) {
                Tb0.gE0(b2, s4_03);
            }
        }
    }
}
