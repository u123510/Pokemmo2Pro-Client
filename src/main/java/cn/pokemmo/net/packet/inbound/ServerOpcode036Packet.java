/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

public class ServerOpcode036Packet
extends GH {
    public short SS;
    public byte G30;
    public boolean j0;

    public ServerOpcode036Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.SS = this.Rj.getShort();
        if (this.SS > 0) {
            ServerOpcode036Packet qB0 = this;
            qB0.G30 = qB0.Rj.get();
            boolean bl = qB0.Rj.get() == 1;
            this.j0 = bl;
        }
    }

    @Override
    public final void os0() {
        ServerOpcode036Packet qB0 = this;
        short s = qB0.SS;
        byte by = qB0.G30;
        boolean bl = qB0.j0;
        tw0_0.FL.wF(s, by, bl);
    }
}

