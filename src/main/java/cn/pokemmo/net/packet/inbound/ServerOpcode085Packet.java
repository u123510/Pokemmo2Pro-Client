package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode085Packet extends GH {
    public gl_2 qs;
    public ys_0[] EF;

    public ServerOpcode085Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.qs = gl_2.Wk0[this.Rj.get()];
        int count = this.Rj.getShort() & 65535;
        this.EF = new ys_0[count];
        for (int index = 0; index < count; index++) {
            gl_2 type = this.qs;
            ByteBuffer buffer = this.Rj;
            CH0 id = CH0.Ab(buffer.getLong());
            short value = buffer.getShort();
            if (type.Vp > 0) {
                buffer.getShort();
            }
            this.EF[index] = new ys_0(id, value);
        }
    }

    @Override
    public final void os0() {
        Ge0 owner = this.sr0();
        ib_0 value = new ib_0(this.qs, this.EF);
        owner.lG[this.qs.qH0] = value;
    }
}
