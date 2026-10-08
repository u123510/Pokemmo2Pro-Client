package f;

import cn.pokemmo.io.binary.CompressedBitmaskTilemapLoader;
import java.util.BitSet;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ap_0
 * 核心实现已迁移至 {@link cn.pokemmo.io.binary.CompressedBitmaskTilemapLoader}
 */
public final class ap_0 extends CompressedBitmaskTilemapLoader {
    public final BitSet[] yA0;
    public final RB[] Ou0;
    public final Object co0;

    public ap_0() {
        super();
        this.yA0 = this.bitsets;
        this.Ou0 = this.sparseMaps;
        this.co0 = this.lock;
    }

    public final void AY(byte index, byte[] compressed) {
        loadCompressed(index, compressed);
    }

    public final boolean ID0(byte index, short value) {
        return testBit(index, value);
    }

    public final boolean H6(byte index, int bit, short value) {
        return testSparseBit(index, bit, value);
    }

    public final void iH0(byte index, int bit, short value) {
        setSparseBit(index, bit, value);
    }

    public final int hs0(short value) {
        return countSparseBits(value);
    }
}
