package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode242Packet extends GH {
    public byte sd;
    public short qy;

    public ServerOpcode242Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.sd = this.Rj.get();
        this.qy = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        yt_1 owner = tw0_0.e60;
        byte value = this.sd;
        short time = this.qy;
        SQ entries = owner.E6;
        entries.getClass();
        us_2 iterator = new us_2(entries);
        while (iterator.hasNext()) {
            ((_else) iterator.ty()).A30 = value;
        }
        owner.VJ0 = time;
        owner.HA = System.currentTimeMillis() + (long) time * 1000L;
        TX target = owner.Mm0.Wz;
        if (target != null && target.nV == 3) {
            target.fl(new hi0_0());
        }
    }
}
