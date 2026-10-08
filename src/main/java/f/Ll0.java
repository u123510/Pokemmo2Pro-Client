package f;

import cn.pokemmo.world.entity.MapObjectPlacement;

/**
 * 兼容垫片 (Shim) - 地图物件放置与图层坐标基类 (Map Object Placement)
 * 实际实现已迁移至 {@link MapObjectPlacement}
 */
public abstract class Ll0 extends MapObjectPlacement {
    public Ll0(XF0 map, bm_1 offset, short x, short y, byte layer) {
        super(map, offset, x, y, layer);
    }
}
