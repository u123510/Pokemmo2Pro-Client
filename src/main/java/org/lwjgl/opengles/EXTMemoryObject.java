/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTMemoryObject {
    public static final int GL_TEXTURE_TILING_EXT = 38272;
    public static final int GL_DEDICATED_MEMORY_OBJECT_EXT = 38273;
    public static final int GL_PROTECTED_MEMORY_OBJECT_EXT = 38299;
    public static final int GL_NUM_TILING_TYPES_EXT = 38274;
    public static final int GL_TILING_TYPES_EXT = 38275;
    public static final int GL_OPTIMAL_TILING_EXT = 38276;
    public static final int GL_LINEAR_TILING_EXT = 38277;
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 38294;
    public static final int GL_DEVICE_UUID_EXT = 38295;
    public static final int GL_DRIVER_UUID_EXT = 38296;
    public static final int GL_UUID_SIZE_EXT = 16;

    public EXTMemoryObject() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGetUnsignedBytevEXT(int var0, long var1);

    public static void glGetUnsignedBytevEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLubyte *") ByteBuffer byteBuffer) {
        EXTMemoryObject.nglGetUnsignedBytevEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    public static native void nglGetUnsignedBytei_vEXT(int var0, int var1, long var2);

    public static void glGetUnsignedBytei_vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLubyte *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTMemoryObject.nglGetUnsignedBytei_vEXT(n, n2, l);
    }

    public static native void nglDeleteMemoryObjectsEXT(int var0, long var1);

    public static void glDeleteMemoryObjectsEXT(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        EXTMemoryObject.nglDeleteMemoryObjectsEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteMemoryObjectsEXT(@NativeType(value="GLuint const *") int n) {
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
        EXTMemoryObject.nglDeleteMemoryObjectsEXT(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsMemoryObjectEXT(@NativeType(value="GLuint") int var0);

    public static native void nglCreateMemoryObjectsEXT(int var0, long var1);

    public static void glCreateMemoryObjectsEXT(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        EXTMemoryObject.nglCreateMemoryObjectsEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glCreateMemoryObjectsEXT() {
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
        EXTMemoryObject.nglCreateMemoryObjectsEXT(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglMemoryObjectParameterivEXT(int var0, int var1, long var2);

    public static void glMemoryObjectParameterivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTMemoryObject.nglMemoryObjectParameterivEXT(n, n2, l);
    }

    public static void glMemoryObjectParameteriEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int n3) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        n = memoryStack.getPointer();
        try {
            EXTMemoryObject.nglMemoryObjectParameterivEXT(n4, n2, MemoryUtil.memAddress(memoryStack.ints(n3)));
            memoryStack.setPointer(n);
            return;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
    }

    public static native void nglGetMemoryObjectParameterivEXT(int var0, int var1, long var2);

    public static void glGetMemoryObjectParameterivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTMemoryObject.nglGetMemoryObjectParameterivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetMemoryObjectParameteriEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        EXTMemoryObject.nglGetMemoryObjectParameterivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void glTexStorageMem2DEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint64") long var6);

    public static native void glTexStorageMem2DMultisampleEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLboolean") boolean var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint64") long var7);

    public static native void glTexStorageMem3DEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint64") long var7);

    public static native void glTexStorageMem3DMultisampleEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6, @NativeType(value="GLuint") int var7, @NativeType(value="GLuint64") long var8);

    public static native void glBufferStorageMemEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizeiptr") long var1, @NativeType(value="GLuint") int var3, @NativeType(value="GLuint64") long var4);

    public static native void glTextureStorageMem2DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint64") long var6);

    public static native void glTextureStorageMem2DMultisampleEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLboolean") boolean var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint64") long var7);

    public static native void glTextureStorageMem3DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint64") long var7);

    public static native void glTextureStorageMem3DMultisampleEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6, @NativeType(value="GLuint") int var7, @NativeType(value="GLuint64") long var8);

    public static native void glNamedBufferStorageMemEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLsizeiptr") long var1, @NativeType(value="GLuint") int var3, @NativeType(value="GLuint64") long var4);

    public static void glDeleteMemoryObjectsEXT(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glDeleteMemoryObjectsEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glCreateMemoryObjectsEXT(@NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glCreateMemoryObjectsEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glMemoryObjectParameterivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GLES.getICD().glMemoryObjectParameterivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetMemoryObjectParameterivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetMemoryObjectParameterivEXT;
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

