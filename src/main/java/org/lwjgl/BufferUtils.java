/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryUtil;

public final class BufferUtils {
    private BufferUtils() {
    }

    public static ByteBuffer createByteBuffer(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }

    public static int getAllocationSize(int n, int n2) {
        int n3 = n;
        APIUtil.apiCheckAllocation(n3, APIUtil.apiGetBytes(n3, n2), Integer.MAX_VALUE);
        return n << n2;
    }

    public static ShortBuffer createShortBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 1)).asShortBuffer();
    }

    public static CharBuffer createCharBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 1)).asCharBuffer();
    }

    public static IntBuffer createIntBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 2)).asIntBuffer();
    }

    public static LongBuffer createLongBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 3)).asLongBuffer();
    }

    public static CLongBuffer createCLongBuffer(int n) {
        return CLongBuffer.allocateDirect(n);
    }

    public static FloatBuffer createFloatBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 2)).asFloatBuffer();
    }

    public static DoubleBuffer createDoubleBuffer(int n) {
        return BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(n, 3)).asDoubleBuffer();
    }

    public static PointerBuffer createPointerBuffer(int n) {
        return PointerBuffer.allocateDirect(n);
    }

    public static void zeroBuffer(ByteBuffer byteBuffer) {
        MemoryUtil.memSet(byteBuffer, 0);
    }

    public static void zeroBuffer(ShortBuffer shortBuffer) {
        MemoryUtil.memSet(shortBuffer, 0);
    }

    public static void zeroBuffer(CharBuffer charBuffer) {
        MemoryUtil.memSet(charBuffer, 0);
    }

    public static void zeroBuffer(IntBuffer intBuffer) {
        MemoryUtil.memSet(intBuffer, 0);
    }

    public static void zeroBuffer(FloatBuffer floatBuffer) {
        MemoryUtil.memSet(floatBuffer, 0);
    }

    public static void zeroBuffer(LongBuffer longBuffer) {
        MemoryUtil.memSet(longBuffer, 0);
    }

    public static void zeroBuffer(DoubleBuffer doubleBuffer) {
        MemoryUtil.memSet(doubleBuffer, 0);
    }

    public static void zeroBuffer(CustomBuffer customBuffer) {
        MemoryUtil.memSet(customBuffer, 0);
    }
}

