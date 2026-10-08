package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode149Packet extends GH {
    public boolean Ok0;

    public ServerOpcode149Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        this.Ok0 = (this.Rj.get() & 0xFF) == 1;
    }

    public final void os0() {
        BR br = (BR) sr0();
        boolean b = this.Ok0;
        BU bu = br.lZ.zK0;
        if (bu != null) {
            bu.RG0(null, b, true);
        }
    }
}
