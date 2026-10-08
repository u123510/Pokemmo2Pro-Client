package cn.pokemmo.world.terrain.animation;

import f.dd_1;
import f.nk_0;

/**
 * 大世界地形网格与材质图块动画状态机统一基类
 * 对应 PokeMMO 中动态水体、草丛、熔岩、机关等各种地形切片状态
 */
public abstract class BaseTerrainTileAnimation extends dd_1 {
    public BaseTerrainTileAnimation(byte value) {
        super(value);
    }

    public BaseTerrainTileAnimation(byte first, byte second, nk_0... values) {
        super(first, second, values);
    }

    public byte getStateId() {
        return this.eA;
    }

    public nk_0[] getFrames() {
        return this.mH0;
    }
}
