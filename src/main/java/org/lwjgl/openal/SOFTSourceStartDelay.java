/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.IntBuffer;
import org.lwjgl.openal.AL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class SOFTSourceStartDelay {
    public SOFTSourceStartDelay() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimeSOFT(@NativeType(value="ALuint") int n, @NativeType(value="ALint64SOFT") long l) {
        long l2 = AL.getICD().alSourcePlayAtTimeSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokeJV(n, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimeDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint") int n, @NativeType(value="ALint64SOFT") long l2) {
        long l3 = AL.getICD().alSourcePlayAtTimeDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePJV(l, n, l2, l3);
    }

    public static void nalSourcePlayAtTimevSOFT(int n, long l, long l2) {
        long l3 = AL.getICD().alSourcePlayAtTimevSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
        }
        JNI.invokePJV(n, l, l2, l3);
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType(value="ALuint const *") IntBuffer intBuffer, @NativeType(value="ALint64SOFT") long l) {
        SOFTSourceStartDelay.nalSourcePlayAtTimevSOFT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer), l);
    }

    public static void nalSourcePlayAtTimevDirectSOFT(long l, int n, long l2, long l3) {
        long l4 = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
        }
        JNI.invokePPJV(l, n, l2, l3, l4);
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint const *") IntBuffer intBuffer, @NativeType(value="ALint64SOFT") long l2) {
        IntBuffer intBuffer2 = intBuffer;
        int n = intBuffer2.remaining();
        long l3 = MemoryUtil.memAddress(intBuffer2);
        SOFTSourceStartDelay.nalSourcePlayAtTimevDirectSOFT(l, n, l3, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType(value="ALuint const *") int[] nArray, @NativeType(value="ALint64SOFT") long l) {
        long l2 = AL.getICD().alSourcePlayAtTimevSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        JNI.invokePJV(nArray.length, nArray, l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType(value="ALCcontext *") long l, @NativeType(value="ALuint const *") int[] nArray, @NativeType(value="ALint64SOFT") long l2) {
        long l3 = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l3);
            Checks.check(l);
        }
        JNI.invokePPJV(l, nArray.length, nArray, l2, l3);
    }
}

