package cn.pokemmo.comparator;

import f.GR;
import java.util.Comparator;

public class MonsterIndexComparator implements Comparator {
    public static final MonsterIndexComparator INSTANCE = new MonsterIndexComparator();

    public MonsterIndexComparator() {
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        GR gr1 = (GR) obj1;
        GR gr2 = (GR) obj2;
        return gr1.Em - gr2.Em;
    }
}
