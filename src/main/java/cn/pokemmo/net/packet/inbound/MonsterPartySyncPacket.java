package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterPartySyncPacket extends S20 {
    public byte UA0;
    public byte Sc;
    public byte VI0;
    public byte B60;
    public VU[] bs = null;

    public MonsterPartySyncPacket(k20_0 var1, ByteBuffer var2) {
        super(var2, var1);
    }

    @Override
    public final void Oj0() {
        this.UA0 = this.Rj.get();
        this.Sc = this.Rj.get();
        this.VI0 = this.Rj.get();
        this.B60 = this.Rj.get();
        if (this.UA0 == 2) {
            this.bs = new VU[this.Rj.get() & 255];
            for (int i = 0; i < this.bs.length; i++) {
                CE value = new CE(CH0.j1);
                value.Yb0 = this.Rj.getShort();
                value.pQ = this.Rj.getShort();
                this.bs[i] = new VU(value);
            }
        } else if (this.UA0 == 0) {
            this.bs = new VU[this.Rj.get() & 255];
            for (int i = 0; i < this.bs.length; i++) {
                this.bs[i] = new VU(this.Lr0());
            }
        }
    }

    @Override
    public final void os0() {
        BU ui = ((BR) this.sr0()).lZ.zK0;
        if (ui != null) {
            if (ui.jg0 != null) {
                ui.jg0.xe0();
                ui.jg0 = null;
            }
            TH panel = new TH(ui, this.UA0, this.Sc, this.VI0, this.B60, this.bs);
            ui.jg0 = panel;
            ui.SL(panel);
            panel.lt0();
            panel.E40(tw0_0.LD0.ew0() / 2 - panel.Mx / 2, tw0_0.LD0.Hv0() / 2 - panel.OB / 2);
        }
    }
}
