/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDiscardFramebuffer {
    public static final int GL_COLOR_EXT = 6144;
    public static final int GL_DEPTH_EXT = 6145;
    public static final int GL_STENCIL_EXT = 6146;

    public EXTDiscardFramebuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void nglDiscardFramebufferEXT(int var0, int var1, long var2);

    public static void glDiscardFramebufferEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTDiscardFramebuffer.nglDiscardFramebufferEXT(n2, n, l);
    }

    public static void glDiscardFramebufferEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum const *") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = n;
        n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.ints(n2);
            n2 = 1;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTDiscardFramebuffer.nglDiscardFramebufferEXT(n3, n2, l);
        memoryStack.setPointer(n);
    }

    public static void glDiscardFramebufferEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum const *") int[] nArray) {
        long l = GLES.getICD().glDiscardFramebufferEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

