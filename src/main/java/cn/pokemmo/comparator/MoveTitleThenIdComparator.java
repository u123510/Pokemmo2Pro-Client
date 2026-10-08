package cn.pokemmo.comparator;

import f.HV;
import java.util.Comparator;

public class MoveTitleThenIdComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        String string;
        HV hV = (HV) object;
        object = (HV) object2;
        object2 = hV.wG0().split("\\(")[0];
        return ((String) object2).compareTo(string = ((HV) object).wG0().split("\\(")[0]) != 0
                ? ((String) object2).compareTo(string)
                : hV.Lpt3 - ((HV) object).Lpt3;
    }
}
