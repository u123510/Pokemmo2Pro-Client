/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import org.lwjgl.opengl.ARBVertexAttrib64Bit;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTVertexAttrib64bit {
    public static final int GL_DOUBLE_VEC2_EXT = 36860;
    public static final int GL_DOUBLE_VEC3_EXT = 36861;
    public static final int GL_DOUBLE_VEC4_EXT = 36862;
    public static final int GL_DOUBLE_MAT2_EXT = 36678;
    public static final int GL_DOUBLE_MAT3_EXT = 36679;
    public static final int GL_DOUBLE_MAT4_EXT = 36680;
    public static final int GL_DOUBLE_MAT2x3_EXT = 36681;
    public static final int GL_DOUBLE_MAT2x4_EXT = 36682;
    public static final int GL_DOUBLE_MAT3x2_EXT = 36683;
    public static final int GL_DOUBLE_MAT3x4_EXT = 36684;
    public static final int GL_DOUBLE_MAT4x2_EXT = 36685;
    public static final int GL_DOUBLE_MAT4x3_EXT = 36686;

    public EXTVertexAttrib64bit() {
        throw new UnsupportedOperationException();
    }

    public static native void glVertexAttribL1dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLdouble") double var1);

    public static native void glVertexAttribL2dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLdouble") double var1, @NativeType(value="GLdouble") double var3);

    public static native void glVertexAttribL3dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLdouble") double var1, @NativeType(value="GLdouble") double var3, @NativeType(value="GLdouble") double var5);

    public static native void glVertexAttribL4dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLdouble") double var1, @NativeType(value="GLdouble") double var3, @NativeType(value="GLdouble") double var5, @NativeType(value="GLdouble") double var7);

    public static native void nglVertexAttribL1dvEXT(int var0, long var1);

    public static void glVertexAttribL1dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        EXTVertexAttrib64bit.nglVertexAttribL1dvEXT(n, MemoryUtil.memAddress(doubleBuffer));
    }

    public static native void nglVertexAttribL2dvEXT(int var0, long var1);

    public static void glVertexAttribL2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 2);
        }
        EXTVertexAttrib64bit.nglVertexAttribL2dvEXT(n, MemoryUtil.memAddress(doubleBuffer));
    }

    public static native void nglVertexAttribL3dvEXT(int var0, long var1);

    public static void glVertexAttribL3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 3);
        }
        EXTVertexAttrib64bit.nglVertexAttribL3dvEXT(n, MemoryUtil.memAddress(doubleBuffer));
    }

    public static native void nglVertexAttribL4dvEXT(int var0, long var1);

    public static void glVertexAttribL4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 4);
        }
        EXTVertexAttrib64bit.nglVertexAttribL4dvEXT(n, MemoryUtil.memAddress(doubleBuffer));
    }

    public static native void nglVertexAttribLPointerEXT(int var0, int var1, int var2, int var3, long var4);

    public static void glVertexAttribLPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTVertexAttrib64bit.nglVertexAttribLPointerEXT(n, n2, n3, n4, l);
    }

    public static void glVertexAttribLPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") long l) {
        EXTVertexAttrib64bit.nglVertexAttribLPointerEXT(n, n2, n3, n4, l);
    }

    public static void glVertexAttribLPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="void const *") DoubleBuffer doubleBuffer) {
        long l = MemoryUtil.memAddress(doubleBuffer);
        EXTVertexAttrib64bit.nglVertexAttribLPointerEXT(n, n2, 5130, n3, l);
    }

    public static native void nglGetVertexAttribLdvEXT(int var0, int var1, long var2);

    public static void glGetVertexAttribLdvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLdouble *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 4);
        }
        long l = MemoryUtil.memAddress(doubleBuffer);
        EXTVertexAttrib64bit.nglGetVertexAttribLdvEXT(n, n2, l);
    }

    public static void glVertexArrayVertexAttribLOffsetEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLint") int n4, @NativeType(value="GLenum") int n5, @NativeType(value="GLsizei") int n6, @NativeType(value="GLintptr") long l) {
        ARBVertexAttrib64Bit.glVertexArrayVertexAttribLOffsetEXT(n, n2, n3, n4, n5, n6, l);
    }

    public static void glVertexAttribL1dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glVertexAttribL1dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.callPV(n, dArray, l);
    }

    public static void glVertexAttribL2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glVertexAttribL2dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 2);
        }
        JNI.callPV(n, dArray, l);
    }

    public static void glVertexAttribL3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glVertexAttribL3dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 3);
        }
        JNI.callPV(n, dArray, l);
    }

    public static void glVertexAttribL4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glVertexAttribL4dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 4);
        }
        JNI.callPV(n, dArray, l);
    }

    public static void glGetVertexAttribLdvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLdouble *") double[] dArray) {
        long l = GL.getICD().glGetVertexAttribLdvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 4);
        }
        JNI.callPV(n, n2, dArray, l);
    }

    static {
        GL.initialize();
    }
}

