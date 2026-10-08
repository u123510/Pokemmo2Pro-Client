/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESSampleShading {
    public static final int GL_SAMPLE_SHADING_OES = 35894;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_OES = 35895;

    public OESSampleShading() {
        throw new UnsupportedOperationException();
    }

    public static native void glMinSampleShadingOES(@NativeType(value="GLfloat") float var0);

    static {
        GLES.initialize();
    }
}

