/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVGPUMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 2048;
    public static final int GL_MULTICAST_GPUS_NV = 37562;
    public static final int GL_RENDER_GPU_MASK_NV = 38232;
    public static final int GL_PER_GPU_STORAGE_NV = 38216;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 38217;

    public NVGPUMulticast() {
        throw new UnsupportedOperationException();
    }

    public static native void glRenderGpuMaskNV(@NativeType(value="GLbitfield") int var0);

    public static native void nglMulticastBufferSubDataNV(int var0, int var1, long var2, long var4, long var6);

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long l2 = byteBuffer2.remaining();
        long l3 = MemoryUtil.memAddress(byteBuffer2);
        NVGPUMulticast.nglMulticastBufferSubDataNV(n, n2, l, l2, l3);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") ShortBuffer shortBuffer) {
        ShortBuffer shortBuffer2 = shortBuffer;
        long l2 = Integer.toUnsignedLong(shortBuffer2.remaining()) << 1;
        long l3 = MemoryUtil.memAddress(shortBuffer2);
        NVGPUMulticast.nglMulticastBufferSubDataNV(n, n2, l, l2, l3);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") IntBuffer intBuffer) {
        IntBuffer intBuffer2 = intBuffer;
        long l2 = Integer.toUnsignedLong(intBuffer2.remaining()) << 2;
        long l3 = MemoryUtil.memAddress(intBuffer2);
        NVGPUMulticast.nglMulticastBufferSubDataNV(n, n2, l, l2, l3);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") FloatBuffer floatBuffer) {
        FloatBuffer floatBuffer2 = floatBuffer;
        long l2 = Integer.toUnsignedLong(floatBuffer2.remaining()) << 2;
        long l3 = MemoryUtil.memAddress(floatBuffer2);
        NVGPUMulticast.nglMulticastBufferSubDataNV(n, n2, l, l2, l3);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") DoubleBuffer doubleBuffer) {
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        long l2 = Integer.toUnsignedLong(doubleBuffer2.remaining()) << 3;
        long l3 = MemoryUtil.memAddress(doubleBuffer2);
        NVGPUMulticast.nglMulticastBufferSubDataNV(n, n2, l, l2, l3);
    }

    public static native void glMulticastCopyBufferSubDataNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLbitfield") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLintptr") long var4, @NativeType(value="GLintptr") long var6, @NativeType(value="GLsizeiptr") long var8);

    public static native void glMulticastCopyImageSubDataNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLbitfield") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6, @NativeType(value="GLint") int var7, @NativeType(value="GLuint") int var8, @NativeType(value="GLenum") int var9, @NativeType(value="GLint") int var10, @NativeType(value="GLint") int var11, @NativeType(value="GLint") int var12, @NativeType(value="GLint") int var13, @NativeType(value="GLsizei") int var14, @NativeType(value="GLsizei") int var15, @NativeType(value="GLsizei") int var16);

    public static native void glMulticastBlitFramebufferNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6, @NativeType(value="GLint") int var7, @NativeType(value="GLint") int var8, @NativeType(value="GLint") int var9, @NativeType(value="GLbitfield") int var10, @NativeType(value="GLenum") int var11);

    public static native void nglMulticastFramebufferSampleLocationsfvNV(int var0, int var1, int var2, int var3, long var4);

    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n4 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVGPUMulticast.nglMulticastFramebufferSampleLocationsfvNV(n4, n2, n3, n, l);
    }

    public static native void glMulticastBarrierNV();

    public static native void glMulticastWaitSyncNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLbitfield") int var1);

    public static native void nglMulticastGetQueryObjectivNV(int var0, int var1, int var2, long var3);

    public static void glMulticastGetQueryObjectivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVGPUMulticast.nglMulticastGetQueryObjectivNV(n, n2, n3, l);
    }

    @NativeType(value="void")
    public static int glMulticastGetQueryObjectiNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        NVGPUMulticast.nglMulticastGetQueryObjectivNV(n, n2, n3, MemoryUtil.memAddress(intBuffer));
        int n5 = intBuffer.get(0);
        memoryStack.setPointer(n4);
        return n5;
    }

    public static native void nglMulticastGetQueryObjectuivNV(int var0, int var1, int var2, long var3);

    public static void glMulticastGetQueryObjectuivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVGPUMulticast.nglMulticastGetQueryObjectuivNV(n, n2, n3, l);
    }

    @NativeType(value="void")
    public static int glMulticastGetQueryObjectuiNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        NVGPUMulticast.nglMulticastGetQueryObjectuivNV(n, n2, n3, MemoryUtil.memAddress(intBuffer));
        int n5 = intBuffer.get(0);
        memoryStack.setPointer(n4);
        return n5;
    }

    public static native void nglMulticastGetQueryObjecti64vNV(int var0, int var1, int var2, long var3);

    public static void glMulticastGetQueryObjecti64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        NVGPUMulticast.nglMulticastGetQueryObjecti64vNV(n, n2, n3, l);
    }

    @NativeType(value="void")
    public static long glMulticastGetQueryObjecti64NV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        NVGPUMulticast.nglMulticastGetQueryObjecti64vNV(n, n2, n3, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n4);
        return l;
    }

    public static native void nglMulticastGetQueryObjectui64vNV(int var0, int var1, int var2, long var3);

    public static void glMulticastGetQueryObjectui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        NVGPUMulticast.nglMulticastGetQueryObjectui64vNV(n, n2, n3, l);
    }

    @NativeType(value="void")
    public static long glMulticastGetQueryObjectui64NV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        NVGPUMulticast.nglMulticastGetQueryObjectui64vNV(n, n2, n3, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n4);
        return l;
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") short[] sArray) {
        long l2 = GL.getICD().glMulticastBufferSubDataNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        long l3 = Integer.toUnsignedLong(sArray.length) << 1;
        JNI.callPPPV(n, n2, l, l3, sArray, l2);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") int[] nArray) {
        long l2 = GL.getICD().glMulticastBufferSubDataNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        long l3 = Integer.toUnsignedLong(nArray.length) << 2;
        JNI.callPPPV(n, n2, l, l3, nArray, l2);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") float[] fArray) {
        long l2 = GL.getICD().glMulticastBufferSubDataNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        long l3 = Integer.toUnsignedLong(fArray.length) << 2;
        JNI.callPPPV(n, n2, l, l3, fArray, l2);
    }

    public static void glMulticastBufferSubDataNV(@NativeType(value="GLbitfield") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="void const *") double[] dArray) {
        long l2 = GL.getICD().glMulticastBufferSubDataNV;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        long l3 = Integer.toUnsignedLong(dArray.length) << 3;
        JNI.callPPPV(n, n2, l, l3, dArray, l2);
    }

    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glMulticastFramebufferSampleLocationsfvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, n3, fArray.length >> 1, fArray, l);
    }

    public static void glMulticastGetQueryObjectivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glMulticastGetQueryObjectivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, n3, nArray, l);
    }

    public static void glMulticastGetQueryObjectuivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glMulticastGetQueryObjectuivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, n3, nArray, l);
    }

    public static void glMulticastGetQueryObjecti64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GL.getICD().glMulticastGetQueryObjecti64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, n3, lArray, l);
    }

    public static void glMulticastGetQueryObjectui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GL.getICD().glMulticastGetQueryObjectui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, n3, lArray, l);
    }

    static {
        GL.initialize();
    }
}

