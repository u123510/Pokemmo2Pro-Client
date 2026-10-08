/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLX13;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class GLX14
extends GLX13 {
    public static final int GLX_SAMPLE_BUFFERS = 100000;
    public static final int GLX_SAMPLES = 100001;

    public GLX14() {
        throw new UnsupportedOperationException();
    }

    public static long nglXGetProcAddress(long l) {
        long l2 = GL.getCapabilitiesGLXClient().glXGetProcAddress;
        if (Checks.CHECKS) {
            Checks.check(l2);
        }
        return JNI.callPP(l, l2);
    }

    @NativeType(value="void *")
    public static long glXGetProcAddress(@NativeType(value="GLchar const *") ByteBuffer byteBuffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(byteBuffer);
        }
        return GLX14.nglXGetProcAddress(MemoryUtil.memAddress(byteBuffer));
    }

    @NativeType(value="void *")
    public static long glXGetProcAddress(@NativeType(value="GLchar const *") CharSequence charSequence) {
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            memoryStack.nASCII(charSequence, true);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        long l = GLX14.nglXGetProcAddress(memoryStack.getPointerAddress());
        memoryStack.setPointer(n);
        return l;
    }
}

