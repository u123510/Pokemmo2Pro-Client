/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.openal.AL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class SOFTBufferSamples {
    public static final int AL_MONO8_SOFT = 4352;
    public static final int AL_MONO16_SOFT = 4353;
    public static final int AL_MONO32F_SOFT = 65552;
    public static final int AL_STEREO8_SOFT = 4354;
    public static final int AL_STEREO16_SOFT = 4355;
    public static final int AL_STEREO32F_SOFT = 65553;
    public static final int AL_QUAD8_SOFT = 4612;
    public static final int AL_QUAD16_SOFT = 4613;
    public static final int AL_QUAD32F_SOFT = 4614;
    public static final int AL_REAR8_SOFT = 4615;
    public static final int AL_REAR16_SOFT = 4616;
    public static final int AL_REAR32F_SOFT = 4617;
    public static final int AL_5POINT1_8_SOFT = 4618;
    public static final int AL_5POINT1_16_SOFT = 4619;
    public static final int AL_5POINT1_32F_SOFT = 4620;
    public static final int AL_6POINT1_8_SOFT = 4621;
    public static final int AL_6POINT1_16_SOFT = 4622;
    public static final int AL_6POINT1_32F_SOFT = 4623;
    public static final int AL_7POINT1_8_SOFT = 4624;
    public static final int AL_7POINT1_16_SOFT = 4625;
    public static final int AL_7POINT1_32F_SOFT = 4626;
    public static final int AL_MONO_SOFT = 5376;
    public static final int AL_STEREO_SOFT = 5377;
    public static final int AL_QUAD_SOFT = 5378;
    public static final int AL_REAR_SOFT = 5379;
    public static final int AL_5POINT1_SOFT = 5380;
    public static final int AL_6POINT1_SOFT = 5381;
    public static final int AL_7POINT1_SOFT = 5382;
    public static final int AL_BYTE_SOFT = 5120;
    public static final int AL_UNSIGNED_BYTE_SOFT = 5121;
    public static final int AL_SHORT_SOFT = 5122;
    public static final int AL_UNSIGNED_SHORT_SOFT = 5123;
    public static final int AL_INT_SOFT = 5124;
    public static final int AL_UNSIGNED_INT_SOFT = 5125;
    public static final int AL_FLOAT_SOFT = 5126;
    public static final int AL_DOUBLE_SOFT = 5127;
    public static final int AL_BYTE3_SOFT = 5128;
    public static final int AL_UNSIGNED_BYTE3_SOFT = 5129;
    public static final int AL_INTERNAL_FORMAT_SOFT = 8200;
    public static final int AL_BYTE_LENGTH_SOFT = 8201;
    public static final int AL_SAMPLE_LENGTH_SOFT = 8202;
    public static final int AL_SEC_LENGTH_SOFT = 8203;
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    public SOFTBufferSamples() {
        throw new UnsupportedOperationException();
    }

    public static void nalBufferSamplesSOFT(int n, int n2, int n3, int n4, int n5, int n6, long l) {
        long l2 = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, n3, n4, n5, n6, l, l2);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        SOFTBufferSamples.nalBufferSamplesSOFT(n, n2, n3, n4, n5, n6, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") ShortBuffer shortBuffer) {
        long l = MemoryUtil.memAddress(shortBuffer);
        SOFTBufferSamples.nalBufferSamplesSOFT(n, n2, n3, n4, n5, n6, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") IntBuffer intBuffer) {
        long l = MemoryUtil.memAddress(intBuffer);
        SOFTBufferSamples.nalBufferSamplesSOFT(n, n2, n3, n4, n5, n6, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") FloatBuffer floatBuffer) {
        long l = MemoryUtil.memAddress(floatBuffer);
        SOFTBufferSamples.nalBufferSamplesSOFT(n, n2, n3, n4, n5, n6, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") DoubleBuffer doubleBuffer) {
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTBufferSamples.nalBufferSamplesSOFT(n, n2, n3, n4, n5, n6, l);
    }

    public static void nalBufferSubSamplesSOFT(int n, int n2, int n3, int n4, int n5, long l) {
        long l2 = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, n3, n4, n5, l, l2);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        SOFTBufferSamples.nalBufferSubSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") ShortBuffer shortBuffer) {
        long l = MemoryUtil.memAddress(shortBuffer);
        SOFTBufferSamples.nalBufferSubSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") IntBuffer intBuffer) {
        long l = MemoryUtil.memAddress(intBuffer);
        SOFTBufferSamples.nalBufferSubSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") FloatBuffer floatBuffer) {
        long l = MemoryUtil.memAddress(floatBuffer);
        SOFTBufferSamples.nalBufferSubSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") DoubleBuffer doubleBuffer) {
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTBufferSamples.nalBufferSubSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void nalGetBufferSamplesSOFT(int n, int n2, int n3, int n4, int n5, long l) {
        long l2 = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, n3, n4, n5, l, l2);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") ByteBuffer byteBuffer) {
        long l = MemoryUtil.memAddress(byteBuffer);
        SOFTBufferSamples.nalGetBufferSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") ShortBuffer shortBuffer) {
        long l = MemoryUtil.memAddress(shortBuffer);
        SOFTBufferSamples.nalGetBufferSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") IntBuffer intBuffer) {
        long l = MemoryUtil.memAddress(intBuffer);
        SOFTBufferSamples.nalGetBufferSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") FloatBuffer floatBuffer) {
        long l = MemoryUtil.memAddress(floatBuffer);
        SOFTBufferSamples.nalGetBufferSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") DoubleBuffer doubleBuffer) {
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTBufferSamples.nalGetBufferSamplesSOFT(n, n2, n3, n4, n5, l);
    }

    @NativeType(value="ALboolean")
    public static boolean alIsBufferFormatSupportedSOFT(@NativeType(value="ALenum") int n) {
        long l = AL.getICD().alIsBufferFormatSupportedSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.invokeZ(n, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") short[] sArray) {
        long l = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, n6, sArray, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") int[] nArray) {
        long l = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, n6, nArray, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") float[] fArray) {
        long l = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, n6, fArray, l);
    }

    public static void alBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALuint") int n2, @NativeType(value="ALenum") int n3, @NativeType(value="ALsizei") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALenum") int n6, @NativeType(value="ALvoid const *") double[] dArray) {
        long l = AL.getICD().alBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, n6, dArray, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") short[] sArray) {
        long l = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, sArray, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") int[] nArray) {
        long l = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, nArray, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") float[] fArray) {
        long l = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, fArray, l);
    }

    public static void alBufferSubSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid const *") double[] dArray) {
        long l = AL.getICD().alBufferSubSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, dArray, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") short[] sArray) {
        long l = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, sArray, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") int[] nArray) {
        long l = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, nArray, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") float[] fArray) {
        long l = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, fArray, l);
    }

    public static void alGetBufferSamplesSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALsizei") int n2, @NativeType(value="ALsizei") int n3, @NativeType(value="ALenum") int n4, @NativeType(value="ALenum") int n5, @NativeType(value="ALvoid *") double[] dArray) {
        long l = AL.getICD().alGetBufferSamplesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokePV(n, n2, n3, n4, n5, dArray, l);
    }
}

