package cn.pokemmo.net.packet.outbound.action;

import f.iz0_0;
import f.so_2;

/**
 * 动作载荷出站数据包基类
 * 原始类: f.SZ
 */
public abstract class ActionPayloadOutboundPacket extends so_2 {
    public abstract byte Bi();

    public int pj() {
        return 0;
    }

    public byte pA0() {
        return 0;
    }

    public short[] l30() {
        return new short[0];
    }

    public iz0_0[] WL() {
        return new iz0_0[0];
    }
}
