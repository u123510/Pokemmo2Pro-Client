/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class AL11
extends AL10 {
    public static final int AL_SEC_OFFSET = 4132;
    public static final int AL_SAMPLE_OFFSET = 4133;
    public static final int AL_BYTE_OFFSET = 4134;
    public static final int AL_STATIC = 4136;
    public static final int AL_STREAMING = 4137;
    public static final int AL_UNDETERMINED = 4144;
    public static final int AL_ILLEGAL_COMMAND = 40964;
    public static final int AL_SPEED_OF_SOUND = 49155;
    public static final int AL_LINEAR_DISTANCE = 53251;
    public static final int AL_LINEAR_DISTANCE_CLAMPED = 53252;
    public static final int AL_EXPONENT_DISTANCE = 53253;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = 53254;

    public AL11() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALvoid")
    public static void alListener3i(@NativeType(value="ALenum") int n, @NativeType(value="ALint") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4) {
        long l = AL.getICD().alListener3i;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, n3, n4, l);
    }

    @NativeType(value="ALvoid")
    public static void alListener3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4) {
        long l2 = AL.getICD().alListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, n3, n4, l2);
    }

    public static void nalGetListener3i(int n, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetListener3i;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetListener3i(@NativeType(value="ALenum") int n, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetListener3i(n, l, l2, l3);
    }

    public static void nalGetListener3iDirect(long l, int n, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetListener3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        long l4 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetListener3iDirect(l2, n, l, l3, l4);
    }

    public static void nalGetListeneriv(int n, long l) {
        long l2 = AL.getICD().alGetListeneriv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetListeneriv(@NativeType(value="ALenum") int n, @NativeType(value="ALint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        AL11.nalGetListeneriv(n, MemoryUtil.memAddress(intBuffer));
    }

    public static void nalGetListenerivDirect(long l, int n, long l2) {
        long l3 = AL.getICD().alGetListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetListenerivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        AL11.nalGetListenerivDirect(l2, n, l);
    }

    @NativeType(value="ALvoid")
    public static void alSource3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4, @NativeType(value="ALint") int n5) {
        long l = AL.getICD().alSource3i;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, n3, n4, n5, l);
    }

    @NativeType(value="ALvoid")
    public static void alSource3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4, @NativeType(value="ALint") int n5) {
        long l2 = AL.getICD().alSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, n3, n4, n5, l2);
    }

    public static void nalGetSource3i(int n, int n2, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetSource3i;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetSource3i(n, n2, l, l2, l3);
    }

    public static void nalGetSource3iDirect(long l, int n, int n2, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, n2, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        long l4 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetSource3iDirect(l2, n, n2, l, l3, l4);
    }

    public static void nalListeneriv(int n, long l) {
        long l2 = AL.getICD().alListeneriv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alListeneriv(@NativeType(value="ALenum") int n, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        AL11.nalListeneriv(n, MemoryUtil.memAddress(intBuffer));
    }

    public static void nalListenerivDirect(long l, int n, long l2) {
        long l3 = AL.getICD().alListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alListenerivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        AL11.nalListenerivDirect(l2, n, l);
    }

    public static void nalSourceiv(int n, int n2, long l) {
        long l2 = AL.getICD().alSourceiv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourceiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        AL11.nalSourceiv(n, n2, l);
    }

    public static void nalSourceivDirect(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alSourceivDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alSourceivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        AL11.nalSourceivDirect(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferf(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat") float f) {
        long l = AL.getICD().alBufferf;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, f, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferfDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat") float f) {
        long l2 = AL.getICD().alBufferfDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, f, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBuffer3f(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat") float f, @NativeType(value="ALfloat") float f2, @NativeType(value="ALfloat") float f3) {
        long l = AL.getICD().alBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, f, f2, f3, l);
    }

    @NativeType(value="ALvoid")
    public static void alBuffer3fDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat") float f, @NativeType(value="ALfloat") float f2, @NativeType(value="ALfloat") float f3) {
        long l2 = AL.getICD().alBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, f, f2, f3, l2);
    }

    public static void nalBufferfv(int n, int n2, long l) {
        long l2 = AL.getICD().alBufferfv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferfv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        AL11.nalBufferfv(n, n2, l);
    }

    public static void nalBufferfvDirect(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferfvDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat const *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(floatBuffer);
        AL11.nalBufferfvDirect(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferi(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3) {
        long l = AL.getICD().alBufferi;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, n3, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferiDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3) {
        long l2 = AL.getICD().alBufferiDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, n3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBuffer3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4, @NativeType(value="ALint") int n5) {
        long l = AL.getICD().alBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, n3, n4, n5, l);
    }

    @NativeType(value="ALvoid")
    public static void alBuffer3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint") int n3, @NativeType(value="ALint") int n4, @NativeType(value="ALint") int n5) {
        long l2 = AL.getICD().alBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, n3, n4, n5, l2);
    }

    public static void nalBufferiv(int n, int n2, long l) {
        long l2 = AL.getICD().alBufferiv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        AL11.nalBufferiv(n, n2, l);
    }

    public static void nalBufferivDirect(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alBufferivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        AL11.nalBufferivDirect(l2, n, n2, l);
    }

    public static void nalGetBuffer3i(int n, int n2, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        long l3 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetBuffer3i(n, n2, l, l2, l3);
    }

    public static void nalGetBuffer3iDirect(long l, int n, int n2, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, n2, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer, @NativeType(value="ALint *") IntBuffer intBuffer2, @NativeType(value="ALint *") IntBuffer intBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
            Checks.check((Buffer)intBuffer2, 1);
            Checks.check((Buffer)intBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        long l3 = MemoryUtil.memAddress(intBuffer2);
        long l4 = MemoryUtil.memAddress(intBuffer3);
        AL11.nalGetBuffer3iDirect(l2, n, n2, l, l3, l4);
    }

    public static void nalGetBufferiv(int n, int n2, long l) {
        long l2 = AL.getICD().alGetBufferiv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        AL11.nalGetBufferiv(n, n2, l);
    }

    public static void nalGetBufferivDirect(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(intBuffer);
        AL11.nalGetBufferivDirect(l2, n, n2, l);
    }

    public static void nalGetBuffer3f(int n, int n2, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3f(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer, @NativeType(value="ALfloat *") FloatBuffer floatBuffer2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
            Checks.check((Buffer)floatBuffer2, 1);
            Checks.check((Buffer)floatBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        long l2 = MemoryUtil.memAddress(floatBuffer2);
        long l3 = MemoryUtil.memAddress(floatBuffer3);
        AL11.nalGetBuffer3f(n, n2, l, l2, l3);
    }

    public static void nalGetBuffer3fDirect(long l, int n, int n2, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, n2, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3fDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer, @NativeType(value="ALfloat *") FloatBuffer floatBuffer2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
            Checks.check((Buffer)floatBuffer2, 1);
            Checks.check((Buffer)floatBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(floatBuffer);
        long l3 = MemoryUtil.memAddress(floatBuffer2);
        long l4 = MemoryUtil.memAddress(floatBuffer3);
        AL11.nalGetBuffer3fDirect(l2, n, n2, l, l3, l4);
    }

    public static void nalGetBufferfv(int n, int n2, long l) {
        long l2 = AL.getICD().alGetBufferfv;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferfv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l = MemoryUtil.memAddress(floatBuffer);
        AL11.nalGetBufferfv(n, n2, l);
    }

    public static void nalGetBufferfvDirect(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferfvDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") FloatBuffer floatBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)floatBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(floatBuffer);
        AL11.nalGetBufferfvDirect(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static void alSpeedOfSound(@NativeType(value="ALfloat") float f) {
        long l = AL.getICD().alSpeedOfSound;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(f, l);
    }

    @NativeType(value="ALvoid")
    public static void alSpeedOfSoundDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALfloat") float f) {
        long l2 = AL.getICD().alSpeedOfSoundDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, f, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetListener3i(@NativeType(value="ALenum") int n, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l = AL.getICD().alGetListener3i;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPV(n, nArray, nArray2, nArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetListener3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l2 = AL.getICD().alGetListener3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPPV(l, n, nArray, nArray2, nArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetListeneriv(@NativeType(value="ALenum") int n, @NativeType(value="ALint *") int[] nArray) {
        long l = AL.getICD().alGetListeneriv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePV(n, nArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetListenerivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint *") int[] nArray) {
        long l2 = AL.getICD().alGetListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePPV(l, n, nArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l = AL.getICD().alGetSource3i;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPV(n, n2, nArray, nArray2, nArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l2 = AL.getICD().alGetSource3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPPV(l, n, n2, nArray, nArray2, nArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alListeneriv(@NativeType(value="ALenum") int n, @NativeType(value="ALint const *") int[] nArray) {
        long l = AL.getICD().alListeneriv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePV(n, nArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alListenerivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALenum") int n, @NativeType(value="ALint const *") int[] nArray) {
        long l2 = AL.getICD().alListenerivDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePPV(l, n, nArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourceiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") int[] nArray) {
        long l = AL.getICD().alSourceiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePV(n, n2, nArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourceivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") int[] nArray) {
        long l2 = AL.getICD().alSourceivDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePPV(l, n, n2, nArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferfv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat const *") float[] fArray) {
        long l = AL.getICD().alBufferfv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.invokePV(n, n2, fArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferfvDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat const *") float[] fArray) {
        long l2 = AL.getICD().alBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.invokePPV(l, n, n2, fArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alBufferiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") int[] nArray) {
        long l = AL.getICD().alBufferiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePV(n, n2, nArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alBufferivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint const *") int[] nArray) {
        long l2 = AL.getICD().alBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePPV(l, n, n2, nArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3i(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l = AL.getICD().alGetBuffer3i;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPV(n, n2, nArray, nArray2, nArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3iDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray, @NativeType(value="ALint *") int[] nArray2, @NativeType(value="ALint *") int[] nArray3) {
        long l2 = AL.getICD().alGetBuffer3iDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
            Checks.check(nArray2, 1);
            Checks.check(nArray3, 1);
        }
        JNI.invokePPPPV(l, n, n2, nArray, nArray2, nArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferiv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray) {
        long l = AL.getICD().alGetBufferiv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePV(n, n2, nArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferivDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint *") int[] nArray) {
        long l2 = AL.getICD().alGetBufferivDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.invokePPV(l, n, n2, nArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3f(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") float[] fArray, @NativeType(value="ALfloat *") float[] fArray2, @NativeType(value="ALfloat *") float[] fArray3) {
        long l = AL.getICD().alGetBuffer3f;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
            Checks.check(fArray2, 1);
            Checks.check(fArray3, 1);
        }
        JNI.invokePPPV(n, n2, fArray, fArray2, fArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetBuffer3fDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") float[] fArray, @NativeType(value="ALfloat *") float[] fArray2, @NativeType(value="ALfloat *") float[] fArray3) {
        long l2 = AL.getICD().alGetBuffer3fDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(fArray, 1);
            Checks.check(fArray2, 1);
            Checks.check(fArray3, 1);
        }
        JNI.invokePPPPV(l, n, n2, fArray, fArray2, fArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferfv(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") float[] fArray) {
        long l = AL.getICD().alGetBufferfv;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.invokePV(n, n2, fArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetBufferfvDirect(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALfloat *") float[] fArray) {
        long l2 = AL.getICD().alGetBufferfvDirect;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(fArray, 1);
        }
        JNI.invokePPV(l, n, n2, fArray, l2);
    }
}

