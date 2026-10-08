/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.egl;

import org.lwjgl.egl.EGL;
import org.lwjgl.egl.EGLGetBlobFuncANDROIDI;
import org.lwjgl.egl.EGLSetBlobFuncANDROIDI;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public class ANDROIDBlobCache {
    public ANDROIDBlobCache() {
        throw new UnsupportedOperationException();
    }

    public static void neglSetBlobCacheFuncsANDROID(long l, long l2, long l3) {
        long l4 = EGL.getCapabilities().eglSetBlobCacheFuncsANDROID;
        if (Checks.CHECKS) {
            Checks.check(l4);
            Checks.check(l);
        }
        JNI.callPPPV(l, l2, l3, l4);
    }

    public static void eglSetBlobCacheFuncsANDROID(@NativeType(value="EGLDisplay") long l, @NativeType(value="EGLSetBlobFuncANDROID") EGLSetBlobFuncANDROIDI eGLSetBlobFuncANDROIDI, @NativeType(value="EGLGetBlobFuncANDROID") EGLGetBlobFuncANDROIDI eGLGetBlobFuncANDROIDI) {
        long l2 = l;
        l = eGLSetBlobFuncANDROIDI.address();
        long l3 = eGLGetBlobFuncANDROIDI.address();
        ANDROIDBlobCache.neglSetBlobCacheFuncsANDROID(l2, l, l3);
    }
}

