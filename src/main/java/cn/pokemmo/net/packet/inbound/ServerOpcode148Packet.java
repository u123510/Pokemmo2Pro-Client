package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode148Packet extends GH {
    public CH0 m40;
    public cd0_2 uh;

    public ServerOpcode148Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.m40 = this.pE();
        this.uh = this.h80();
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        if (state.q50 != null) {
            fa0_0 holder = state.q50;
            GR value = (GR) holder.lx.get(this.m40);
            if (value != null) {
                ((wp_0) value).fh0(this.uh);
            }
        }
        if (state.xI0 != null) {
            ce0_0 value = state.xI0.ci(this.m40);
            if (value != null) {
                ((wp_0) value).fh0(this.uh);
            }
        }
        if (state.gd0 != null) {
            yi_1 registry = state.gd0;
            si_0 value = (si_0) registry.Wc.get(this.m40);
            if (value != null) {
                cd0_2 data = this.uh;
                cd0_2 old = value.KY;
                if (old == null) {
                    value.KY = data;
                } else {
                    old.DR = data.DR;
                    old.gw = data.gw;
                    old.X3 = data.X3;
                    old.YZ = data.YZ;
                }
            }
        }
    }
}
