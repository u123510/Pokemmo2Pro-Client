package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseNetworkSessionEvent;

import java.nio.ByteBuffer;

public class LoginSessionAuthenticationEvent extends BaseNetworkSessionEvent {
    public CH0 FC0;
    public String rP;
    public String us0;
    public zo_0 la;
    public G50 NQ;
    public byte O70;

    public LoginSessionAuthenticationEvent(TX owner, ByteBuffer buffer) {
        super(owner, buffer);
        this.FC0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.la = (zo_0) zo_0.N00.BM(this.Rj.get());
        if (this.la.ordinal() != 8) {
            this.FC0 = CH0.Ab(this.Rj.getLong());
            this.us0 = this.q60();
            this.NQ = G50.oZ(this.Rj.get(), true);
            this.O70 = this.Rj.get();
            this.rP = this.q60();
        } else {
            this.FC0 = CH0.j1;
            this.us0 = "";
            this.rP = this.q60();
        }
    }

    @Override
    public final void os0() {
        zo_0 type = this.la;
        if (type == null) {
            return;
        }
        if (!type.g3 && this.FC0.Uz0()) {
            this.rP = sm0_0.dd(this.rP);
        }
        TX owner = (TX) this.uk;
        owner.Bu.ug(new sf0_2(this.la, this.FC0, this.us0, this.NQ, this.O70, this.rP));
    }
}
