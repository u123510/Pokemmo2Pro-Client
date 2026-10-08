/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL13C;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class GL14C
extends GL13C {
    public static final int GL_CONSTANT_COLOR = 32769;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    public static final int GL_CONSTANT_ALPHA = 32771;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    public static final int GL_BLEND_COLOR = 32773;
    public static final int GL_FUNC_ADD = 32774;
    public static final int GL_MIN = 32775;
    public static final int GL_MAX = 32776;
    public static final int GL_BLEND_EQUATION = 32777;
    public static final int GL_FUNC_SUBTRACT = 32778;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
    public static final int GL_DEPTH_COMPONENT16 = 33189;
    public static final int GL_DEPTH_COMPONENT24 = 33190;
    public static final int GL_DEPTH_COMPONENT32 = 33191;
    public static final int GL_TEXTURE_DEPTH_SIZE = 34890;
    public static final int GL_TEXTURE_COMPARE_MODE = 34892;
    public static final int GL_TEXTURE_COMPARE_FUNC = 34893;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 33064;
    public static final int GL_BLEND_DST_RGB = 32968;
    public static final int GL_BLEND_SRC_RGB = 32969;
    public static final int GL_BLEND_DST_ALPHA = 32970;
    public static final int GL_BLEND_SRC_ALPHA = 32971;
    public static final int GL_INCR_WRAP = 34055;
    public static final int GL_DECR_WRAP = 34056;
    public static final int GL_TEXTURE_LOD_BIAS = 34049;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 34045;
    public static final int GL_MIRRORED_REPEAT = 33648;

    public GL14C() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlendColor(@NativeType(value="GLfloat") float var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3);

    public static native void glBlendEquation(@NativeType(value="GLenum") int var0);

    public static native void nglMultiDrawArrays(int var0, long var1, long var3, int var5);

    public static void glMultiDrawArrays(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") IntBuffer intBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        int n2 = intBuffer.remaining();
        GL14C.nglMultiDrawArrays(n, l, l2, n2);
    }

    public static native void nglMultiDrawElements(int var0, long var1, int var3, long var4, int var6);

    public static void glMultiDrawElements(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei *") IntBuffer intBuffer, @NativeType(value="GLenum") int n2, @NativeType(value="void const **") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        int n3 = intBuffer.remaining();
        GL14C.nglMultiDrawElements(n, l, n2, l2, n3);
    }

    public static native void glPointParameterf(@NativeType(value="GLenum") int var0, @NativeType(value="GLfloat") float var1);

    public static native void glPointParameteri(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1);

    public static native void nglPointParameterfv(int var0, long var1);

    public static void glPointParameterfv(@NativeType(value="GLenum") int n, @NativeType(value="GLfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 3);
        }
        GL14C.nglPointParameterfv(n, MemoryUtil.memAddress(floatBuffer));
    }

    public static native void nglPointParameteriv(int var0, long var1);

    public static void glPointParameteriv(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 3);
        }
        GL14C.nglPointParameteriv(n, MemoryUtil.memAddress(intBuffer));
    }

    public static native void glBlendFuncSeparate(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLenum") int var3);

    public static void glMultiDrawArrays(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") int[] nArray, @NativeType(value="GLsizei const *") int[] nArray2) {
        long l = GL.getICD().glMultiDrawArrays;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray2, nArray.length);
        }
        int n2 = n;
        n = nArray.length;
        JNI.callPPV(n2, nArray, nArray2, n, l);
    }

    public static void glMultiDrawElements(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei *") int[] nArray, @NativeType(value="GLenum") int n2, @NativeType(value="void const **") PointerBuffer pointerBuffer) {
        long l = GL.getICD().glMultiDrawElements;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check((CustomBuffer)pointerBuffer, nArray.length);
        }
        int n3 = n;
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        n = nArray.length;
        JNI.callPPV(n3, nArray, n2, l2, n, l);
    }

    public static void glPointParameterfv(@NativeType(value="GLenum") int n, @NativeType(value="GLfloat const *") float[] fArray) {
        long l = GL.getICD().glPointParameterfv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 3);
        }
        JNI.callPV(n, fArray, l);
    }

    public static void glPointParameteriv(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glPointParameteriv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 3);
        }
        JNI.callPV(n, nArray, l);
    }

    static {
        GL.initialize();
    }
}

