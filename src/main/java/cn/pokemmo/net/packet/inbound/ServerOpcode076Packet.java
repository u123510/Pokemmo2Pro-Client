package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode076Packet extends GH {
    public int EF0;
    public byte Qc0;
    public av_1 SW;
    public id_0[] yS;

    public ServerOpcode076Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.EF0 = this.Rj.getInt();
        this.Qc0 = this.Rj.get();
        this.SW = (av_1) av_1.rh.BM(this.Rj.get());
        this.yS = new id_0[this.Rj.getShort() & 65535];
        for (int i = 0; i < this.yS.length; i++) {
            id_0 entry = new id_0(this.pE(), this.SW, this.Qc0,
                    this.Rj.getFloat(), this.Rj.getShort(), this.Rj.getInt(), this.Rj.getInt());
            entry.EO = this.h80();
            this.yS[i] = entry;
        }
    }

    @Override
    public final void os0() {
        BR client = (BR) this.sr0();
        BU panel = client.lZ.zK0;
        if (panel == null) {
            return;
        }
        Yl view = panel.Vi0;
        if (view != null) {
            view.TC0(this.EF0, this.Qc0, this.SW, this.yS);
        }
    }
}
