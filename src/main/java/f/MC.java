package f;

import cn.pokemmo.rom.nds.dppt.PlatinumBattleSceneLoader;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.dppt.PlatinumBattleSceneLoader
 */
public class MC extends PlatinumBattleSceneLoader {
    public MC(byte var1, byte var2, short var3, byte var4, byte var5) { super(var1, var2, var3, var4, var5); }
    public MC(byte var1, byte var2, byte var3, byte var4, int var5, byte var6, byte var7) { super(var1, var2, var3, var4, var5, var6, var7); }
}
