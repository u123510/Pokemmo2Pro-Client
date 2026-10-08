package cn.pokemmo.order;

import f.*;

public class OrderedTextureState implements Comparable {
    public final int Im0;
    public final iz0_0[] kc0;

    public OrderedTextureState(int i, iz0_0... iz0_0s) {
        this.Im0 = i;
        this.kc0 = iz0_0s;
    }

    @Override
    public final int compareTo(Object obj) {
        OrderedTextureState other = (OrderedTextureState) obj;
        return this.Im0 - other.Im0;
    }
}
