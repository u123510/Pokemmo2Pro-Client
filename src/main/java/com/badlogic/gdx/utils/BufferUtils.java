/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.es_1
 *  f.nf_1
 */
package com.badlogic.gdx.utils;

import f.es_1;
import f.nf_1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class BufferUtils {
    public static final es_1 Iv0 = new es_1();
    public static int Fd = 0;

    private BufferUtils() {
    }

    public static void ys0(float[] fArray, Buffer buffer, int n, int n2) {
        if (buffer instanceof ByteBuffer) {
            buffer.limit(n << 2);
        } else if (buffer instanceof FloatBuffer) {
            buffer.limit(n);
        }
        BufferUtils.copyJni(fArray, buffer, n, n2);
        buffer.position(0);
    }

    public static int ts0(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return buffer.position();
        }
        if (buffer instanceof ShortBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof CharBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof IntBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof LongBuffer) {
            return buffer.position() << 3;
        }
        if (buffer instanceof FloatBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return buffer.position() << 3;
        }
        throw new nf_1("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    public static int jz(Buffer buffer, int n) {
        if (buffer instanceof ByteBuffer) {
            return n;
        }
        if (buffer instanceof ShortBuffer) {
            return n >>> 1;
        }
        if (buffer instanceof CharBuffer) {
            return n >>> 1;
        }
        if (buffer instanceof IntBuffer) {
            return n >>> 2;
        }
        if (buffer instanceof LongBuffer) {
            return n >>> 3;
        }
        if (buffer instanceof FloatBuffer) {
            return n >>> 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return n >>> 3;
        }
        throw new nf_1("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    public static ByteBuffer I5(int n) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n);
        byteBuffer.order(ByteOrder.nativeOrder());
        return byteBuffer;
    }

    public static IntBuffer yD0(int n) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n * 4);
        byteBuffer.order(ByteOrder.nativeOrder());
        return byteBuffer.asIntBuffer();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void t7(ByteBuffer byteBuffer) {
        int n = byteBuffer.capacity();
        synchronized (Iv0) {
            if (!Iv0.sj0((Object)byteBuffer, true)) {
                throw new IllegalArgumentException("buffer not allocated with newUnsafeByteBuffer or already disposed");
            }
            Fd -= n;
            BufferUtils.freeMemory(byteBuffer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean qL(ByteBuffer byteBuffer) {
        es_1 es_12 = Iv0;
        synchronized (es_12) {
            return es_12.j4((Object)byteBuffer, true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ByteBuffer qw0(int n) {
        ByteBuffer byteBuffer = BufferUtils.newDisposableByteBuffer(n);
        byteBuffer.order(ByteOrder.nativeOrder());
        Fd += n;
        es_1 es_12 = Iv0;
        synchronized (es_12) {
            es_12.Ue0((Object)byteBuffer);
            return byteBuffer;
        }
    }

    private static native void freeMemory(ByteBuffer var0);

    private static native ByteBuffer newDisposableByteBuffer(int var0);

    public static native void clear(ByteBuffer var0, int var1);

    private static native void copyJni(float[] var0, Buffer var1, int var2, int var3);

    private static native void copyJni(byte[] var0, int var1, Buffer var2, int var3, int var4);

    private static native void copyJni(Buffer var0, int var1, Buffer var2, int var3, int var4);

    public static void n9(byte[] byArray, ByteBuffer byteBuffer, int n) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int n2 = byteBuffer.position();
        ((Buffer)byteBuffer2).limit(BufferUtils.jz(byteBuffer2, n) + n2);
        n2 = BufferUtils.ts0(byteBuffer2);
        BufferUtils.copyJni(byArray, 0, (Buffer)byteBuffer, n2, n);
    }

    public static void KJ(ByteBuffer src, Buffer dst, int numBytes) {
        int dstPosition = dst.position();
        dst.limit(BufferUtils.jz(dst, numBytes) + dstPosition);
        int srcOffset = BufferUtils.ts0(src);
        int dstOffset = BufferUtils.ts0(dst);
        BufferUtils.copyJni(src, srcOffset, dst, dstOffset, numBytes);
    }

    public static FloatBuffer S5() {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        return byteBuffer.asFloatBuffer();
    }
}
