package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class ServerOpcode150Packet extends GH {
    public ez0_0 HB;

    public ServerOpcode150Packet(k20_0 owner, java.nio.ByteBuffer data) {
        super(owner, data);
    }

    @Override
    public final void Oj0() {
        byte key = this.Rj.get();
        if (ez0_0.St0.dg(key)) {
            this.HB = (ez0_0) ez0_0.St0.BM(key);
        } else {
            this.HB = ez0_0.Xn;
        }
    }

    @Override
    public final void os0() {
        BR root = (BR) this.sr0();
        ez0_0 value = this.HB;
        root.qK(sm0_0.c0(value.B3));
        if (root.lZ != null && root.lZ.zK0 != null && root.lZ.zK0.de0 != null) {
            root.lZ.zK0.de0.tn(value);
        }
    }
}
