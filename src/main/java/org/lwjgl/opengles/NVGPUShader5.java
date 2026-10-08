/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVGPUShader5 {
    public static final int GL_INT64_NV = 5134;
    public static final int GL_UNSIGNED_INT64_NV = 5135;
    public static final int GL_INT8_NV = 36832;
    public static final int GL_INT8_VEC2_NV = 36833;
    public static final int GL_INT8_VEC3_NV = 36834;
    public static final int GL_INT8_VEC4_NV = 36835;
    public static final int GL_INT16_NV = 36836;
    public static final int GL_INT16_VEC2_NV = 36837;
    public static final int GL_INT16_VEC3_NV = 36838;
    public static final int GL_INT16_VEC4_NV = 36839;
    public static final int GL_INT64_VEC2_NV = 36841;
    public static final int GL_INT64_VEC3_NV = 36842;
    public static final int GL_INT64_VEC4_NV = 36843;
    public static final int GL_UNSIGNED_INT8_NV = 36844;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 36845;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 36846;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 36847;
    public static final int GL_UNSIGNED_INT16_NV = 36848;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 36849;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 36850;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 36851;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 36853;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 36854;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 36855;
    public static final int GL_FLOAT16_NV = 36856;
    public static final int GL_FLOAT16_VEC2_NV = 36857;
    public static final int GL_FLOAT16_VEC3_NV = 36858;
    public static final int GL_FLOAT16_VEC4_NV = 36859;

    public NVGPUShader5() {
        throw new UnsupportedOperationException();
    }

    public static native void glUniform1i64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLint64") long var1);

    public static native void glUniform2i64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLint64") long var1, @NativeType(value="GLint64") long var3);

    public static native void glUniform3i64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLint64") long var1, @NativeType(value="GLint64") long var3, @NativeType(value="GLint64") long var5);

    public static native void glUniform4i64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLint64") long var1, @NativeType(value="GLint64") long var3, @NativeType(value="GLint64") long var5, @NativeType(value="GLint64") long var7);

    public static native void nglUniform1i64vNV(int var0, int var1, long var2);

    public static void glUniform1i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining();
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform1i64vNV(n2, n, l);
    }

    public static native void nglUniform2i64vNV(int var0, int var1, long var2);

    public static void glUniform2i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform2i64vNV(n2, n, l);
    }

    public static native void nglUniform3i64vNV(int var0, int var1, long var2);

    public static void glUniform3i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform3i64vNV(n2, n, l);
    }

    public static native void nglUniform4i64vNV(int var0, int var1, long var2);

    public static void glUniform4i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform4i64vNV(n2, n, l);
    }

    public static native void glUniform1ui64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLuint64") long var1);

    public static native void glUniform2ui64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLuint64") long var1, @NativeType(value="GLuint64") long var3);

    public static native void glUniform3ui64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLuint64") long var1, @NativeType(value="GLuint64") long var3, @NativeType(value="GLuint64") long var5);

    public static native void glUniform4ui64NV(@NativeType(value="GLint") int var0, @NativeType(value="GLuint64") long var1, @NativeType(value="GLuint64") long var3, @NativeType(value="GLuint64") long var5, @NativeType(value="GLuint64") long var7);

    public static native void nglUniform1ui64vNV(int var0, int var1, long var2);

    public static void glUniform1ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining();
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform1ui64vNV(n2, n, l);
    }

    public static native void nglUniform2ui64vNV(int var0, int var1, long var2);

    public static void glUniform2ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform2ui64vNV(n2, n, l);
    }

    public static native void nglUniform3ui64vNV(int var0, int var1, long var2);

    public static void glUniform3ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform3ui64vNV(n2, n, l);
    }

    public static native void nglUniform4ui64vNV(int var0, int var1, long var2);

    public static void glUniform4ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n2 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglUniform4ui64vNV(n2, n, l);
    }

    public static native void nglGetUniformi64vNV(int var0, int var1, long var2);

    public static void glGetUniformi64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        NVGPUShader5.nglGetUniformi64vNV(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetUniformi64NV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        NVGPUShader5.nglGetUniformi64vNV(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void nglGetUniformui64vNV(int var0, int var1, long var2);

    public static void glGetUniformui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        NVGPUShader5.nglGetUniformui64vNV(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetUniformui64NV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        NVGPUShader5.nglGetUniformui64vNV(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void glProgramUniform1i64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint64") long var2);

    public static native void glProgramUniform2i64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint64") long var2, @NativeType(value="GLint64") long var4);

    public static native void glProgramUniform3i64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint64") long var2, @NativeType(value="GLint64") long var4, @NativeType(value="GLint64") long var6);

    public static native void glProgramUniform4i64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint64") long var2, @NativeType(value="GLint64") long var4, @NativeType(value="GLint64") long var6, @NativeType(value="GLint64") long var8);

    public static native void nglProgramUniform1i64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform1i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining();
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform1i64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform2i64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform2i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform2i64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform3i64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform3i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform3i64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform4i64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform4i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform4i64vNV(n3, n2, n, l);
    }

    public static native void glProgramUniform1ui64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLuint64") long var2);

    public static native void glProgramUniform2ui64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLuint64") long var2, @NativeType(value="GLuint64") long var4);

    public static native void glProgramUniform3ui64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLuint64") long var2, @NativeType(value="GLuint64") long var4, @NativeType(value="GLuint64") long var6);

    public static native void glProgramUniform4ui64NV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLuint64") long var2, @NativeType(value="GLuint64") long var4, @NativeType(value="GLuint64") long var6, @NativeType(value="GLuint64") long var8);

    public static native void nglProgramUniform1ui64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform1ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining();
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform1ui64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform2ui64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform2ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform2ui64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform3ui64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform3ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform3ui64vNV(n3, n2, n, l);
    }

    public static native void nglProgramUniform4ui64vNV(int var0, int var1, int var2, long var3);

    public static void glProgramUniform4ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") LongBuffer longBuffer) {
        int n3 = n;
        LongBuffer longBuffer2 = longBuffer;
        n = longBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(longBuffer2);
        NVGPUShader5.nglProgramUniform4ui64vNV(n3, n2, n, l);
    }

    public static void glUniform1i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform1i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length, lArray, l);
    }

    public static void glUniform2i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform2i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length >> 1, lArray, l);
    }

    public static void glUniform3i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform3i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length / 3, lArray, l);
    }

    public static void glUniform4i64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform4i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length >> 2, lArray, l);
    }

    public static void glUniform1ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform1ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length, lArray, l);
    }

    public static void glUniform2ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GLES.getICD().glUniform2ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length >> 1, lArray, l);
    }

    public static void glUniform3ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform3ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length / 3, lArray, l);
    }

    public static void glUniform4ui64vNV(@NativeType(value="GLint") int n, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glUniform4ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, lArray.length >> 2, lArray, l);
    }

    public static void glGetUniformi64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GLES.getICD().glGetUniformi64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetUniformui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GLES.getICD().glGetUniformui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glProgramUniform1i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform1i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length, lArray, l);
    }

    public static void glProgramUniform2i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform2i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length >> 1, lArray, l);
    }

    public static void glProgramUniform3i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform3i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length / 3, lArray, l);
    }

    public static void glProgramUniform4i64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform4i64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length >> 2, lArray, l);
    }

    public static void glProgramUniform1ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform1ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length, lArray, l);
    }

    public static void glProgramUniform2ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform2ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length >> 1, lArray, l);
    }

    public static void glProgramUniform3ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform3ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length / 3, lArray, l);
    }

    public static void glProgramUniform4ui64vNV(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint64 const *") long[] lArray) {
        long l = GLES.getICD().glProgramUniform4ui64vNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, lArray.length >> 2, lArray, l);
    }

    static {
        GLES.initialize();
    }
}

