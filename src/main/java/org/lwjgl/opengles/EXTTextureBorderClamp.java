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

public class EXTTextureBorderClamp {
    public static final int GL_TEXTURE_BORDER_COLOR_EXT = 4100;
    public static final int GL_CLAMP_TO_BORDER_EXT = 33069;

    public EXTTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    public static native void nglTexParameterIivEXT(int var0, int var1, long var2);

    public static void glTexParameterIivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglTexParameterIivEXT(n, n2, l);
    }

    public static native void nglTexParameterIuivEXT(int var0, int var1, long var2);

    public static void glTexParameterIuivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglTexParameterIuivEXT(n, n2, l);
    }

    public static native void nglGetTexParameterIivEXT(int var0, int var1, long var2);

    public static void glGetTexParameterIivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglGetTexParameterIivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetTexParameterIiEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
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
        EXTTextureBorderClamp.nglGetTexParameterIivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetTexParameterIuivEXT(int var0, int var1, long var2);

    public static void glGetTexParameterIuivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglGetTexParameterIuivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetTexParameterIuiEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
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
        EXTTextureBorderClamp.nglGetTexParameterIuivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglSamplerParameterIivEXT(int var0, int var1, long var2);

    public static void glSamplerParameterIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglSamplerParameterIivEXT(n, n2, l);
    }

    public static native void nglSamplerParameterIuivEXT(int var0, int var1, long var2);

    public static void glSamplerParameterIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglSamplerParameterIuivEXT(n, n2, l);
    }

    public static native void nglGetSamplerParameterIivEXT(int var0, int var1, long var2);

    public static void glGetSamplerParameterIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglGetSamplerParameterIivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        EXTTextureBorderClamp.nglGetSamplerParameterIivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetSamplerParameterIuivEXT(int var0, int var1, long var2);

    public static void glGetSamplerParameterIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTTextureBorderClamp.nglGetSamplerParameterIuivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIuiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        EXTTextureBorderClamp.nglGetSamplerParameterIuivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static void glTexParameterIivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glTexParameterIivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glTexParameterIuivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glTexParameterIuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetTexParameterIivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetTexParameterIivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetTexParameterIuivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGetTexParameterIuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glSamplerParameterIivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glSamplerParameterIuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetSamplerParameterIivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGetSamplerParameterIuivEXT;
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

