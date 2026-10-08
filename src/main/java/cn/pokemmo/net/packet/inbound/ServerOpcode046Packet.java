package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode046Packet extends GH {
    public CH0 xd0;
    public String Eq;

    public ServerOpcode046Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.xd0 = this.pE();
        this.Eq = this.q60();
    }

    @Override
    public final void os0() {
        E90 entry = this.sr0().cJ0.te0(this.xd0);
        if (entry != null) {
            entry.oc0 = this.Eq;
        }

        pk_0 player = this.sr0().xI0;
        if (player != null) {
            ce0_0 record = player.ci(this.xd0);
            if (record != null) {
                record.GG0.DR = this.Eq;
                player.Ov = true;
            }
        }
    }
}
