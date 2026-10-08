package f;

import cn.pokemmo.world.entity.MapEntityMovementRecord;

/**
 * 兼容垫片 (Shim) - MapEntityMovementRecord
 * 原混淆类: f.zv_2
 * 现代实现: cn.pokemmo.world.entity.MapEntityMovementRecord
 * @see cn.pokemmo.world.entity.MapEntityMovementRecord
 */
public final class zv_2 extends MapEntityMovementRecord {

    public zv_2(byte b, byte b2, byte b3, boolean z, short s, short s2, byte b4, byte b5) {
        super(b, b2, b3, z, s, s2, b4, b5);
    }

    public zv_2(zv_2 other) {
        super(other);
    }

    public zv_2(MapEntityMovementRecord other) {
        super(other);
    }

    public void V2(zv_2 other) {
        super.V2(other);
    }

    @Override
    public zv_2 Xr() {
        return new zv_2(this.uS, this.o0, this.ID0, this.Lpt2, this.Lq0, this.B5, this.JT, this.Y30);
    }

    @Override
    public zv_2 clone() {
        return Xr();
    }
}
