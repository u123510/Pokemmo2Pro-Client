/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTSemaphoreFD {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 38278;

    public EXTSemaphoreFD() {
        throw new UnsupportedOperationException();
    }

    public static native void glImportSemaphoreFdEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLint") int var2);

    static {
        GLES.initialize();
    }
}

