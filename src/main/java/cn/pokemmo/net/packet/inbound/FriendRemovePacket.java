package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class FriendRemovePacket extends GH {
    public CH0 E90;
    public CH0 dv0;

    public FriendRemovePacket(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        this.E90 = this.pE();
        this.dv0 = this.pE();
    }

    public final void os0() {
        if (this.sr0().gd0 == null) {
            return;
        }

        BR client = (BR)this.sr0();
        client.gd0.Wc.remove(this.E90);

        xg_0 entityLayer = client.lZ.zK0.LPT8;
        bn_2 removed = (bn_2)entityLayer.f80.get(this.E90);
        if (removed != null) {
            entityLayer.f80.remove(this.E90);
            entityLayer.u3(removed);
        }

        yi_1 world = client.gd0;
        world.Ku0 = this.dv0;
        entityLayer.Xf = world.Ku0;
        for (si_0 entry : world.yJ()) {
            entityLayer.DN(entry);
        }
        this.sr0().fP();
    }
}
