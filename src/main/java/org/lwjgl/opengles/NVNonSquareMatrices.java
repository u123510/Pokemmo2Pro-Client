/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.FloatBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVNonSquareMatrices {
    public static final int GL_FLOAT_MAT2x3_NV = 35685;
    public static final int GL_FLOAT_MAT2x4_NV = 35686;
    public static final int GL_FLOAT_MAT3x2_NV = 35687;
    public static final int GL_FLOAT_MAT3x4_NV = 35688;
    public static final int GL_FLOAT_MAT4x2_NV = 35689;
    public static final int GL_FLOAT_MAT4x3_NV = 35690;

    public NVNonSquareMatrices() {
        throw new UnsupportedOperationException();
    }

    public static native void nglUniformMatrix2x3fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix2x3fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() / 6;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix2x3fvNV(n2, n, bl, l);
    }

    public static native void nglUniformMatrix3x2fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix3x2fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() / 6;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix3x2fvNV(n2, n, bl, l);
    }

    public static native void nglUniformMatrix2x4fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix2x4fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 3;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix2x4fvNV(n2, n, bl, l);
    }

    public static native void nglUniformMatrix4x2fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix4x2fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() >> 3;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix4x2fvNV(n2, n, bl, l);
    }

    public static native void nglUniformMatrix3x4fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix3x4fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() / 12;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix3x4fvNV(n2, n, bl, l);
    }

    public static native void nglUniformMatrix4x3fvNV(int var0, int var1, boolean var2, long var3);

    public static void glUniformMatrix4x3fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        int n2 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        n = floatBuffer2.remaining() / 12;
        long l = MemoryUtil.memAddress(floatBuffer2);
        NVNonSquareMatrices.nglUniformMatrix4x3fvNV(n2, n, bl, l);
    }

    public static void glUniformMatrix2x3fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix2x3fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length / 6, bl, fArray, l);
    }

    public static void glUniformMatrix3x2fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix3x2fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length / 6, bl, fArray, l);
    }

    public static void glUniformMatrix2x4fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix2x4fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 3, bl, fArray, l);
    }

    public static void glUniformMatrix4x2fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix4x2fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length >> 3, bl, fArray, l);
    }

    public static void glUniformMatrix3x4fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix3x4fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length / 12, bl, fArray, l);
    }

    public static void glUniformMatrix4x3fvNV(@NativeType(value="GLint") int n, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GLES.getICD().glUniformMatrix4x3fvNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, fArray.length / 12, bl, fArray, l);
    }

    static {
        GLES.initialize();
    }
}

