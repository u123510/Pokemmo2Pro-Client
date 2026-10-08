/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVBindlessMultiDrawIndirect {
    public NVBindlessMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    public static native void nglMultiDrawArraysIndirectBindlessNV(int var0, long var1, int var3, int var4, int var5);

    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4) {
        if (Checks.CHECKS) {
            int n5 = n3 == 0 ? n4 * 24 + 16 : n3;
            Checks.check((Buffer)byteBuffer, n2 * n5);
        }
        NVBindlessMultiDrawIndirect.nglMultiDrawArraysIndirectBindlessNV(n, MemoryUtil.memAddress(byteBuffer), n2, n3, n4);
    }

    public static void glMultiDrawArraysIndirectBindlessNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLint") int n4) {
        NVBindlessMultiDrawIndirect.nglMultiDrawArraysIndirectBindlessNV(n, l, n2, n3, n4);
    }

    public static native void nglMultiDrawElementsIndirectBindlessNV(int var0, int var1, long var2, int var4, int var5, int var6);

    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5) {
        if (Checks.CHECKS) {
            int n6 = n4 == 0 ? (n5 + 2) * 24 : n4;
            Checks.check((Buffer)byteBuffer, n3 * n6);
        }
        long l = MemoryUtil.memAddress(byteBuffer);
        NVBindlessMultiDrawIndirect.nglMultiDrawElementsIndirectBindlessNV(n, n2, l, n3, n4, n5);
    }

    public static void glMultiDrawElementsIndirectBindlessNV(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLint") int n5) {
        NVBindlessMultiDrawIndirect.nglMultiDrawElementsIndirectBindlessNV(n, n2, l, n3, n4, n5);
    }

    static {
        GL.initialize();
    }
}

