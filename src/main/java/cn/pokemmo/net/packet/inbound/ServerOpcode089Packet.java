package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode089Packet extends GH {
    public ur_0 sb0;
    public mw_1 bK0;

    public ServerOpcode089Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.bK0 = null;
    }

    @Override
    public final void Oj0() {
        this.sb0 = ur_0.pv0(this.Rj.get());
        if ((this.Rj.get() & 0xFF) != 1) {
            return;
        }
        this.pE();
        ur_0.pv0(this.Rj.get());
        this.Rj.get();
        int length = this.Rj.getShort() & 0xFFFF;
        byte[] bytes = new byte[length];
        this.Rj.get(bytes);
        this.bK0 = new mw_1(bytes);
    }

    @Override
    public final void os0() {
        Ge0 root = this.sr0();
        ur_0 kind = this.sb0;
        mw_1 data = this.bK0;
        ((BR) root).ja[kind.yI] = data;

        Qy0 state = ((BR) root).lZ;
        if (state != null) {
            BU panel = state.zK0;
            if (panel != null) {
                pe0_2 loader = panel.fE;
                if (loader != null) {
                    loader.rr0();
                    if (Ge0.Vv0 == 1) {
                        Ge0.Vv0 = 0;
                    }
                }
            }
        }
    }
}
