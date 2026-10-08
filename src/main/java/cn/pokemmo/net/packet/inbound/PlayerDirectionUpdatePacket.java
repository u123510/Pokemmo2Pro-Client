package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class PlayerDirectionUpdatePacket extends GH {
    public CH0 a7;
    public short Dg0;
    public boolean Js;

    public PlayerDirectionUpdatePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.a7 = this.pE();
        this.Dg0 = this.Rj.getShort();
        this.Js = (this.Rj.get() & 255) == 1;
    }

    @Override
    public final void os0() {
        VU value = this.sr0().FJ0(this.a7, _volatile.pG0);
        if (value == null) {
            return;
        }
        value.u60 = this.Dg0;
        if (this.Dg0 < 1) {
            return;
        }
        a10_0 manager = tw0_0.PK0;
        if (manager == null) {
            manager = bc_1.Bm();
            manager.lPt9.add(new if0_0(value, this.Js));
            tw0_0.PK0 = manager;
            return;
        }
        manager.lPt9.add(new if0_0(value, this.Js));
    }
}
