package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode041Packet extends GH {
    public byte iX;
    public final TE A80;

    public ServerOpcode041Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.A80 = new TE();
    }

    @Override
    public final void Oj0() {
        this.iX = this.Rj.get();
        int count = this.Rj.getShort() & 65535;
        for (int i = 0; i < count; i++) {
            this.A80.Dc0(this.Rj.getShort(), this.Rj.getShort());
        }
    }

    @Override
    public final void os0() {
        Ge0 owner = this.sr0();
        if (owner == null) {
            return;
        }
        if (this.iX == (byte) -128) {
            owner.oY.lY = new AI(this.A80);
            return;
        }
        owner.yh0.lPT7[this.iX] = new AI(this.A80);
        owner.yh0.CN(this.iX);
    }
}
