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

public class EXTDrawBuffers {
    public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = 36063;
    public static final int GL_MAX_DRAW_BUFFERS_EXT = 34852;
    public static final int GL_DRAW_BUFFER0_EXT = 34853;
    public static final int GL_DRAW_BUFFER1_EXT = 34854;
    public static final int GL_DRAW_BUFFER2_EXT = 34855;
    public static final int GL_DRAW_BUFFER3_EXT = 34856;
    public static final int GL_DRAW_BUFFER4_EXT = 34857;
    public static final int GL_DRAW_BUFFER5_EXT = 34858;
    public static final int GL_DRAW_BUFFER6_EXT = 34859;
    public static final int GL_DRAW_BUFFER7_EXT = 34860;
    public static final int GL_DRAW_BUFFER8_EXT = 34861;
    public static final int GL_DRAW_BUFFER9_EXT = 34862;
    public static final int GL_DRAW_BUFFER10_EXT = 34863;
    public static final int GL_DRAW_BUFFER11_EXT = 34864;
    public static final int GL_DRAW_BUFFER12_EXT = 34865;
    public static final int GL_DRAW_BUFFER13_EXT = 34866;
    public static final int GL_DRAW_BUFFER14_EXT = 34867;
    public static final int GL_DRAW_BUFFER15_EXT = 34868;
    public static final int GL_COLOR_ATTACHMENT0_EXT = 36064;
    public static final int GL_COLOR_ATTACHMENT1_EXT = 36065;
    public static final int GL_COLOR_ATTACHMENT2_EXT = 36066;
    public static final int GL_COLOR_ATTACHMENT3_EXT = 36067;
    public static final int GL_COLOR_ATTACHMENT4_EXT = 36068;
    public static final int GL_COLOR_ATTACHMENT5_EXT = 36069;
    public static final int GL_COLOR_ATTACHMENT6_EXT = 36070;
    public static final int GL_COLOR_ATTACHMENT7_EXT = 36071;
    public static final int GL_COLOR_ATTACHMENT8_EXT = 36072;
    public static final int GL_COLOR_ATTACHMENT9_EXT = 36073;
    public static final int GL_COLOR_ATTACHMENT10_EXT = 36074;
    public static final int GL_COLOR_ATTACHMENT11_EXT = 36075;
    public static final int GL_COLOR_ATTACHMENT12_EXT = 36076;
    public static final int GL_COLOR_ATTACHMENT13_EXT = 36077;
    public static final int GL_COLOR_ATTACHMENT14_EXT = 36078;
    public static final int GL_COLOR_ATTACHMENT15_EXT = 36079;

    public EXTDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    public static native void nglDrawBuffersEXT(int var0, long var1);

    public static void glDrawBuffersEXT(@NativeType(value="GLenum const *") IntBuffer intBuffer) {
        EXTDrawBuffers.nglDrawBuffersEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDrawBuffersEXT(@NativeType(value="GLenum const *") int n) {
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
        EXTDrawBuffers.nglDrawBuffersEXT(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static void glDrawBuffersEXT(@NativeType(value="GLenum const *") int[] nArray) {
        long l = GLES.getICD().glDrawBuffersEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

