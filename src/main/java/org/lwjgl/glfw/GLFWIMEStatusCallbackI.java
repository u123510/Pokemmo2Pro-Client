/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.glfw;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType(value="GLFWimestatusfun")
public interface GLFWIMEStatusCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        this.invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l2)));
    }

    public void invoke(@NativeType(value="GLFWwindow *") long var1);
}

