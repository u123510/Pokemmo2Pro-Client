package cn.pokemmo.item;

import f.gu0;
import f.mc0_1;

public class ItemPairDescriptor {
    public final mc0_1 db;
    public final short OW;
    public final short Io;

    public ItemPairDescriptor(short first, short second) {
        this.OW = second;
        this.Io = first;
        this.db = gu0.Az0().lPT6(first);
    }
}
