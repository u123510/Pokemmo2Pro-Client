/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVDrawVulkanImage {
    public NVDrawVulkanImage() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawVkImageNV(@NativeType(value="GLuint64") long var0, @NativeType(value="GLuint") int var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4, @NativeType(value="GLfloat") float var5, @NativeType(value="GLfloat") float var6, @NativeType(value="GLfloat") float var7, @NativeType(value="GLfloat") float var8, @NativeType(value="GLfloat") float var9, @NativeType(value="GLfloat") float var10, @NativeType(value="GLfloat") float var11);

    public static native long nglGetVkProcAddrNV(long var0);

    @NativeType(value="VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return NVDrawVulkanImage.nglGetVkProcAddrNV(MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="VULKANPROCNV")
    public static long glGetVkProcAddrNV(@NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = NVDrawVulkanImage.nglGetVkProcAddrNV(memoryStack.getPointerAddress());
        memoryStack.setPointer(n);
        return l;
    }

    public static native void glWaitVkSemaphoreNV(@NativeType(value="GLuint64") long var0);

    public static native void glSignalVkSemaphoreNV(@NativeType(value="GLuint64") long var0);

    public static native void glSignalVkFenceNV(@NativeType(value="GLuint64") long var0);

    static {
        GL.initialize();
    }
}

