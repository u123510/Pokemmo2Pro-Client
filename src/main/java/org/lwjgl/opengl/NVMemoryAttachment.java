/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVMemoryAttachment {
    public static final int GL_ATTACHED_MEMORY_OBJECT_NV = 38308;
    public static final int GL_ATTACHED_MEMORY_OFFSET_NV = 38309;
    public static final int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 38310;
    public static final int GL_MEMORY_ATTACHABLE_SIZE_NV = 38311;
    public static final int GL_MEMORY_ATTACHABLE_NV = 38312;
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 38313;
    public static final int GL_DETACHED_TEXTURES_NV = 38314;
    public static final int GL_DETACHED_BUFFERS_NV = 38315;
    public static final int GL_MAX_DETACHED_TEXTURES_NV = 38316;
    public static final int GL_MAX_DETACHED_BUFFERS_NV = 38317;

    public NVMemoryAttachment() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGetMemoryObjectDetachedResourcesuivNV(int var0, int var1, int var2, int var3, long var4);

    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        int n4 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        NVMemoryAttachment.nglGetMemoryObjectDetachedResourcesuivNV(n4, n2, n3, n, l);
    }

    public static native void glResetMemoryObjectParameterNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void glTexAttachMemoryNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint64") long var2);

    public static native void glBufferAttachMemoryNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint64") long var2);

    public static native void glTextureAttachMemoryNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint64") long var2);

    public static native void glNamedBufferAttachMemoryNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint64") long var2);

    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGetMemoryObjectDetachedResourcesuivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n4 = n;
        n = nArray.length;
        JNI.callPV(n4, n2, n3, n, nArray, l);
    }

    static {
        GL.initialize();
    }
}

