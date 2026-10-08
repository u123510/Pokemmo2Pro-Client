/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK_NV = 36386;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 36387;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING_NV = 36389;

    public NVTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    public static native void glBindTransformFeedbackNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void nglDeleteTransformFeedbacksNV(int var0, long var1);

    public static void glDeleteTransformFeedbacksNV(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        NVTransformFeedback2.nglDeleteTransformFeedbacksNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteTransformFeedbacksNV(@NativeType(value="GLuint const *") int n) {
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
        NVTransformFeedback2.nglDeleteTransformFeedbacksNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static native void nglGenTransformFeedbacksNV(int var0, long var1);

    public static void glGenTransformFeedbacksNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        NVTransformFeedback2.nglGenTransformFeedbacksNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenTransformFeedbacksNV() {
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
        NVTransformFeedback2.nglGenTransformFeedbacksNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsTransformFeedbackNV(@NativeType(value="GLuint") int var0);

    public static native void glPauseTransformFeedbackNV();

    public static native void glResumeTransformFeedbackNV();

    public static native void glDrawTransformFeedbackNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static void glDeleteTransformFeedbacksNV(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteTransformFeedbacksNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGenTransformFeedbacksNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGenTransformFeedbacksNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    static {
        GL.initialize();
    }
}

