package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode030Packet extends GH {
    public byte Gq0;
    public short pz0;
    public short v30;
    public short IB0;
    public short Bc0;
    public float zc;
    public float Wq0;
    public float KU;
    public float tl;
    public short P8;

    public ServerOpcode030Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Gq0 = this.Rj.get();
        if (this.Gq0 == 0) {
            this.pz0 = this.Rj.getShort();
            this.v30 = this.Rj.getShort();
        } else if (this.Gq0 == 4) {
            this.IB0 = this.Rj.getShort();
            this.Bc0 = this.Rj.getShort();
            this.zc = this.Rj.getFloat();
            this.Wq0 = this.Rj.getFloat();
            this.KU = this.Rj.getFloat();
            this.tl = this.Rj.getFloat();
            this.P8 = this.Rj.getShort();
        } else if (this.Gq0 == 5) {
            this.P8 = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        switch (this.Gq0) {
            case 0:
                com6__1.WI0.cI0(this.pz0, this.v30);
                return;
            case 1:
            case 2:
                tw0_0.LD0.Sc.Tm0(this.Gq0 == 1);
                return;
            case 3:
                com6__1.WI0.cI0((short)0, (short)0);
                return;
            case 4:
            case 5:
            case 6:
                tw0_0.LD0.Sc.VI(this.Gq0 == 5, this.IB0, this.Bc0, this.zc, this.Wq0, this.KU, this.tl, this.P8);
                return;
            default:
                return;
        }
    }
}
