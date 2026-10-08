/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTMultiDrawIndirect {
    public EXTMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    public static native void nglMultiDrawArraysIndirectEXT(int var0, long var1, int var3, int var4);

    public static void glMultiDrawArraysIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3) {
        if (Checks.CHECKS) {
            int n4 = n3 == 0 ? 16 : n3;
            Checks.check((Buffer)byteBuffer, n2 * n4);
        }
        EXTMultiDrawIndirect.nglMultiDrawArraysIndirectEXT(n, MemoryUtil.memAddress(byteBuffer), n2, n3);
    }

    public static void glMultiDrawArraysIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3) {
        EXTMultiDrawIndirect.nglMultiDrawArraysIndirectEXT(n, l, n2, n3);
    }

    public static void glMultiDrawArraysIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3) {
        if (Checks.CHECKS) {
            int n4 = n3 == 0 ? 16 : n3;
            Checks.check((Buffer)intBuffer, n2 * n4 >> 2);
        }
        EXTMultiDrawIndirect.nglMultiDrawArraysIndirectEXT(n, MemoryUtil.memAddress(intBuffer), n2, n3);
    }

    public static native void nglMultiDrawElementsIndirectEXT(int var0, int var1, long var2, int var4, int var5);

    public static void glMultiDrawElementsIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4) {
        if (Checks.CHECKS) {
            int n5 = n4 == 0 ? 20 : n4;
            Checks.check((Buffer)byteBuffer, n3 * n5);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        EXTMultiDrawIndirect.nglMultiDrawElementsIndirectEXT(n, n2, l, n3, n4);
    }

    public static void glMultiDrawElementsIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4) {
        EXTMultiDrawIndirect.nglMultiDrawElementsIndirectEXT(n, n2, l, n3, n4);
    }

    public static void glMultiDrawElementsIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4) {
        if (Checks.CHECKS) {
            int n5 = n4 == 0 ? 20 : n4;
            Checks.check((Buffer)intBuffer, n3 * n5 >> 2);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTMultiDrawIndirect.nglMultiDrawElementsIndirectEXT(n, n2, l, n3, n4);
    }

    public static void glMultiDrawArraysIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") int[] nArray, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3) {
        long l = GLES.getICD().glMultiDrawArraysIndirectEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            int n4 = n3 == 0 ? 16 : n3;
            Checks.check(nArray, n2 * n4 >> 2);
        }
        JNI.callPV(n, nArray, n2, n3, l);
    }

    public static void glMultiDrawElementsIndirectEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") int[] nArray, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4) {
        long l = GLES.getICD().glMultiDrawElementsIndirectEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            int n5 = n4 == 0 ? 20 : n4;
            Checks.check(nArray, n3 * n5 >> 2);
        }
        JNI.callPV(n, n2, nArray, n3, n4, l);
    }

    static {
        GLES.initialize();
    }
}

