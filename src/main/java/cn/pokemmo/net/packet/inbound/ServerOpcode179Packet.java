package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode179Packet extends GH {
    public byte bl0;
    public byte rz;
    public byte GU;
    public s4_0 gp0;

    public ServerOpcode179Packet(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    public final void Oj0() {
        this.bl0 = this.Rj.get();
        this.rz = this.Rj.get();
        this.GU = this.Rj.get();
        this.gp0 = (s4_0) s4_0.Ai.BM(this.Rj.get());
    }

    public final void os0() {
        _else e = (_else) tw0_0.e60.E6.get(J4.iA0(this.bl0, this.rz, this.GU));
        if (e != null && this.gp0 != null) {
            e.Jo0 = this.gp0;
        }
    }
}
