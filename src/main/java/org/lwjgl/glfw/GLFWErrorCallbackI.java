/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.glfw;

import f.Cz0;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType(value="GLFWerrorfun")
public interface GLFWErrorCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        long l3 = l2;
        int n = MemoryUtil.memGetInt(MemoryUtil.memGetAddress(l3));
        l = Cz0.ox0(l3, Pointer.POINTER_SIZE);
        this.invoke(n, l);
    }

    public void invoke(int var1, @NativeType(value="char *") long var2);
}

