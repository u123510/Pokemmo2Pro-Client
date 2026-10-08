package f;

import cn.pokemmo.pokemon.species.WildEncounterRateRecord;

/**
 * 兼容垫片 (Shim) - 野生宝可梦遭遇概率与等级分布记录 (Wild Encounter Rate Record)
 * 实际实现已迁移至 {@link WildEncounterRateRecord}
 */
public final class HV extends WildEncounterRateRecord {
    public HV(int i1, E10 v2, byte i3, short i4, int i5, int i6, int i7, int i8, int i9, byte i10) {
        super(i1, v2, i3, i4, i5, i6, i7, i8, i9, i10);
    }
}
