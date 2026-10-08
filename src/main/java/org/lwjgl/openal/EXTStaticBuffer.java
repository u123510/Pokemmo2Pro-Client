/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.openal.AL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTStaticBuffer {
    public EXTStaticBuffer() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferDataStatic(int n, int n2, long l, int n3, int n4) {
        long l2 = AL.getICD().alBufferDataStatic;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, n3, n4, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") ByteBuffer byteBuffer, @NativeType(value="ALsizei") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        long l = MemoryUtil.memAddress(byteBuffer2);
        n = byteBuffer2.remaining();
        EXTStaticBuffer.nalBufferDataStatic(n4, n2, l, n, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") ShortBuffer shortBuffer, @NativeType(value="ALsizei") int n3) {
        ShortBuffer shortBuffer2 = shortBuffer;
        long l = MemoryUtil.memAddress(shortBuffer2);
        int n4 = shortBuffer2.remaining() << 1;
        EXTStaticBuffer.nalBufferDataStatic(n, n2, l, n4, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") IntBuffer intBuffer, @NativeType(value="ALsizei") int n3) {
        IntBuffer intBuffer2 = intBuffer;
        long l = MemoryUtil.memAddress(intBuffer2);
        int n4 = intBuffer2.remaining() << 2;
        EXTStaticBuffer.nalBufferDataStatic(n, n2, l, n4, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") FloatBuffer floatBuffer, @NativeType(value="ALsizei") int n3) {
        FloatBuffer floatBuffer2 = floatBuffer;
        long l = MemoryUtil.memAddress(floatBuffer2);
        int n4 = floatBuffer2.remaining() << 2;
        EXTStaticBuffer.nalBufferDataStatic(n, n2, l, n4, n3);
    }

    public static void nalBufferDataStaticDirect(long l, int n, int n2, long l2, int n3, int n4) {
        long l3 = AL.getICD().alBufferDataStaticDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, n3, n4, l3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") ByteBuffer byteBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        ByteBuffer byteBuffer2 = byteBuffer;
        l = MemoryUtil.memAddress(byteBuffer2);
        int n4 = byteBuffer2.remaining();
        EXTStaticBuffer.nalBufferDataStaticDirect(l2, n, n2, l, n4, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") ShortBuffer shortBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        l = MemoryUtil.memAddress(shortBuffer2);
        n = shortBuffer2.remaining() << 1;
        EXTStaticBuffer.nalBufferDataStaticDirect(l2, n4, n2, l, n, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") IntBuffer intBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        IntBuffer intBuffer2 = intBuffer;
        l = MemoryUtil.memAddress(intBuffer2);
        n = intBuffer2.remaining() << 2;
        EXTStaticBuffer.nalBufferDataStaticDirect(l2, n4, n2, l, n, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") FloatBuffer floatBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        l = MemoryUtil.memAddress(floatBuffer2);
        n = floatBuffer2.remaining() << 2;
        EXTStaticBuffer.nalBufferDataStaticDirect(l2, n4, n2, l, n, n3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") short[] sArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferDataStatic;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, sArray, sArray.length << 1, n3, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") int[] nArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferDataStatic;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, nArray, nArray.length << 2, n3, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStatic(@NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") float[] fArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferDataStatic;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, fArray, fArray.length << 2, n3, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") short[] sArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferDataStaticDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = sArray.length << 1;
        JNI.invokePPV(l, n, n2, sArray, n4, n3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") int[] nArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferDataStaticDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = nArray.length << 2;
        JNI.invokePPV(l, n, n2, nArray, n4, n3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferDataStaticDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid *") float[] fArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferDataStaticDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = fArray.length << 2;
        JNI.invokePPV(l, n, n2, fArray, n4, n3, l2);
    }
}

