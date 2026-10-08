/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.stb;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType(value="int (*) (void *)")
public interface STBIEOFCallbackI
extends CallbackI {
    public static final FFICIF CIF = APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer);

    @Override
    default public FFICIF getCallInterface() {
        return CIF;
    }

    @Override
    default public void callback(long l, long l2) {
        APIUtil.apiClosureRet(l, this.invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(l2))));
    }

    public int invoke(@NativeType(value="void *") long var1);
}

