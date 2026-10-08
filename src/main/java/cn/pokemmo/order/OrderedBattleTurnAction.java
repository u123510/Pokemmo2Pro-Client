package cn.pokemmo.order;

import f.*;

public class OrderedBattleTurnAction implements Comparable {
    public final short oA0;
    public final short Yq;
    public final byte Tc;
    public final short E70;
    public final byte yv;
    public final byte ad;
    public final boolean tm;
    public final boolean VA0;
    public final short Fq;

    public OrderedBattleTurnAction(short first, short second, short order, byte kind) {
        if (kind != 0) {
            throw new RuntimeException("");
        }
        this.Tc = kind;
        this.Yq = first;
        this.oA0 = second;
        this.E70 = order;
        this.yv = 0;
        this.ad = -1;
        this.tm = false;
        this.VA0 = false;
        this.Fq = 0;
    }

    public OrderedBattleTurnAction(byte kind, short value, byte first, byte second,
                boolean flag1, boolean flag2, short order) {
        if (kind != 1) {
            throw new RuntimeException("");
        }
        this.Tc = kind;
        this.Yq = value;
        this.E70 = order;
        this.yv = first;
        this.ad = second;
        this.tm = flag1;
        this.VA0 = flag2;
        this.oA0 = 1;
        this.Fq = 0;
    }

    public OrderedBattleTurnAction(byte kind, short first, short second) {
        if (kind != 2) {
            throw new RuntimeException("");
        }
        this.Tc = kind;
        this.Fq = first;
        this.E70 = second;
        this.oA0 = 0;
        this.Yq = 0;
        this.yv = -1;
        this.ad = -1;
        this.tm = false;
        this.VA0 = false;
    }

    @Override
    public final int compareTo(Object value) {
        return Short.compare(this.E70, ((OrderedBattleTurnAction) value).E70);
    }
}
