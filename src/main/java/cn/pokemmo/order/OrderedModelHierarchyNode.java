package cn.pokemmo.order;

import f.*;

import java.util.ArrayList;

public class OrderedModelHierarchyNode implements Comparable {
    public final N2 kK0;
    public final ArrayList x2;

    public OrderedModelHierarchyNode(N2 v1) {
        super();
        this.x2 = new ArrayList();
        this.kK0 = v1;
    }

    public final N2 hT() {
        return this.kK0;
    }

    public final ArrayList Gc0() {
        return this.x2;
    }

    @Override
    public final int compareTo(Object v1) {
        N2 other = ((OrderedModelHierarchyNode)v1).kK0;
        N2 current = this.kK0;
        int result;
        if (other != null && current != null) {
            result = Integer.compare(other.yz, current.yz);
        } else if (other == null) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
