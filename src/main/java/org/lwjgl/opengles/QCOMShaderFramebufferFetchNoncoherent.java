/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;

public class QCOMShaderFramebufferFetchNoncoherent {
    public QCOMShaderFramebufferFetchNoncoherent() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferFetchBarrierQCOM();

    static {
        GLES.initialize();
    }
}

