package cn.pokemmo.order;

import f.*;

public class OrderedGridPoint implements Comparable {
    public final int Ax;
    public final int T20;


    public OrderedGridPoint(int i1, int i2) {
        this.Ax = i1;
        this.T20 = i2;
    }


    public final boolean equals(Object v1) {
        if (v1 instanceof OrderedGridPoint) {
            OrderedGridPoint o = (OrderedGridPoint) v1;
            return o.Ax == this.Ax && o.T20 == this.T20;
        }
        return false;
    }


    public final int hashCode() {
        return this.Ax | (this.T20 << 16);
    }


    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.Ax);
        sb.append(" x ");
        sb.append(this.T20);
        return sb.toString();
    }


    public final int compareTo(Object v1) {
        OrderedGridPoint o = (OrderedGridPoint) v1;
        int i2 = this.T20;
        int i3 = o.T20;
        if (i2 != i3) {
            return i3 - i2;
        }
        return o.Ax - this.Ax;
    }
}
