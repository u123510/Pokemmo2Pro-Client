/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVFragmentCoverageToColor {
    public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 37597;
    public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 37598;

    public NVFragmentCoverageToColor() {
        throw new UnsupportedOperationException();
    }

    public static native void glFragmentCoverageColorNV(@NativeType(value="GLuint") int var0);

    static {
        GL.initialize();
    }
}

