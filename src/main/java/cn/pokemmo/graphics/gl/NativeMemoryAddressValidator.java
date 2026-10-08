package cn.pokemmo.graphics.gl;

import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;

public abstract class NativeMemoryAddressValidator {
    public static void lf0(long l, long l2) {
        Checks.check(MemoryUtil.memGetAddress(l + l2));
    }
}
