/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTMultiDrawArrays {
    public EXTMultiDrawArrays() {
        throw new UnsupportedOperationException();
    }

    public static native void nglMultiDrawArraysEXT(int var0, long var1, long var3, int var5);

    public static void glMultiDrawArraysEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") IntBuffer intBuffer, @NativeType(value="GLsizei const *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer2, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        int n2 = intBuffer.remaining();
        EXTMultiDrawArrays.nglMultiDrawArraysEXT(n, l, l2, n2);
    }

    public static native void nglMultiDrawElementsEXT(int var0, long var1, int var3, long var4, int var6);

    public static void glMultiDrawElementsEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei const *") IntBuffer intBuffer, @NativeType(value="GLenum") int n2, @NativeType(value="void const * const *") PointerBuffer pointerBuffer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer)pointerBuffer, intBuffer.remaining());
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        int n3 = intBuffer.remaining();
        EXTMultiDrawArrays.nglMultiDrawElementsEXT(n, l, n2, l2, n3);
    }

    public static void glMultiDrawArraysEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLint const *") int[] nArray, @NativeType(value="GLsizei const *") int[] nArray2) {
        long l = GLES.getICD().glMultiDrawArraysEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray2, nArray.length);
        }
        int n2 = n;
        n = nArray.length;
        JNI.callPPV(n2, nArray, nArray2, n, l);
    }

    public static void glMultiDrawElementsEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei const *") int[] nArray, @NativeType(value="GLenum") int n2, @NativeType(value="void const * const *") PointerBuffer pointerBuffer) {
        long l = GLES.getICD().glMultiDrawElementsEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check((CustomBuffer)pointerBuffer, nArray.length);
        }
        int n3 = n;
        long l2 = MemoryUtil.memAddress(pointerBuffer);
        n = nArray.length;
        JNI.callPPV(n3, nArray, n2, l2, n, l);
    }

    static {
        GLES.initialize();
    }
}

