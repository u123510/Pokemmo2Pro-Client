package f;

import cn.pokemmo.pokemon.species.WildEncounterSlotEntry;

/**
 * 兼容垫片 (Shim) - 野生遭遇分布槽位条目 (Wild Encounter Slot Entry)
 * 实际实现已迁移至 {@link WildEncounterSlotEntry}
 */
public final class OJ extends WildEncounterSlotEntry {
    public OJ(byte by, byte by2, int n, byte by3, byte by4, short s, tu_0 tu_02) {
        super(by, by2, n, by3, by4, s, tu_02);
    }
}
