package f;

import cn.pokemmo.util.text.FastCharBuffer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.b3_0
 * 核心实现已迁移至 {@link cn.pokemmo.util.text.FastCharBuffer}
 */
public class b3_0 extends FastCharBuffer {
    public b3_0() {
        super();
    }

    public b3_0(int n) {
        super(n);
    }

    public b3_0(CharSequence charSequence) {
        super(charSequence);
    }

    public b3_0(FastCharBuffer b3_02) {
        super(b3_02);
    }

    public b3_0(String string) {
        super(string);
    }

    @Override
    public final b3_0 on(int n) {
        super.on(n);
        return this;
    }

    @Override
    public final b3_0 u(String string, char c) {
        super.u(string, c);
        return this;
    }
}
