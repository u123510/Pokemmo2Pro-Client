package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode080Packet extends GH {
    public byte li0;
    public String xd0;
    public byte fN;

    public ServerOpcode080Packet(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    public final void Oj0() {
        this.fN = this.Rj.get();
        this.li0 = this.Rj.get();
        this.xd0 = this.q60();
    }

    public final void os0() {
        BR client = (BR)this.sr0();
        Dm0 value = new Dm0(this.li0, this.xd0, (this.fN & 2) != 0, (this.fN & 1) != 0);
        client.bh = value;
        client.lZ.zK0.GF0(value);
    }
}
