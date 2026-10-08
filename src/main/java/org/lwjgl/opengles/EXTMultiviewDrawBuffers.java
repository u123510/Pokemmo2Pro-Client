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

public class EXTMultiviewDrawBuffers {
    public static final int GL_COLOR_ATTACHMENT_EXT = 37104;
    public static final int GL_MULTIVIEW_EXT = 37105;
    public static final int GL_DRAW_BUFFER_EXT = 3073;
    public static final int GL_READ_BUFFER_EXT = 3074;
    public static final int GL_MAX_MULTIVIEW_BUFFERS_EXT = 37106;

    public EXTMultiviewDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    public static native void glReadBufferIndexedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1);

    public static native void nglDrawBuffersIndexedEXT(int var0, long var1, long var3);

    public static void glDrawBuffersIndexedEXT(@NativeType(value="GLenum const *") IntBuffer intBuffer, @NativeType(value="GLint const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        EXTMultiviewDrawBuffers.nglDrawBuffersIndexedEXT(intBuffer.remaining(), l, l2);
    }

    public static native void nglGetIntegeri_vEXT(int var0, int var1, long var2);

    public static void glGetIntegeri_vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTMultiviewDrawBuffers.nglGetIntegeri_vEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetIntegeriEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
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
        EXTMultiviewDrawBuffers.nglGetIntegeri_vEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static void glDrawBuffersIndexedEXT(@NativeType(value="GLenum const *") int[] nArray, @NativeType(value="GLint const *") int[] nArray2) {
        long l = GLES.getICD().glDrawBuffersIndexedEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray2, nArray.length);
        }
        JNI.callPPV(nArray.length, nArray, nArray2, l);
    }

    public static void glGetIntegeri_vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetIntegeri_vEXT;
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

