package f;

import cn.pokemmo.rom.gba.sprite.GbaMapFieldEffectSpriteManager;

/**
 * GBA 野外效果精灵管理器垫片
 * 现代化实现: cn.pokemmo.rom.gba.sprite.GbaMapFieldEffectSpriteManager
 */
public final class c20_0 extends GbaMapFieldEffectSpriteManager {
    public static c20_0 Eu = new c20_0();

    public static c20_0 eE0() {
        if (Eu == null) {
            Eu = new c20_0();
        }
        return Eu;
    }
}
