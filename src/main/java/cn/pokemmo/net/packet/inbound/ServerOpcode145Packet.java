package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode145Packet extends GH {
    public CH0 zj0;

    public ServerOpcode145Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.zj0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.zj0 = this.pE();
    }

    @Override
    public final void os0() {
        BR state = (BR)this.sr0();
        state.lZ.da0(ry_0.Rz0, this.zj0, (byte)0);
    }
}
