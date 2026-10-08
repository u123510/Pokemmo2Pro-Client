package f;

import cn.pokemmo.world.map.MapZoneConnectionDescriptor;

/**
 * 兼容垫片 (Shim) - 世界地图区域边缘连接描述符 (Map Zone Connection Descriptor)
 * 实际实现已迁移至 {@link MapZoneConnectionDescriptor}
 */
public final class KF extends MapZoneConnectionDescriptor {
    public KF(bi0_1 var1, short var2, byte var3) {
        super(var1, var2, var3);
    }
    public KF(bi0_1 var1, zv_2 var2, short var3, byte var4) {
        super(var1, var2, var3, var4);
    }
}
