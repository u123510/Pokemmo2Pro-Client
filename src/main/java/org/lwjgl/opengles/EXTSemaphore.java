/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengles.EXTMemoryObject;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTSemaphore {
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 38294;
    public static final int GL_DEVICE_UUID_EXT = 38295;
    public static final int GL_DRIVER_UUID_EXT = 38296;
    public static final int GL_UUID_SIZE_EXT = 16;
    public static final int GL_LAYOUT_GENERAL_EXT = 38285;
    public static final int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 38286;
    public static final int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 38287;
    public static final int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 38288;
    public static final int GL_LAYOUT_SHADER_READ_ONLY_EXT = 38289;
    public static final int GL_LAYOUT_TRANSFER_SRC_EXT = 38290;
    public static final int GL_LAYOUT_TRANSFER_DST_EXT = 38291;
    public static final int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 38192;
    public static final int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 38193;

    public EXTSemaphore() {
        throw new UnsupportedOperationException();
    }

    public static void nglGetUnsignedBytevEXT(int n, long l) {
        EXTMemoryObject.nglGetUnsignedBytevEXT(n, l);
    }

    public static void glGetUnsignedBytevEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLubyte *") ByteBuffer byteBuffer) {
        EXTMemoryObject.glGetUnsignedBytevEXT(n, byteBuffer);
    }

    public static void nglGetUnsignedBytei_vEXT(int n, int n2, long l) {
        EXTMemoryObject.nglGetUnsignedBytei_vEXT(n, n2, l);
    }

    public static void glGetUnsignedBytei_vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLubyte *") ByteBuffer byteBuffer) {
        EXTMemoryObject.glGetUnsignedBytei_vEXT(n, n2, byteBuffer);
    }

    public static native void nglGenSemaphoresEXT(int var0, long var1);

    public static void glGenSemaphoresEXT(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        EXTSemaphore.nglGenSemaphoresEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenSemaphoresEXT() {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        EXTSemaphore.nglGenSemaphoresEXT(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteSemaphoresEXT(int var0, long var1);

    public static void glDeleteSemaphoresEXT(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        EXTSemaphore.nglDeleteSemaphoresEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteSemaphoresEXT(@NativeType(value="GLuint const *") int n) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.ints(n2);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        EXTSemaphore.nglDeleteSemaphoresEXT(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsSemaphoreEXT(@NativeType(value="GLuint") int var0);

    public static native void nglSemaphoreParameterui64vEXT(int var0, int var1, long var2);

    public static void glSemaphoreParameterui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        EXTSemaphore.nglSemaphoreParameterui64vEXT(n, n2, l);
    }

    public static void glSemaphoreParameterui64EXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 const *") long l) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = n;
        n = memoryStack.getPointer();
        try {
            EXTSemaphore.nglSemaphoreParameterui64vEXT(n3, n2, MemoryUtil.memAddress(memoryStack.longs(l)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglGetSemaphoreParameterui64vEXT(int var0, int var1, long var2);

    public static void glGetSemaphoreParameterui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        EXTSemaphore.nglGetSemaphoreParameterui64vEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetSemaphoreParameterui64EXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTSemaphore.nglGetSemaphoreParameterui64vEXT(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void nglWaitSemaphoreEXT(int var0, int var1, long var2, int var4, long var5, long var7);

    public static void glWaitSemaphoreEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLenum const *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer3, intBuffer2.remaining());
        }
        int n2 = n;
        IntBuffer intBuffer4 = intBuffer2;
        IntBuffer intBuffer5 = intBuffer;
        n = intBuffer5.remaining();
        long l = MemoryUtil.memAddress(intBuffer5);
        int n3 = intBuffer4.remaining();
        long l2 = MemoryUtil.memAddress(intBuffer4);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        EXTSemaphore.nglWaitSemaphoreEXT(n2, n, l, n3, l2, l3);
    }

    public static native void nglSignalSemaphoreEXT(int var0, int var1, long var2, int var4, long var5, long var7);

    public static void glSignalSemaphoreEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLenum const *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer3, intBuffer2.remaining());
        }
        int n2 = n;
        IntBuffer intBuffer4 = intBuffer2;
        IntBuffer intBuffer5 = intBuffer;
        n = intBuffer5.remaining();
        long l = MemoryUtil.memAddress(intBuffer5);
        int n3 = intBuffer4.remaining();
        long l2 = MemoryUtil.memAddress(intBuffer4);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        EXTSemaphore.nglSignalSemaphoreEXT(n2, n, l, n3, l2, l3);
    }

    public static void glGenSemaphoresEXT(@NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGenSemaphoresEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteSemaphoresEXT(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glDeleteSemaphoresEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glSemaphoreParameterui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glSemaphoreParameterui64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetSemaphoreParameterui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GLES.getICD().glGetSemaphoreParameterui64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glWaitSemaphoreEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLenum const *") int[] nArray3) {
        long l = GLES.getICD().glWaitSemaphoreEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray3, nArray2.length);
        }
        int n2 = n;
        n = nArray.length;
        int n3 = nArray2.length;
        JNI.callPPPV(n2, n, nArray, n3, nArray2, nArray3, l);
    }

    public static void glSignalSemaphoreEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLenum const *") int[] nArray3) {
        long l = GLES.getICD().glSignalSemaphoreEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray3, nArray2.length);
        }
        int n2 = n;
        n = nArray.length;
        int n3 = nArray2.length;
        JNI.callPPPV(n2, n, nArray, n3, nArray2, nArray3, l);
    }

    static {
        GLES.initialize();
    }
}

