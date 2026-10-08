package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class FriendListPacket extends GH {
    public boolean zx;
    public CH0 a8;
    public si_0[] sZ;

    public FriendListPacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.zx = (this.Rj.get() & 255) == 1;
        if (!this.zx) {
            return;
        }
        this.a8 = this.pE();
        this.sZ = new si_0[this.Rj.get() & 255];
        for (int i = 0; i < this.sZ.length; i++) {
            CH0 id = this.pE();
            cd0_2 data = this.h80();
            ls_0[] layers = this.Vj0();
            this.sZ[i] = new si_0(id, data, layers);
        }
    }

    @Override
    public final void os0() {
        yi_1 loaded = null;
        if (this.zx) {
            loaded = new yi_1(this.a8);
            for (si_0 entry : this.sZ) {
                loaded.Wc.put(entry.HU, entry);
            }
        }
        BR root = (BR) this.sr0();
        root.gd0 = loaded;
        xg_0 widget = root.lZ.zK0.LPT8;
        widget.em();
        widget.f80.clear();
        if (loaded != null) {
            widget.Xf = loaded.Ku0;
            for (si_0 entry : loaded.yJ()) {
                widget.DN(entry);
            }
        }
        this.sr0().fP();
    }
}
