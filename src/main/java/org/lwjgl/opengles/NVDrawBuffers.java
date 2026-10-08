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

public class NVDrawBuffers {
    public static final int GL_MAX_DRAW_BUFFERS_NV = 34852;
    public static final int GL_DRAW_BUFFER0_NV = 34853;
    public static final int GL_DRAW_BUFFER1_NV = 34854;
    public static final int GL_DRAW_BUFFER2_NV = 34855;
    public static final int GL_DRAW_BUFFER3_NV = 34856;
    public static final int GL_DRAW_BUFFER4_NV = 34857;
    public static final int GL_DRAW_BUFFER5_NV = 34858;
    public static final int GL_DRAW_BUFFER6_NV = 34859;
    public static final int GL_DRAW_BUFFER7_NV = 34860;
    public static final int GL_DRAW_BUFFER8_NV = 34861;
    public static final int GL_DRAW_BUFFER9_NV = 34862;
    public static final int GL_DRAW_BUFFER10_NV = 34863;
    public static final int GL_DRAW_BUFFER11_NV = 34864;
    public static final int GL_DRAW_BUFFER12_NV = 34865;
    public static final int GL_DRAW_BUFFER13_NV = 34866;
    public static final int GL_DRAW_BUFFER14_NV = 34867;
    public static final int GL_DRAW_BUFFER15_NV = 34868;
    public static final int GL_COLOR_ATTACHMENT0_NV = 36064;
    public static final int GL_COLOR_ATTACHMENT1_NV = 36065;
    public static final int GL_COLOR_ATTACHMENT2_NV = 36066;
    public static final int GL_COLOR_ATTACHMENT3_NV = 36067;
    public static final int GL_COLOR_ATTACHMENT4_NV = 36068;
    public static final int GL_COLOR_ATTACHMENT5_NV = 36069;
    public static final int GL_COLOR_ATTACHMENT6_NV = 36070;
    public static final int GL_COLOR_ATTACHMENT7_NV = 36071;
    public static final int GL_COLOR_ATTACHMENT8_NV = 36072;
    public static final int GL_COLOR_ATTACHMENT9_NV = 36073;
    public static final int GL_COLOR_ATTACHMENT10_NV = 36074;
    public static final int GL_COLOR_ATTACHMENT11_NV = 36075;
    public static final int GL_COLOR_ATTACHMENT12_NV = 36076;
    public static final int GL_COLOR_ATTACHMENT13_NV = 36077;
    public static final int GL_COLOR_ATTACHMENT14_NV = 36078;
    public static final int GL_COLOR_ATTACHMENT15_NV = 36079;

    public NVDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    public static native void nglDrawBuffersNV(int var0, long var1);

    public static void glDrawBuffersNV(@NativeType(value="GLenum const *") IntBuffer intBuffer) {
        NVDrawBuffers.nglDrawBuffersNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDrawBuffersNV(@NativeType(value="GLenum const *") int n) {
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
        NVDrawBuffers.nglDrawBuffersNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static void glDrawBuffersNV(@NativeType(value="GLenum const *") int[] nArray) {
        long l = GLES.getICD().glDrawBuffersNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

