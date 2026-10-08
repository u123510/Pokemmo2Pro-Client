package cn.pokemmo.comparator;

import f.DA;
import f.HV;
import java.util.Comparator;

public class MoveTierComparator implements Comparator {
    public final boolean eh0;

    public MoveTierComparator(boolean bl) {
        this.eh0 = bl;
    }

    @Override
    public int compare(Object object, Object object2) {
        int n;
        int n2;
        int n3;
        DA dA;
        boolean bl;
        object = (HV) object;
        object2 = (HV) object2;
        DA dA2 = ((HV) object).dE0;
        boolean bl2 = dA2 == null;
        if (bl2 != (bl = (dA = ((HV) object2).dE0) == null)) {
            int n4 = dA == null ? 0 : 1;
            int n5 = dA2 == null ? 0 : 1;
            n3 = n4 - n5;
            return n3;
        }
        if (!(!this.eh0 ? (n2 = ((HV) object).ME) != (n = ((HV) object2).ME) : (n2 = ((HV) object).xk0) != (n = ((HV) object2).xk0)) && (n2 = ((HV) object).wG) == (n = ((HV) object2).wG)) {
            n3 = ((HV) object2).Lpt3 - ((HV) object).Lpt3;
            return n3;
        }
        n3 = n - n2;
        return n3;
    }
}
