package cn.pokemmo.world.terrain.animation;

import f.nk_0;

/**
 * 循环周期切片地形动画基类
 * 对应 PokeMMO 中按固定周期时间步长轮播的地形动态材质
 */
public abstract class BaseCyclicTileAnimation extends BaseTerrainTileAnimation {
    public BaseCyclicTileAnimation(byte by, byte by2, nk_0... nk_0Array) {
        super(by, by2, nk_0Array);
        if (nk_0Array.length != 0) {
            return;
        }
        throw new RuntimeException();
    }

    @Override
    public nk_0 Gs(int n, int n2, int n3) {
        return this.mH0[n % this.mH0.length];
    }
}
