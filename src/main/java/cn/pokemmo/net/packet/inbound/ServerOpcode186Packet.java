package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode186Packet extends GH {
    public byte no0;
    public byte Mc;
    public byte Gt0;
    public byte pP;
    public boolean LpT9;
    public short Ml0;
    public short rF;
    public byte hf0;
    public boolean Rj0;

    public ServerOpcode186Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.no0 = this.Rj.get();
        this.Mc = this.Rj.get();
        this.Gt0 = this.Rj.get();
        this.pP = this.Rj.get();
        this.LpT9 = (this.Rj.get() & 0xFF) == 1;
        if (this.LpT9) {
            this.Ml0 = this.Rj.getShort();
            this.rF = this.Rj.getShort();
            this.hf0 = this.Rj.get();
            this.Rj0 = this.Rj.get() == 1;
        }
    }

    @Override
    public final void os0() {
        _else table = (_else) tw0_0.e60.E6.get(J4.iA0(this.no0, this.Mc, this.Gt0));
        if (!(table instanceof p50_0)) {
            return;
        }
        if (!this.LpT9) {
            table.Hy[this.pP] = null;
            return;
        }
        LT tile = this.Rj0
                ? table.Jk0(this.hf0, this.Ml0, this.rF)
                : table.Fn(this.Ml0, this.rF, this.hf0);
        if (tile == null) {
            return;
        }
        if (table.Hy[this.pP] == tile) {
            return;
        }
        table.Hy[this.pP] = tile;
        tile.ZD0(new EL0(this.pP, tile));
    }
}
