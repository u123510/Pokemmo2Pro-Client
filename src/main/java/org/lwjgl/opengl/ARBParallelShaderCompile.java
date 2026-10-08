/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 37296;
    public static final int GL_COMPLETION_STATUS_ARB = 37297;

    public ARBParallelShaderCompile() {
        throw new UnsupportedOperationException();
    }

    public static native void glMaxShaderCompilerThreadsARB(@NativeType(value="GLuint") int var0);

    static {
        GL.initialize();
    }
}

