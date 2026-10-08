package cn.pokemmo.comparator;

import f.Tv0;
import f.lc_0;
import java.util.Comparator;

public class DistanceToCameraDescendingComparator implements Comparator {
    public final Tv0 COm3;

    public DistanceToCameraDescendingComparator(Tv0 tv0) {
        this.COm3 = tv0;
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        lc_0 a = (lc_0) obj1;
        lc_0 b = (lc_0) obj2;
        float distA = this.COm3.v40.SH0(a.ei0);
        float distB = this.COm3.v40.SH0(b.ei0);
        return (int) Math.signum(distB - distA);
    }
}
