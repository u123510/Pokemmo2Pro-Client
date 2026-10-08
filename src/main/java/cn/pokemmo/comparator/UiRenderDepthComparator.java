package cn.pokemmo.comparator;

import f.E90;
import java.util.Comparator;

public class UiRenderDepthComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        E90 e90 = (E90) object;
        object = (E90) object2;
        boolean bl = ((E90) object).w9;
        if (e90.w9 != bl) {
            if (!bl) return 1;
            return -1;
        }
        bl = ((E90) object).LPt7;
        if (e90.LPt7 != bl) {
            if (!bl) return 1;
            return -1;
        }
        bl = ((E90) object).uL0;
        if (e90.uL0 == bl) return Float.compare(((E90) object).DM, e90.DM);
        if (!bl) return 1;
        return -1;
    }
}
