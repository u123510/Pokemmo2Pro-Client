/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTShaderPixelLocalStorage2 {
    public static final int GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT = 38480;
    public static final int GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT = 38481;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT = 38482;

    public EXTShaderPixelLocalStorage2() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferPixelLocalStorageSizeEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizei") int var1);

    @NativeType(value="GLsizei")
    public static native int glGetFramebufferPixelLocalStorageSizeEXT(@NativeType(value="GLuint") int var0);

    public static native void nglClearPixelLocalStorageuiEXT(int var0, int var1, long var2);

    public static void glClearPixelLocalStorageuiEXT(@NativeType(value="GLsizei") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTShaderPixelLocalStorage2.nglClearPixelLocalStorageuiEXT(n2, n, l);
    }

    public static void glClearPixelLocalStorageuiEXT(@NativeType(value="GLsizei") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glClearPixelLocalStorageuiEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

