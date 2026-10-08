/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system.windows;

import f.AN;
import java.nio.IntBuffer;

public final class WindowsUtil {
    private WindowsUtil() {
    }

    public static void windowsThrowException(String string, IntBuffer intBuffer) {
        IntBuffer intBuffer2 = intBuffer;
        throw new RuntimeException(AN.nK0(string, " (error code = ").append(intBuffer2.get(intBuffer2.position())).append(")").toString());
    }
}

