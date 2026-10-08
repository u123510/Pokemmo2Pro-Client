/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.glfw;

import f.ms_2;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType(value="GLFWmonitorfun")
public interface GLFWMonitorCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer, LibFFI.ffi_type_sint32);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        long l3 = l2;
        long l4 = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l3));
        int n = ms_2.mY(l3, Pointer.POINTER_SIZE);
        this.invoke(l4, n);
    }

    public void invoke(@NativeType(value="GLFWmonitor *") long var1, int var3);
}

