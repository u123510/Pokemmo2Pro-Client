/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;

public class EXTShaderFramebufferFetchNonCoherent {
    public EXTShaderFramebufferFetchNonCoherent() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferFetchBarrierEXT();

    static {
        GLES.initialize();
    }
}

