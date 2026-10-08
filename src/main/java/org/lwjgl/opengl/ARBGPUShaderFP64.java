/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL40C;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class ARBGPUShaderFP64 {
    public static final int GL_DOUBLE_VEC2 = 36860;
    public static final int GL_DOUBLE_VEC3 = 36861;
    public static final int GL_DOUBLE_VEC4 = 36862;
    public static final int GL_DOUBLE_MAT2 = 36678;
    public static final int GL_DOUBLE_MAT3 = 36679;
    public static final int GL_DOUBLE_MAT4 = 36680;
    public static final int GL_DOUBLE_MAT2x3 = 36681;
    public static final int GL_DOUBLE_MAT2x4 = 36682;
    public static final int GL_DOUBLE_MAT3x2 = 36683;
    public static final int GL_DOUBLE_MAT3x4 = 36684;
    public static final int GL_DOUBLE_MAT4x2 = 36685;
    public static final int GL_DOUBLE_MAT4x3 = 36686;

    public ARBGPUShaderFP64() {
        throw new UnsupportedOperationException();
    }

    public static void glUniform1d(@NativeType(value="GLint") int n, @NativeType(value="GLdouble") double d) {
        GL40C.glUniform1d(n, d);
    }

    public static void glUniform2d(@NativeType(value="GLint") int n, @NativeType(value="GLdouble") double d, @NativeType(value="GLdouble") double d2) {
        GL40C.glUniform2d(n, d, d2);
    }

    public static void glUniform3d(@NativeType(value="GLint") int n, @NativeType(value="GLdouble") double d, @NativeType(value="GLdouble") double d2, @NativeType(value="GLdouble") double d4) {
        GL40C.glUniform3d(n, d, d2, d4);
    }

    public static void glUniform4d(@NativeType(value="GLint") int n, @NativeType(value="GLdouble") double d, @NativeType(value="GLdouble") double d2, @NativeType(value="GLdouble") double d4, @NativeType(value="GLdouble") double d5) {
        GL40C.glUniform4d(n, d, d2, d4, d5);
    }

    public static void nglUniform1dv(int n, int n2, long l) {
        GL40C.nglUniform1dv(n, n2, l);
    }

    public static void glUniform1dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniform1dv(n, doubleBuffer);
    }

    public static void nglUniform2dv(int n, int n2, long l) {
        GL40C.nglUniform2dv(n, n2, l);
    }

    public static void glUniform2dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniform2dv(n, doubleBuffer);
    }

    public static void nglUniform3dv(int n, int n2, long l) {
        GL40C.nglUniform3dv(n, n2, l);
    }

    public static void glUniform3dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniform3dv(n, doubleBuffer);
    }

    public static void nglUniform4dv(int n, int n2, long l) {
        GL40C.nglUniform4dv(n, n2, l);
    }

    public static void glUniform4dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniform4dv(n, doubleBuffer);
    }

    public static void nglUniformMatrix2dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix2dv(n, n2, bl, l);
    }

    public static void glUniformMatrix2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix2dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix3dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix3dv(n, n2, bl, l);
    }

    public static void glUniformMatrix3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix3dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix4dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix4dv(n, n2, bl, l);
    }

    public static void glUniformMatrix4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix4dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix2x3dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix2x3dv(n, n2, bl, l);
    }

    public static void glUniformMatrix2x3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix2x3dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix2x4dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix2x4dv(n, n2, bl, l);
    }

    public static void glUniformMatrix2x4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix2x4dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix3x2dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix3x2dv(n, n2, bl, l);
    }

    public static void glUniformMatrix3x2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix3x2dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix3x4dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix3x4dv(n, n2, bl, l);
    }

    public static void glUniformMatrix3x4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix3x4dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix4x2dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix4x2dv(n, n2, bl, l);
    }

    public static void glUniformMatrix4x2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix4x2dv(n, bl, doubleBuffer);
    }

    public static void nglUniformMatrix4x3dv(int n, int n2, boolean bl, long l) {
        GL40C.nglUniformMatrix4x3dv(n, n2, bl, l);
    }

    public static void glUniformMatrix4x3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        GL40C.glUniformMatrix4x3dv(n, bl, doubleBuffer);
    }

    public static void nglGetUniformdv(int n, int n2, long l) {
        GL40C.nglGetUniformdv(n, n2, l);
    }

    public static void glGetUniformdv(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble *") DoubleBuffer doubleBuffer) {
        GL40C.glGetUniformdv(n, n2, doubleBuffer);
    }

    @NativeType(value="void")
    public static double glGetUniformd(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        return GL40C.glGetUniformd(n, n2);
    }

    public static native void glProgramUniform1dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLdouble") double var2);

    public static native void glProgramUniform2dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLdouble") double var2, @NativeType(value="GLdouble") double var4);

    public static native void glProgramUniform3dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLdouble") double var2, @NativeType(value="GLdouble") double var4, @NativeType(value="GLdouble") double var6);

    public static native void glProgramUniform4dEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLdouble") double var2, @NativeType(value="GLdouble") double var4, @NativeType(value="GLdouble") double var6, @NativeType(value="GLdouble") double var8);

    public static native void nglProgramUniform1dvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramUniform1dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining();
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniform1dvEXT(n3, n2, n, l);
    }

    public static native void nglProgramUniform2dvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramUniform2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniform2dvEXT(n3, n2, n, l);
    }

    public static native void nglProgramUniform3dvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramUniform3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniform3dvEXT(n3, n2, n, l);
    }

    public static native void nglProgramUniform4dvEXT(int var0, int var1, int var2, long var3);

    public static void glProgramUniform4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniform4dvEXT(n3, n2, n, l);
    }

    public static native void nglProgramUniformMatrix2dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix2dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix3dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 9;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix3dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix4dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 4;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix4dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix2x3dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix2x3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 6;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix2x3dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix2x4dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix2x4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 3;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix2x4dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix3x2dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix3x2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 6;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix3x2dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix3x4dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix3x4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 12;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix3x4dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix4x2dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix4x2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() >> 3;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix4x2dvEXT(n3, n2, n, bl, l);
    }

    public static native void nglProgramUniformMatrix4x3dvEXT(int var0, int var1, int var2, boolean var3, long var4);

    public static void glProgramUniformMatrix4x3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") DoubleBuffer doubleBuffer) {
        int n3 = n;
        DoubleBuffer doubleBuffer2 = doubleBuffer;
        n = doubleBuffer2.remaining() / 12;
        long l = MemoryUtil.memAddress(doubleBuffer2);
        ARBGPUShaderFP64.nglProgramUniformMatrix4x3dvEXT(n3, n2, n, bl, l);
    }

    public static void glUniform1dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniform1dv(n, dArray);
    }

    public static void glUniform2dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniform2dv(n, dArray);
    }

    public static void glUniform3dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniform3dv(n, dArray);
    }

    public static void glUniform4dv(@NativeType(value="GLint") int n, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniform4dv(n, dArray);
    }

    public static void glUniformMatrix2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix2dv(n, bl, dArray);
    }

    public static void glUniformMatrix3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix3dv(n, bl, dArray);
    }

    public static void glUniformMatrix4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix4dv(n, bl, dArray);
    }

    public static void glUniformMatrix2x3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix2x3dv(n, bl, dArray);
    }

    public static void glUniformMatrix2x4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix2x4dv(n, bl, dArray);
    }

    public static void glUniformMatrix3x2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix3x2dv(n, bl, dArray);
    }

    public static void glUniformMatrix3x4dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix3x4dv(n, bl, dArray);
    }

    public static void glUniformMatrix4x2dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix4x2dv(n, bl, dArray);
    }

    public static void glUniformMatrix4x3dv(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        GL40C.glUniformMatrix4x3dv(n, bl, dArray);
    }

    public static void glGetUniformdv(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble *") double[] dArray) {
        GL40C.glGetUniformdv(n, n2, dArray);
    }

    public static void glProgramUniform1dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniform1dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length, dArray, l);
    }

    public static void glProgramUniform2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniform2dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 1, dArray, l);
    }

    public static void glProgramUniform3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniform3dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 3, dArray, l);
    }

    public static void glProgramUniform4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniform4dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 2, dArray, l);
    }

    public static void glProgramUniformMatrix2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix2dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 2, bl, dArray, l);
    }

    public static void glProgramUniformMatrix3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix3dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 9, bl, dArray, l);
    }

    public static void glProgramUniformMatrix4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix4dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 4, bl, dArray, l);
    }

    public static void glProgramUniformMatrix2x3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix2x3dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 6, bl, dArray, l);
    }

    public static void glProgramUniformMatrix2x4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix2x4dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 3, bl, dArray, l);
    }

    public static void glProgramUniformMatrix3x2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix3x2dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 6, bl, dArray, l);
    }

    public static void glProgramUniformMatrix3x4dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix3x4dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 12, bl, dArray, l);
    }

    public static void glProgramUniformMatrix4x2dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix4x2dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length >> 3, bl, dArray, l);
    }

    public static void glProgramUniformMatrix4x3dvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLdouble const *") double[] dArray) {
        long l = GL.getICD().glProgramUniformMatrix4x3dvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, dArray.length / 12, bl, dArray, l);
    }

    static {
        GL.initialize();
    }
}

