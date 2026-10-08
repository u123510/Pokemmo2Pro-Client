package cn.pokemmo.net.packet;

import f.Mu0;

/**
 * 数据包传输方向 (Packet Direction)
 * 原混淆类: f.Mu0
 */
public class PacketDirection {
    public static final Mu0 SERVERBOUND = new Mu0("S");
    public static final Mu0 CLIENTBOUND = new Mu0("C");
    public static final Mu0 da0 = SERVERBOUND;
    public static final Mu0 py0 = CLIENTBOUND;

    public final String name;
    public final String tD0;

    public PacketDirection(String name) {
        this.name = name;
        this.tD0 = name;
    }

    public final boolean isServerbound() {
        return "S".equals(this.tD0);
    }

    public final boolean isClientbound() {
        return "C".equals(this.tD0);
    }
}
