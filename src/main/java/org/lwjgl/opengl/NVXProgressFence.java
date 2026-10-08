/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVXProgressFence {
    public NVXProgressFence() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="GLuint")
    public static native int glCreateProgressFenceNVX();

    public static native void nglSignalSemaphoreui64NVX(int var0, int var1, long var2, long var4);

    public static void glSignalSemaphoreui64NVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, intBuffer.remaining());
        }
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        long l2 = MemoryUtil.memAddress(longBuffer);
        NVXProgressFence.nglSignalSemaphoreui64NVX(n2, n, l, l2);
    }

    public static native void nglWaitSemaphoreui64NVX(int var0, int var1, long var2, long var4);

    public static void glWaitSemaphoreui64NVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, intBuffer.remaining());
        }
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        long l2 = MemoryUtil.memAddress(longBuffer);
        NVXProgressFence.nglWaitSemaphoreui64NVX(n2, n, l, l2);
    }

    public static native void nglClientWaitSemaphoreui64NVX(int var0, long var1, long var3);

    public static void glClientWaitSemaphoreui64NVX(@NativeType(value="GLuint const *") IntBuffer intBuffer, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(longBuffer);
        NVXProgressFence.nglClientWaitSemaphoreui64NVX(intBuffer.remaining(), l, l2);
    }

    public static void glSignalSemaphoreui64NVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GL.getICD().glSignalSemaphoreui64NVX;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, nArray.length);
        }
        JNI.callPPV(n, nArray.length, nArray, lArray, l);
    }

    public static void glWaitSemaphoreui64NVX(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GL.getICD().glWaitSemaphoreui64NVX;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, nArray.length);
        }
        JNI.callPPV(n, nArray.length, nArray, lArray, l);
    }

    public static void glClientWaitSemaphoreui64NVX(@NativeType(value="GLuint const *") int[] nArray, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GL.getICD().glClientWaitSemaphoreui64NVX;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, nArray.length);
        }
        JNI.callPPV(nArray.length, nArray, lArray, l);
    }

    static {
        GL.initialize();
    }
}

