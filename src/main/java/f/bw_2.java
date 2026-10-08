package f;

import java.util.Collection;
import cn.pokemmo.net.packet.Modern_Net_Bw2;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.bw_2
 * 核心实现已迁移至 {@link Modern_Net_Bw2}
 */
public final class bw_2 extends Modern_Net_Bw2 {
    public bw_2(Collection collection, F9 lock) {
        super(collection, lock);
    }
}
