package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode187Packet extends GH {
    public CH0 y4;

    public ServerOpcode187Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        this.y4 = this.pE();
    }

    public final void os0() {
        E90 jb = this.sr0().cJ0.jB0;
        if (jb == null) {
            return;
        }
        if (this.y4.Uz0()) {
            jb.sE0(null, false);
            return;
        }
        bi0_1 bi = this.sr0().cJ0.ax(this.y4);
        if (bi != null && bi.CI0()) {
            jb.sE0((MO) bi, false);
        } else {
            jb.sE0(null, false);
        }
    }
}
