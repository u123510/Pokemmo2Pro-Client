package cn.pokemmo.rom.nds.narc;

import f.Ae;
import f.FJ;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * NDS NARC 条目迭代器
 */
public class NarcEntryIterator implements Iterator<Ae> {
    public int NJ0 = 0;
    public final NarcArchive MN;

    public NarcEntryIterator(NarcArchive archive) {
        this.MN = archive;
    }

    @Override
    public boolean hasNext() {
        return this.NJ0 < this.MN.AC.F10;
    }

    @Override
    public Ae next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int n = this.NJ0;
        this.NJ0 = n + 1;
        return this.MN.GJ(n);
    }
}
