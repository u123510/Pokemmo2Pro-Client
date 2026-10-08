/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class APPLECopyTextureLevels {
    public APPLECopyTextureLevels() {
        throw new UnsupportedOperationException();
    }

    public static native void glCopyTextureLevelsAPPLE(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLsizei") int var3);

    static {
        GLES.initialize();
    }
}

