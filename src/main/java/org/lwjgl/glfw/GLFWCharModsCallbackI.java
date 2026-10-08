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
@NativeType(value="GLFWcharmodsfun")
public interface GLFWCharModsCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer, LibFFI.ffi_type_uint32, LibFFI.ffi_type_sint32);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        long l3 = l2;
        long l4 = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l3));
        int n = Pointer.POINTER_SIZE;
        int n2 = n;
        n2 = ms_2.mY(l2, n2);
        int n3 = ms_2.mY(l3, n * 2);
        this.invoke(l4, n2, n3);
    }

    public void invoke(@NativeType(value="GLFWwindow *") long var1, @NativeType(value="unsigned int") int var3, int var4);
}

