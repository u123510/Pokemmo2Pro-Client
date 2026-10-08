package f;

import cn.pokemmo.battle.weather.BattleWeather;
import java.util.Arrays;

/**
 * 对战天气兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.battle.weather.BattleWeather
 */
public final class d70_0 extends BattleWeather {
    public static final d70_0 Do;
    public static final d70_0 Sl0;
    public static final d70_0 Ga0;
    public static final d70_0 gh;
    public static final d70_0 HD;
    public static final d70_0 tA;
    public static final d70_0 Mt0;
    public static final d70_0 gl;
    public static final d70_0 lv;
    public static final bm0_1 UB;
    public static final d70_0[] SN;

    public d70_0(int value, int key, boolean enabled) {
        super(value, key, enabled);
    }

    public static d70_0[] dI0(int length) {
        return new d70_0[length];
    }

    static {
        d70_0 doValue = new d70_0(0, 0, false);
        Do = doValue;
        d70_0 slValue = new d70_0(1, 1, false);
        Sl0 = slValue;
        d70_0 gaValue = new d70_0(2, 2, true);
        Ga0 = gaValue;
        d70_0 ghValue = new d70_0(3, 3, false);
        gh = ghValue;
        d70_0 hdValue = new d70_0(4, 5, false);
        HD = hdValue;
        d70_0 taValue = new d70_0(5, 6, false);
        tA = taValue;
        d70_0 mtValue = new d70_0(6, 10, true);
        Mt0 = mtValue;
        d70_0 glValue = new d70_0(7, 11, true);
        gl = glValue;
        d70_0 lvValue = new d70_0(8, 16, false);
        lv = lvValue;
        SN = new d70_0[] { doValue, slValue, gaValue, ghValue, hdValue, taValue, mtValue, glValue, lvValue };
        UB = new bm0_1();
        d70_0[] copy = SN.clone();
        Arrays.stream(copy).filter(d70_0::eA).toArray(d70_0::dI0);
        for (d70_0 value : copy) {
            UB.gE0(value.R60, value);
        }
    }
}
