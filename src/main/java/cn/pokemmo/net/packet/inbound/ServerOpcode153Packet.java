package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode153Packet extends GH {
    public St0 hM;

    public ServerOpcode153Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
        this.hM = null;
    }

    public final void Oj0() {
        if ((this.Rj.get() & 255) == 1) {
            boolean b = (this.Rj.get() & 255) == 1;
            this.hM = this.m5(b, true);
        }
    }

    public final void os0() {
        Ge0 sr0 = this.sr0();
        St0 st = this.hM;
        BU bu = ((BR) sr0).lZ.zK0;
        if (bu != null) {
            qu_2 de0 = bu.de0;
            if (de0 != null) {
                de0.A20(st);
            }
        }
    }
}
