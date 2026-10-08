package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode128Packet extends GH {
    public boolean OB0;
    public pe_0 ng0;

    public ServerOpcode128Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.OB0 = (this.Rj.get() & 255) == 1;
        if (this.OB0) {
            this.ng0 = this.h();
        }
    }

    @Override
    public final void os0() {
        pk_0 packet = null;
        if (this.OB0) {
            packet = new pk_0(this.ng0);
            zo_0 channel = zo_0.kJ0;
            Ge0 ge = this.sr0();
            ge.jC(this.ng0.lt0 + ": " + this.ng0.VB, channel);
            if (this.ng0.J50()) {
                int seconds = this.ng0.hr - (int)(System.currentTimeMillis() / 1000L);
                String text = seconds < 301 ? sm0_0.c0(2715) : tx_1.HU(seconds, 2);
                ge.jC(sm0_0.wa0(2714, text), channel);
            }
        }
        BR bridge = (BR)this.sr0();
        bridge.xI0 = packet;
        if (packet != null && bridge.lZ.zK0 != null) {
            bridge.lZ.zK0.hc0(false);
        }
    }
}
