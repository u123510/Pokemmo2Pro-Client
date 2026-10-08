/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTClipControl {
    public static final int GL_LOWER_LEFT_EXT = 36001;
    public static final int GL_UPPER_LEFT_EXT = 36002;
    public static final int GL_NEGATIVE_ONE_TO_ONE_EXT = 37726;
    public static final int GL_ZERO_TO_ONE_EXT = 37727;
    public static final int GL_CLIP_ORIGIN_EXT = 37724;
    public static final int GL_CLIP_DEPTH_MODE_EXT = 37725;

    public EXTClipControl() {
        throw new UnsupportedOperationException();
    }

    public static native void glClipControlEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1);

    static {
        GLES.initialize();
    }
}

