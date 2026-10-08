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

public class LoginSessionChallengeEvent extends BaseNetworkSessionEvent {
    public boolean gp0;

    public LoginSessionChallengeEvent(TX owner, ByteBuffer data) {
        super(owner, data);
    }

    @Override
    public final void Oj0() {
        this.gp0 = (this.Rj.get() & 255) == 1;
    }

    @Override
    public final void iw0() {
        if (this.gp0) {
            ((TX) this.uk).nV = 3;
        }
    }

    @Override
    public final void os0() {
        if (!this.gp0) {
            return;
        }
        TX owner = (TX) this.uk;
        Ge0 state = owner.Bu;
        state.jC(sm0_0.c0(1516), zo_0.rr0);
        state.wc0 = 0;
        TX next = state.Wz;
        if (next != null) {
            next.fl(new hi0_0());
        }
    }
}
