package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode058RequestPacket extends RE {
    public final short bK0;
    public final ef0_0 jc0;

    public ClientOpcode058RequestPacket(short i1, ef0_0 v2) {
        super(58);
        this.bK0 = i1;
        this.jc0 = v2;
    }

    public final void ig0(k20_0 v1, ByteBuffer v2) {
        v2.putShort(this.bK0);
        v2.putLong(this.jc0.xh.YD0.Sa);
        v2.put(this.jc0.HP.f10);
        short[] arr = this.jc0.uy;
        for (short s : arr) {
            v2.putShort(s);
        }
    }
}
