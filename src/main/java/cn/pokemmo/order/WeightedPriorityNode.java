package cn.pokemmo.order;

import f.*;

public class WeightedPriorityNode implements Comparable {
    public final byte v9;
    public final int EN;
    public final int EG;
    public int dP;

    public WeightedPriorityNode(byte b, int i, int j) {
        this.dP = rg0_2.r4(100);
        this.v9 = b;
        this.EN = i;
        this.EG = j;
    }

    @Override
    public final int compareTo(Object obj) {
        WeightedPriorityNode other = (WeightedPriorityNode) obj;
        int i2 = other.EN;
        int i3 = this.EN;
        if (i2 == i3) {
            int ret = this.dP;
            other.dP = ret;
            return ret;
        } else {
            return i2 - i3;
        }
    }
}
