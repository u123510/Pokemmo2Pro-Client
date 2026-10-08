package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode045Packet extends GH {
    public byte f7;
    public byte Tn;
    public byte Ra;
    public short Wp0;

    public ServerOpcode045Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.f7 = this.Rj.get();
        this.Tn = this.Rj.get();
        this.Ra = this.Rj.get();
        this.Wp0 = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        yt_1 state = tw0_0.e60;
        int index = this.f7;
        _else value = (_else) state.E6.get(J4.iA0(this.f7, this.Tn, this.Ra));
        if (value == null) {
            return;
        }
        if (value instanceof yl_0) {
            if (index != 0 && index != 1) {
                return;
            }
            ng0_0 data = (ng0_0) Z0.rb.Ta[index].x20.f5(this.Wp0);
            if (data == null) {
                return;
            }
            ((yl_0) value).OC0(data.sh0);
        }
    }
}
