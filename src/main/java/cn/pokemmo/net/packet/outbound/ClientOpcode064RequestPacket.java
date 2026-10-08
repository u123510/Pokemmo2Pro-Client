package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode064RequestPacket extends RE {
    public final byte Nf;
    public final CH0[] JW;
    public final byte HX;
    public final byte ne0;

    public ClientOpcode064RequestPacket(byte value, CH0[] targets, byte first, byte second) {
        super(64);
        this.Nf = value;
        this.JW = targets;
        this.HX = first;
        this.ne0 = second;
    }

    public final void ig0(k20_0 connection, ByteBuffer data) {
        data.put(this.Nf);
        for (CH0 target : this.JW) {
            data.putLong(target.Sa);
        }
        data.put(this.HX);
        data.put(this.ne0);
    }
}
