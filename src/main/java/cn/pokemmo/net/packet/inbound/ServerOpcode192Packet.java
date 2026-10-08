package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode192Packet extends GH {
    public short D9;
    public short iy0;
    public boolean oH0;

    public ServerOpcode192Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.D9 = this.Rj.getShort();
        this.iy0 = this.Rj.getShort();
        this.oH0 = (this.Rj.get() & 0xFF) == 1;
    }

    @Override
    public final void os0() {
        _else actor = this.sr0().cJ0.N60();
        if (actor == null) {
            return;
        }

        LT move = actor.Fn(this.D9, this.iy0, 0);
        if (move == null) {
            return;
        }

        if (this.oH0) {
            move.ZD0(new ye0_1(actor, move, move.B3(), false, true, false));
        } else {
            if (move.Sg != null) {
                move.Sg.clear();
            }
            move.ZD0(new ye0_1(actor, move, move.B3(), true, false, false));
        }
    }
}
