/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.AL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class SOFTDeferredUpdates {
    public static final int AL_DEFERRED_UPDATES_SOFT = 49154;

    public SOFTDeferredUpdates() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALvoid")
    public static void alDeferUpdatesSOFT() {
        long l = AL.getICD().alDeferUpdatesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(l);
    }

    @NativeType(value="ALvoid")
    public static void alDeferUpdatesDirectSOFT(@NativeType(value="ALCcontext *") long l) {
        long l2 = AL.getICD().alDeferUpdatesDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, l2);
    }

    @NativeType(value="ALvoid")
    public static void alProcessUpdatesSOFT() {
        long l = AL.getICD().alProcessUpdatesSOFT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.invokeV(l);
    }

    @NativeType(value="ALvoid")
    public static void alProcessUpdatesDirectSOFT(@NativeType(value="ALCcontext *") long l) {
        long l2 = AL.getICD().alProcessUpdatesDirectSOFT;
        if (Checks.CHECKS) {
            Checks.check(l2);
            Checks.check(l);
        }
        JNI.invokePV(l, l2);
    }
}

