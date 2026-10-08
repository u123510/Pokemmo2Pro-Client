/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.LibSTB;
import org.lwjgl.stb.STBIWriteCallbackI;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class STBImageWrite {
    public static final IntBuffer stbi_write_png_compression_level;
    public static final IntBuffer stbi_write_force_png_filter;
    public static final PointerBuffer stbi_zlib_compress;
    public static final IntBuffer stbi_write_tga_with_rle;

    public STBImageWrite() {
        throw new UnsupportedOperationException();
    }

    public static native int nstbi_write_png(long var0, int var2, int var3, int var4, long var5, int var7);

    @NativeType(value="int")
    public static boolean stbi_write_png(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer2, int n4) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            int n5 = n4 != 0 ? n4 : n * n3;
            Checks.check((Buffer)byteBuffer2, n5 * n2);
        }
        long l = MemoryUtil.memAddress(byteBuffer2);
        return STBImageWrite.nstbi_write_png(MemoryUtil.memAddress(byteBuffer), n, n2, n3, l, n4) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_png(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer, int n4) {
        if (Checks.CHECKS) {
            int n5 = n4 != 0 ? n4 : n * n3;
            Checks.check((Buffer)byteBuffer, n5 * n2);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n6 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n6);
            throw throwable;
        }
        long l = memoryStack.getPointerAddress();
        int n7 = n;
        int n8 = n2;
        long l2 = MemoryUtil.memAddress(byteBuffer);
        boolean bl = STBImageWrite.nstbi_write_png(l, n7, n8, n3, l2, n4) != 0;
        memoryStack.setPointer(n6);
        return bl;
    }

    private static native long nstbi_write_png_compression_level();

    @NativeType(value="int *")
    private static IntBuffer stbi_write_png_compression_level() {
        return MemoryUtil.memIntBuffer(STBImageWrite.nstbi_write_png_compression_level(), 1);
    }

    private static native long nstbi_write_force_png_filter();

    @NativeType(value="int *")
    private static IntBuffer stbi_write_force_png_filter() {
        return MemoryUtil.memIntBuffer(STBImageWrite.nstbi_write_force_png_filter(), 1);
    }

    private static native long nstbi_zlib_compress();

    @NativeType(value="unsigned char * (*) (unsigned char *, int, int *, int) *")
    private static PointerBuffer stbi_zlib_compress() {
        return MemoryUtil.memPointerBuffer(STBImageWrite.nstbi_zlib_compress(), 1);
    }

    public static native int nstbi_write_bmp(long var0, int var2, int var3, int var4, long var5);

    @NativeType(value="int")
    public static boolean stbi_write_bmp(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer2) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check((Buffer)byteBuffer2, n * n2 * n3);
        }
        long l = MemoryUtil.memAddress(byteBuffer2);
        return STBImageWrite.nstbi_write_bmp(MemoryUtil.memAddress(byteBuffer), n, n2, n3, l) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_bmp(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = memoryStack.getPointerAddress();
        int n5 = n;
        int n6 = n2;
        long l2 = MemoryUtil.memAddress(byteBuffer);
        boolean bl = STBImageWrite.nstbi_write_bmp(l, n5, n6, n3, l2) != 0;
        memoryStack.setPointer(n4);
        return bl;
    }

    public static native int nstbi_write_tga(long var0, int var2, int var3, int var4, long var5);

    @NativeType(value="int")
    public static boolean stbi_write_tga(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer2) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check((Buffer)byteBuffer2, n * n2 * n3);
        }
        long l = MemoryUtil.memAddress(byteBuffer2);
        return STBImageWrite.nstbi_write_tga(MemoryUtil.memAddress(byteBuffer), n, n2, n3, l) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_tga(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = memoryStack.getPointerAddress();
        int n5 = n;
        int n6 = n2;
        long l2 = MemoryUtil.memAddress(byteBuffer);
        boolean bl = STBImageWrite.nstbi_write_tga(l, n5, n6, n3, l2) != 0;
        memoryStack.setPointer(n4);
        return bl;
    }

    private static native long nstbi_write_tga_with_rle();

    @NativeType(value="int *")
    private static IntBuffer stbi_write_tga_with_rle() {
        return MemoryUtil.memIntBuffer(STBImageWrite.nstbi_write_tga_with_rle(), 1);
    }

    public static native int nstbi_write_hdr(long var0, int var2, int var3, int var4, long var5);

    @NativeType(value="int")
    public static boolean stbi_write_hdr(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="float const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check((Buffer)floatBuffer, n * n2 * n3);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        return STBImageWrite.nstbi_write_hdr(MemoryUtil.memAddress(byteBuffer), n, n2, n3, l) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_hdr(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="float const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, n * n2 * n3);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        long l = memoryStack.getPointerAddress();
        int n5 = n;
        int n6 = n2;
        long l2 = MemoryUtil.memAddress(floatBuffer);
        boolean bl = STBImageWrite.nstbi_write_hdr(l, n5, n6, n3, l2) != 0;
        memoryStack.setPointer(n4);
        return bl;
    }

    public static native int nstbi_write_jpg(long var0, int var2, int var3, int var4, long var5, int var7);

    @NativeType(value="int")
    public static boolean stbi_write_jpg(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer2, int n4) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check((Buffer)byteBuffer2, n * n2 * n3);
        }
        long l = MemoryUtil.memAddress(byteBuffer2);
        return STBImageWrite.nstbi_write_jpg(MemoryUtil.memAddress(byteBuffer), n, n2, n3, l, n4) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_jpg(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer, int n4) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n5 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n5);
            throw throwable;
        }
        long l = memoryStack.getPointerAddress();
        int n6 = n;
        int n7 = n2;
        long l2 = MemoryUtil.memAddress(byteBuffer);
        boolean bl = STBImageWrite.nstbi_write_jpg(l, n6, n7, n3, l2, n4) != 0;
        memoryStack.setPointer(n5);
        return bl;
    }

    public static native int nstbi_write_png_to_func(long var0, long var2, int var4, int var5, int var6, long var7, int var9);

    @NativeType(value="int")
    public static boolean stbi_write_png_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer, int n4) {
        if (Checks.CHECKS) {
            int n5 = n4 != 0 ? n4 : n * n3;
            Checks.check((Buffer)byteBuffer, n5 * n2);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        return STBImageWrite.nstbi_write_png_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, l2, n4) != 0;
    }

    public static native int nstbi_write_bmp_to_func(long var0, long var2, int var4, int var5, int var6, long var7);

    @NativeType(value="int")
    public static boolean stbi_write_bmp_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        return STBImageWrite.nstbi_write_bmp_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, l2) != 0;
    }

    public static native int nstbi_write_tga_to_func(long var0, long var2, int var4, int var5, int var6, long var7);

    @NativeType(value="int")
    public static boolean stbi_write_tga_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        return STBImageWrite.nstbi_write_tga_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, l2) != 0;
    }

    public static native int nstbi_write_hdr_to_func(long var0, long var2, int var4, int var5, int var6, long var7);

    @NativeType(value="int")
    public static boolean stbi_write_hdr_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="float const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, n * n2 * n3);
        }
        long l2 = MemoryUtil.memAddress(floatBuffer);
        return STBImageWrite.nstbi_write_hdr_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, l2) != 0;
    }

    public static native int nstbi_write_jpg_to_func(long var0, long var2, int var4, int var5, int var6, long var7, int var9);

    public static int stbi_write_jpg_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="void const *") ByteBuffer byteBuffer, int n4) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)byteBuffer, n * n2 * n3);
        }
        long l2 = MemoryUtil.memAddress(byteBuffer);
        return STBImageWrite.nstbi_write_jpg_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, l2, n4);
    }

    public static native void nstbi_flip_vertically_on_write(int var0);

    public static void stbi_flip_vertically_on_write(@NativeType(value="int") boolean bl) {
        STBImageWrite.nstbi_flip_vertically_on_write(bl ? 1 : 0);
    }

    public static native int nstbi_write_hdr(long var0, int var2, int var3, int var4, float[] var5);

    @NativeType(value="int")
    public static boolean stbi_write_hdr(@NativeType(value="char const *") ByteBuffer byteBuffer, int n, int n2, int n3, @NativeType(value="float const *") float[] fArray) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
            Checks.check(fArray, n * n2 * n3);
        }
        return STBImageWrite.nstbi_write_hdr(MemoryUtil.memAddress(byteBuffer), n, n2, n3, fArray) != 0;
    }

    @NativeType(value="int")
    public static boolean stbi_write_hdr(@NativeType(value="char const *") CharSequence charSequence, int n, int n2, int n3, @NativeType(value="float const *") float[] fArray) {
        if (Checks.CHECKS) {
            Checks.check(fArray, n * n2 * n3);
        }
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n4 = memoryStack.getPointer();
        try {
            memoryStack.nUTF8(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n4);
            throw throwable;
        }
        boolean bl = STBImageWrite.nstbi_write_hdr(memoryStack.getPointerAddress(), n, n2, n3, fArray) != 0;
        memoryStack.setPointer(n4);
        return bl;
    }

    public static native int nstbi_write_hdr_to_func(long var0, long var2, int var4, int var5, int var6, float[] var7);

    @NativeType(value="int")
    public static boolean stbi_write_hdr_to_func(@NativeType(value="stbi_write_func *") STBIWriteCallbackI sTBIWriteCallbackI, @NativeType(value="void *") long l, int n, int n2, int n3, @NativeType(value="float const *") float[] fArray) {
        if (Checks.CHECKS) {
            Checks.check(fArray, n * n2 * n3);
        }
        return STBImageWrite.nstbi_write_hdr_to_func(sTBIWriteCallbackI.address(), l, n, n2, n3, fArray) != 0;
    }

    static {
        LibSTB.initialize();
        stbi_write_png_compression_level = STBImageWrite.stbi_write_png_compression_level();
        stbi_write_force_png_filter = STBImageWrite.stbi_write_force_png_filter();
        stbi_zlib_compress = STBImageWrite.stbi_zlib_compress();
        stbi_write_tga_with_rle = STBImageWrite.stbi_write_tga_with_rle();
    }
}

