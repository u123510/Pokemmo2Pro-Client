package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class ServerOpcode147Packet extends GH {
    public CH0 bO;
    public q10_0 r40;
    public short GD;
    public byte CD0;

    public ServerOpcode147Packet(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.bO = this.pE();
        this.r40 = q10_0.Pt0(this.Rj.get());
        int packed = this.Rj.getShort();
        short value = (short) (packed & 1023);
        this.GD = value == 1023 ? (short) -1 : value;
        byte flags = (byte) ((packed & 0xFFFF) >> 10);
        this.CD0 = flags == 63 ? (byte) -1 : flags;
    }

    @Override
    public final void os0() {
        yt_1 world = ((Ge0) this.sr0()).cJ0;
        CH0 target = this.bO;
        q10_0 category = this.r40;
        short value = this.GD;
        byte flags = this.CD0;
        if (world.dj0.equals(target)) {
            ec0_1 data = world.jB0.J1;
            int index = category.iL;
            data.rh.pr[index] = value;
            data.rh.iu0[index] = flags;
            data.wC0 = new yb_1[q10_0.Pn0.length];
            return;
        }
        bi0_1 entry = (bi0_1) world.pn0.get(target);
        if (entry instanceof E90) {
            ec0_1 data = entry.Gi();
            int index = category.iL;
            data.rh.pr[index] = value;
            data.rh.iu0[index] = flags;
            entry.Gi().wC0 = new yb_1[q10_0.Pn0.length];
        }
    }
}
