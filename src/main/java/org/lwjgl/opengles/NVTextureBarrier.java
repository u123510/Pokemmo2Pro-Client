/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;

public class NVTextureBarrier {
    public NVTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    public static native void glTextureBarrierNV();

    static {
        GLES.initialize();
    }
}

