package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode167RequestPacket extends RE {
    public final P40[] pW;
    public final int XD0;
    public final int Pp0;

    public ClientOpcode167RequestPacket(P40[] values, int offset, int count) {
        super(167);
        this.pW = values;
        this.XD0 = offset;
        this.Pp0 = count;
    }

    @Override
    public final void ig0(k20_0 connection, ByteBuffer buffer) {
        buffer.put((byte) this.Pp0);
        if (this.pW == null) {
            return;
        }
        for (int index = 0; index < this.Pp0; index++) {
            P40 value = this.pW[index + this.XD0];
            buffer.put(value.sG0);
            bo_1.cK(value.xr, buffer);
            bo_1.cK(value.WL0, buffer);
            if (value.sG0 == 1) {
                buffer.put((byte) value.et0.size());
                for (Object nested : value.et0) {
                    bo_1.cK(((P40) nested).xr, buffer);
                }
            }
        }
    }
}
