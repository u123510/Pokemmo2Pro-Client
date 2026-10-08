package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode045RequestPacket extends RE {
    public final byte wp0;
    public final boolean WL0;
    public final CH0 y5;
    public final short MU;
    public final short v9;
    public final CH0 ea0;
    public final short z2;
    public final short TL;

    public ClientOpcode045RequestPacket(MO first, MO second, byte type) {
        super(45);
        this.wp0 = type;
        this.y5 = first.ZK();
        this.MU = first.try$();
        this.v9 = first.WR();
        boolean hasSecond = second != null;
        this.WL0 = hasSecond;
        CH0 secondId = null;
        short secondStart = 0;
        short secondEnd = 0;
        if (hasSecond) {
            secondId = second.ZK();
            secondStart = second.try$();
            secondEnd = second.WR();
        }
        this.ea0 = secondId;
        this.z2 = secondStart;
        this.TL = secondEnd;
    }

    public final void ig0(k20_0 ignored, ByteBuffer out) {
        out.put(this.wp0);
        out.put((byte) (this.WL0 ? 1 : 0));
        out.putLong(this.y5.Sa);
        out.putShort(this.MU);
        out.putShort(this.v9);
        if (this.WL0) {
            out.putLong(this.ea0.Sa);
            out.putShort(this.z2);
            out.putShort(this.TL);
        }
    }
}
