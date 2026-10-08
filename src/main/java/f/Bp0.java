package f;

import cn.pokemmo.math.geometry.Vector2f;
import java.io.Serializable;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.Bp0
 * 核心实现已迁移至 {@link cn.pokemmo.math.geometry.Vector2f}
 */
public final class Bp0 extends Vector2f implements Serializable, lt_2 {
    public static final Bp0 X = new Bp0(1.0f, 0.0f);
    public static final Bp0 Y = new Bp0(0.0f, 1.0f);
    public static final Bp0 Zero = new Bp0(0.0f, 0.0f);

    public Bp0() {
        super();
    }

    public Bp0(float f, float f2) {
        super(f, f2);
    }

    public Bp0(Bp0 bp0) {
        super(bp0);
    }

    public Bp0(Vector2f bp0) {
        super(bp0);
    }

    @Override
    public Bp0 Jp0() {
        return new Bp0(this);
    }
}
