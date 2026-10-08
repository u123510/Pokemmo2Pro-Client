package cn.pokemmo.io.filter;

import f.GQ;
import java.util.ArrayList;

public abstract class FileFilterUtils {
    public static ArrayList toList(IOFileFilter... filters) {
        ArrayList list = new ArrayList(filters.length);
        for (int i = 0; i < filters.length; ++i) {
            IOFileFilter filter;
            if ((filter = filters[i]) == null) {
                throw new IllegalArgumentException(GQ.ti("The filter[", i, "] is null"));
            }
            list.add(filter);
        }
        return list;
    }
}
