/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseNetworkSessionEvent;

import f.Ey0;
import f.TX;
import java.nio.ByteBuffer;

/*
 * Renamed from f.rV
 */
public class LoginSessionHandshakeResponseEvent extends BaseNetworkSessionEvent {
    public LoginSessionHandshakeResponseEvent(TX tX, ByteBuffer byteBuffer) {
        super(tX, byteBuffer);
    }

    @Override
    public final void Oj0() {
    }

    @Override
    public final void os0() {
    }
}

