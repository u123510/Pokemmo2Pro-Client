/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;

public class INTELFramebufferCMAA {
    public INTELFramebufferCMAA() {
        throw new UnsupportedOperationException();
    }

    public static native void glApplyFramebufferAttachmentCMAAINTEL();

    static {
        GLES.initialize();
    }
}

