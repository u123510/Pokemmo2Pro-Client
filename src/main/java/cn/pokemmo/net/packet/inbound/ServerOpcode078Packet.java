package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode078Packet extends GH {
    public short sa0;
    public byte Op;
    public ub_0[] Z9;

    public ServerOpcode078Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.sa0 = this.Rj.getShort();
        this.Op = this.Rj.get();
        int count = this.Rj.get() & 0xFF;
        this.Z9 = new ub_0[count];
        for (int i = 0; i < this.Z9.length; i++) {
            int id = this.Rj.getInt();
            av_1 type = (av_1) av_1.rh.BM(this.Rj.get());
            int width = this.Rj.getInt();
            int order = this.Rj.getInt();
            byte valueCount = this.Rj.get();
            cd0_2[] values = new cd0_2[valueCount];
            for (int j = 0; j < valueCount; j++) {
                values[j] = this.h80();
            }
            this.Z9[i] = new ub_0(id, type, width, order, values);
        }
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        Yl view = ((BR) state).lZ.zK0.Vi0;
        if (view != null) {
            view.D3(this.sa0, this.Op, this.Z9);
        }
    }
}
