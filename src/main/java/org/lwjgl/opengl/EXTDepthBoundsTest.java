/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;

public class EXTDepthBoundsTest {
    public static final int GL_DEPTH_BOUNDS_TEST_EXT = 34960;
    public static final int GL_DEPTH_BOUNDS_EXT = 34961;

    public EXTDepthBoundsTest() {
        throw new UnsupportedOperationException();
    }

    public static native void glDepthBoundsEXT(double var0, double var2);

    static {
        GL.initialize();
    }
}

