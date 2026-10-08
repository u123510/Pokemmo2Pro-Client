/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class OESTextureBorderClamp {
    public static final int GL_TEXTURE_BORDER_COLOR_OES = 4100;
    public static final int GL_CLAMP_TO_BORDER_OES = 33069;

    public OESTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    public static native void nglTexParameterIivOES(int var0, int var1, long var2);

    public static void glTexParameterIivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglTexParameterIivOES(n, n2, l);
    }

    public static void glTexParameterIiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int n3) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        n = memoryStack.getPointer();
        try {
            OESTextureBorderClamp.nglTexParameterIivOES(n4, n2, MemoryUtil.memAddress(memoryStack.ints(n3)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglTexParameterIuivOES(int var0, int var1, long var2);

    public static void glTexParameterIuivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglTexParameterIuivOES(n, n2, l);
    }

    public static void glTexParameterIuiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int n3) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        n = memoryStack.getPointer();
        try {
            OESTextureBorderClamp.nglTexParameterIuivOES(n4, n2, MemoryUtil.memAddress(memoryStack.ints(n3)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglGetTexParameterIivOES(int var0, int var1, long var2);

    public static void glGetTexParameterIivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglGetTexParameterIivOES(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetTexParameterIiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        OESTextureBorderClamp.nglGetTexParameterIivOES(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetTexParameterIuivOES(int var0, int var1, long var2);

    public static void glGetTexParameterIuivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglGetTexParameterIuivOES(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetTexParameterIuiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        OESTextureBorderClamp.nglGetTexParameterIuivOES(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglSamplerParameterIivOES(int var0, int var1, long var2);

    public static void glSamplerParameterIivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglSamplerParameterIivOES(n, n2, l);
    }

    public static void glSamplerParameterIiOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int n3) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        n = memoryStack.getPointer();
        try {
            OESTextureBorderClamp.nglSamplerParameterIivOES(n4, n2, MemoryUtil.memAddress(memoryStack.ints(n3)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglSamplerParameterIuivOES(int var0, int var1, long var2);

    public static void glSamplerParameterIuivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglSamplerParameterIuivOES(n, n2, l);
    }

    public static void glSamplerParameterIuiOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int n3) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        n = memoryStack.getPointer();
        try {
            OESTextureBorderClamp.nglSamplerParameterIuivOES(n4, n2, MemoryUtil.memAddress(memoryStack.ints(n3)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglGetSamplerParameterIivOES(int var0, int var1, long var2);

    public static void glGetSamplerParameterIivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglGetSamplerParameterIivOES(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIiOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        OESTextureBorderClamp.nglGetSamplerParameterIivOES(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetSamplerParameterIuivOES(int var0, int var1, long var2);

    public static void glGetSamplerParameterIuivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        OESTextureBorderClamp.nglGetSamplerParameterIuivOES(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIuiOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        OESTextureBorderClamp.nglGetSamplerParameterIuivOES(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static void glTexParameterIivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glTexParameterIivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glTexParameterIuivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glTexParameterIuivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetTexParameterIivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetTexParameterIivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetTexParameterIuivOES(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGetTexParameterIuivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterIivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glSamplerParameterIivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterIuivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glSamplerParameterIuivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterIivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetSamplerParameterIivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterIuivOES(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGetSamplerParameterIuivOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

