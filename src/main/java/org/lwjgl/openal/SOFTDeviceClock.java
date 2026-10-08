/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.LongBuffer;
import org.lwjgl.openal.ALC;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class SOFTDeviceClock {
    public static final int ALC_DEVICE_CLOCK_SOFT = 5632;
    public static final int ALC_DEVICE_LATENCY_SOFT = 5633;
    public static final int ALC_DEVICE_CLOCK_LATENCY_SOFT = 5634;
    public static final int AL_SAMPLE_OFFSET_CLOCK_SOFT = 4610;
    public static final int AL_SEC_OFFSET_CLOCK_SOFT = 4611;

    public SOFTDeviceClock() {
        throw new UnsupportedOperationException();
    }

    public static void nalcGetInteger64vSOFT(long l, int n, int n2, long l2) {
        long l3 = ALC.getICD().alcGetInteger64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
        }
        JNI.invokePPV(l, n, n2, l2, l3);
    }

    @NativeType(value="ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType(value="ALCdevice *") long l, @NativeType(value="ALCenum") int n, @NativeType(value="ALCint64SOFT *") LongBuffer longBuffer) {
        LongBuffer longBuffer2 = longBuffer;
        int n2 = longBuffer2.remaining();
        long l2 = MemoryUtil.memAddress(longBuffer2);
        SOFTDeviceClock.nalcGetInteger64vSOFT(l, n, n2, l2);
    }

    @NativeType(value="ALCvoid")
    public static long alcGetInteger64vSOFT(@NativeType(value="ALCdevice *") long l, @NativeType(value="ALCenum") int n) {
        int n2;
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
            n2 = 1;
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        long l2 = MemoryUtil.memAddress(longBuffer);
        SOFTDeviceClock.nalcGetInteger64vSOFT(l, n, n2, l2);
        long l3 = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l3;
    }

    @NativeType(value="ALCvoid")
    public static void alcGetInteger64vSOFT(@NativeType(value="ALCdevice *") long l, @NativeType(value="ALCenum") int n, @NativeType(value="ALCint64SOFT *") long[] lArray) {
        long l2 = ALC.getICD().alcGetInteger64vSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePPV(l, n, lArray.length, lArray, l2);
    }
}

