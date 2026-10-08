/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0;
    public static final int GL_NOP_COMMAND_NV = 1;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 2;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 3;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 4;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 5;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 6;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 7;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 8;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 9;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 10;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 11;
    public static final int GL_STENCIL_REF_COMMAND_NV = 12;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 13;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 14;
    public static final int GL_ALPHA_REF_COMMAND_NV = 15;
    public static final int GL_VIEWPORT_COMMAND_NV = 16;
    public static final int GL_SCISSOR_COMMAND_NV = 17;
    public static final int GL_FRONT_FACE_COMMAND_NV = 18;

    public NVCommandList() {
        throw new UnsupportedOperationException();
    }

    public static native void nglCreateStatesNV(int var0, long var1);

    public static void glCreateStatesNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        NVCommandList.nglCreateStatesNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glCreateStatesNV() {
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
        NVCommandList.nglCreateStatesNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteStatesNV(int var0, long var1);

    public static void glDeleteStatesNV(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        NVCommandList.nglDeleteStatesNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteStatesNV(@NativeType(value="GLuint const *") int n) {
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
        NVCommandList.nglDeleteStatesNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsStateNV(@NativeType(value="GLuint") int var0);

    public static native void glStateCaptureNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    @NativeType(value="GLuint")
    public static native int glGetCommandHeaderNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    @NativeType(value="GLushort")
    public static native short glGetStageIndexNV(@NativeType(value="GLenum") int var0);

    public static native void nglDrawCommandsNV(int var0, int var1, long var2, long var4, int var6);

    public static void glDrawCommandsNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr const *") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, pointerBuffer.remaining());
        }
        int n3 = n;
        long l = MemoryUtil.memAddress(pointerBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer);
        n = pointerBuffer.remaining();
        NVCommandList.nglDrawCommandsNV(n3, n2, l, l2, n);
    }

    public static native void nglDrawCommandsAddressNV(int var0, long var1, long var3, int var5);

    public static void glDrawCommandsAddressNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint64 const *") LongBuffer longBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, longBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(longBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer);
        int n2 = longBuffer.remaining();
        NVCommandList.nglDrawCommandsAddressNV(n, l, l2, n2);
    }

    public static native void nglDrawCommandsStatesNV(int var0, long var1, long var3, long var5, long var7, int var9);

    public static void glDrawCommandsStatesNV(@NativeType(value="GLuint") int n, @NativeType(value="GLintptr const *") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLuint const *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, pointerBuffer.remaining());
            Checks.check((Buffer)intBuffer2, pointerBuffer.remaining());
            Checks.check((Buffer)intBuffer3, pointerBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(pointerBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        long l4 = MemoryUtil.memAddress(intBuffer3);
        int n2 = pointerBuffer.remaining();
        NVCommandList.nglDrawCommandsStatesNV(n, l, l2, l3, l4, n2);
    }

    public static native void nglDrawCommandsStatesAddressNV(long var0, long var2, long var4, long var6, int var8);

    public static void glDrawCommandsStatesAddressNV(@NativeType(value="GLuint64 const *") LongBuffer longBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLuint const *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, longBuffer.remaining());
            Checks.check((Buffer)intBuffer2, longBuffer.remaining());
            Checks.check((Buffer)intBuffer3, longBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        int n = longBuffer.remaining();
        NVCommandList.nglDrawCommandsStatesAddressNV(MemoryUtil.memAddress(longBuffer), l, l2, l3, n);
    }

    public static native void nglCreateCommandListsNV(int var0, long var1);

    public static void glCreateCommandListsNV(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        NVCommandList.nglCreateCommandListsNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glCreateCommandListsNV() {
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
        NVCommandList.nglCreateCommandListsNV(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteCommandListsNV(int var0, long var1);

    public static void glDeleteCommandListsNV(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        NVCommandList.nglDeleteCommandListsNV(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteCommandListsNV(@NativeType(value="GLuint const *") int n) {
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
        NVCommandList.nglDeleteCommandListsNV(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsCommandListNV(@NativeType(value="GLuint") int var0);

    public static native void nglListDrawCommandsStatesClientNV(int var0, int var1, long var2, long var4, long var6, long var8, int var10);

    public static void glListDrawCommandsStatesClientNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="void const **") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer, @NativeType(value="GLuint const *") IntBuffer intBuffer2, @NativeType(value="GLuint const *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, pointerBuffer.remaining());
            Checks.check((Buffer)intBuffer2, pointerBuffer.remaining());
            Checks.check((Buffer)intBuffer3, pointerBuffer.remaining());
        }
        int n3 = n;
        long l = MemoryUtil.memAddress(pointerBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        long l4 = MemoryUtil.memAddress(intBuffer3);
        n = pointerBuffer.remaining();
        NVCommandList.nglListDrawCommandsStatesClientNV(n3, n2, l, l2, l3, l4, n);
    }

    public static native void glCommandListSegmentsNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    public static native void glCompileCommandListNV(@NativeType(value="GLuint") int var0);

    public static native void glCallCommandListNV(@NativeType(value="GLuint") int var0);

    public static void glCreateStatesNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glCreateStatesNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteStatesNV(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteStatesNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDrawCommandsNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr const *") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") int[] nArray) {
        long l = GL.getICD().glDrawCommandsNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, pointerBuffer.remaining());
        }
        int n3 = n;
        PointerBuffer pointerBuffer2 = pointerBuffer;
        long l2 = MemoryUtil.memAddress(pointerBuffer2);
        n = pointerBuffer2.remaining();
        JNI.callPPV(n3, n2, l2, nArray, n, l);
    }

    public static void glDrawCommandsAddressNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint64 const *") long[] lArray, @NativeType(value="GLsizei const *") int[] nArray) {
        long l = GL.getICD().glDrawCommandsAddressNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, lArray.length);
        }
        int n2 = n;
        n = lArray.length;
        JNI.callPPV(n2, lArray, nArray, n, l);
    }

    public static void glDrawCommandsStatesNV(@NativeType(value="GLuint") int n, @NativeType(value="GLintptr const *") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLuint const *") int[] nArray3) {
        long l = GL.getICD().glDrawCommandsStatesNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, pointerBuffer.remaining());
            Checks.check(nArray2, pointerBuffer.remaining());
            Checks.check(nArray3, pointerBuffer.remaining());
        }
        PointerBuffer pointerBuffer2 = pointerBuffer;
        long l2 = MemoryUtil.memAddress(pointerBuffer2);
        int n2 = pointerBuffer2.remaining();
        JNI.callPPPPV(n, l2, nArray, nArray2, nArray3, n2, l);
    }

    public static void glDrawCommandsStatesAddressNV(@NativeType(value="GLuint64 const *") long[] lArray, @NativeType(value="GLsizei const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLuint const *") int[] nArray3) {
        long l = GL.getICD().glDrawCommandsStatesAddressNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, lArray.length);
            Checks.check(nArray2, lArray.length);
            Checks.check(nArray3, lArray.length);
        }
        int n = lArray.length;
        JNI.callPPPPV(lArray, nArray, nArray2, nArray3, n, l);
    }

    public static void glCreateCommandListsNV(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glCreateCommandListsNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteCommandListsNV(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteCommandListsNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glListDrawCommandsStatesClientNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="void const **") PointerBuffer pointerBuffer, @NativeType(value="GLsizei const *") int[] nArray, @NativeType(value="GLuint const *") int[] nArray2, @NativeType(value="GLuint const *") int[] nArray3) {
        long l = GL.getICD().glListDrawCommandsStatesClientNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, pointerBuffer.remaining());
            Checks.check(nArray2, pointerBuffer.remaining());
            Checks.check(nArray3, pointerBuffer.remaining());
        }
        int n3 = n;
        PointerBuffer pointerBuffer2 = pointerBuffer;
        long l2 = MemoryUtil.memAddress(pointerBuffer2);
        n = pointerBuffer2.remaining();
        JNI.callPPPPV(n3, n2, l2, nArray, nArray2, nArray3, n, l);
    }

    static {
        GL.initialize();
    }
}

