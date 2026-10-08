/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.macosx.LibSystem;

public class LibC {
    public LibC() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="pid_t")
    public static long getpid() {
        return JNI.invokeP(Functions.getpid);
    }

    public static final class Functions {
        public static final long getpid = APIUtil.apiGetFunctionAddress(LibSystem.getLibrary(), "getpid");

        private Functions() {
        }
    }
}

