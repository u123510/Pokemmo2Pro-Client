/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL45C;

public class ARBTextureBarrier {
    public ARBTextureBarrier() {
        throw new UnsupportedOperationException();
    }

    public static void glTextureBarrier() {
        GL45C.glTextureBarrier();
    }

    static {
        GL.initialize();
    }
}

