package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode102Packet extends GH {
    public CH0 lPt5;
    public boolean wg;

    public ServerOpcode102Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.lPt5 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.lPt5 = this.pE();
        this.wg = (this.Rj.get() & 255) == 1;
    }

    @Override
    public final void os0() {
        fa0_0 friends = this.sr0().q50;
        CH0 id = this.lPt5;
        boolean online = this.wg;
        GR friend = (GR) friends.lx.get(id);
        if (friend == null) {
            return;
        }
        friends.LF0 = true;
        int message = online ? 2604 : 2605;
        if (online && friend.qc) {
            message = 2623;
        }
        friend.qc = online;
        int now = (int) (System.currentTimeMillis() / 1000L);
        friend.QB0.gw = now;
        tw0_0.rl.qK(sm0_0.wa0(message, friend.QB0.DR));
    }
}
