package f;

import cn.pokemmo.rom.gba.sprite.GbaMapEnvironmentalSpriteManager;

/**
 * GBA 地图环境精灵管理器垫片
 * 现代化实现: cn.pokemmo.rom.gba.sprite.GbaMapEnvironmentalSpriteManager
 */
public final class ph_1 extends GbaMapEnvironmentalSpriteManager {
    public static ph_1 uu = new ph_1();

    public static ph_1 Ry() {
        if (uu == null) {
            uu = new ph_1();
        }
        return uu;
    }
}
