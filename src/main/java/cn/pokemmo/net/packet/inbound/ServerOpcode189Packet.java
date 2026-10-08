package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class ServerOpcode189Packet extends GH {
    public short rA0;

    public ServerOpcode189Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        this.rA0 = this.Rj.getShort();
    }

    public final void os0() {
        yt_1 world = this.sr0().cJ0;
        if (world == null) {
            return;
        }

        short id = this.rA0;
        Iterator iterator = world.pn0.values().iterator();
        while (iterator.hasNext()) {
            bi0_1 entity = (bi0_1) iterator.next();
            if (entity instanceof MO) {
                MO trainer = (MO) entity;
                if (trainer.DN == id) {
                    trainer.Nf0 = trainer.ct0;
                }
            }
        }
    }
}
