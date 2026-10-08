package f;

import cn.pokemmo.graphics.sprite.NdsSpriteSheetCache;

/**
 * Shim: i5_0 -> NdsSpriteSheetCache
 * @see cn.pokemmo.graphics.sprite.NdsSpriteSheetCache
 */
public final class i5_0 extends NdsSpriteSheetCache {
    public static i5_0 fo;

    public static i5_0 Jg0() {
        if (fo == null) {
            fo = new i5_0();
        }
        return fo;
    }
}
