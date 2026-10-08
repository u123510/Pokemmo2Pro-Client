package f;

import cn.pokemmo.util.collection.Modern_Col_Eq;
import java.util.ConcurrentModificationException;
import java.util.Map;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.EQ
 * 核心实现已迁移至 {@link Modern_Col_Eq}
 */
public final class EQ extends Modern_Col_Eq {
    public EQ(jb0_1 owner, Object key, Object value, int index) {
        super(owner, key, value, index);
    }
}

