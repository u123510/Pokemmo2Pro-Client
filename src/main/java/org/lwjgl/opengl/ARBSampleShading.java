/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 35894;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 35895;

    public ARBSampleShading() {
        throw new UnsupportedOperationException();
    }

    public static native void glMinSampleShadingARB(@NativeType(value="GLfloat") float var0);

    static {
        GL.initialize();
    }
}

