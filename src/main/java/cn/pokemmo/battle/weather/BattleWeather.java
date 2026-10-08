package cn.pokemmo.battle.weather;

/**
 * 对战天气状态 (Battle Weather)
 * 对应战斗系统中的晴天、雨天、沙暴、冰雹、大雨、大日照等天气效果。
 *
 * 原混淆类: f.d70_0
 */
public class BattleWeather {
    public static final BattleWeather NONE;
    public static final BattleWeather RAIN;
    public static final BattleWeather HARSH_SUNLIGHT;
    public static final BattleWeather SANDSTORM;
    public static final BattleWeather HAIL;
    public static final BattleWeather FOG;
    public static final BattleWeather HEAVY_RAIN;
    public static final BattleWeather EXTREMELY_HARSH_SUNLIGHT;
    public static final BattleWeather STRONG_WINDS;

    public final byte R60;
    public final boolean eB;
    public final int Mf;

    public BattleWeather(int value, int key, boolean enabled) {
        this.Mf = value;
        this.R60 = (byte) key;
        this.eB = enabled;
    }

    public int getValue() {
        return this.Mf;
    }

    public byte getKey() {
        return this.R60;
    }

    public boolean isEnabled() {
        return this.eB;
    }

    public final boolean eA() {
        return this.eB;
    }

    static {
        NONE = new BattleWeather(0, 0, false);
        RAIN = new BattleWeather(1, 1, false);
        HARSH_SUNLIGHT = new BattleWeather(2, 2, true);
        SANDSTORM = new BattleWeather(3, 3, false);
        HAIL = new BattleWeather(4, 5, false);
        FOG = new BattleWeather(5, 6, false);
        HEAVY_RAIN = new BattleWeather(6, 10, true);
        EXTREMELY_HARSH_SUNLIGHT = new BattleWeather(7, 11, true);
        STRONG_WINDS = new BattleWeather(8, 16, false);
    }
}
