/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.ALC;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class EXTThreadLocalContext {
    public EXTThreadLocalContext() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="ALCboolean")
    public static boolean alcSetThreadContext(@NativeType(value="ALCcontext *") long l) {
        long l2 = ALC.getICD().alcSetThreadContext;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.invokePZ(l, l2);
    }

    @NativeType(value="ALCcontext *")
    public static long alcGetThreadContext() {
        long l = ALC.getICD().alcGetThreadContext;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        return JNI.invokeP(l);
    }
}

