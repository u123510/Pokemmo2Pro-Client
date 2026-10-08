package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode088Packet extends GH {
    public boolean hY;
    public ur_0 op;

    public ServerOpcode088Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        boolean b = (this.Rj.get() & 255) == 1;
        this.hY = b;
        if (b) {
            this.op = ur_0.pv0(this.Rj.get());
        }
    }

    public final void os0() {
        Ge0 sr0 = this.sr0();
        boolean b = this.hY;
        ur_0 u = this.op;
        BU zK0 = ((BR) sr0).lZ.zK0;
        if (zK0 != null) {
            zK0.G20(b, u);
        }
    }
}
