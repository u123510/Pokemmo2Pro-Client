package cn.pokemmo.net.packet;

import f.*;

public class NetworkPacketHeaderData {
    public static NetworkPacketHeaderData Ba;
    public static NetworkPacketHeaderData pc;
    public static NetworkPacketHeaderData gB;
    public static NetworkPacketHeaderData fh0;
    public static NetworkPacketHeaderData QB0;
    public static NetworkPacketHeaderData gI;
    public static NetworkPacketHeaderData prn;
    public static NetworkPacketHeaderData Hs0;
    public static NetworkPacketHeaderData jK;
    public static NetworkPacketHeaderData yu0;
    public static bm0_1 ze0;
    public static NetworkPacketHeaderData[] Rx;
    public final byte iz0;
    public final I4 sf0;
    public final int t3;

    public NetworkPacketHeaderData(int first, int value, I4 type) {
        super();
        this.t3 = value;
        this.iz0 = (byte) first;
        this.sf0 = type;
    }

    static {
        if (f.rh0_1.Ba == null) {
            try {
                Class.forName(f.rh0_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
