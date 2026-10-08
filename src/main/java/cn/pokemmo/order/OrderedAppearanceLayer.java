package cn.pokemmo.order;

import f.*;

public class OrderedAppearanceLayer implements Comparable {
    public final byte eL;
    public long Zi0;
    public byte Ya0;
    public byte ka0;
    public byte uu0;
    public short lpT3;
    public short Dl;

    public OrderedAppearanceLayer(byte b) {
        this.eL = b;
    }

    public final long ZG0() {
        return this.Zi0;
    }

    @Override
    public final int compareTo(Object obj) {
        OrderedAppearanceLayer other = (OrderedAppearanceLayer) obj;
        return Long.compare(this.Zi0, other.Zi0);
    }
}
