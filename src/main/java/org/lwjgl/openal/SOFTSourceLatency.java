/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import java.nio.LongBuffer;
import org.lwjgl.openal.AL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class SOFTSourceLatency {
    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 4608;
    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 4609;

    public SOFTSourceLatency() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALvoid")
    public static void alSourcedSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble") double d) {
        long l = AL.getICD().alSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, d, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourcedDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble") double d) {
        long l2 = AL.getICD().alSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, d, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSource3dSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble") double d, @NativeType(value="ALdouble") double d2, @NativeType(value="ALdouble") double d4) {
        long l = AL.getICD().alSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(n, n2, d, d2, d4, l);
    }

    @NativeType(value="ALvoid")
    public static void alSource3dDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble") double d, @NativeType(value="ALdouble") double d2, @NativeType(value="ALdouble") double d4) {
        long l2 = AL.getICD().alSource3dDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, n, n2, d, d2, d4, l2);
    }

    public static void nalSourcedvSOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcedvSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalSourcedvSOFT(n, n2, l);
    }

    public static void nalSourcedvDirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble const *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalSourcedvDirectSOFT(l2, n, n2, l);
    }

    public static void nalGetSourcedSOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alGetSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalGetSourcedSOFT(n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static double alGetSourcedSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2) {
        DoubleBuffer doubleBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            doubleBuffer = memoryStack.callocDouble(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        SOFTSourceLatency.nalGetSourcedSOFT(n, n2, MemoryUtil.memAddress(doubleBuffer));
        double d = doubleBuffer.get(0);
        memoryStack.setPointer(n3);
        return d;
    }

    public static void nalGetSourcedDirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalGetSourcedDirectSOFT(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static double alGetSourcedDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2) {
        DoubleBuffer doubleBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            doubleBuffer = memoryStack.callocDouble(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        SOFTSourceLatency.nalGetSourcedDirectSOFT(l, n, n2, MemoryUtil.memAddress(doubleBuffer));
        double d = doubleBuffer.get(0);
        memoryStack.setPointer(n3);
        return d;
    }

    public static void nalGetSource3dSOFT(int n, int n2, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3dSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
            Checks.check((Buffer)doubleBuffer2, 1);
            Checks.check((Buffer)doubleBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(doubleBuffer);
        long l2 = MemoryUtil.memAddress(doubleBuffer2);
        long l3 = MemoryUtil.memAddress(doubleBuffer3);
        SOFTSourceLatency.nalGetSource3dSOFT(n, n2, l, l2, l3);
    }

    public static void nalGetSource3dDirectSOFT(long l, int n, int n2, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetSource3dDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, n2, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
            Checks.check((Buffer)doubleBuffer2, 1);
            Checks.check((Buffer)doubleBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(doubleBuffer);
        long l3 = MemoryUtil.memAddress(doubleBuffer2);
        long l4 = MemoryUtil.memAddress(doubleBuffer3);
        SOFTSourceLatency.nalGetSource3dDirectSOFT(l2, n, n2, l, l3, l4);
    }

    public static void nalGetSourcedvSOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alGetSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedvSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalGetSourcedvSOFT(n, n2, l);
    }

    public static void nalGetSourcedvDirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") DoubleBuffer doubleBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)doubleBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(doubleBuffer);
        SOFTSourceLatency.nalGetSourcedvDirectSOFT(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT") long l) {
        long l2 = AL.getICD().alSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokeJV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT") long l2) {
        long l3 = AL.getICD().alSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePJV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alSource3i64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT") long l, @NativeType(value="ALint64SOFT") long l2, @NativeType(value="ALint64SOFT") long l3) {
        long l4 = AL.getICD().alSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokeJJJV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alSource3i64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT") long l2, @NativeType(value="ALint64SOFT") long l3, @NativeType(value="ALint64SOFT") long l4) {
        long l5 = AL.getICD().alSource3i64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePJJJV(l, n, n2, l2, l3, l4, l5);
    }

    public static void nalSourcei64vSOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64vSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalSourcei64vSOFT(n, n2, l);
    }

    public static void nalSourcei64vDirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT const *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalSourcei64vDirectSOFT(l2, n, n2, l);
    }

    public static void nalGetSourcei64SOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alGetSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalGetSourcei64SOFT(n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static long alGetSourcei64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        SOFTSourceLatency.nalGetSourcei64SOFT(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static void nalGetSourcei64DirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalGetSourcei64DirectSOFT(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static long alGetSourcei64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        SOFTSourceLatency.nalGetSourcei64DirectSOFT(l, n, n2, MemoryUtil.memAddress(longBuffer));
        long l2 = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l2;
    }

    public static void nalGetSource3i64SOFT(int n, int n2, long l, long l2, long l3) {
        long l4 = AL.getICD().alGetSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l4);
        }
        JNI.invokePPPV(n, n2, l, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
            Checks.check((Buffer)longBuffer2, 1);
            Checks.check((Buffer)longBuffer3, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        long l2 = MemoryUtil.memAddress(longBuffer2);
        long l3 = MemoryUtil.memAddress(longBuffer3);
        SOFTSourceLatency.nalGetSource3i64SOFT(n, n2, l, l2, l3);
    }

    public static void nalGetSource3i64DirectSOFT(long l, int n, int n2, long l2, long l3, long l4) {
        long l5 = AL.getICD().alGetSource3i64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l5);
            Checks.check(l);
        }
        JNI.invokePPPPV(l, n, n2, l2, l3, l4, l5);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer3) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
            Checks.check((Buffer)longBuffer2, 1);
            Checks.check((Buffer)longBuffer3, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(longBuffer);
        long l3 = MemoryUtil.memAddress(longBuffer2);
        long l4 = MemoryUtil.memAddress(longBuffer3);
        SOFTSourceLatency.nalGetSource3i64DirectSOFT(l2, n, n2, l, l3, l4);
    }

    public static void nalGetSourcei64vSOFT(int n, int n2, long l) {
        long l2 = AL.getICD().alGetSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePV(n, n2, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalGetSourcei64vSOFT(n, n2, l);
    }

    public static void nalGetSourcei64vDirectSOFT(long l, int n, int n2, long l2) {
        long l3 = AL.getICD().alGetSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l2 = l;
        l = MemoryUtil.memAddress(longBuffer);
        SOFTSourceLatency.nalGetSourcei64vDirectSOFT(l2, n, n2, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourcedvSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble const *") double[] dArray) {
        long l = AL.getICD().alSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePV(n, n2, dArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble const *") double[] dArray) {
        long l2 = AL.getICD().alSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePPV(l, n, n2, dArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray) {
        long l = AL.getICD().alGetSourcedSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePV(n, n2, dArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray) {
        long l2 = AL.getICD().alGetSourcedDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePPV(l, n, n2, dArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3dSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray, @NativeType(value="ALdouble *") double[] dArray2, @NativeType(value="ALdouble *") double[] dArray3) {
        long l = AL.getICD().alGetSource3dSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 1);
            Checks.check(dArray2, 1);
            Checks.check(dArray3, 1);
        }
        JNI.invokePPPV(n, n2, dArray, dArray2, dArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray, @NativeType(value="ALdouble *") double[] dArray2, @NativeType(value="ALdouble *") double[] dArray3) {
        long l2 = AL.getICD().alGetSource3dDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(dArray, 1);
            Checks.check(dArray2, 1);
            Checks.check(dArray3, 1);
        }
        JNI.invokePPPPV(l, n, n2, dArray, dArray2, dArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedvSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray) {
        long l = AL.getICD().alGetSourcedvSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePV(n, n2, dArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALdouble *") double[] dArray) {
        long l2 = AL.getICD().alGetSourcedvDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(dArray, 1);
        }
        JNI.invokePPV(l, n, n2, dArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64vSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT const *") long[] lArray) {
        long l = AL.getICD().alSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePV(n, n2, lArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT const *") long[] lArray) {
        long l2 = AL.getICD().alSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePPV(l, n, n2, lArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray) {
        long l = AL.getICD().alGetSourcei64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePV(n, n2, lArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray) {
        long l2 = AL.getICD().alGetSourcei64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePPV(l, n, n2, lArray, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i64SOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray, @NativeType(value="ALint64SOFT *") long[] lArray2, @NativeType(value="ALint64SOFT *") long[] lArray3) {
        long l = AL.getICD().alGetSource3i64SOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
            Checks.check(lArray2, 1);
            Checks.check(lArray3, 1);
        }
        JNI.invokePPPV(n, n2, lArray, lArray2, lArray3, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray, @NativeType(value="ALint64SOFT *") long[] lArray2, @NativeType(value="ALint64SOFT *") long[] lArray3) {
        long l2 = AL.getICD().alGetSource3i64DirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(lArray, 1);
            Checks.check(lArray2, 1);
            Checks.check(lArray3, 1);
        }
        JNI.invokePPPPV(l, n, n2, lArray, lArray2, lArray3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray) {
        long l = AL.getICD().alGetSourcei64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePV(n, n2, lArray, l);
    }

    @NativeType(value="ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALenum") int n2, @NativeType(value="ALint64SOFT *") long[] lArray) {
        long l2 = AL.getICD().alGetSourcei64vDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.invokePPV(l, n, n2, lArray, l2);
    }
}

