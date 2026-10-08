package cn.pokemmo.graphics.gl;

import f.bi_1;

public abstract class NativeBufferBase extends bi_1 {
    public NativeBufferBase(long l, boolean bl) {
        super(l, bl);
    }

    public NativeBufferBase(int n, int n2) {
        this(n, n2, true, true);
    }

    public NativeBufferBase(int n, int n2, boolean bl, boolean bl2) {
        super(n * n2, bl, bl2);
    }
}
