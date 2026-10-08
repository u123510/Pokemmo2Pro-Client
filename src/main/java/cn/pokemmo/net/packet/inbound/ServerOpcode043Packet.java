package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode043Packet extends GH {
    public CH0 fM;
    public short Qd;
    public byte Qr;
    public boolean mo;

    public ServerOpcode043Packet(k20_0 connection, ByteBuffer data) {
        super(connection, data);
    }

    public final void Oj0() {
        this.fM = this.pE();
        this.Qd = this.Rj.getShort();
        this.Qr = this.Rj.get();
        this.mo = (this.Rj.get() & 0xFF) != 0;
    }

    public final void os0() {
        yt_1 player = this.sr0().cJ0;
        bi0_1 target;
        if (player.dj0.equals(this.fM)) {
            target = player.jB0;
        } else {
            target = (bi0_1) player.pn0.get(this.fM);
        }
        if (target != null) {
            target.ql(this.Qd, this.Qr, this.mo);
        }
    }
}
