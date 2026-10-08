package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterStorageMovePacket extends S20 {
    public Ip0 Pc0;
    public ch0_2 i2;

    public MonsterStorageMovePacket(k20_0 source, ByteBuffer data) {
        super(data, source);
    }

    static {
        Cq0.E1(MonsterStorageMovePacket.class);
    }

    public final void Oj0() {
        byte code = this.Rj.get();
        this.Pc0 = (Ip0)t_0.BI0(Ip0.tM.BM(code), Ip0.class, code);
        if (this.Pc0 == Ip0.IL0) {
            this.i2 = this.ST();
        }
    }

    public final void os0() {
        Ge0 context = this.sr0();
        Ip0 value = this.Pc0;
        ch0_2 parsed = this.i2;
        BR connection = (BR)context;
        if (value == Ip0.IL0) {
            connection.Cl.px0.put(parsed.Pc0.WN, parsed);
            lg_0.k.lPT5(new Nq(connection.lZ, connection));
            return;
        }
        j20 state = connection.lZ.uw0;
        if (state == null) {
            return;
        }
        state.fj0.pw0(true);
        state.PV.pw0(true);
        Qy0.yI0.dk(-1, sm0_0.c0(value.Z4));
    }
}
