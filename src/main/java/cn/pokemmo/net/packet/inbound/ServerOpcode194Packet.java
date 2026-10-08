package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode194Packet extends GH {
    public boolean s50;
    public long LR;
    public long BY;
    public String CA0 = "";

    public ServerOpcode194Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.s50 = (this.Rj.get() & 0xFF) == 1;
        this.LR = this.Rj.getLong();
        if (!this.s50) {
            this.CA0 = this.q60();
        }
        this.BY = System.currentTimeMillis() - this.LR;
    }

    @Override
    public final void km() {
        if (this.s50) {
            this.je(new hl_1(this.LR, true));
        }
    }

    @Override
    public final void os0() {
        if (this.s50) {
            return;
        }
        int stringId = 6776 + (this.CA0.isEmpty() ? 0 : 1);
        String message = sm0_0.Bx(stringId, this.BY + "", this.CA0);
        this.sr0().ug(new sf0_2(zo_0.Dd, CH0.j1, "", null, (byte) 0, message));
    }
}
