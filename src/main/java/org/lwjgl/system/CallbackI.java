/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system;

import org.lwjgl.system.Callback;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.libffi.FFICIF;

public interface CallbackI
extends Pointer {
    public FFICIF getCallInterface();

    @Override
    default public long address() {
        return Callback.create(this.getCallInterface(), this);
    }

    public void callback(long var1, long var3);
}

