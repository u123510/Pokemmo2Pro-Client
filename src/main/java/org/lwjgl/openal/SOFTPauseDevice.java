/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.ALC;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class SOFTPauseDevice {
    public SOFTPauseDevice() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALCvoid")
    public static void alcDevicePauseSOFT(@NativeType(value="ALCdevice *") long l) {
        long l2 = ALC.getICD().alcDevicePauseSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, l2);
    }

    @NativeType(value="ALCvoid")
    public static void alcDeviceResumeSOFT(@NativeType(value="ALCdevice *") long l) {
        long l2 = ALC.getICD().alcDeviceResumeSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, l2);
    }
}

