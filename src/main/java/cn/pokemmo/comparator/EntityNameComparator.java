package cn.pokemmo.comparator;

import f.eo0_0;
import java.util.Comparator;

public class EntityNameComparator implements Comparator {
    public static final EntityNameComparator INSTANCE = new EntityNameComparator();

    public int M3(eo0_0 var1, eo0_0 var2) {
        return var1.JJ().compareTo(var2.JJ());
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.M3((eo0_0) var1, (eo0_0) var2);
    }
}
