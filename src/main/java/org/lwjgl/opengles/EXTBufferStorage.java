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
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTBufferStorage {
    public static final int GL_MAP_PERSISTENT_BIT_EXT = 64;
    public static final int GL_MAP_COHERENT_BIT_EXT = 128;
    public static final int GL_DYNAMIC_STORAGE_BIT_EXT = 256;
    public static final int GL_CLIENT_STORAGE_BIT_EXT = 512;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE_EXT = 33311;
    public static final int GL_BUFFER_STORAGE_FLAGS_EXT = 33312;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT = 16384;

    public EXTBufferStorage() {
        throw new UnsupportedOperationException();
    }

    public static native void nglBufferStorageEXT(int var0, long var1, long var3, int var5);

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizeiptr") long l, @NativeType(value="GLbitfield") int n2) {
        EXTBufferStorage.nglBufferStorageEXT(n, l, 0L, n2);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLbitfield") int n2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long l = byteBuffer2.remaining();
        long l2 = MemoryUtil.memAddress(byteBuffer2);
        EXTBufferStorage.nglBufferStorageEXT(n, l, l2, n2);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLbitfield") int n2) {
        ShortBuffer shortBuffer2 = shortBuffer;
        long l = Integer.toUnsignedLong(shortBuffer2.remaining()) << 1;
        long l2 = MemoryUtil.memAddress(shortBuffer2);
        EXTBufferStorage.nglBufferStorageEXT(n, l, l2, n2);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLbitfield") int n2) {
        IntBuffer intBuffer2 = intBuffer;
        long l = Integer.toUnsignedLong(intBuffer2.remaining()) << 2;
        long l2 = MemoryUtil.memAddress(intBuffer2);
        EXTBufferStorage.nglBufferStorageEXT(n, l, l2, n2);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") FloatBuffer floatBuffer, @NativeType(value="GLbitfield") int n2) {
        FloatBuffer floatBuffer2 = floatBuffer;
        long l = Integer.toUnsignedLong(floatBuffer2.remaining()) << 2;
        long l2 = MemoryUtil.memAddress(floatBuffer2);
        EXTBufferStorage.nglBufferStorageEXT(n, l, l2, n2);
    }

    public static native void nglNamedBufferStorageEXT(int var0, long var1, long var3, int var5);

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLsizeiptr") long l, @NativeType(value="GLbitfield") int n2) {
        EXTBufferStorage.nglNamedBufferStorageEXT(n, l, 0L, n2);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLbitfield") int n2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long l = byteBuffer2.remaining();
        long l2 = MemoryUtil.memAddress(byteBuffer2);
        EXTBufferStorage.nglNamedBufferStorageEXT(n, l, l2, n2);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLbitfield") int n2) {
        ShortBuffer shortBuffer2 = shortBuffer;
        long l = Integer.toUnsignedLong(shortBuffer2.remaining()) << 1;
        long l2 = MemoryUtil.memAddress(shortBuffer2);
        EXTBufferStorage.nglNamedBufferStorageEXT(n, l, l2, n2);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLbitfield") int n2) {
        IntBuffer intBuffer2 = intBuffer;
        long l = Integer.toUnsignedLong(intBuffer2.remaining()) << 2;
        long l2 = MemoryUtil.memAddress(intBuffer2);
        EXTBufferStorage.nglNamedBufferStorageEXT(n, l, l2, n2);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") FloatBuffer floatBuffer, @NativeType(value="GLbitfield") int n2) {
        FloatBuffer floatBuffer2 = floatBuffer;
        long l = Integer.toUnsignedLong(floatBuffer2.remaining()) << 2;
        long l2 = MemoryUtil.memAddress(floatBuffer2);
        EXTBufferStorage.nglNamedBufferStorageEXT(n, l, l2, n2);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") short[] sArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(sArray.length) << 1, sArray, n2, l);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") int[] nArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(nArray.length) << 2, nArray, n2, l);
    }

    public static void glBufferStorageEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") float[] fArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(fArray.length) << 2, fArray, n2, l);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") short[] sArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glNamedBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(sArray.length) << 1, sArray, n2, l);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") int[] nArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glNamedBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(nArray.length) << 2, nArray, n2, l);
    }

    public static void glNamedBufferStorageEXT(@NativeType(value="GLuint") int n, @NativeType(value="void const *") float[] fArray, @NativeType(value="GLbitfield") int n2) {
        long l = GLES.getICD().glNamedBufferStorageEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPPV(n, Integer.toUnsignedLong(fArray.length) << 2, fArray, n2, l);
    }

    static {
        GLES.initialize();
    }
}

