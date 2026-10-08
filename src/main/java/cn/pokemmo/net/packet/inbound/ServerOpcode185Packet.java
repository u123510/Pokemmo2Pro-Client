/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.c8_0;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerOpcode185Packet
extends GH {
    public byte Pc;

    public ServerOpcode185Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.Pc = this.Rj.get();
    }

    @Override
    public final void os0() {
        c8_0.JD0.jH0(this.Pc);
    }
}

