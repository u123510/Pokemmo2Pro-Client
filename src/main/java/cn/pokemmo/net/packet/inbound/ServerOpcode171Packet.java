package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode171Packet extends GH {
    public long eR;
    public int Zo0;
    public byte[] KA0;

    public ServerOpcode171Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.eR = this.Rj.getLong();
        this.Zo0 = this.Rj.getInt();
        byte[] data = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(data);
        this.KA0 = data;
    }

    @Override
    public final void os0() {
        Ge0 ge0 = this.sr0();
        ge0.ZE0 = new oa_0(this.sr0(), this.eR, this.Zo0, this.KA0);
    }
}
