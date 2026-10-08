package cn.pokemmo.collection.group;

import f.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.d30_0
 */
public class EffectGroupIterable implements Iterable<Vw0> {

    public final k80_0 Xx0;
    public final ArrayList<Vw0> jp0;
    public final HashMap<Short, Q50> Hs;

    public EffectGroupIterable(k80_0 type) {
        this.jp0 = new ArrayList<>();
        this.Hs = new HashMap<>();
        this.Xx0 = type;
    }

    public final Q50 Rz0(short id) {
        return this.Hs.getOrDefault(Short.valueOf(id), Q50.ZF0);
    }

    public final void sA0(Vw0 value) {
        this.jp0.add(value);
        this.Hs.put(Short.valueOf(value.xX), value.ay);
    }

    @Override
    public final Iterator<Vw0> iterator() {
        return this.jp0.iterator();
    }
}
