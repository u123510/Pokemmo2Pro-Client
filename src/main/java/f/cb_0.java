package f;

import cn.pokemmo.rom.nds.dppt.PlatinumMapZone;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.dppt.PlatinumMapZone
 */
public final class cb_0 extends PlatinumMapZone {
    public cb_0(Ts var1, short var2, byte var3, short var4, TE var5) { super(var1, var2, var3, var4, var5); }
    public static boolean Pc(LT var0) { return PlatinumMapZone.Pc(var0); }
    public static boolean Ed(LT var0) { return PlatinumMapZone.Ed(var0); }
    public static boolean XT(LT var0) { return PlatinumMapZone.XT(var0); }
}
