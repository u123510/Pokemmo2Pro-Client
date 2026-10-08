package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode153RequestPacket extends RE {
    public final short Bt;
    public final boolean Lpt2;

    public ClientOpcode153RequestPacket(short s, boolean z) {
        super(153);
        this.Bt = s;
        this.Lpt2 = z;
    }

    @Override
    public final void ig0(k20_0 k20_0, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.Bt);
        byteBuffer.put((byte) (this.Lpt2 ? 1 : 0));
    }
}
