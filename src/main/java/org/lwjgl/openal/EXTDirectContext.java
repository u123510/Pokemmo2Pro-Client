/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import org.lwjgl.openal.ALC;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDirectContext {
    public EXTDirectContext() {
        throw new UnsupportedOperationException();
    }

    public static long nalcGetProcAddress2(long l, long l2) {
        long l3 = ALC.getICD().alcGetProcAddress2;
        if (Checks.CHECKS) {
            Checks.check(l3);
        }
        return JNI.invokePPP(l, l2, l3);
    }

    @NativeType(value="ALCvoid *")
    public static long alcGetProcAddress2(@NativeType(value="ALCdevice *") long l, @NativeType(value="ALchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return EXTDirectContext.nalcGetProcAddress2(l, MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="ALCvoid *")
    public static long alcGetProcAddress2(@NativeType(value="ALCdevice *") long l, @NativeType(value="ALchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l2 = EXTDirectContext.nalcGetProcAddress2(l, memoryStack.getPointerAddress());
        memoryStack.setPointer(n);
        return l2;
    }
}

