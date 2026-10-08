package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ServerOpcode111Packet extends GH {
    public ArrayList FM;

    public ServerOpcode111Packet(k20_0 connection, ByteBuffer data) { super(connection, data); }

    @Override
    public final void Oj0() {
        ByteBuffer data = this.Rj;
        int count = data.get();
        this.FM = new ArrayList(count);
        for (int i = 0; i < count; i++) {
            byte kind = data.get();
            String name = this.q60();
            byte type = data.get();
            qd_0 format;
            if (type == 0) format = qd_0.Vx0;
            else if (type == 1) format = qd_0.H4;
            else if (type == 2) format = qd_0.Ws0;
            else { qd_0.Vx0.toString(); format = null; }
            byte[] payload = new byte[data.get() & 255];
            data.get(payload);
            this.FM.add(new bx_0(kind, name, format, payload));
        }
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        if (state == null) return;
        vi_0 target = state.sN;
        bm0_1 map = new bm0_1();
        for (Object value : this.FM) {
            bx_0 entry = (bx_0) value;
            map.gE0(entry.Wr0, entry);
        }
        target.za = new Nm(map);
    }
}
