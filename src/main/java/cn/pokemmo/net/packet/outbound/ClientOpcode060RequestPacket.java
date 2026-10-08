package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode060RequestPacket extends RE {
    public final short RO;
    public final TE0 jJ0;

    public ClientOpcode060RequestPacket(short i1, TE0 v2) {
        super(60);
        this.RO = i1;
        this.jJ0 = v2;
    }

    public final void ig0(k20_0 v1, ByteBuffer v2) {
        v2.putShort(this.RO);
        v2.putLong(this.jJ0.MJ.YD0.Sa);
        byte[] yl = this.jJ0.yl0;
        for (int i = 0; i < yl.length; i++) {
            v2.put(yl[i]);
        }
    }
}
