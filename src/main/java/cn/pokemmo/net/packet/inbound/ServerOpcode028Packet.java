package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode028Packet extends GH {
    public final yj_1 zk0;

    public ServerOpcode028Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
        this.zk0 = new yj_1();
    }

    public final void Oj0() {
        int count = this.Rj.getShort() & 0xFFFF;
        for (int i = 0; i < count; i++) {
            this.zk0.uo0(this.Rj.getShort());
        }
    }

    public final void os0() {
        if (sr0() != null) {
            sr0().yh0.IK0 = this.zk0;
        }
    }
}
