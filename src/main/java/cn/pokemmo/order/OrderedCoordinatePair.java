package cn.pokemmo.order;

import f.*;

public class OrderedCoordinatePair implements Comparable {
    public final int aQ;
    public final int z;

    public OrderedCoordinatePair(int i, int j) {
        this.aQ = i;
        this.z = j;
    }

    @Override
    public final int compareTo(Object obj) {
        OrderedCoordinatePair other = (OrderedCoordinatePair) obj;
        return this.z - other.z;
    }
}
