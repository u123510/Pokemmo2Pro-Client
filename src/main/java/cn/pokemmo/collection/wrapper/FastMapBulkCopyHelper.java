package cn.pokemmo.collection.wrapper;

import f.af_1;
import f.nb_2;

public class FastMapBulkCopyHelper {
    public final nb_2 Oa0 = new nb_2();

    public void GB(FastMapBulkCopyHelper source) {
        nb_2 targetMap = this.Oa0;
        nb_2 sourceMap = source.Oa0;
        int capacity = af_1.NK(targetMap.Va0 + sourceMap.Va0, targetMap.cB0);
        if (targetMap.z40.length < capacity) {
            targetMap.p70(capacity);
        }

        Object[] keys = sourceMap.z40;
        Object[] values = sourceMap.Pr;
        for (int index = 0; index < keys.length; index++) {
            Object key = keys[index];
            if (key != null) {
                targetMap.WK0(key, values[index]);
            }
        }
    }
}
