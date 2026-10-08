package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode117Packet extends GH {
    public byte Vh0;
    public boolean B;
    public short d;
    public int PV;
    public zp0_0[] x00;

    public BattleOpcode117Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Vh0 = this.Rj.get();
        this.B = (this.Rj.get() & 255) == 1;
        this.d = this.Rj.getShort();
        this.PV = this.Rj.getInt();
        int count = this.Rj.get() & 255;
        this.x00 = new zp0_0[count];
        for (int i = 0; i < count; ++i) {
            this.x00[i] = this.Pl0();
        }
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        Qy0 screen = ((BR) world).lZ;
        BU battle = screen.zK0;
        if (battle == null) {
            return;
        }
        cb0_1 table = battle.Ld;
        if (table == null) {
            return;
        }
        if (table.com4[this.B ? 1 : 0] != this.Vh0) {
            return;
        }
        table.Xh0.JK0(this.d, this.PV);
        if (this.x00 != null) {
            if (this.B) {
                table.Wv0.fC0(this.x00);
            } else {
                table.S80.fC0(this.x00);
            }
        }
    }
}
