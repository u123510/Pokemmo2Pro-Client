package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode099Packet extends GH {
    public int zQ;
    public GR[] Xu0;

    public ServerOpcode099Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.zQ = this.Rj.get() & 0xFF;
        this.Xu0 = new GR[this.Rj.get() & 0xFF];
        for (int i = 0; i < this.Xu0.length; ++i) {
            CH0 id = this.pE();
            int addTime = this.Rj.getInt();
            boolean online = (this.Rj.get() & 0xFF) == 1;
            GR friend = new GR(id, addTime, online);
            friend.fh0(this.h80());
            this.Xu0[i] = friend;
        }
    }

    @Override
    public final void os0() {
        fa0_0 friends = this.sr0().q50;
        if (this.zQ == 0) {
            friends.lx.clear();
        }
        for (GR friend : this.Xu0) {
            friends.lx.put(friend.WS, friend);
        }
    }
}
