package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode097Packet extends GH {
    public CH0 J1;
    public ed0_0 pd0;

    public ServerOpcode097Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        this.J1 = this.pE();
        int i2 = this.Rj.getInt();
        boolean i3 = (this.Rj.get() & 255) == 1;
        this.Rj.get();
        int i_int = this.Rj.getInt();
        this.pd0 = new ed0_0(i2, i_int, i3);
    }

    public final void os0() {
        Ge0 sr0 = this.sr0();
        if (sr0 != null) {
            sr0.hc(this.J1, this.pd0);
        }
    }
}
