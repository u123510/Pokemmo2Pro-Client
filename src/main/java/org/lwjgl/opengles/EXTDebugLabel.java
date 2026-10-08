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

public class EXTDebugLabel {
    public static final int GL_BUFFER_OBJECT_EXT = 37201;
    public static final int GL_SHADER_OBJECT_EXT = 35656;
    public static final int GL_PROGRAM_OBJECT_EXT = 35648;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 37204;
    public static final int GL_QUERY_OBJECT_EXT = 37203;
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 35407;

    public EXTDebugLabel() {
        throw new UnsupportedOperationException();
    }

    public static native void nglLabelObjectEXT(int var0, int var1, int var2, long var3);

    public static void glLabelObjectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        int n3 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        EXTDebugLabel.nglLabelObjectEXT(n3, n2, n, l);
    }

    public static void glLabelObjectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = n;
        int n4 = n2;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack2.getPointer();
        try {
            n2 = memoryStack2.nUTF8(charSequence, false);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = memoryStack2.getPointerAddress();
        EXTDebugLabel.nglLabelObjectEXT(n3, n4, n2, l);
        memoryStack.setPointer(n);
    }

    public static native void nglGetObjectLabelEXT(int var0, int var1, int var2, long var3, long var5);

    public static void glGetObjectLabelEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLsizei *") IntBuffer intBuffer, @NativeType(value="GLchar *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        int n3 = n;
        n = byteBuffer.remaining();
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(byteBuffer);
        EXTDebugLabel.nglGetObjectLabelEXT(n3, n2, n, l, l2);
    }

    @NativeType(value="void")
    public static String glGetObjectLabelEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLsizei") int n3) {
        IntBuffer intBuffer;
        MemoryStack memoryStack;
        MemoryStack memoryStack2 = memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack2.getPointer();
        try {
            intBuffer = memoryStack2.ints(0);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        ByteBuffer byteBuffer = memoryStack.malloc(n3);
        IntBuffer intBuffer2 = intBuffer;
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        ByteBuffer byteBuffer2 = byteBuffer;
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(byteBuffer2);
        EXTDebugLabel.nglGetObjectLabelEXT(n5, n6, n7, l, l2);
        String string = MemoryUtil.memUTF8(byteBuffer, intBuffer2.get(0));
        memoryStack.setPointer(n4);
        return string;
    }

    public static void glGetObjectLabelEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLsizei *") int[] nArray, @NativeType(value="GLchar *") ByteBuffer byteBuffer) {
        long l = GLES.getICD().glGetObjectLabelEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        int n3 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l2 = MemoryUtil.memAddress(byteBuffer2);
        JNI.callPPV(n3, n2, n, nArray, l2, l);
    }

    static {
        GLES.initialize();
    }
}

