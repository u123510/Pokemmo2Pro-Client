/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.opengles.OESDrawBuffersIndexed;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class OESViewportArray {
    public static final int GL_MAX_VIEWPORTS_OES = 33371;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS_OES = 33372;
    public static final int GL_VIEWPORT_BOUNDS_RANGE_OES = 33373;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX_OES = 33375;

    public OESViewportArray() {
        throw new UnsupportedOperationException();
    }

    public static native void nglViewportArrayvOES(int var0, int var1, long var2);

    public static void glViewportArrayvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        OESViewportArray.nglViewportArrayvOES(n2, n, l);
    }

    public static native void glViewportIndexedfOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4);

    public static native void nglViewportIndexedfvOES(int var0, long var1);

    public static void glViewportIndexedfvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 4);
        }
        OESViewportArray.nglViewportIndexedfvOES(n, MemoryUtil.memAddress(floatBuffer));
    }

    public static native void nglScissorArrayvOES(int var0, int var1, long var2);

    public static void glScissorArrayvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        OESViewportArray.nglScissorArrayvOES(n2, n, l);
    }

    public static native void glScissorIndexedOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void nglScissorIndexedvOES(int var0, long var1);

    public static void glScissorIndexedvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        OESViewportArray.nglScissorIndexedvOES(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglDepthRangeArrayfvOES(int var0, int var1, long var2);

    public static void glDepthRangeArrayfvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(floatBuffer2);
        OESViewportArray.nglDepthRangeArrayfvOES(n2, n, l);
    }

    public static native void glDepthRangeIndexedfOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2);

    public static native void nglGetFloati_vOES(int var0, int var1, long var2);

    public static void glGetFloati_vOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        OESViewportArray.nglGetFloati_vOES(n, n2, l);
    }

    @NativeType(value="void")
    public static float glGetFloatiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
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
        OESViewportArray.nglGetFloati_vOES(n, n2, MemoryUtil.memAddress(floatBuffer));
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n3);
        return f;
    }

    public static void glEnableiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        OESDrawBuffersIndexed.glEnableiOES(n, n2);
    }

    public static void glDisableiOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        OESDrawBuffersIndexed.glDisableiOES(n, n2);
    }

    @NativeType(value="GLboolean")
    public static boolean glIsEnablediOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        return OESDrawBuffersIndexed.glIsEnablediOES(n, n2);
    }

    public static void glViewportArrayvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glViewportArrayvOES;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 2, fArray, l);
    }

    public static void glViewportIndexedfvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glViewportIndexedfvOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 4);
        }
        JNI.callPV(n, fArray, l);
    }

    public static void glScissorArrayvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glScissorArrayvOES;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length >> 2, nArray, l);
    }

    public static void glScissorIndexedvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glScissorIndexedvOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glDepthRangeArrayfvOES(@NativeType(value="GLuint") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glDepthRangeArrayfvOES;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 1, fArray, l);
    }

    public static void glGetFloati_vOES(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GLES.getICD().glGetFloati_vOES;
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

