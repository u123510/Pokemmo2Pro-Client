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
import cn.pokemmo.net.packet.system.BaseSecureHandshakePacket;

import f.ky_2;
import f.uf_0;

public class HandshakeKeepAlivePacket extends BaseSecureHandshakePacket {
    public HandshakeKeepAlivePacket(int n) {
        super(n);
    }

    @Override
    public final void Oj0() {
        HandshakeKeepAlivePacket hC0 = this;
        hC0.Rj.getLong();
        hC0.Rj.getLong();
    }

    @Override
    public final void os0() {
        ((ky_2)this.uk).getClass();
        throw new UnsupportedOperationException();
    }
}

