package cn.pokemmo.platform.desktop.jni;

import f.*;


import com.badlogic.gdx.jnigen.runtime.CHandler;

public class GdxNativeHandle {
    public final long U9;
    public long W6 = -1L;

    public GdxNativeHandle(long pointer, boolean register) {
        this.U9 = pointer;
        if (register) {
            hu_1.dd((bi_1) (Object) this);
        }
    }

    public GdxNativeHandle(int length, boolean register, boolean guarded) {
        this(CHandler.malloc((long)length), register);
        if (guarded) {
            this.Xf(length);
        }
    }

    public final void Xf(long guard) {
        this.W6 = guard;
    }

    public final void pN(long position) {
        if (this.U9 == 0L) {
            throw new NullPointerException("Pointer is null");
        }
        if (this.W6 != -1L && position >= this.W6) {
            throw new IllegalArgumentException("Byte " + position + " overshoots guard " + this.W6);
        }
    }

    public final long ET() {
        return this.U9;
    }
}
