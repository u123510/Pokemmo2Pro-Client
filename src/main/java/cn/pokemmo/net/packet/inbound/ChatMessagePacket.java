package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ChatMessagePacket extends GH {
    public CH0 Hr0;
    public String y;
    public String ho;
    public zo_0 od;
    public G50 TX;
    public byte FH;

    public ChatMessagePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.Hr0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.od = (zo_0) zo_0.N00.BM(this.Rj.get());
        if (this.od.ordinal() != 8) {
            this.Hr0 = this.pE();
            this.ho = this.q60();
            this.TX = G50.oZ(this.Rj.get(), true);
            this.FH = this.Rj.get();
            this.y = this.q60();
        } else {
            this.Hr0 = CH0.j1;
            this.ho = "";
            this.y = this.q60();
        }
    }

    @Override
    public final void os0() {
        zo_0 type = this.od;
        if (type == null) {
            return;
        }
        if (!type.g3 && this.Hr0.Uz0()) {
            this.y = sm0_0.dd(this.y);
        }
        this.sr0().ug(new sf0_2(type, this.Hr0, this.ho, this.TX, this.FH, this.y));
    }
}
