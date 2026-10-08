package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode155RequestPacket extends RE {
    public final byte gc0;
    public final qd_0 lW;
    public final byte aI0;
    public final short UE0;
    public final Mg[] Gx0;

    public ClientOpcode155RequestPacket(byte i1, qd_0 v2, byte i3, short i4, Mg... v5) {
        super(155);
        this.gc0 = i1;
        this.lW = v2;
        this.aI0 = i3;
        this.UE0 = i4;
        this.Gx0 = v5;
    }

    public final void ig0(k20_0 v1, ByteBuffer v2) {
        v2.put(this.gc0);
        v2.put(this.lW.xZ);
        v2.put(this.aI0);
        v2.putShort(this.UE0);
        v2.put((byte) this.Gx0.length);
        for (int i = 0; i < this.Gx0.length; i++) {
            this.Gx0[i].hG(v2);
        }
    }
}
