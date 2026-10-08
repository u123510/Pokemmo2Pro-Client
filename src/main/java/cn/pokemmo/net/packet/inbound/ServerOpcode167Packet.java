package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode167Packet extends GH {
    public k5_0 XO;

    public ServerOpcode167Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        int first = this.Rj.getShort() & 0xFFFF;
        int count = this.Rj.getShort() & 0xFFFF;
        byte[] bytes = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(bytes);
        this.XO = new k5_0(first, count, k5_0.Tc(bytes));
    }

    @Override
    public final void os0() {
        lpt5__5.hL.Com4.execute(this::uV);
    }

    public final void uV() {
        P40[] values = tw0_0.lM.ly(this.XO);
        int remaining = values.length;
        int offset = 0;
        int batch;
        do {
            batch = Math.min(10, remaining);
            this.je(new ny0(values, offset, batch));
            remaining -= batch;
            offset += batch;
        } while (remaining > 0);
        this.je(new ny0(null, 0, 0));
    }
}
