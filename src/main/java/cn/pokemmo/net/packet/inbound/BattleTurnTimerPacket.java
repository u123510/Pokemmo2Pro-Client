package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleTurnTimerPacket extends GH {
    public boolean bW;
    public int aJ;
    public int E10;

    public BattleTurnTimerPacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.bW = this.Rj.get() == 1;
        this.aJ = this.Rj.getShort() & 65535;
        this.E10 = this.Rj.getShort() & 65535;
    }

    @Override
    public final void os0() {
        a10_0 current = tw0_0.PK0;
        if (current == null || !this.bW) {
            return;
        }
        if (current.rU == null) {
            current.rU = new dy_1();
        }
        dy_1 timer = current.rU;
        timer.K50 = this.bW;
        timer.r6 = this.aJ;
        timer.sB0 = this.E10;
        if (this.bW) {
            timer.yJ0 = (int) (System.currentTimeMillis() / 1000L);
            timer.coM5 = timer.mi0() - 1;
        } else {
            timer.coM5 = -1;
        }
    }
}
