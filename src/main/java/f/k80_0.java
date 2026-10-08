package f;

import cn.pokemmo.constant.ThreeByteCodeRegistry;

public final class k80_0 extends ThreeByteCodeRegistry {
    public static final k80_0 At;
    public static final bm0_1 H70;

    public k80_0(byte first, byte second, int id) {
        super(first, second, id);
    }

    static {

        tu_0 ignored = tu_0.M4;
        k80_0 first = new k80_0((byte) 0, (byte) 4, 16805024);
        k80_0 second = new k80_0((byte) 1, (byte) 4, 16804011);
        k80_0 third = new k80_0((byte) 2, (byte) 1, 7950);
        At = third;
        k80_0[] values = new k80_0[]{first, second, third};
        H70 = new bm0_1();
        for (k80_0 value : values) {
            H70.gE0(value.GH0, value);
        }
    
        ThreeByteCodeRegistry.At = At;
        ThreeByteCodeRegistry.H70 = H70;
    }
}
