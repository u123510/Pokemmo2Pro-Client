/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;

public class EXTShaderFramebufferFetchNonCoherent {
    public EXTShaderFramebufferFetchNonCoherent() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferFetchBarrierEXT();

    static {
        GL.initialize();
    }
}

