package cn.pokemmo.collection.wrapper;

import f.EQ;
import f.FT;
import f.jb0_1;
import f.rl_2;

public class DelegatingTableEntryIterator extends FT {
    public final rl_2 x30;

    public DelegatingTableEntryIterator(rl_2 rl_2, jb0_1 jb0_1) {
        super(jb0_1);
        this.x30 = rl_2;
    }

    @Override
    public Object Sx(int i) {
        jb0_1 map = this.x30.tv0;
        return new EQ(map, map.Yw[i], map.ba[i], i);
    }
}
