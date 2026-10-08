package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class GuildMemberListPacket extends GH {
    public CH0 Wh;
    public ls_0[] mo0;

    public GuildMemberListPacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Wh = this.pE();
        this.mo0 = this.Vj0();
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        if (world.gd0 == null) {
            return;
        }
        yi_1 table = world.gd0;
        if (table.Wc.containsKey(this.Wh)) {
            ((si_0) table.Wc.get(this.Wh)).qJ0 = this.mo0;
        }
        BR client = (BR) world;
        xg_0 widgets = client.lZ.zK0.LPT8;
        if (table != null) {
            widgets.Xf = table.Ku0;
            for (si_0 entry : table.yJ()) {
                widgets.DN(entry);
            }
        }
        world.fP();
    }
}
