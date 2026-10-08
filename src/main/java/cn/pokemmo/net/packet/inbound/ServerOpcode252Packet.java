package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode252Packet extends GH {
    public byte[] qe;
    public lp_1[] mj0;

    public ServerOpcode252Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        int len1 = this.Rj.get() & 255;
        byte[] bArr = new byte[len1];
        this.Rj.get(bArr);
        this.qe = bArr;
        int len2 = this.Rj.get() & 255;
        this.mj0 = new lp_1[len2];
        for (int i = 0; i < len2; i++) {
            this.mj0[i] = this.uu0();
        }
    }

    public final void os0() {
        this.sr0().mU(this.qe, this.mj0);
    }
}
