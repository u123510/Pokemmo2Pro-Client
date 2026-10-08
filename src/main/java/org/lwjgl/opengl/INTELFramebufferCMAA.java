/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;

public class INTELFramebufferCMAA {
    public INTELFramebufferCMAA() {
        throw new UnsupportedOperationException();
    }

    public static native void glApplyFramebufferAttachmentCMAAINTEL();

    static {
        GL.initialize();
    }
}

