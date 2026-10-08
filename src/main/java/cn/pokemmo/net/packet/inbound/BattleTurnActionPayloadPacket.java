package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleTurnActionPayloadPacket extends JK0 {
    public CH0 hz;
    public CH0 t00;
    public Nt COm8;

    public BattleTurnActionPayloadPacket(k20_0 connection, ByteBuffer buffer) {
        super(buffer, connection);
    }

    @Override
    public final void Oj0() {
        this.hz = this.pE();
        this.t00 = this.pE();
        this.COm8 = this.S2();
    }

    @Override
    public final void os0() {
        a10_0 manager = tw0_0.PK0;
        if (manager != null && this.COm8 != null) {
            manager.Tk0.add(new yf_2(this.hz, this.t00, this.COm8));
        }
    }
}
