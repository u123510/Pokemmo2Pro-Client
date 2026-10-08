package cn.pokemmo.collection.wrapper;

import f.FT;
import f.Jz;
import f.jb0_1;
import java.util.Iterator;

public class ObjectSetAdapter extends Jz {
    public final jb0_1 tE;

    public ObjectSetAdapter(jb0_1 jb0_1) {
        super(jb0_1, 0);
        this.tE = jb0_1;
    }

    @Override
    public Iterator iterator() {
        return new FT(this.tE);
    }

    @Override
    public boolean QT(Object obj) {
        return this.tE.remove(obj) != null;
    }

    @Override
    public boolean z4(Object obj) {
        return this.tE.s60(obj);
    }
}
