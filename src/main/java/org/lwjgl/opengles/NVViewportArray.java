/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVViewportArray {
    public static final int GL_MAX_VIEWPORTS_NV = 33371;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS_NV = 33372;
    public static final int GL_VIEWPORT_BOUNDS_RANGE_NV = 33373;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX_NV = 33375;

    public NVViewportArray() {
        throw new UnsupportedOperationException();
    }

    public static native void nglViewportArrayvNV(int var0, int var1, long var2);

    public static void glViewportArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVViewportArray.nglViewportArrayvNV(n2, n, l);
    }

    public static native void glViewportIndexedfNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4);

    public static native void nglViewportIndexedfvNV(int var0, long var1);

    public static void glViewportIndexedfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 4);
        }
        NVViewportArray.nglViewportIndexedfvNV(n, MemoryUtil.memAddress(floatBuffer));
    }

    public static native void nglScissorArrayvNV(int var0, int var1, long var2);

    public static void glScissorArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        NVViewportArray.nglScissorArrayvNV(n2, n, l);
    }

    public static native void glScissorIndexedNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void nglScissorIndexedvNV(int var0, long var1);

    public static void glScissorIndexedvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        NVViewportArray.nglScissorIndexedvNV(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglDepthRangeArrayfvNV(int var0, int var1, long var2);

    public static void glDepthRangeArrayfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVViewportArray.nglDepthRangeArrayfvNV(n2, n, l);
    }

    public static native void glDepthRangeIndexedfNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2);

    public static native void nglGetFloati_vNV(int var0, int var1, long var2);

    public static void glGetFloati_vNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        NVViewportArray.nglGetFloati_vNV(n, n2, l);
    }

    @NativeType(value="void")
    public static float glGetFloatiNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        FloatBuffer floatBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            floatBuffer = memoryStack.callocFloat(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        NVViewportArray.nglGetFloati_vNV(n, n2, MemoryUtil.memAddress(floatBuffer));
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n3);
        return f;
    }

    public static native void glEnableiNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glDisableiNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    @NativeType(value="GLboolean")
    public static native boolean glIsEnablediNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static void glViewportArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glViewportArrayvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 2, fArray, l);
    }

    public static void glViewportIndexedfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glViewportIndexedfvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 4);
        }
        JNI.callPV(n, fArray, l);
    }

    public static void glScissorArrayvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glScissorArrayvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length >> 2, nArray, l);
    }

    public static void glScissorIndexedvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glScissorIndexedvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glDepthRangeArrayfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glDepthRangeArrayfvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 1, fArray, l);
    }

    public static void glGetFloati_vNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GLES.getICD().glGetFloati_vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.callPV(n, n2, fArray, l);
    }

    static {
        GLES.initialize();
    }
}

