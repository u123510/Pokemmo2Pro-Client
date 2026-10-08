package f;

import cn.pokemmo.rom.nds.bw.BwPokemonModelRenderer;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.bw.BwPokemonModelRenderer
 */
public final class CX extends BwPokemonModelRenderer {
    public CX(short var1, boolean var2, byte var3) { super(var1, var2, var3); }
    public CX(int var1, short var2, short var3) { super(var1, var2, var3); }
    public CX() { super(); }
}
