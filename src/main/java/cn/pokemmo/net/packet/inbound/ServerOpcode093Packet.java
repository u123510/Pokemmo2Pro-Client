package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode093Packet extends GH {
    public byte Um0;
    public Cq Ks0;
    public N2 iT;
    public rs_1 Vd;

    public ServerOpcode093Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        if (this.Rj.get() < 1) {
            Object comparator = bf0_0.mJ0;
            this.Vd = new rs_1(0);
            return;
        }
        this.Um0 = this.Rj.get();
        this.Ks0 = Cq.Gl(this.Rj.get());
        this.iT = N2.FW(this.Rj.get());
        Object comparator = bf0_0.mJ0;
        this.Vd = new rs_1(this.Rj.getInt());
        long offset = this.Rj.getLong();
        this.Vd.Si0 = System.currentTimeMillis() + offset + 10000L;
        this.Vd.kz0 = this.Rj.getInt();
        int count = this.Rj.getShort();
        for (int i = 0; i < count; i++) {
            short s = this.Rj.getShort();
            bf0_0 entry = new bf0_0(this.Rj.getInt(), this.Rj.getInt(), s);
            if (this.iT == N2.b6) {
                entry.SF0 = this.Rj.get();
            }
            this.Vd.vf0.coM4(s, entry);
        }
    }

    @Override
    public final void os0() {
        BR bR = tw0_0.rl;
        if (bR != null) {
            bR.Ux(this.Um0, this.Ks0, this.iT, this.Vd);
        }
    }
}
