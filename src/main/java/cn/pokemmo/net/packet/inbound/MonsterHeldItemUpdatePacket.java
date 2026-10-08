package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterHeldItemUpdatePacket extends S20 {
    public xj_0 qj0;
    public CH0 Pa;
    public short eA0;

    public MonsterHeldItemUpdatePacket(k20_0 var1, ByteBuffer var2) {
        super(var2, var1);
    }

    @Override
    public final void Oj0() {
        xj_0 type = (xj_0) xj_0.yz0.get(this.Rj.get() & 255);
        if (type == null) {
            type = xj_0.HH0;
        }
        this.qj0 = type;
        if (type == xj_0.Jr) {
            this.Pa = this.pE();
        } else if (type == xj_0.oG) {
            this.eA0 = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        BR client = (BR) this.sr0();
        if (this.qj0 == xj_0.Jr && this.Pa.uI0()) {
            ch0_2 removed = (ch0_2) client.Cl.px0.remove(this.Pa);
            if (removed != null) {
                client.qK(sm0_0.wa0(2150, removed.Pc0.Nw0));
            }
            Qy0 screen = client.lZ;
            screen.getClass();
            lg_0.k.lPT5(new Nq(screen, client));
        } else if (this.qj0 == xj_0.oG) {
            mc0_1 item = gu0.l2.lPT6(this.eA0);
            client.qK(sm0_0.wa0(this.qj0.gk, sm0_0.c0(item.Nl)));
        } else {
            client.qK(sm0_0.c0(this.qj0.gk));
        }
    }
}
