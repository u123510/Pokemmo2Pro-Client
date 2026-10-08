/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class KHRParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 37296;
    public static final int GL_COMPLETION_STATUS_KHR = 37297;

    public KHRParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    public static native void glMaxShaderCompilerThreadsKHR(@NativeType(value="GLuint") int var0);

    static {
        GLES.initialize();
    }
}

