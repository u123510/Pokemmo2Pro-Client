/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.EXTInstancedArrays;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTDrawInstanced {
    public EXTDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    public static void glDrawArraysInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLsizei") int n3, @NativeType(value="GLsizei") int n4) {
        EXTInstancedArrays.glDrawArraysInstancedEXT(n, n2, n3, n4);
    }

    public static void nglDrawElementsInstancedEXT(int n, int n2, int n3, long l, int n4) {
        EXTInstancedArrays.nglDrawElementsInstancedEXT(n, n2, n3, l, n4);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="void const *") long l, @NativeType(value="GLsizei") int n4) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(n, n2, n3, l, n4);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n3) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(n, n2, byteBuffer, n3);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer, @NativeType(value="GLsizei") int n2) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(n, byteBuffer, n2);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ShortBuffer shortBuffer, @NativeType(value="GLsizei") int n2) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(n, shortBuffer, n2);
    }

    public static void glDrawElementsInstancedEXT(@NativeType(value="GLenum") int n, @NativeType(value="void const *") IntBuffer intBuffer, @NativeType(value="GLsizei") int n2) {
        EXTInstancedArrays.glDrawElementsInstancedEXT(n, intBuffer, n2);
    }

    static {
        GLES.initialize();
    }
}

