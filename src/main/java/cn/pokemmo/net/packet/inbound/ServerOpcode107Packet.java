package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode107Packet extends GH {
    public A5 E1;

    public ServerOpcode107Packet(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    public final void Oj0() {
        byte value = this.Rj.get();
        this.E1 = (A5)t_0.BI0(A5.N8.BM(value), A5.class, value);
    }

    public final void os0() {
        BR client = tw0_0.rl;
        A5 value = this.E1;
        if (client.NC[value.ec0] == null) {
            client.NC[value.ec0] = new RJ0(RJ0.w);
        }
        client.u40 = value;
    }
}
