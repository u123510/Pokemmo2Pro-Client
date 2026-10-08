package cn.pokemmo.battle;

import f.P80;
import f.ZR;
import f.cq_0;
import f.mp_1;
import f.wx_2;
import java.util.TreeMap;

public class BattleMoveEvolutionTreeResolver {
    public final wx_2 Ox;
    public final TreeMap FX;

    public BattleMoveEvolutionTreeResolver(cq_0 root) {
        this.Ox = new wx_2();
        this.FX = new TreeMap();
        tN(0, root);
    }

    public void tN(int index, cq_0 value) {
        if (value == null || this.Ox.bL0(value.dR)) return;
        this.Ox.TI0(value.dR);
        ZR bucket = (ZR) this.FX.get(index);
        if (bucket == null) {
            bucket = new ZR(index);
            this.FX.put(index, bucket);
        }
        bucket.Jc.put(Short.valueOf(value.dR), value);
        cq_0 parent = value.By;
        if (parent != null) tN(index - 2, parent);
        for (Object item : value.Xn) {
            P80 link = (P80) item;
            cq_0 child = (cq_0) mp_1.vf0().k2.get(Short.valueOf(link.YS));
            int childIndex = index + 1;
            ZR childBucket = (ZR) this.FX.get(childIndex);
            if (childBucket == null) {
                childBucket = new ZR(childIndex);
                this.FX.put(childIndex, childBucket);
            }
            childBucket.Rw0.put(Short.valueOf(link.YS), link);
            tN(index + 2, child);
        }
    }
}
