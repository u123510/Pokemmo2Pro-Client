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
@NativeType(value="GLFWwindowmaximizefun")
public interface GLFWWindowMaximizeCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer, LibFFI.ffi_type_uint32);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        long l3 = l2;
        l = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l3));
        boolean bl = ms_2.mY(l3, Pointer.POINTER_SIZE) != 0;
        this.invoke(l, bl);
    }

    public void invoke(@NativeType(value="GLFWwindow *") long var1, @NativeType(value="int") boolean var3);
}

