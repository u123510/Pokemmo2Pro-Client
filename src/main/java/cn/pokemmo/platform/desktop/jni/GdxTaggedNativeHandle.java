/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.jni;

import f.*;


import com.badlogic.gdx.jnigen.runtime.CHandler;
import f.bi_1;
import f.co0;

public class GdxTaggedNativeHandle
extends f.bi_1 {
    public final co0 M80;

    public GdxTaggedNativeHandle(long l, boolean bl, String string) {
        super(l, bl);
        this.M80 = CHandler.j2(string);
    }

    public GdxTaggedNativeHandle(String string) {
        this(string, 1);
    }

    public GdxTaggedNativeHandle(String string, int n) {
        this(string, n, true, true);
    }

    public GdxTaggedNativeHandle(String string, int n, boolean bl, boolean bl2) {
        this(CHandler.j2(string), n, bl, bl2);
    }

    private GdxTaggedNativeHandle(co0 co02, int n, boolean bl, boolean bl2) {
        super(co02.k30() * n, bl, bl2);
        this.M80 = co02;
    }

    public final void G4(String string) {
        co0 co02 = this.M80;
        if (co02.Yv != null) {
            if (string.replace("const ", "").equals(co02.Yv)) {
                return;
            }
            throw new IllegalArgumentException("Expected type " + string + " does not match actual type " + co02.Yv);
        }
        throw new IllegalArgumentException("CType has no name");
    }

    public final String wA0() {
        long l = this.U9;
        if (l == 0L) {
            return null;
        }
        return CHandler.getPointerAsString(l);
    }
}

