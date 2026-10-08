package cn.pokemmo.net.packet;

import f.*;

public class PacketHeaderDescriptor {
    public static final NA0 T70;
    public static final NA0 ED;
    public static final NA0 P5;
    public static final NA0 X10;
    public static final NA0 oO;
    public static final NA0 oH;
    public static final NA0 rD0;
    public static final NA0 om0;
    public static final NA0 n90;
    public static final bm0_1 v6;
    public static final NA0[] UK;
    public final byte sk;
    public final boolean Zq0;
    public final boolean CP;
    public final int g20;

    public PacketHeaderDescriptor(int value, byte flag, boolean first, boolean second) {
        this.g20 = value;
        this.sk = flag;
        this.Zq0 = first;
        this.CP = second;
    }

    static {
        NA0 value0 = new NA0(0, (byte)0, false, true);
        T70 = value0;
        NA0 value1 = new NA0(1, (byte)1, false, true);
        NA0 value2 = new NA0(2, (byte)2, true, true);
        ED = value2;
        NA0 value3 = new NA0(3, (byte)3, true, true);
        P5 = value3;
        NA0 value4 = new NA0(4, (byte)4, false, false);
        X10 = value4;
        NA0 value5 = new NA0(5, (byte)5, true, false);
        oO = value5;
        NA0 value6 = new NA0(6, (byte)6, false, false);
        oH = value6;
        NA0 value7 = new NA0(7, (byte)7, true, false);
        NA0 value8 = new NA0(8, (byte)8, false, false);
        rD0 = value8;
        NA0 value9 = new NA0(9, (byte)9, false, false);
        NA0 value10 = new NA0(10, (byte)10, false, false);
        NA0 value11 = new NA0(11, (byte)11, false, false);
        NA0 value12 = new NA0(12, (byte)12, false, false);
        om0 = value12;
        NA0 value13 = new NA0(13, (byte)13, false, false);
        n90 = value13;
        UK = new NA0[]{
            value0,
            value1,
            value2,
            value3,
            value4,
            value5,
            value6,
            value7,
            value8,
            value9,
            value10,
            value11,
            value12,
            value13
        };
        v6 = new bm0_1();
        NA0[] values = UK.clone();
        for (NA0 value : values) {
            v6.gE0(value.sk, value);
        }
    }
}
