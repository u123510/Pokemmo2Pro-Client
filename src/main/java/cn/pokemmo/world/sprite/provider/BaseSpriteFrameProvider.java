package cn.pokemmo.world.sprite.provider;

import f.au_2;
import f.i4_0;

/**
 * 精灵贴图纹理切片与帧提供者基类
 * 对应混淆基类: f.au_2
 * 负责大世界角色、宝可梦、跟随物与地图环境动态图块的切片提取与帧提供。
 */
public abstract class BaseSpriteFrameProvider extends au_2 {

    public BaseSpriteFrameProvider() {
        super();
    }

    @SuppressWarnings("unchecked")
    public final <T extends au_2> T asBridge() {
        return (T) (Object) this;
    }
}
