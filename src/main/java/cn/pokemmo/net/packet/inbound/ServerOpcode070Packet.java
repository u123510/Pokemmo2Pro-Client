package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode070Packet extends GH {
    public byte[] GN;

    public ServerOpcode070Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        this.GN = new byte[3];
        this.GN[0] = this.Rj.get();
        this.GN[1] = this.Rj.get();
        this.GN[2] = this.Rj.get();
    }

    public final void os0() {
        Ge0 sr0 = this.sr0();
        byte[] gn = this.GN;
        BU bu = ((BR) sr0).lZ.zK0;
        if (bu != null) {
            ur_2 mc0 = bu.Mc0;
            if (mc0 != null) {
                mc0.ab0 = gn;
            }
        }
    }
}
