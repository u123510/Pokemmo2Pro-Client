/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.Library;
import org.lwjgl.system.SharedLibrary;

public final class LibSystem {
    private static final SharedLibrary SYSTEM = Library.loadNative(LibSystem.class, "org.lwjgl", "System");

    public static SharedLibrary getLibrary() {
        return SYSTEM;
    }

    private LibSystem() {
        throw new UnsupportedOperationException();
    }
}

