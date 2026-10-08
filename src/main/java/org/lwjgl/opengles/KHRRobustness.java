/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class KHRRobustness {
    public static final int GL_GUILTY_CONTEXT_RESET_KHR = 33363;
    public static final int GL_INNOCENT_CONTEXT_RESET_KHR = 33364;
    public static final int GL_UNKNOWN_CONTEXT_RESET_KHR = 33365;
    public static final int GL_CONTEXT_ROBUST_ACCESS_KHR = 37107;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_KHR = 33366;
    public static final int GL_LOSE_CONTEXT_ON_RESET_KHR = 33362;
    public static final int GL_NO_RESET_NOTIFICATION_KHR = 33377;
    public static final int GL_CONTEXT_LOST_KHR = 1287;

    public KHRRobustness() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="GLenum")
    public static native int glGetGraphicsResetStatusKHR();

    public static native void nglReadnPixelsKHR(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="GLsizei") int n7, @NativeType(value="void *") long l) {
        KHRRobustness.nglReadnPixelsKHR(n, n2, n3, n4, n5, n6, n7, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") ByteBuffer byteBuffer) {
        int n7 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        KHRRobustness.nglReadnPixelsKHR(n7, n2, n3, n4, n5, n6, n, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") ShortBuffer shortBuffer) {
        int n7 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        n = shortBuffer2.remaining() << 1;
        long l = MemoryUtil.memAddress(shortBuffer2);
        KHRRobustness.nglReadnPixelsKHR(n7, n2, n3, n4, n5, n6, n, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") IntBuffer intBuffer) {
        int n7 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() << 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        KHRRobustness.nglReadnPixelsKHR(n7, n2, n3, n4, n5, n6, n, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") FloatBuffer floatBuffer) {
        int n7 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() << 2;
        long l = MemoryUtil.memAddress(floatBuffer2);
        KHRRobustness.nglReadnPixelsKHR(n7, n2, n3, n4, n5, n6, n, l);
    }

    public static native void nglGetnUniformfvKHR(int var0, int var1, int var2, long var3);

    public static void glGetnUniformfvKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining();
        long l = MemoryUtil.memAddress(floatBuffer2);
        KHRRobustness.nglGetnUniformfvKHR(n3, n2, n, l);
    }

    @NativeType(value="void")
    public static float glGetnUniformfKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        int n3;
        FloatBuffer floatBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            floatBuffer = memoryStack.callocFloat(1);
            n3 = n;
            n = 1;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        KHRRobustness.nglGetnUniformfvKHR(n3, n2, n, l);
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n4);
        return f;
    }

    public static native void nglGetnUniformivKHR(int var0, int var1, int var2, long var3);

    public static void glGetnUniformivKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining();
        long l = MemoryUtil.memAddress(floatBuffer2);
        KHRRobustness.nglGetnUniformivKHR(n3, n2, n, l);
    }

    @NativeType(value="void")
    public static float glGetnUniformiKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        int n3;
        FloatBuffer floatBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            floatBuffer = memoryStack.callocFloat(1);
            n3 = n;
            n = 1;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        KHRRobustness.nglGetnUniformivKHR(n3, n2, n, l);
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n4);
        return f;
    }

    public static native void nglGetnUniformuivKHR(int var0, int var1, int var2, long var3);

    public static void glGetnUniformuivKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        int n3 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining();
        long l = MemoryUtil.memAddress(floatBuffer2);
        KHRRobustness.nglGetnUniformuivKHR(n3, n2, n, l);
    }

    @NativeType(value="void")
    public static float glGetnUniformuiKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        int n3;
        FloatBuffer floatBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            floatBuffer = memoryStack.callocFloat(1);
            n3 = n;
            n = 1;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        KHRRobustness.nglGetnUniformuivKHR(n3, n2, n, l);
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n4);
        return f;
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") short[] sArray) {
        long l = GLES.getICD().glReadnPixelsKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n7 = n;
        n = sArray.length << 1;
        JNI.callPV(n7, n2, n3, n4, n5, n6, n, sArray, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") int[] nArray) {
        long l = GLES.getICD().glReadnPixelsKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n7 = n;
        n = nArray.length << 2;
        JNI.callPV(n7, n2, n3, n4, n5, n6, n, nArray, l);
    }

    public static void glReadnPixelsKHR(@NativeType(value="GLint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLenum") int n6, @NativeType(value="void *") float[] fArray) {
        long l = GLES.getICD().glReadnPixelsKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n7 = n;
        n = fArray.length << 2;
        JNI.callPV(n7, n2, n3, n4, n5, n6, n, fArray, l);
    }

    public static void glGetnUniformfvKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GLES.getICD().glGetnUniformfvKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length, fArray, l);
    }

    public static void glGetnUniformivKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GLES.getICD().glGetnUniformivKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length, fArray, l);
    }

    public static void glGetnUniformuivKHR(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GLES.getICD().glGetnUniformuivKHR;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, fArray.length, fArray, l);
    }

    static {
        GLES.initialize();
    }
}

