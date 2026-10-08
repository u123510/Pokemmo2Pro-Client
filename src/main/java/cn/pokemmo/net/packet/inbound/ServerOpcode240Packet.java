package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode240Packet extends GH {
    public short hd;
    public short ew;

    public ServerOpcode240Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.hd = this.Rj.getShort();
        this.ew = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        Qy0 screen = ((BR) this.sr0()).lZ;
        int width = this.hd;
        int height = this.ew;
        n60_0 queue = screen.fv;
        if (queue == null) {
            queue = new n60_0((short) width, (short) height);
            screen.fv = queue;
            queue.F9(screen.fU(), queue);
            lg_0.k.lPT5(new IL0(screen, false));
        } else {
            queue.eU.Sk(sm0_0.c0(1076) + " " + width + "/" + height);
        }
    }
}
