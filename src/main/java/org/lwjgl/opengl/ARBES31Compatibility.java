/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL45C;
import org.lwjgl.system.NativeType;

public class ARBES31Compatibility {
    public ARBES31Compatibility() {
        throw new UnsupportedOperationException();
    }

    public static void glMemoryBarrierByRegion(@NativeType(value="GLbitfield") int n) {
        GL45C.glMemoryBarrierByRegion(n);
    }

    static {
        GL.initialize();
    }
}

