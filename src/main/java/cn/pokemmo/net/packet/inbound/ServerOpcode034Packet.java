package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class ServerOpcode034Packet extends GH {
    public byte ws0;
    public byte N70;
    public byte yN;
    public short aF0;
    public short q9;
    public short ph;
    public short Uv;

    public ServerOpcode034Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    public static void wV(E90 entity, LT action) {
        if (entity == null) {
            return;
        }
        if (entity.ba0.Lq0 != action.Tz()) {
            return;
        }
        if (entity.ba0.B5 != action.HR()) {
            return;
        }
        if (entity.ba0.o0 != action.F2().Bm0) {
            return;
        }
        if (entity.ba0.ID0 != action.F2().case$) {
            return;
        }
        entity.il0.LL0(action);
    }

    @Override
    public final void Oj0() {
        this.ws0 = this.Rj.get();
        this.N70 = this.Rj.get();
        this.yN = this.Rj.get();
        this.aF0 = this.Rj.getShort();
        this.q9 = this.Rj.getShort();
        this.ph = this.Rj.getShort();
        this.Uv = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        yt_1 source = tw0_0.e60;
        _else action = (_else) source.E6.get(J4.iA0(this.ws0, this.N70, this.yN));
        if (action == null) {
            return;
        }
        LT move = action.Fn(this.aF0, this.q9, 0);
        if (move == null) {
            return;
        }
        move.HU((byte) this.ph, this.Uv);
        wV(tw0_0.e60.jB0, move);
        Iterator iterator = tw0_0.e60.A90(10000).iterator();
        while (iterator.hasNext()) {
            wV((E90) (bi0_1) iterator.next(), move);
        }
    }
}
