package f;

import cn.pokemmo.constant.enums.FontRenderQuality;

public enum ri_0 {
    w8,
    pN,
    xQ;

    public static final ri_0[] KP = values();

    public FontRenderQuality asModern() {
        return FontRenderQuality.valueOf(name());
    }
}