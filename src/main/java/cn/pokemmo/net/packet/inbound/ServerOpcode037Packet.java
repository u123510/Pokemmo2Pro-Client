package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode037Packet extends GH {
    public byte C10;
    public short rw;
    public byte Yg0;

    public ServerOpcode037Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        this.C10 = this.Rj.get();
        this.rw = this.Rj.getShort();
        this.Yg0 = this.Rj.get();
    }

    public final void os0() {
        tw0_0.RE0.Eh(this.C10, this.rw, this.Yg0 != 0, false);
    }
}
