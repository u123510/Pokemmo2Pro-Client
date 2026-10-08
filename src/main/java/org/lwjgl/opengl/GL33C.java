/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class GL33C
extends GL32C {
    public static final int GL_SRC1_COLOR = 35065;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 35066;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 35067;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 35068;
    public static final int GL_ANY_SAMPLES_PASSED = 35887;
    public static final int GL_SAMPLER_BINDING = 35097;
    public static final int GL_RGB10_A2UI = 36975;
    public static final int GL_TEXTURE_SWIZZLE_R = 36418;
    public static final int GL_TEXTURE_SWIZZLE_G = 36419;
    public static final int GL_TEXTURE_SWIZZLE_B = 36420;
    public static final int GL_TEXTURE_SWIZZLE_A = 36421;
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 36422;
    public static final int GL_TIME_ELAPSED = 35007;
    public static final int GL_TIMESTAMP = 36392;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070;
    public static final int GL_INT_2_10_10_10_REV = 36255;

    public GL33C() {
        throw new UnsupportedOperationException();
    }

    public static native void nglBindFragDataLocationIndexed(int var0, int var1, int var2, long var3);

    public static void glBindFragDataLocationIndexed(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        GL33C.nglBindFragDataLocationIndexed(n, n2, n3, l);
    }

    public static void glBindFragDataLocationIndexed(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLchar const *") CharSequence charSequence) {
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
        GL33C.nglBindFragDataLocationIndexed(n4, n2, n3, l);
        memoryStack.setPointer(n);
    }

    public static native int nglGetFragDataIndex(int var0, long var1);

    @NativeType(value="GLint")
    public static int glGetFragDataIndex(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return GL33C.nglGetFragDataIndex(n, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="GLint")
    public static int glGetFragDataIndex(@NativeType(value="GLuint") int n, @NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        int n3 = GL33C.nglGetFragDataIndex(n, memoryStack.getPointerAddress());
        memoryStack.setPointer(n2);
        return n3;
    }

    public static native void nglGenSamplers(int var0, long var1);

    public static void glGenSamplers(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        GL33C.nglGenSamplers(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenSamplers() {
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
        GL33C.nglGenSamplers(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteSamplers(int var0, long var1);

    public static void glDeleteSamplers(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        GL33C.nglDeleteSamplers(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteSamplers(@NativeType(value="GLuint const *") int n) {
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
        GL33C.nglDeleteSamplers(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsSampler(@NativeType(value="GLuint") int var0);

    public static native void glBindSampler(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    public static native void glSamplerParameteri(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLint") int var2);

    public static native void glSamplerParameterf(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLfloat") float var2);

    public static native void nglSamplerParameteriv(int var0, int var1, long var2);

    public static void glSamplerParameteriv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglSamplerParameteriv(n, n2, l);
    }

    public static native void nglSamplerParameterfv(int var0, int var1, long var2);

    public static void glSamplerParameterfv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        GL33C.nglSamplerParameterfv(n, n2, l);
    }

    public static native void nglSamplerParameterIiv(int var0, int var1, long var2);

    public static void glSamplerParameterIiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglSamplerParameterIiv(n, n2, l);
    }

    public static native void nglSamplerParameterIuiv(int var0, int var1, long var2);

    public static void glSamplerParameterIuiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglSamplerParameterIuiv(n, n2, l);
    }

    public static native void nglGetSamplerParameteriv(int var0, int var1, long var2);

    public static void glGetSamplerParameteriv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglGetSamplerParameteriv(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameteri(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        GL33C.nglGetSamplerParameteriv(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetSamplerParameterfv(int var0, int var1, long var2);

    public static void glGetSamplerParameterfv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLfloat *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        GL33C.nglGetSamplerParameterfv(n, n2, l);
    }

    @NativeType(value="void")
    public static float glGetSamplerParameterf(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        FloatBuffer floatBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            floatBuffer = memoryStack.callocFloat(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        GL33C.nglGetSamplerParameterfv(n, n2, MemoryUtil.memAddress(floatBuffer));
        float f = floatBuffer.get(0);
        memoryStack.setPointer(n3);
        return f;
    }

    public static native void nglGetSamplerParameterIiv(int var0, int var1, long var2);

    public static void glGetSamplerParameterIiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglGetSamplerParameterIiv(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIi(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        GL33C.nglGetSamplerParameterIiv(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetSamplerParameterIuiv(int var0, int var1, long var2);

    public static void glGetSamplerParameterIuiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglGetSamplerParameterIuiv(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetSamplerParameterIui(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        GL33C.nglGetSamplerParameterIuiv(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void glQueryCounter(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void nglGetQueryObjecti64v(int var0, int var1, long var2);

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        GL33C.nglGetQueryObjecti64v(n, n2, l);
    }

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long l) {
        GL33C.nglGetQueryObjecti64v(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjecti64(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        GL33C.nglGetQueryObjecti64v(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void nglGetQueryObjectui64v(int var0, int var1, long var2);

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        GL33C.nglGetQueryObjectui64v(n, n2, l);
    }

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long l) {
        GL33C.nglGetQueryObjectui64v(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjectui64(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        GL33C.nglGetQueryObjectui64v(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void glVertexAttribDivisor(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    public static native void glVertexAttribP1ui(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLuint") int var3);

    public static native void glVertexAttribP2ui(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLuint") int var3);

    public static native void glVertexAttribP3ui(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLuint") int var3);

    public static native void glVertexAttribP4ui(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLuint") int var3);

    public static native void nglVertexAttribP1uiv(int var0, int var1, boolean var2, long var3);

    public static void glVertexAttribP1uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglVertexAttribP1uiv(n, n2, bl, l);
    }

    public static native void nglVertexAttribP2uiv(int var0, int var1, boolean var2, long var3);

    public static void glVertexAttribP2uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglVertexAttribP2uiv(n, n2, bl, l);
    }

    public static native void nglVertexAttribP3uiv(int var0, int var1, boolean var2, long var3);

    public static void glVertexAttribP3uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglVertexAttribP3uiv(n, n2, bl, l);
    }

    public static native void nglVertexAttribP4uiv(int var0, int var1, boolean var2, long var3);

    public static void glVertexAttribP4uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        GL33C.nglVertexAttribP4uiv(n, n2, bl, l);
    }

    public static void glGenSamplers(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGenSamplers;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteSamplers(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteSamplers;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glSamplerParameteriv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glSamplerParameteriv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterfv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glSamplerParameterfv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.callPV(n, n2, fArray, l);
    }

    public static void glSamplerParameterIiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glSamplerParameterIiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glSamplerParameterIuiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glSamplerParameterIuiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameteriv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetSamplerParameteriv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterfv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLfloat *") float[] fArray) {
        long l = GL.getICD().glGetSamplerParameterfv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.callPV(n, n2, fArray, l);
    }

    public static void glGetSamplerParameterIiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetSamplerParameterIiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetSamplerParameterIuiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGetSamplerParameterIuiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GL.getICD().glGetQueryObjecti64v;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GL.getICD().glGetQueryObjectui64v;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glVertexAttribP1uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribP1uiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, bl, nArray, l);
    }

    public static void glVertexAttribP2uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribP2uiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, bl, nArray, l);
    }

    public static void glVertexAttribP3uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribP3uiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, bl, nArray, l);
    }

    public static void glVertexAttribP4uiv(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glVertexAttribP4uiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, bl, nArray, l);
    }

    static {
        GL.initialize();
    }
}

