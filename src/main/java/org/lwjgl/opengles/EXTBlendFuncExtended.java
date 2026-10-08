/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.ByteBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTBlendFuncExtended {
    public static final int GL_SRC1_COLOR_EXT = 35065;
    public static final int GL_SRC1_ALPHA_EXT = 34185;
    public static final int GL_ONE_MINUS_SRC1_COLOR_EXT = 35066;
    public static final int GL_ONE_MINUS_SRC1_ALPHA_EXT = 35067;
    public static final int GL_SRC_ALPHA_SATURATE_EXT = 776;
    public static final int GL_LOCATION_INDEX_EXT = 37647;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = 35068;

    public EXTBlendFuncExtended() {
        throw new UnsupportedOperationException();
    }

    public static native void nglBindFragDataLocationIndexedEXT(int var0, int var1, int var2, long var3);

    public static void glBindFragDataLocationIndexedEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTBlendFuncExtended.nglBindFragDataLocationIndexedEXT(n, n2, n3, l);
    }

    public static void glBindFragDataLocationIndexedEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = n;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack2.getPointer();
        try {
            memoryStack2.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = memoryStack2.getPointerAddress();
        EXTBlendFuncExtended.nglBindFragDataLocationIndexedEXT(n4, n2, n3, l);
        memoryStack.setPointer(n);
    }

    public static native int nglGetFragDataIndexEXT(int var0, long var1);

    @NativeType(value="GLint")
    public static int glGetFragDataIndexEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return EXTBlendFuncExtended.nglGetFragDataIndexEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="GLint")
    public static int glGetFragDataIndexEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        int n3 = EXTBlendFuncExtended.nglGetFragDataIndexEXT(n, memoryStack.getPointerAddress());
        memoryStack.setPointer(n2);
        return n3;
    }

    public static native void nglBindFragDataLocationEXT(int var0, int var1, long var2);

    public static void glBindFragDataLocationEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTBlendFuncExtended.nglBindFragDataLocationEXT(n, n2, l);
    }

    public static void glBindFragDataLocationEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = n;
        MemoryStack memoryStack2 = memoryStack;
        n = memoryStack2.getPointer();
        try {
            memoryStack2.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        EXTBlendFuncExtended.nglBindFragDataLocationEXT(n3, n2, memoryStack2.getPointerAddress());
        memoryStack.setPointer(n);
    }

    public static native int nglGetProgramResourceLocationIndexEXT(int var0, int var1, long var2);

    @NativeType(value="GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return EXTBlendFuncExtended.nglGetProgramResourceLocationIndexEXT(n, n2, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLchar const *") CharSequence charSequence) {
        int n3 = n2;
        MemoryStack memoryStack = MemoryStack.stackGet();
        n2 = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        int n4 = EXTBlendFuncExtended.nglGetProgramResourceLocationIndexEXT(n, n3, memoryStack.getPointerAddress());
        memoryStack.setPointer(n2);
        return n4;
    }

    static {
        GLES.initialize();
    }
}

