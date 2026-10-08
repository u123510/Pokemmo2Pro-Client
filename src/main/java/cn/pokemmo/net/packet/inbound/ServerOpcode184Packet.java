package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode184Packet extends GH {
    public byte kV;
    public short hY;
    public short Ra0;
    public short Qk0;

    public ServerOpcode184Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.kV = this.Rj.get();
        this.hY = this.Rj.getShort();
        this.Qk0 = this.Rj.getShort();
        if (this.kV == 0) {
            this.Ra0 = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        SQ entries = tw0_0.e60.E6;
        entries.getClass();
        us_2 iterator = new us_2(entries);
        while (iterator.hasNext()) {
            _else value = (_else) iterator.ty();
            if (!(value instanceof XF0)) {
                continue;
            }
            XF0 row = (XF0) value;
            if (row.Ro0.Va0 != this.hY) {
                continue;
            }
            if (this.kV == 1) {
                row.Z10 = this.Qk0;
                row.Fm = true;
            } else {
                row.sp0.Dc0(this.Ra0, this.Qk0);
                row.Fm = true;
            }
        }
    }
}
