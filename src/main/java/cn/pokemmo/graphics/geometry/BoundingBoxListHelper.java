package cn.pokemmo.graphics.geometry;

import f.qg_1;
import java.util.ArrayList;

public abstract class BoundingBoxListHelper {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static qg_1 addBoxAndCreateNext(ArrayList arrayList, qg_1 qg_12, int n, int n2, int n3) {
        arrayList.add(qg_12);
        return new qg_1(n, n2, n3);
    }

    public static qg_1 hn0(ArrayList arrayList, qg_1 qg_12, int n, int n2, int n3) {
        return addBoxAndCreateNext(arrayList, qg_12, n, n2, n3);
    }
}
