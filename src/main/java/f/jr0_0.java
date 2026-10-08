package f;

import cn.pokemmo.pokemon.encounter.WildPokemonEncounterData;

/**
 * 兼容垫片 (Shim) - 野生宝可梦明雷/暗雷生成记录 (Wild Pokemon Encounter Data)
 * 实际实现已迁移至 {@link WildPokemonEncounterData}
 */
public final class jr0_0 extends WildPokemonEncounterData {
    public jr0_0(byte b, byte b2, short s, boolean z, boolean z2, byte b3, boolean z3, boolean z4, byte b4, byte b5, byte b6) {
        super(b, b2, s, z, z2, b3, z3, z4, b4, b5, b6);
    }
    public jr0_0(byte b, byte b2, int i, int i2, int i3, short s, short s2, byte b3) {
        super(b, b2, i, i2, i3, s, s2, b3);
    }
}
