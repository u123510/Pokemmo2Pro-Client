package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode058Packet extends GH {
    public kt_2 K;
    public byte U50;
    public byte sc0;

    public ServerOpcode058Packet(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }

    @Override
    public final void Oj0() {
        this.K = kt_2.uF(this.Rj.get());
        this.U50 = this.Rj.get();
        this.sc0 = this.Rj.get();
    }

    @Override
    public final void os0() {
        if (this.K != null && tw0_0.PK0 != null) {
            tw0_0.PK0.Tk0.add(new ZP(this.K, this.U50, this.sc0));
        }
    }
}
