/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVReadBuffer {
    public static final int GL_READ_BUFFER_NV = 3074;

    public NVReadBuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void glReadBufferNV(@NativeType(value="GLenum") int var0);

    static {
        GLES.initialize();
    }
}

