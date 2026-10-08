package f;

import cn.pokemmo.ui.twl.theme.TwlThemeManager;
import java.net.URL;
import java.util.HashMap;

/**
 * 垫片类：向前兼容 f.R40
 */
public final class R40 extends TwlThemeManager {
    public R40(pc0_1 renderer, cu0_0 data) {
        super(renderer, data);
    }

    public static R40 EQ(URL url, pc0_1 renderer, cu0_0 data, HashMap constants) {
        return (R40) TwlThemeManager.EQ(url, renderer, data, constants);
    }
}
