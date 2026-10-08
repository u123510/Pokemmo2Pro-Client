package cn.pokemmo.net.packet;

import f.Mu0;

/**
 * 数据包顶级抽象基类 (Base Packet)
 * 原混淆类: f.JM
 */
public abstract class Packet {
    public final Mu0 direction;
    public int opcode;

    // 兼容混淆字段别名
    public final Mu0 n6;
    public int L8;

    public Packet(Mu0 direction, int opcode) {
        this.direction = direction;
        this.opcode = opcode;
        this.n6 = direction;
        this.L8 = opcode;
    }

    public Packet() {
        this(Mu0.da0, 0);
    }

    public final Mu0 getDirection() {
        return this.direction;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    public final void setOpcode(int opcode) {
        this.opcode = opcode;
        this.L8 = opcode;
    }

    @Override
    public String toString() {
        return String.format("[%s] 0x%02X %s", this.n6.tD0, this.L8, this.getClass().getSimpleName());
    }
}
