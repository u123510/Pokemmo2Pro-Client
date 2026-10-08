/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTGPUShader4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 35069;
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
    public static final int GL_SAMPLER_BUFFER_EXT = 36290;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;
    public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 36293;
    public static final int GL_UNSIGNED_INT_VEC2_EXT = 36294;
    public static final int GL_UNSIGNED_INT_VEC3_EXT = 36295;
    public static final int GL_UNSIGNED_INT_VEC4_EXT = 36296;
    public static final int GL_INT_SAMPLER_1D_EXT = 36297;
    public static final int GL_INT_SAMPLER_2D_EXT = 36298;
    public static final int GL_INT_SAMPLER_3D_EXT = 36299;
    public static final int GL_INT_SAMPLER_CUBE_EXT = 36300;
    public static final int GL_INT_SAMPLER_2D_RECT_EXT = 36301;
    public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 36302;
    public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 36303;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 36305;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 36306;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 36307;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 36308;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 36309;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 36310;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 36311;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 35076;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 35077;

    public EXTGPUShader4() {
        throw new UnsupportedOperationException();
    }

    public static native void glVertexAttribI1iEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1);

    public static native void glVertexAttribI2iEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2);

    public static native void glVertexAttribI3iEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3);

    public static native void glVertexAttribI4iEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4);

    public static native void glVertexAttribI1uiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    public static native void glVertexAttribI2uiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2);

    public static native void glVertexAttribI3uiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3);

    public static native void glVertexAttribI4uiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4);

    public static native void nglVertexAttribI1ivEXT(int var0, long var1);

    public static void glVertexAttribI1ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        EXTGPUShader4.nglVertexAttribI1ivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI2ivEXT(int var0, long var1);

    public static void glVertexAttribI2ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 2);
        }
        EXTGPUShader4.nglVertexAttribI2ivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI3ivEXT(int var0, long var1);

    public static void glVertexAttribI3ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 3);
        }
        EXTGPUShader4.nglVertexAttribI3ivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI4ivEXT(int var0, long var1);

    public static void glVertexAttribI4ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4ivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI1uivEXT(int var0, long var1);

    public static void glVertexAttribI1uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        EXTGPUShader4.nglVertexAttribI1uivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI2uivEXT(int var0, long var1);

    public static void glVertexAttribI2uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 2);
        }
        EXTGPUShader4.nglVertexAttribI2uivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI3uivEXT(int var0, long var1);

    public static void glVertexAttribI3uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 3);
        }
        EXTGPUShader4.nglVertexAttribI3uivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI4uivEXT(int var0, long var1);

    public static void glVertexAttribI4uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4uivEXT(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void nglVertexAttribI4bvEXT(int var0, long var1);

    public static void glVertexAttribI4bvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLbyte const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4bvEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    public static native void nglVertexAttribI4svEXT(int var0, long var1);

    public static void glVertexAttribI4svEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLshort const *") ShortBuffer shortBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)shortBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4svEXT(n, MemoryUtil.memAddress(shortBuffer));
    }

    public static native void nglVertexAttribI4ubvEXT(int var0, long var1);

    public static void glVertexAttribI4ubvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLbyte const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4ubvEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    public static native void nglVertexAttribI4usvEXT(int var0, long var1);

    public static void glVertexAttribI4usvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLshort const *") ShortBuffer shortBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)shortBuffer, 4);
        }
        EXTGPUShader4.nglVertexAttribI4usvEXT(n, MemoryUtil.memAddress(shortBuffer));
    }

    public static native void nglVertexAttribIPointerEXT(int var0, int var1, int var2, int var3, long var4);

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTGPUShader4.nglVertexAttribIPointerEXT(n, n2, n3, n4, l);
    }

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") long l) {
        EXTGPUShader4.nglVertexAttribIPointerEXT(n, n2, n3, n4, l);
    }

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") ShortBuffer shortBuffer) {
        long l = MemoryUtil.memAddress(shortBuffer);
        EXTGPUShader4.nglVertexAttribIPointerEXT(n, n2, n3, n4, l);
    }

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") IntBuffer intBuffer) {
        long l = MemoryUtil.memAddress(intBuffer);
        EXTGPUShader4.nglVertexAttribIPointerEXT(n, n2, n3, n4, l);
    }

    public static native void nglGetVertexAttribIivEXT(int var0, int var1, long var2);

    public static void glGetVertexAttribIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTGPUShader4.nglGetVertexAttribIivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetVertexAttribIiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTGPUShader4.nglGetVertexAttribIivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetVertexAttribIuivEXT(int var0, int var1, long var2);

    public static void glGetVertexAttribIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 4);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTGPUShader4.nglGetVertexAttribIuivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetVertexAttribIuiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTGPUShader4.nglGetVertexAttribIuivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetUniformuivEXT(int var0, int var1, long var2);

    public static void glGetUniformuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTGPUShader4.nglGetUniformuivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetUniformuiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTGPUShader4.nglGetUniformuivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglBindFragDataLocationEXT(int var0, int var1, long var2);

    public static void glBindFragDataLocationEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTGPUShader4.nglBindFragDataLocationEXT(n, n2, l);
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
        EXTGPUShader4.nglBindFragDataLocationEXT(n3, n2, memoryStack2.getPointerAddress());
        memoryStack.setPointer(n);
    }

    public static native int nglGetFragDataLocationEXT(int var0, long var1);

    @NativeType(value="GLint")
    public static int glGetFragDataLocationEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return EXTGPUShader4.nglGetFragDataLocationEXT(n, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="GLint")
    public static int glGetFragDataLocationEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        int n3 = EXTGPUShader4.nglGetFragDataLocationEXT(n, memoryStack.getPointerAddress());
        memoryStack.setPointer(n2);
        return n3;
    }

    public static native void glUniform1uiEXT(@NativeType(value="GLint") int var0, @NativeType(value="GLuint") int var1);

    public static native void glUniform2uiEXT(@NativeType(value="GLint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2);

    public static native void glUniform3uiEXT(@NativeType(value="GLint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLuint") int var3);

    public static native void glUniform4uiEXT(@NativeType(value="GLint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLuint") int var4);

    public static native void nglUniform1uivEXT(int var0, int var1, long var2);

    public static void glUniform1uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTGPUShader4.nglUniform1uivEXT(n2, n, l);
    }

    public static native void nglUniform2uivEXT(int var0, int var1, long var2);

    public static void glUniform2uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 1;
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTGPUShader4.nglUniform2uivEXT(n2, n, l);
    }

    public static native void nglUniform3uivEXT(int var0, int var1, long var2);

    public static void glUniform3uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() / 3;
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTGPUShader4.nglUniform3uivEXT(n2, n, l);
    }

    public static native void nglUniform4uivEXT(int var0, int var1, long var2);

    public static void glUniform4uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        int n2 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining() >> 2;
        long l = MemoryUtil.memAddress(intBuffer2);
        EXTGPUShader4.nglUniform4uivEXT(n2, n, l);
    }

    public static void glVertexAttribI1ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI1ivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI2ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI2ivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 2);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI3ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI3ivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 3);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI4ivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI4ivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI1uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI1uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI2uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI2uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 2);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI3uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI3uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 3);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI4uivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribI4uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, nArray, l);
    }

    public static void glVertexAttribI4svEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLshort const *") short[] sArray) {
        long l = GL.getICD().glVertexAttribI4svEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(sArray, 4);
        }
        JNI.callPV(n, sArray, l);
    }

    public static void glVertexAttribI4usvEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLshort const *") short[] sArray) {
        long l = GL.getICD().glVertexAttribI4usvEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(sArray, 4);
        }
        JNI.callPV(n, sArray, l);
    }

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") short[] sArray) {
        long l = GL.getICD().glVertexAttribIPointerEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, n3, n4, sArray, l);
    }

    public static void glVertexAttribIPointerEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="void const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribIPointerEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, n3, n4, nArray, l);
    }

    public static void glGetVertexAttribIivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetVertexAttribIivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetVertexAttribIuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGetVertexAttribIuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 4);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetUniformuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGetUniformuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glUniform1uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glUniform1uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length, nArray, l);
    }

    public static void glUniform2uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glUniform2uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length >> 1, nArray, l);
    }

    public static void glUniform3uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glUniform3uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length / 3, nArray, l);
    }

    public static void glUniform4uivEXT(@NativeType(value="GLint") int n, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glUniform4uivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, nArray.length >> 2, nArray, l);
    }

    static {
        GL.initialize();
    }
}

