package cn.pokemmo.comparator;

import f.Sp0;
import f.eo0_0;

/**
 * 宝可梦图鉴条目排序比较器
 */
public class PokemonEntryOrderComparator extends Sp0 {
    public static final PokemonEntryOrderComparator INSTANCE = new PokemonEntryOrderComparator();

    @Override
    public int M3(eo0_0 eo0_02, eo0_0 eo0_03) {
        if (eo0_02.M60.Gn(false) != eo0_03.M60.Gn(false)) {
            return eo0_02.M60.Gn(false) - eo0_03.M60.Gn(false);
        }
        return eo0_02.JJ().compareTo(eo0_03.JJ());
    }
}
