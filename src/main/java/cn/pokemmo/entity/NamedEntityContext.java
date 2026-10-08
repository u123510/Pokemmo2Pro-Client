package cn.pokemmo.entity;

import f.CH0;
import f.cd0_2;

public interface NamedEntityContext {
    CH0 eU();
    cd0_2 oV();
    void pD(cd0_2 v1);

    default String getName() {
        return oV().DR;
    }

    default void fh0(cd0_2 v1) {
        cd0_2 curr = oV();
        if (curr == null) {
            pD(v1);
            return;
        }
        if (curr == v1) {
            return;
        }
        curr.getClass();
        curr.DR = v1.DR;
        curr.gw = v1.gw;
        curr.X3 = v1.X3;
        curr.YZ = v1.YZ;
    }
}
