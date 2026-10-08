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

public class SOFTBufferSubData {
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    public SOFTBufferSubData() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferSubDataSOFT(int n, int n2, long l, int n3, int n4) {
        long l2 = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, n3, n4, l2);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") ByteBuffer byteBuffer, @NativeType(value="ALsizei") int n3) {
        int n4 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        long l = MemoryUtil.memAddress(byteBuffer2);
        n = byteBuffer2.remaining();
        SOFTBufferSubData.nalBufferSubDataSOFT(n4, n2, l, n3, n);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") ShortBuffer shortBuffer, @NativeType(value="ALsizei") int n3) {
        ShortBuffer shortBuffer2 = shortBuffer;
        long l = MemoryUtil.memAddress(shortBuffer2);
        int n4 = shortBuffer2.remaining() << 1;
        SOFTBufferSubData.nalBufferSubDataSOFT(n, n2, l, n3, n4);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") IntBuffer intBuffer, @NativeType(value="ALsizei") int n3) {
        IntBuffer intBuffer2 = intBuffer;
        long l = MemoryUtil.memAddress(intBuffer2);
        int n4 = intBuffer2.remaining() << 2;
        SOFTBufferSubData.nalBufferSubDataSOFT(n, n2, l, n3, n4);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") FloatBuffer floatBuffer, @NativeType(value="ALsizei") int n3) {
        FloatBuffer floatBuffer2 = floatBuffer;
        long l = MemoryUtil.memAddress(floatBuffer2);
        int n4 = floatBuffer2.remaining() << 2;
        SOFTBufferSubData.nalBufferSubDataSOFT(n, n2, l, n3, n4);
    }

    public static void nalBufferSubDataDirectSOFT(long l, int n, int n2, long l2, int n3, int n4) {
        long l3 = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, n3, n4, l3);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") ByteBuffer byteBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        ByteBuffer byteBuffer2 = byteBuffer;
        l = MemoryUtil.memAddress(byteBuffer2);
        int n4 = byteBuffer2.remaining();
        SOFTBufferSubData.nalBufferSubDataDirectSOFT(l2, n, n2, l, n3, n4);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") ShortBuffer shortBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        ShortBuffer shortBuffer2 = shortBuffer;
        l = MemoryUtil.memAddress(shortBuffer2);
        n = shortBuffer2.remaining() << 1;
        SOFTBufferSubData.nalBufferSubDataDirectSOFT(l2, n4, n2, l, n3, n);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") IntBuffer intBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        IntBuffer intBuffer2 = intBuffer;
        l = MemoryUtil.memAddress(intBuffer2);
        n = intBuffer2.remaining() << 2;
        SOFTBufferSubData.nalBufferSubDataDirectSOFT(l2, n4, n2, l, n3, n);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") FloatBuffer floatBuffer, @NativeType(value="ALsizei") int n3) {
        long l2 = l;
        int n4 = n;
        FloatBuffer floatBuffer2 = floatBuffer;
        l = MemoryUtil.memAddress(floatBuffer2);
        n = floatBuffer2.remaining() << 2;
        SOFTBufferSubData.nalBufferSubDataDirectSOFT(l2, n4, n2, l, n3, n);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") short[] sArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n4 = n;
        n = sArray.length << 1;
        JNI.invokePV(n4, n2, sArray, n3, n, l);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") int[] nArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n4 = n;
        n = nArray.length << 2;
        JNI.invokePV(n4, n2, nArray, n3, n, l);
    }

    public static void alBufferSubDataSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") float[] fArray, @NativeType(value="ALsizei") int n3) {
        long l = AL.getICD().alBufferSubDataSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n4 = n;
        n = fArray.length << 2;
        JNI.invokePV(n4, n2, fArray, n3, n, l);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") short[] sArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = sArray.length << 1;
        JNI.invokePPV(l, n, n2, sArray, n3, n4, l2);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") int[] nArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = nArray.length << 2;
        JNI.invokePPV(l, n, n2, nArray, n3, n4, l2);
    }

    public static void alBufferSubDataDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALvoid const *") float[] fArray, @NativeType(value="ALsizei") int n3) {
        long l2 = AL.getICD().alBufferSubDataDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        int n4 = fArray.length << 2;
        JNI.invokePPV(l, n, n2, fArray, n3, n4, l2);
    }
}

