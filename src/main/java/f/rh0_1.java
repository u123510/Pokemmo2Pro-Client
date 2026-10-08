package f;

import cn.pokemmo.net.packet.NetworkPacketHeaderData;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.rh0_1
 * 核心实现已迁移至 {@link cn.pokemmo.net.packet.NetworkPacketHeaderData}
 */
public final class rh0_1 extends NetworkPacketHeaderData {
    public static final rh0_1 Ba;
    public static final rh0_1 pc;
    public static final rh0_1 gB;
    public static final rh0_1 fh0;
    public static final rh0_1 QB0;
    public static final rh0_1 gI;
    public static final rh0_1 prn;
    public static final rh0_1 Hs0;
    public static final rh0_1 jK;
    public static final rh0_1 yu0;
    public static final bm0_1 ze0;
    public static final rh0_1[] Rx;

    public rh0_1(int first, int value, I4 type) {
        super(first, value, type);
    }

    static {

        Ba = new rh0_1(0, 0, I4.Ya);
        pc = new rh0_1(1, 1, I4.Ya);
        gB = new rh0_1(2, 2, I4.vb);
        fh0 = new rh0_1(3, 3, I4.WD0);
        QB0 = new rh0_1(4, 4, I4.J10);
        gI = new rh0_1(5, 5, I4.J10);
        prn = new rh0_1(6, 6, I4.op);
        Hs0 = new rh0_1(7, 7, I4.op);
        jK = new rh0_1(8, 8, I4.T6);
        rh0_1 ninth = new rh0_1(9, 9, I4.Ya);
        yu0 = new rh0_1(10, 12, I4.n20);
        rh0_1 eleventh = new rh0_1(11, 13, I4.Bt);
        rh0_1 twelfth = new rh0_1(12, 14, I4.Aj0);
        Rx = new rh0_1[]{Ba, pc, gB, fh0, QB0, gI, prn, Hs0, jK,
                ninth, yu0, eleventh, twelfth};
        ze0 = new bm0_1();
        for (rh0_1 value : (rh0_1[]) Rx.clone()) {
            ze0.gE0(value.iz0, value);
        }
    
        NetworkPacketHeaderData.Ba = Ba;
        NetworkPacketHeaderData.pc = pc;
        NetworkPacketHeaderData.gB = gB;
        NetworkPacketHeaderData.fh0 = fh0;
        NetworkPacketHeaderData.QB0 = QB0;
        NetworkPacketHeaderData.gI = gI;
        NetworkPacketHeaderData.prn = prn;
        NetworkPacketHeaderData.Hs0 = Hs0;
        NetworkPacketHeaderData.jK = jK;
        NetworkPacketHeaderData.yu0 = yu0;
        NetworkPacketHeaderData.ze0 = ze0;
        NetworkPacketHeaderData.Rx = Rx;
    }
}
