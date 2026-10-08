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

public class EXTSeparateShaderObjects {
    public static final int GL_ACTIVE_PROGRAM_EXT = 35725;

    public EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    public static native void glUseShaderProgramEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glActiveProgramEXT(@NativeType(value="GLuint") int var0);

    public static native int nglCreateShaderProgramEXT(int var0, long var1);

    @NativeType(value="GLuint")
    public static int glCreateShaderProgramEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return EXTSeparateShaderObjects.nglCreateShaderProgramEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="GLuint")
    public static int glCreateShaderProgramEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        int n3 = EXTSeparateShaderObjects.nglCreateShaderProgramEXT(n, memoryStack.getPointerAddress());
        memoryStack.setPointer(n2);
        return n3;
    }

    static {
        GL.initialize();
    }
}

